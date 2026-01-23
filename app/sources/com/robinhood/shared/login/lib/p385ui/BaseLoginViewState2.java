package com.robinhood.shared.login.lib.p385ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BaseLoginViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginHeader;", "", "<init>", "()V", "Logo", "Title", "Lcom/robinhood/shared/login/lib/ui/LoginHeader$Logo;", "Lcom/robinhood/shared/login/lib/ui/LoginHeader$Title;", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.lib.ui.LoginHeader, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class BaseLoginViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ BaseLoginViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BaseLoginViewState2() {
    }

    /* compiled from: BaseLoginViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginHeader$Logo;", "Lcom/robinhood/shared/login/lib/ui/LoginHeader;", "resId", "", "<init>", "(I)V", "getResId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.login.lib.ui.LoginHeader$Logo, reason: from toString */
    public static final /* data */ class Logo extends BaseLoginViewState2 {
        public static final int $stable = 0;
        private final int resId;

        public static /* synthetic */ Logo copy$default(Logo logo, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = logo.resId;
            }
            return logo.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        public final Logo copy(int resId) {
            return new Logo(resId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Logo) && this.resId == ((Logo) other).resId;
        }

        public int hashCode() {
            return Integer.hashCode(this.resId);
        }

        public String toString() {
            return "Logo(resId=" + this.resId + ")";
        }

        public Logo(int i) {
            super(null);
            this.resId = i;
        }

        public final int getResId() {
            return this.resId;
        }
    }

    /* compiled from: BaseLoginViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginHeader$Title;", "Lcom/robinhood/shared/login/lib/ui/LoginHeader;", "textResID", "", "<init>", "(I)V", "getTextResID", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.login.lib.ui.LoginHeader$Title, reason: from toString */
    public static final /* data */ class Title extends BaseLoginViewState2 {
        public static final int $stable = 0;
        private final int textResID;

        public static /* synthetic */ Title copy$default(Title title, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = title.textResID;
            }
            return title.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTextResID() {
            return this.textResID;
        }

        public final Title copy(int textResID) {
            return new Title(textResID);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Title) && this.textResID == ((Title) other).textResID;
        }

        public int hashCode() {
            return Integer.hashCode(this.textResID);
        }

        public String toString() {
            return "Title(textResID=" + this.textResID + ")";
        }

        public Title(int i) {
            super(null);
            this.textResID = i;
        }

        public final int getTextResID() {
            return this.textResID;
        }
    }
}
