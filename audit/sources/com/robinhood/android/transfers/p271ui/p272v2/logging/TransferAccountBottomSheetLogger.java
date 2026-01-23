package com.robinhood.android.transfers.p271ui.p272v2.logging;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataState;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.converters.cash.Transfers;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccountBottomSheetLogger.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"logTransferAccountSelectionRowTap", "", "Lcom/robinhood/analytics/EventLogger;", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "maxTransferContext", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "logTransferAccountBottomSheetAppear", "logTransferAccountRowAppear", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "logTransferAccountRowTap", "logGeneralRowTap", "identifier", "", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.logging.TransferAccountBottomSheetLoggerKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferAccountBottomSheetLogger {

    /* compiled from: TransferAccountBottomSheetLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.logging.TransferAccountBottomSheetLoggerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void logTransferAccountSelectionRowTap(EventLogger eventLogger, TransferAccountDirection direction, MAXTransferContext maxTransferContext) {
        String str;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(maxTransferContext, "maxTransferContext");
        Screen screen$feature_transfers_externalRelease = CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease();
        Component.ComponentType componentType = Component.ComponentType.ROW;
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            str = "edit_source_account";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "edit_sink_account";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen$feature_transfers_externalRelease, new Component(componentType, str, null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    public static final void logTransferAccountBottomSheetAppear(EventLogger eventLogger, TransferAccountDirection direction, MAXTransferContext maxTransferContext) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(maxTransferContext, "maxTransferContext");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease(), new Component(Component.ComponentType.BOTTOM_SHEET, MicrogramLoggingConverters.toBottomSheetIdentifier(direction), null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), 9, null);
    }

    public static final void logTransferAccountRowAppear(EventLogger eventLogger, TransferAccount transferAccount, TransferAccountDirection direction, MAXTransferContext maxTransferContext) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(maxTransferContext, "maxTransferContext");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease(), new Component(Component.ComponentType.ROW, "select_account", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, MicrogramLoggingConverters.toBottomSheetIdentifier(direction), null, 4, null), null, null, null, null, 30, null), new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext, new MAXTransferAccountSelectionContext(MicrogramLoggingConverters.toMAXTransferAccountSelectionState(direction), Transfers.toProtobuf(transferAccount), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -393217, -1, -1, -1, -1, 16383, null), 1, null);
    }

    public static final void logTransferAccountRowTap(EventLogger eventLogger, TransferAccount transferAccount, TransferAccountDirection direction, MAXTransferContext maxTransferContext) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(maxTransferContext, "maxTransferContext");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease(), new Component(Component.ComponentType.ROW, "select_account", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, MicrogramLoggingConverters.toBottomSheetIdentifier(direction), null, 4, null), null, null, null, null, 30, null), new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext, new MAXTransferAccountSelectionContext(MicrogramLoggingConverters.toMAXTransferAccountSelectionState(direction), Transfers.toProtobuf(transferAccount), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -393217, -1, -1, -1, -1, 16383, null), false, 33, null);
    }

    public static final void logGeneralRowTap(EventLogger eventLogger, MAXTransferContext maxTransferContext, String identifier) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(maxTransferContext, "maxTransferContext");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease(), new Component(Component.ComponentType.ROW, identifier, null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, null, null, null, 30, null), new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 33, null);
    }
}
