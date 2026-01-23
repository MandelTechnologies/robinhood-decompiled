package com.robinhood.shared.login.lib.p385ui;

import kotlin.Metadata;

/* compiled from: BaseLoginViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginSubtext;", "", "regularText", "", "linkText", "<init>", "(II)V", "getRegularText", "()I", "getLinkText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LoginSubtext {
    public static final int $stable = 0;
    private final int linkText;
    private final int regularText;

    public static /* synthetic */ LoginSubtext copy$default(LoginSubtext loginSubtext, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = loginSubtext.regularText;
        }
        if ((i3 & 2) != 0) {
            i2 = loginSubtext.linkText;
        }
        return loginSubtext.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRegularText() {
        return this.regularText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLinkText() {
        return this.linkText;
    }

    public final LoginSubtext copy(int regularText, int linkText) {
        return new LoginSubtext(regularText, linkText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginSubtext)) {
            return false;
        }
        LoginSubtext loginSubtext = (LoginSubtext) other;
        return this.regularText == loginSubtext.regularText && this.linkText == loginSubtext.linkText;
    }

    public int hashCode() {
        return (Integer.hashCode(this.regularText) * 31) + Integer.hashCode(this.linkText);
    }

    public String toString() {
        return "LoginSubtext(regularText=" + this.regularText + ", linkText=" + this.linkText + ")";
    }

    public LoginSubtext(int i, int i2) {
        this.regularText = i;
        this.linkText = i2;
    }

    public final int getRegularText() {
        return this.regularText;
    }

    public final int getLinkText() {
        return this.linkText;
    }
}
