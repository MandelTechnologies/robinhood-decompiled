package com.robinhood.android.transfers.p271ui.p272v2.extensions;

import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.scarlet.ScarletOverlay;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConfigurations.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"mappedScarletOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getMappedScarletOverlay", "(Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)Lcom/robinhood/scarlet/ScarletOverlay;", "isFromIraSettingTransfersRow", "", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.extensions.TransferConfigurationsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferConfigurations2 {

    /* compiled from: TransferConfigurations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.extensions.TransferConfigurationsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferConfiguration.TransferOverlayTheme.values().length];
            try {
                iArr[TransferConfiguration.TransferOverlayTheme.ACHROMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferConfiguration.TransferOverlayTheme.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ScarletOverlay getMappedScarletOverlay(TransferConfiguration transferConfiguration) {
        Intrinsics.checkNotNullParameter(transferConfiguration, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferConfiguration.getTransferOverlayTheme().ordinal()];
        if (i == 1) {
            return AchromaticOverlay.INSTANCE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return DirectionOverlay.NEGATIVE;
    }

    public static final boolean isFromIraSettingTransfersRow(TransferConfiguration transferConfiguration) {
        ApiTransferAccount.TransferAccountType type2;
        Intrinsics.checkNotNullParameter(transferConfiguration, "<this>");
        TransferConfiguration.TransferAccountSelection to = transferConfiguration.getTo();
        return to != null && (type2 = to.getType()) != null && type2.isIra() && transferConfiguration.getEntryPoint() == MAXTransferContext.EntryPoint.RETIREMENT_SETTINGS;
    }
}
