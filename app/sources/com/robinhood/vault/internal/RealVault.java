package com.robinhood.vault.internal;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.vault.Vault;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import okio.ByteString;

/* compiled from: RealVault.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/vault/internal/RealVault;", "Lcom/robinhood/vault/Vault;", "vaults", "", "Lcom/robinhood/vault/internal/VaultWorker;", "<init>", "(Ljava/util/List;)V", "vaultWorkerMap", "", "", "vaultWorker", "encrypt", "Lokio/ByteString;", "bytes", "decrypt", AnalyticsStrings.BUTTON_LIST_DELETE, "", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class RealVault implements Vault {
    private final VaultWorker vaultWorker;
    private final Map<Integer, VaultWorker> vaultWorkerMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RealVault() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RealVault(List<? extends VaultWorker> vaults) {
        Object obj;
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        List<? extends VaultWorker> list = vaults;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj2 : list) {
            linkedHashMap.put(Integer.valueOf(((VaultWorker) obj2).getVersion()), obj2);
        }
        this.vaultWorkerMap = linkedHashMap;
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNull(entry);
        this.vaultWorker = (VaultWorker) entry.getValue();
    }

    public /* synthetic */ RealVault(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.listOf(VaultWorkerV1.INSTANCE.getInstance()) : list);
    }

    @Override // com.robinhood.vault.Vault
    public ByteString encrypt(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return this.vaultWorker.encrypt(bytes).toEncodedByteString();
    }

    @Override // com.robinhood.vault.Vault
    public ByteString decrypt(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        VaultCipherText vaultCipherTextFromEncodedBytes = VaultCipherText.INSTANCE.fromEncodedBytes(bytes);
        int version = vaultCipherTextFromEncodedBytes.getVersion();
        VaultWorker vaultWorker = this.vaultWorkerMap.get(Integer.valueOf(version));
        if (vaultWorker == null) {
            throw new IllegalStateException(("No worker specified for ciphertext v" + version).toString());
        }
        return vaultWorker.decrypt(vaultCipherTextFromEncodedBytes);
    }

    @Override // com.robinhood.vault.Vault
    public void delete() {
        Iterator<T> it = this.vaultWorkerMap.values().iterator();
        while (it.hasNext()) {
            ((VaultWorker) it.next()).delete();
        }
    }
}
