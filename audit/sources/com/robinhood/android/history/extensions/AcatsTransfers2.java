package com.robinhood.android.history.extensions;

import android.content.res.Resources;
import com.robinhood.android.history.C18359R;
import com.robinhood.models.acats.p299db.C35048R;
import com.robinhood.models.acats.p299db.LegacyAcatsTransfer;
import com.robinhood.models.api.LegacyApiAcatsTransfer;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.math.BigDecimals7;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsTransfers.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0007\u001a\u0012\u0010\f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/models/api/LegacyApiAcatsTransfer$State;", "getLabelResId", "(Lcom/robinhood/models/api/LegacyApiAcatsTransfer$State;)I", "getStatusLabel", "", "Lcom/robinhood/models/acats/db/LegacyAcatsTransfer;", "resources", "Landroid/content/res/Resources;", "shouldShowAssets", "", "getAssetsHeader", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.extensions.AcatsTransfersKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AcatsTransfers2 {

    /* compiled from: AcatsTransfers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.extensions.AcatsTransfersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LegacyApiAcatsTransfer.State.values().length];
            try {
                iArr[LegacyApiAcatsTransfer.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.State.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.State.REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.State.FINALIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.State.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LegacyApiAcatsTransfer.State.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LegacyApiAcatsTransfer.Type.values().length];
            try {
                iArr2[LegacyApiAcatsTransfer.Type.RECLAIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LegacyApiAcatsTransfer.Type.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LegacyApiAcatsTransfer.Type.RESIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LegacyApiAcatsTransfer.Type.PARTIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LegacyApiAcatsTransfer.Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getLabelResId(LegacyApiAcatsTransfer.State state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return C35048R.string.acats_transfer_state_pending;
            case 5:
                return C35048R.string.acats_transfer_state_completed;
            case 6:
                return C39006R.string.acats_transfer_state_failed;
            case 7:
                return C35048R.string.acats_transfer_state_canceled;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getStatusLabel(LegacyAcatsTransfer legacyAcatsTransfer, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(legacyAcatsTransfer, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(getLabelResId(legacyAcatsTransfer.getState()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final boolean shouldShowAssets(LegacyAcatsTransfer legacyAcatsTransfer) {
        Intrinsics.checkNotNullParameter(legacyAcatsTransfer, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[legacyAcatsTransfer.getState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return BigDecimals7.isPositive(legacyAcatsTransfer.getCashValue()) || !legacyAcatsTransfer.getPositions().isEmpty();
            case 6:
            case 7:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getAssetsHeader(LegacyAcatsTransfer legacyAcatsTransfer, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(legacyAcatsTransfer, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$0[legacyAcatsTransfer.getState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                int i = WhenMappings.$EnumSwitchMapping$1[legacyAcatsTransfer.getType().ordinal()];
                if (i == 1) {
                    String string2 = resources.getString(C18359R.string.acats_transfer_detail_transferring_label_reclaimed, legacyAcatsTransfer.getContraBrokerageName());
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                }
                if (i != 2 && i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                String string3 = resources.getString(C18359R.string.acats_transfer_detail_transferring_label);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 5:
                int i2 = WhenMappings.$EnumSwitchMapping$1[legacyAcatsTransfer.getType().ordinal()];
                if (i2 == 1) {
                    String string4 = resources.getString(C18359R.string.acats_transfer_detail_transferred_label_reclaimed, legacyAcatsTransfer.getContraBrokerageName());
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    return string4;
                }
                if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                String string5 = resources.getString(C18359R.string.acats_transfer_detail_transferred_label);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 6:
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(legacyAcatsTransfer.getState());
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
