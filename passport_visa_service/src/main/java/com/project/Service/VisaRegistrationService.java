package com.project.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Model.VisaRegistration;
import com.project.Repository.VisaRegistrationRepo;

@Service
public class VisaRegistrationService {

	@Autowired
	VisaRegistrationRepo repo;

	public VisaRegistration visaRegistration(VisaRegistration vs) {

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

	public List<VisaRegistration> findVisaRegistrationByPassportNo(String PASSPORT_NO) {

		return repo.findVisaRegistrationByPassportNo(PASSPORT_NO);
	}

}
