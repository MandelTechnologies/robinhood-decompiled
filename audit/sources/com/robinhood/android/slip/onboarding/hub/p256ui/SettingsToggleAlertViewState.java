package com.robinhood.android.slip.onboarding.hub.p256ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsToggleAlertViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/ui/SettingsToggleAlertViewState;", "", "accountNumber", "", "title", "content", "primaryCta", "secondaryCta", "directionToToggle", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getTitle", "getContent", "getPrimaryCta", "getSecondaryCta", "getDirectionToToggle", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SettingsToggleAlertViewState {
    public static final int $stable = 0;
    private final String accountNumber;
    private final String content;
    private final boolean directionToToggle;
    private final String primaryCta;
    private final String secondaryCta;
    private final String title;

    public static /* synthetic */ SettingsToggleAlertViewState copy$default(SettingsToggleAlertViewState settingsToggleAlertViewState, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settingsToggleAlertViewState.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = settingsToggleAlertViewState.title;
        }
        if ((i & 4) != 0) {
            str3 = settingsToggleAlertViewState.content;
        }
        if ((i & 8) != 0) {
            str4 = settingsToggleAlertViewState.primaryCta;
        }
        if ((i & 16) != 0) {
            str5 = settingsToggleAlertViewState.secondaryCta;
        }
        if ((i & 32) != 0) {
            z = settingsToggleAlertViewState.directionToToggle;
        }
        String str6 = str5;
        boolean z2 = z;
        return settingsToggleAlertViewState.copy(str, str2, str3, str4, str6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSecondaryCta() {
        return this.secondaryCta;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDirectionToToggle() {
        return this.directionToToggle;
    }

    public final SettingsToggleAlertViewState copy(String accountNumber, String title, String content, String primaryCta, String secondaryCta, boolean directionToToggle) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        return new SettingsToggleAlertViewState(accountNumber, title, content, primaryCta, secondaryCta, directionToToggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsToggleAlertViewState)) {
            return false;
        }
        SettingsToggleAlertViewState settingsToggleAlertViewState = (SettingsToggleAlertViewState) other;
        return Intrinsics.areEqual(this.accountNumber, settingsToggleAlertViewState.accountNumber) && Intrinsics.areEqual(this.title, settingsToggleAlertViewState.title) && Intrinsics.areEqual(this.content, settingsToggleAlertViewState.content) && Intrinsics.areEqual(this.primaryCta, settingsToggleAlertViewState.primaryCta) && Intrinsics.areEqual(this.secondaryCta, settingsToggleAlertViewState.secondaryCta) && this.directionToToggle == settingsToggleAlertViewState.directionToToggle;
    }

    public int hashCode() {
        return (((((((((this.accountNumber.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.primaryCta.hashCode()) * 31) + this.secondaryCta.hashCode()) * 31) + Boolean.hashCode(this.directionToToggle);
    }

    public String toString() {
        return "SettingsToggleAlertViewState(accountNumber=" + this.accountNumber + ", title=" + this.title + ", content=" + this.content + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", directionToToggle=" + this.directionToToggle + ")";
    }

    public SettingsToggleAlertViewState(String accountNumber, String title, String content, String primaryCta, String secondaryCta, boolean z) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        this.accountNumber = accountNumber;
        this.title = title;
        this.content = content;
        this.primaryCta = primaryCta;
        this.secondaryCta = secondaryCta;
        this.directionToToggle = z;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getPrimaryCta() {
        return this.primaryCta;
    }

    public final String getSecondaryCta() {
        return this.secondaryCta;
    }

    public final boolean getDirectionToToggle() {
        return this.directionToToggle;
    }
}
