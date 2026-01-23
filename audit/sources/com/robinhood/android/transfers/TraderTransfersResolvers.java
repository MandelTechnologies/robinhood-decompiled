package com.robinhood.android.transfers;

import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.shared.transfers.contracts.SepaCreditDetailKey;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderTransfersResolvers.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/SepaCreditDetailResolver;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/transfers/contracts/SepaCreditDetailKey;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.SepaCreditDetailResolver, reason: use source file name */
/* loaded from: classes9.dex */
public final class TraderTransfersResolvers implements FragmentResolver<SepaCreditDetailKey> {
    public static final int $stable = 0;
    public static final TraderTransfersResolvers INSTANCE = new TraderTransfersResolvers();

    private TraderTransfersResolvers() {
    }

    @Override // com.robinhood.android.navigation.FragmentResolver
    public Fragment createFragment(SepaCreditDetailKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new Standard2("This should only be invoked from :rhc");
    }
}
