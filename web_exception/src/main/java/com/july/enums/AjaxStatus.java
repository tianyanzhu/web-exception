package com.july.enums;

/**
 * @author ¡¡july
 */
public enum AjaxStatus {
    OK(100, "ok"),
    ERROR(500,"server error"),

    ERROR_ACCESS_DENIED(201, "Access denied"),
    ERROR_PARAMETER_MISSING(202, "Request parameter missing"),
    ERROR_NOT_FOUND(203, "Resource not found"),

    FORM_REQUIRED_FIELD(301, "Required field"),
    FORM_BAD_FORMATTING(302, "Invalid formatting"),
    FORM_BAD_FIELD_SIZE(303, "Too many characters in field"),
    FORM_HAS_ERRORS(304, "Your submitted form has errors") ;

    private final int code;
    private final String description;

    private AjaxStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }


    public int getCode() {
        return code;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return name();
    }
    }
