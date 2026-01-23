package com.robinhood.android.crypto.p094ui.upgrade;

import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.models.api.ApiResidencyDocument;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeResult.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeResult;", "", "activation", "Lcom/robinhood/models/api/ApiCryptoActivation;", "residencyDocument", "", "Lcom/robinhood/models/api/ApiResidencyDocument;", "<init>", "(Lcom/robinhood/models/api/ApiCryptoActivation;Ljava/util/List;)V", "getActivation", "()Lcom/robinhood/models/api/ApiCryptoActivation;", "getResidencyDocument", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoUpgradeResult {
    public static final int $stable = 8;
    private final ApiCryptoActivation activation;
    private final List<ApiResidencyDocument> residencyDocument;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoUpgradeResult copy$default(CryptoUpgradeResult cryptoUpgradeResult, ApiCryptoActivation apiCryptoActivation, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            apiCryptoActivation = cryptoUpgradeResult.activation;
        }
        if ((i & 2) != 0) {
            list = cryptoUpgradeResult.residencyDocument;
        }
        return cryptoUpgradeResult.copy(apiCryptoActivation, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiCryptoActivation getActivation() {
        return this.activation;
    }

    public final List<ApiResidencyDocument> component2() {
        return this.residencyDocument;
    }

    public final CryptoUpgradeResult copy(ApiCryptoActivation activation, List<ApiResidencyDocument> residencyDocument) {
        Intrinsics.checkNotNullParameter(activation, "activation");
        Intrinsics.checkNotNullParameter(residencyDocument, "residencyDocument");
        return new CryptoUpgradeResult(activation, residencyDocument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeResult)) {
            return false;
        }
        CryptoUpgradeResult cryptoUpgradeResult = (CryptoUpgradeResult) other;
        return Intrinsics.areEqual(this.activation, cryptoUpgradeResult.activation) && Intrinsics.areEqual(this.residencyDocument, cryptoUpgradeResult.residencyDocument);
    }

    public int hashCode() {
        return (this.activation.hashCode() * 31) + this.residencyDocument.hashCode();
    }

    public String toString() {
        return "CryptoUpgradeResult(activation=" + this.activation + ", residencyDocument=" + this.residencyDocument + ")";
    }

    public CryptoUpgradeResult(ApiCryptoActivation activation, List<ApiResidencyDocument> residencyDocument) {
        Intrinsics.checkNotNullParameter(activation, "activation");
        Intrinsics.checkNotNullParameter(residencyDocument, "residencyDocument");
        this.activation = activation;
        this.residencyDocument = residencyDocument;
    }

    public final ApiCryptoActivation getActivation() {
        return this.activation;
    }

    public final List<ApiResidencyDocument> getResidencyDocument() {
        return this.residencyDocument;
    }
}
