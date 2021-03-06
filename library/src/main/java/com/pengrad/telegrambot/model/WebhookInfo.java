package com.pengrad.telegrambot.model;

import java.io.Serializable;

/**
 * Stas Parshin
 * 03 October 2016
 */
public class WebhookInfo implements Serializable {
    private final static long serialVersionUID = 0L;

    private String url;
    private Boolean has_custom_certificate;
    private Integer pending_update_count;
    private Integer last_error_date;
    private String last_error_message;

    public String url() {
        return url;
    }

    public Boolean hasCustomCertificate() {
        return has_custom_certificate;
    }

    public Integer pendingUpdateCount() {
        return pending_update_count;
    }

    public Integer lastErrorDate() {
        return last_error_date;
    }

    public String lastErrorMessage() {
        return last_error_message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WebhookInfo that = (WebhookInfo) o;

        if (!url.equals(that.url)) return false;
        if (!has_custom_certificate.equals(that.has_custom_certificate)) return false;
        if (!pending_update_count.equals(that.pending_update_count)) return false;
        if (last_error_date != null ? !last_error_date.equals(that.last_error_date) : that.last_error_date != null)
            return false;
        return last_error_message != null ? last_error_message.equals(that.last_error_message) : that.last_error_message == null;

    }

    @Override
    public int hashCode() {
        int result = url.hashCode();
        result = 31 * result + has_custom_certificate.hashCode();
        result = 31 * result + pending_update_count.hashCode();
        result = 31 * result + (last_error_date != null ? last_error_date.hashCode() : 0);
        result = 31 * result + (last_error_message != null ? last_error_message.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WebhookInfo{" +
                "url='" + url + '\'' +
                ", has_custom_certificate=" + has_custom_certificate +
                ", pending_update_count=" + pending_update_count +
                ", last_error_date=" + last_error_date +
                ", last_error_message='" + last_error_message + '\'' +
                '}';
    }
}
