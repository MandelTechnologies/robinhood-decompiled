package com.plaid.link.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\t\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/plaid/link/exception/InvalidLinkConfigurationException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "userMessage", "", "(Ljava/lang/String;)V", "Lcom/plaid/link/exception/LinkConfigurationInvalidCountryCodeException;", "Lcom/plaid/link/exception/LinkConfigurationInvalidInstitutionIdException;", "Lcom/plaid/link/exception/LinkConfigurationInvalidLanguageException;", "Lcom/plaid/link/exception/LinkConfigurationMalformedLinkTokenException;", "Lcom/plaid/link/exception/LinkConfigurationMissingKeyException;", "Lcom/plaid/link/exception/LinkConfigurationMissingTokenException;", "Lcom/plaid/link/exception/LinkConfigurationNoClientNameException;", "Lcom/plaid/link/exception/LinkConfigurationNoProductException;", "Lcom/plaid/link/exception/LinkNoConfigurationException;", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class InvalidLinkConfigurationException extends IllegalArgumentException {
    private final String userMessage;

    public /* synthetic */ InvalidLinkConfigurationException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private InvalidLinkConfigurationException(String str) {
        super(str);
        this.userMessage = str;
    }
}
