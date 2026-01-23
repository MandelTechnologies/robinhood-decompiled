package com.robinhood.shared.crypto.transfer.verification.beneficiary;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.unit.Density;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: BeneficiaryNameComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/CenterLastArrangement;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "<init>", "()V", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "outPositions", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.CenterLastArrangement, reason: use source file name */
/* loaded from: classes21.dex */
public final class BeneficiaryNameComposable4 implements Arrangement.Vertical {
    public static final int $stable = 0;
    public static final BeneficiaryNameComposable4 INSTANCE = new BeneficiaryNameComposable4();

    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    /* renamed from: getSpacing-D9Ej5fM */
    public /* bridge */ /* synthetic */ float getSpacing() {
        return super.getSpacing();
    }

    private BeneficiaryNameComposable4() {
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    public void arrange(Density density, int i, int[] sizes, int[] outPositions) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        Intrinsics.checkNotNullParameter(outPositions, "outPositions");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : sizes) {
            i3 += i4;
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i - i3, 0);
        int length = sizes.length;
        int i5 = 0;
        int i6 = 0;
        while (i2 < length) {
            int i7 = sizes[i2];
            int i8 = i5 + 1;
            if (i5 == ArraysKt.getLastIndex(sizes)) {
                outPositions[i5] = (iCoerceAtLeast / 2) + i6;
            } else {
                outPositions[i5] = i6;
                i6 += i7;
            }
            i2++;
            i5 = i8;
        }
    }
}
