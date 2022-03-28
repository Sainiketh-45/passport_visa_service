package com.project.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Model.Visa;
import com.project.Repository.VisaRepo;

@Service
public class VisaService {

	@Autowired
	VisaRepo repo;

	public Visa visaRegistration(Visa vs) {

		String ui = "VISA-1234";
		String s1 = ui.substring(5, 9);
		String nu = String.valueOf(s1);
		int num = Integer.parseInt(nu);

		int maxnum = num + 1;
		if (!vs.getPASSPORT_NO().isEmpty()) {
			if (vs.getOCCUPATION().equalsIgnoreCase("STUDENT")) {

				String vn = "STU-" + maxnum;
				vs.setVISA_NO(vn);

			}
			if (vs.getOCCUPATION().equalsIgnoreCase("Self Employed")) {

				String vn = "SE-" + maxnum;
				vs.setVISA_NO(vn);

			}
			if (vs.getOCCUPATION().equalsIgnoreCase("Government Employee")) {

				String vn = "GE-" + maxnum;
				vs.setVISA_NO(vn);
			}
			if (vs.getOCCUPATION().equalsIgnoreCase("Private Employee")) {

				String vn = "PE-" + maxnum;
				vs.setVISA_NO(vn);
			}
			if (vs.getOCCUPATION().equalsIgnoreCase("Retire Employee")) {

				String vn = "RE-" + maxnum;
				vs.setVISA_NO(vn);
			}
		}
		return repo.save(vs);
	}

	public List<Visa> findVisaRegistrationByPassportNo(String PASSPORT_NO) {

		return repo.findVisaRegistrationByPassportNo(PASSPORT_NO);
	}

}
