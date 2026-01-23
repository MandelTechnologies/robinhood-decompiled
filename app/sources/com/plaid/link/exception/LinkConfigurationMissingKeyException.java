package com.plaid.link.exception;

import kotlin.Metadata;

@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/plaid/link/exception/LinkConfigurationMissingKeyException;", "Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "()V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class LinkConfigurationMissingKeyException extends InvalidLinkConfigurationException {
    public static final LinkConfigurationMissingKeyException INSTANCE = new LinkConfigurationMissingKeyException();

    private LinkConfigurationMissingKeyException() {
        super("Please provide your Link Token https://plaid.com/docs/link/link-token-migration-guide/ or continue using the deprecated public key https://plaid.com/docs/link/maintain-legacy-integration/#plaid-link-for-android", null);
    }
}
