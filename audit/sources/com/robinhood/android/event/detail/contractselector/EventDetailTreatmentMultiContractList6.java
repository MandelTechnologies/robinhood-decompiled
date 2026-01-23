package com.robinhood.android.event.detail.contractselector;

import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.event.detail.C16095R;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventDetailTreatmentMultiContractList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.EventDetailTreatmentMultiContractListKt$eventDetailTreatmentMultiContractList$1$2, reason: use source file name */
/* loaded from: classes3.dex */
final class EventDetailTreatmentMultiContractList6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ int $numOfContracts;
    final /* synthetic */ Function0<Unit> $onViewAllClick;

    EventDetailTreatmentMultiContractList6(int i, Function0<Unit> function0) {
        this.$numOfContracts = i;
        this.$onViewAllClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-788890823, i, -1, "com.robinhood.android.event.detail.contractselector.eventDetailTreatmentMultiContractList.<anonymous>.<anonymous> (EventDetailTreatmentMultiContractList.kt:63)");
        }
        final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
        final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        final String strStringResource = StringResources_androidKt.stringResource(C16095R.string.event_detail_multi_contract_revamp_view_more, new Object[]{Integer.valueOf(this.$numOfContracts)}, composer, 0);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(userInteractionEventDescriptor) | composer.changed(strStringResource) | composer.changed(this.$onViewAllClick);
        final Function0<Unit> function0 = this.$onViewAllClick;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.detail.contractselector.EventDetailTreatmentMultiContractListKt$eventDetailTreatmentMultiContractList$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDetailTreatmentMultiContractList6.invoke$lambda$1$lambda$0(current, userInteractionEventDescriptor, strStringResource, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, BentoTextButton3.Size.f5148S, false, null, composer, 24576, 104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, String str, Function0 function0) {
        Screen screen = userInteractionEventDescriptor.getScreen();
        Component component = new Component(Component.ComponentType.BUTTON, EventAnalyticsString.CONTRACT_SELECTOR_VIEW_ALL, null, 4, null);
        Context context = userInteractionEventDescriptor.getContext();
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, context != null ? Context.copy$default(context, 0, 0, 0, str, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null) : null, false, 41, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
