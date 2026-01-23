package com.plaid.link.exception;

import kotlin.Metadata;

@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/plaid/link/exception/LinkConfigurationInvalidCountryCodeException;", "Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "()V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class LinkConfigurationInvalidCountryCodeException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationInvalidCountryCodeException INSTANCE = new LinkConfigurationInvalidCountryCodeException();

    private LinkConfigurationInvalidCountryCodeException() {
        super("Country code must be an ISO 3166 alpha-2 code for LinkPublicKeyConfiguration. You can get country codes from the Locale https://developer.android.com/reference/java/util/Locale", null);
    }
}
