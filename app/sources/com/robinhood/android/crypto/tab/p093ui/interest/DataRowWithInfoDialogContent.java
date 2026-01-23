package com.robinhood.android.crypto.tab.p093ui.interest;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CryptoHomeInterestDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/DataRowWithInfoDialogContent;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "infoDialogContent", "Lcom/robinhood/android/crypto/tab/ui/interest/InfoDialogContent;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/crypto/tab/ui/interest/InfoDialogContent;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "getInfoDialogContent", "()Lcom/robinhood/android/crypto/tab/ui/interest/InfoDialogContent;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DataRowWithInfoDialogContent {
    public static final int $stable = StringResource.$stable;
    private final InfoDialogContent infoDialogContent;
    private final StringResource label;
    private final StringResource value;

    public static /* synthetic */ DataRowWithInfoDialogContent copy$default(DataRowWithInfoDialogContent dataRowWithInfoDialogContent, StringResource stringResource, StringResource stringResource2, InfoDialogContent infoDialogContent, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = dataRowWithInfoDialogContent.label;
        }
        if ((i & 2) != 0) {
            stringResource2 = dataRowWithInfoDialogContent.value;
        }
        if ((i & 4) != 0) {
            infoDialogContent = dataRowWithInfoDialogContent.infoDialogContent;
        }
        return dataRowWithInfoDialogContent.copy(stringResource, stringResource2, infoDialogContent);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final InfoDialogContent getInfoDialogContent() {
        return this.infoDialogContent;
    }

    public final DataRowWithInfoDialogContent copy(StringResource label, StringResource value, InfoDialogContent infoDialogContent) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new DataRowWithInfoDialogContent(label, value, infoDialogContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataRowWithInfoDialogContent)) {
            return false;
        }
        DataRowWithInfoDialogContent dataRowWithInfoDialogContent = (DataRowWithInfoDialogContent) other;
        return Intrinsics.areEqual(this.label, dataRowWithInfoDialogContent.label) && Intrinsics.areEqual(this.value, dataRowWithInfoDialogContent.value) && Intrinsics.areEqual(this.infoDialogContent, dataRowWithInfoDialogContent.infoDialogContent);
    }

    public int hashCode() {
        int iHashCode = ((this.label.hashCode() * 31) + this.value.hashCode()) * 31;
        InfoDialogContent infoDialogContent = this.infoDialogContent;
        return iHashCode + (infoDialogContent == null ? 0 : infoDialogContent.hashCode());
    }

    public String toString() {
        return "DataRowWithInfoDialogContent(label=" + this.label + ", value=" + this.value + ", infoDialogContent=" + this.infoDialogContent + ")";
    }

    public DataRowWithInfoDialogContent(StringResource label, StringResource value, InfoDialogContent infoDialogContent) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.label = label;
        this.value = value;
        this.infoDialogContent = infoDialogContent;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final StringResource getValue() {
        return this.value;
    }

    public final InfoDialogContent getInfoDialogContent() {
        return this.infoDialogContent;
    }
}
