package com.robinhood.shared.posttransfer;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: TransferMarginCallCoveredFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferMarginCallCoveredFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/shared/posttransfer/TransferMarginCallCoveredFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/posttransfer/TransferMarginCallCoveredFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TransferMarginCallCoveredFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferMarginCallCoveredFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/posttransfer/TransferMarginCallCoveredFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransferMarginCallCoveredFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferMarginCallCoveredFragment$Callbacks;", "", "onDoneClick", "", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDoneClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(TransferMarginCallCoveredFragment transferMarginCallCoveredFragment, int i, Composer composer, int i2) {
        transferMarginCallCoveredFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name nameFromValue = Screen.Name.INSTANCE.fromValue(((UiPostTransferPage.MarginCallCovered) INSTANCE.getArgs((Fragment) this)).getScreenLoggingProto());
        if (nameFromValue == null) {
            nameFromValue = Screen.Name.NAME_UNSPECIFIED;
        }
        return new Screen(nameFromValue, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1446772386);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1446772386, i2, -1, "com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment.ComposeContent (TransferMarginCallCoveredFragment.kt:42)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1198619853, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1198619853, i3, -1, "com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment.ComposeContent.<anonymous> (TransferMarginCallCoveredFragment.kt:44)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM());
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    TransferMarginCallCoveredFragment transferMarginCallCoveredFragment = TransferMarginCallCoveredFragment.this;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21596getXxlargeD9Ej5fM()), composer2, 0);
                    ImageKt.Image(PainterResources_androidKt.painterResource(C39496R.drawable.ic_margin_call_covered_check, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21591getLargeD9Ej5fM()), composer2, 0);
                    Companion companion3 = TransferMarginCallCoveredFragment.INSTANCE;
                    String title = ((UiPostTransferPage.MarginCallCovered) companion3.getArgs((Fragment) transferMarginCallCoveredFragment)).getTitle();
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium(), composer2, 0, 0, 8126);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM()), composer2, 0);
                    BentoText2.m20747BentoText38GnDrw(((UiPostTransferPage.MarginCallCovered) companion3.getArgs((Fragment) transferMarginCallCoveredFragment)).getSubtitle(), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8126);
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer2, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    String title2 = ((UiPostTransferPage.MarginCallCovered) companion3.getArgs((Fragment) transferMarginCallCoveredFragment)).getPrimaryButton().getTitle();
                    Callbacks callbacks = transferMarginCallCoveredFragment.getCallbacks();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(callbacks);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new TransferMarginCallCoveredFragment2(callbacks);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue), title2, modifierFillMaxWidth$default, null, null, false, false, null, null, null, null, false, null, composer2, 384, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferMarginCallCoveredFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TransferMarginCallCoveredFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferMarginCallCoveredFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/posttransfer/TransferMarginCallCoveredFragment;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$MarginCallCovered;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransferMarginCallCoveredFragment, UiPostTransferPage.MarginCallCovered> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiPostTransferPage.MarginCallCovered getArgs(TransferMarginCallCoveredFragment transferMarginCallCoveredFragment) {
            return (UiPostTransferPage.MarginCallCovered) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transferMarginCallCoveredFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferMarginCallCoveredFragment newInstance(UiPostTransferPage.MarginCallCovered marginCallCovered) {
            return (TransferMarginCallCoveredFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, marginCallCovered);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferMarginCallCoveredFragment transferMarginCallCoveredFragment, UiPostTransferPage.MarginCallCovered marginCallCovered) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transferMarginCallCoveredFragment, marginCallCovered);
        }
    }
}
