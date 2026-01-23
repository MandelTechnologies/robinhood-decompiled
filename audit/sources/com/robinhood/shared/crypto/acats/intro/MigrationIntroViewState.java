package com.robinhood.shared.crypto.acats.intro;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MigrationIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroViewState;", "", "loading", "", "showDialog", "dialogMessage", "", "<init>", "(ZZLjava/lang/String;)V", "getLoading", "()Z", "getShowDialog", "getDialogMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MigrationIntroViewState {
    public static final int $stable = 0;
    private final String dialogMessage;
    private final boolean loading;
    private final boolean showDialog;

    public static /* synthetic */ MigrationIntroViewState copy$default(MigrationIntroViewState migrationIntroViewState, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = migrationIntroViewState.loading;
        }
        if ((i & 2) != 0) {
            z2 = migrationIntroViewState.showDialog;
        }
        if ((i & 4) != 0) {
            str = migrationIntroViewState.dialogMessage;
        }
        return migrationIntroViewState.copy(z, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowDialog() {
        return this.showDialog;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDialogMessage() {
        return this.dialogMessage;
    }

    public final MigrationIntroViewState copy(boolean loading, boolean showDialog, String dialogMessage) {
        return new MigrationIntroViewState(loading, showDialog, dialogMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigrationIntroViewState)) {
            return false;
        }
        MigrationIntroViewState migrationIntroViewState = (MigrationIntroViewState) other;
        return this.loading == migrationIntroViewState.loading && this.showDialog == migrationIntroViewState.showDialog && Intrinsics.areEqual(this.dialogMessage, migrationIntroViewState.dialogMessage);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.loading) * 31) + Boolean.hashCode(this.showDialog)) * 31;
        String str = this.dialogMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MigrationIntroViewState(loading=" + this.loading + ", showDialog=" + this.showDialog + ", dialogMessage=" + this.dialogMessage + ")";
    }

    public MigrationIntroViewState(boolean z, boolean z2, String str) {
        this.loading = z;
        this.showDialog = z2;
        this.dialogMessage = str;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getShowDialog() {
        return this.showDialog;
    }

    public final String getDialogMessage() {
        return this.dialogMessage;
    }
}
