package com.rest.restfullfunctional.exception;

public class TutorialNotFoundExceptionResponse {
    private String tutorialNotFound;

    public TutorialNotFoundExceptionResponse(String tutorialNotFound) {
        this.tutorialNotFound = tutorialNotFound;
    }

    public String getTutorialNotFound() {
        return tutorialNotFound;
    }

    public void setTutorialNotFound(String tutorialNotFound) {
        this.tutorialNotFound = tutorialNotFound;
    }

    @Override
    public String toString() {
        return "TutorialNotFoundException{" +
                "tutorialNotFound='" + tutorialNotFound + '\'' +
                '}';
    }
}
