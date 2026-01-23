package com.robinhood.android.transfers.p271ui.max;

import android.content.Context;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.rfp.RfpPopupComponent3;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CreateTransferFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class CreateTransferFragment$onStart$9$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TransferConfiguration $configuration;
    final /* synthetic */ ApiPreCreateTransferSduiContainer $content;
    final /* synthetic */ CreateTransferViewState $it;
    final /* synthetic */ List<UIComponent<GenericAction>> $sduiContent;
    final /* synthetic */ CreateTransferFragment this$0;

    /* JADX WARN: Multi-variable type inference failed */
    CreateTransferFragment$onStart$9$1$1$1(CreateTransferFragment createTransferFragment, ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer, List<? extends UIComponent<? extends GenericAction>> list, CreateTransferViewState createTransferViewState, TransferConfiguration transferConfiguration) {
        this.this$0 = createTransferFragment;
        this.$content = apiPreCreateTransferSduiContainer;
        this.$sduiContent = list;
        this.$it = createTransferViewState;
        this.$configuration = transferConfiguration;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(786845415, i, -1, "com.robinhood.android.transfers.ui.max.CreateTransferFragment.onStart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferFragment.kt:563)");
        }
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(new ScarletContextWrapper(contextRequireContext, null, null, 6, null)));
        ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer = this.$content;
        ImmutableList immutableList = extensions2.toImmutableList(this.$sduiContent);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final CreateTransferFragment createTransferFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$9$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(CreateTransferFragment$onStart$9$1$1$1.invoke$lambda$1$lambda$0(createTransferFragment, (ModalBottomSheetValue) obj));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
        final CreateTransferFragment createTransferFragment2 = this.this$0;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$9$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateTransferFragment$onStart$9$1$1$1.invoke$lambda$3$lambda$2(createTransferFragment2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance3 = composer.changedInstance(this.this$0) | composer.changedInstance(this.$it) | composer.changedInstance(this.$configuration);
        final CreateTransferFragment createTransferFragment3 = this.this$0;
        final CreateTransferViewState createTransferViewState = this.$it;
        final TransferConfiguration transferConfiguration = this.$configuration;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$9$1$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateTransferFragment$onStart$9$1$1$1.invoke$lambda$5$lambda$4(createTransferFragment3, createTransferViewState, transferConfiguration);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function02 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance4 = composer.changedInstance(this.this$0) | composer.changedInstance(this.$it) | composer.changedInstance(this.$configuration);
        final CreateTransferFragment createTransferFragment4 = this.this$0;
        final CreateTransferViewState createTransferViewState2 = this.$it;
        final TransferConfiguration transferConfiguration2 = this.$configuration;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferFragment$onStart$9$1$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateTransferFragment$onStart$9$1$1$1.invoke$lambda$7$lambda$6(createTransferFragment4, createTransferViewState2, transferConfiguration2);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        RfpPopupComponent3.RfpPopupComponent(apiPreCreateTransferSduiContainer, immutableList, observableThemeChangesForCompose, function1, function0, function02, (Function0) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$1$lambda$0(CreateTransferFragment createTransferFragment, ModalBottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it != ModalBottomSheetValue.Hidden) {
            return true;
        }
        createTransferFragment.getBinding().rfpPopup.setContent(ComposableSingletons$CreateTransferFragmentKt.INSTANCE.m19767getLambda$716342709$feature_transfers_externalRelease());
        createTransferFragment.getBinding().rfpPopup.setVisibility(8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CreateTransferFragment createTransferFragment) {
        createTransferFragment.getBinding().rfpPopup.setContent(ComposableSingletons$CreateTransferFragmentKt.INSTANCE.getLambda$1950724257$feature_transfers_externalRelease());
        createTransferFragment.getBinding().rfpPopup.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(CreateTransferFragment createTransferFragment, CreateTransferViewState createTransferViewState, TransferConfiguration transferConfiguration) {
        CreateTransferLogging.logRfpSelection(createTransferFragment.getEventLogger(), createTransferFragment.getEventScreen(), true, createTransferViewState.getAmount(), transferConfiguration.getEntryPoint(), transferConfiguration.getEntryPointLoggingIdentifier());
        createTransferFragment.getDuxo().continueWithRfp();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(CreateTransferFragment createTransferFragment, CreateTransferViewState createTransferViewState, TransferConfiguration transferConfiguration) {
        CreateTransferLogging.logRfpSelection(createTransferFragment.getEventLogger(), createTransferFragment.getEventScreen(), false, createTransferViewState.getAmount(), transferConfiguration.getEntryPoint(), transferConfiguration.getEntryPointLoggingIdentifier());
        createTransferFragment.getDuxo().fallbackToStandardTransfer();
        return Unit.INSTANCE;
    }
}
