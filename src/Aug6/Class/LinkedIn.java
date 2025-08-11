package Aug6.Class;

import Aug6.Interfaces.LinkedInBase;
import Aug6.Interfaces.ProfessionalSocialMedia;

public class LinkedIn implements ProfessionalSocialMedia, LinkedInBase {
    @Override
    public void updateProfile() {
        System.out.println("Update Profile in LinkedIn ");
    }

    @Override
    public void jobPosting() {
        System.out.println("Job Posting in LinkedIn ");
    }

    @Override
    public void makeConnection() {
        System.out.println("Make Connection in LinkedIn ");
    }

    @Override
    public void makeProfile() {
    }
}
