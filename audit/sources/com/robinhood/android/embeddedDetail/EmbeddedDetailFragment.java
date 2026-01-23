package com.robinhood.android.embeddedDetail;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.embeddedDetail.EmbeddedDetailFragment;
import com.robinhood.android.embeddedDetail.databinding.FragmentEmbeddedDetailBinding;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunk2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import okhttp3.HttpUrl;

/* compiled from: EmbeddedDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0011J\r\u0010\u001a\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u001bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/embeddedDetail/EmbeddedDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/embeddedDetail/databinding/FragmentEmbeddedDetailBinding;", "getBinding", "()Lcom/robinhood/android/embeddedDetail/databinding/FragmentEmbeddedDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/embeddedDetail/EmbeddedDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/embeddedDetail/EmbeddedDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/embeddedDetail/EmbeddedDetailFragment$Callbacks;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setCallbacks", "cb", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Companion", "lib-embedded-detail_externalDebug", "viewState", "Lcom/robinhood/android/embeddedDetail/EmbeddedDetailViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EmbeddedDetailFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmbeddedDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/embeddedDetail/databinding/FragmentEmbeddedDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EmbeddedDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/embeddedDetail/EmbeddedDetailFragment$Callbacks;", "", "onPrimaryButtonClick", "", "id", "Ljava/util/UUID;", "lib-embedded-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPrimaryButtonClick(UUID id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(EmbeddedDetailFragment embeddedDetailFragment, int i, Composer composer, int i2) {
        embeddedDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public EmbeddedDetailFragment() {
        super(C14480R.layout.fragment_embedded_detail);
        this.binding = ViewBinding5.viewBinding(this, EmbeddedDetailFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, EmbeddedDetailDuxo.class);
    }

    private final FragmentEmbeddedDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEmbeddedDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmbeddedDetailDuxo getDuxo() {
        return (EmbeddedDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().composeView.setContent(ComposableLambda3.composableLambdaInstance(-1152934584, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment.onViewCreated.1
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
                    ComposerKt.traceEventStart(-1152934584, i, -1, "com.robinhood.android.embeddedDetail.EmbeddedDetailFragment.onViewCreated.<anonymous> (EmbeddedDetailFragment.kt:59)");
                }
                EmbeddedDetailFragment.this.ComposeContent(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    public final void setCallbacks(Callbacks cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.callbacks = cb;
    }

    public final void ComposeContent(Composer composer, final int i) {
        int i2;
        ScarletManager scarletManager;
        final EmbeddedDetailFragment embeddedDetailFragment;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-407120480);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-407120480, i2, -1, "com.robinhood.android.embeddedDetail.EmbeddedDetailFragment.ComposeContent (EmbeddedDetailFragment.kt:68)");
            }
            Observable<EmbeddedDetailViewState> states = getDuxo().getStates();
            Companion companion = INSTANCE;
            final SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(states, new EmbeddedDetailViewState(((EmbeddedDetailArgs) companion.getArgs((Fragment) this)).getAssetType(), ((EmbeddedDetailArgs) companion.getArgs((Fragment) this)).getAssetId(), null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), composerStartRestartGroup, 0);
            ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
            if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                Context context = getContext();
                scarletManager = context != null ? ScarletManager2.getScarletManager(context) : null;
            }
            Intrinsics.checkNotNull(scarletManager);
            Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
            final List<UIComponent<GenericAction>> components = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getComponents();
            final UIComponent<GenericAction> headerComponent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getHeaderComponent();
            final UIComponent<GenericAction> expandableMarkdownComponent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getExpandableMarkdownComponent();
            final UIComponent<GenericAction> fundamentalComponent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getFundamentalComponent();
            Navigator navigator = getNavigator();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmbeddedDetailFragment.ComposeContent$lambda$2$lambda$1((GenericAlertContent) obj, (SduiActionHandler6) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SduiActionHandler2 sduiActionHandler2RememberDefaultSduiChunkCallbacks = SduiChunk2.rememberDefaultSduiChunkCallbacks(navigator, (Function2) objRememberedValue, null, composerStartRestartGroup, 48, 4);
            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: EmbeddedDetailFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<EmbeddedDetailViewState> $viewState$delegate;
                    final /* synthetic */ EmbeddedDetailFragment this$0;

                    AnonymousClass1(EmbeddedDetailFragment embeddedDetailFragment, SnapshotState4<EmbeddedDetailViewState> snapshotState4) {
                        this.this$0 = embeddedDetailFragment;
                        this.$viewState$delegate = snapshotState4;
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
                            ComposerKt.traceEventStart(-469755240, i, -1, "com.robinhood.android.embeddedDetail.EmbeddedDetailFragment.ComposeContent.<anonymous>.<anonymous> (EmbeddedDetailFragment.kt:90)");
                        }
                        StringResource basketButtonText = EmbeddedDetailFragment.ComposeContent$lambda$0(this.$viewState$delegate).getBasketButtonText();
                        Resources resources = this.this$0.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        String string2 = basketButtonText.getText(resources).toString();
                        Companion companion = EmbeddedDetailFragment.INSTANCE;
                        boolean z = !((EmbeddedDetailArgs) companion.getArgs((Fragment) this.this$0)).getBasketFull() || ((EmbeddedDetailArgs) companion.getArgs((Fragment) this.this$0)).getInBasket();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 0, 0);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$viewState$delegate);
                        final EmbeddedDetailFragment embeddedDetailFragment = this.this$0;
                        final SnapshotState4<EmbeddedDetailViewState> snapshotState4 = this.$viewState$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EmbeddedDetailFragment.C144781.AnonymousClass1.invoke$lambda$1$lambda$0(embeddedDetailFragment, snapshotState4);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, z, false, null, null, null, null, false, null, composer, 0, 0, 8152);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EmbeddedDetailFragment embeddedDetailFragment, SnapshotState4 snapshotState4) {
                        Callbacks callbacks = embeddedDetailFragment.callbacks;
                        if (callbacks == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                            callbacks = null;
                        }
                        UUID assetId = EmbeddedDetailFragment.ComposeContent$lambda$0(snapshotState4).getAssetId();
                        Intrinsics.checkNotNull(assetId);
                        callbacks.onPrimaryButtonClick(assetId);
                        embeddedDetailFragment.getDuxo().logButtonTap();
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1634539566, i3, -1, "com.robinhood.android.embeddedDetail.EmbeddedDetailFragment.ComposeContent.<anonymous> (EmbeddedDetailFragment.kt:88)");
                    }
                    ScaffoldKt.m5625Scaffold27mzLpw(null, null, null, ComposableLambda3.rememberComposableLambda(-469755240, true, new AnonymousClass1(EmbeddedDetailFragment.this, snapshotState4SubscribeAsState), composer3, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1533122928, true, new AnonymousClass2(headerComponent, sduiActionHandler2RememberDefaultSduiChunkCallbacks, expandableMarkdownComponent, fundamentalComponent, components, EmbeddedDetailFragment.this, snapshotState4SubscribeAsState), composer3, 54), composer3, 3072, 12582912, 131063);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: EmbeddedDetailFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment$ComposeContent$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ SduiActionHandler2 $chunkCallbacks;
                    final /* synthetic */ UIComponent<GenericAction> $expandableMarkdownComponent;
                    final /* synthetic */ UIComponent<GenericAction> $fundamentalComponent;
                    final /* synthetic */ UIComponent<GenericAction> $headerComponent;
                    final /* synthetic */ List<UIComponent<GenericAction>> $sduiContent;
                    final /* synthetic */ SnapshotState4<EmbeddedDetailViewState> $viewState$delegate;
                    final /* synthetic */ EmbeddedDetailFragment this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(UIComponent<? extends GenericAction> uIComponent, SduiActionHandler2 sduiActionHandler2, UIComponent<? extends GenericAction> uIComponent2, UIComponent<? extends GenericAction> uIComponent3, List<? extends UIComponent<? extends GenericAction>> list, EmbeddedDetailFragment embeddedDetailFragment, SnapshotState4<EmbeddedDetailViewState> snapshotState4) {
                        this.$headerComponent = uIComponent;
                        this.$chunkCallbacks = sduiActionHandler2;
                        this.$expandableMarkdownComponent = uIComponent2;
                        this.$fundamentalComponent = uIComponent3;
                        this.$sduiContent = list;
                        this.this$0 = embeddedDetailFragment;
                        this.$viewState$delegate = snapshotState4;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) throws Resources.NotFoundException {
                        int i2;
                        Modifier.Companion companion;
                        SduiActionHandler2 sduiActionHandler2;
                        UIComponent<GenericAction> uIComponent;
                        UIComponent<GenericAction> uIComponent2;
                        List<UIComponent<GenericAction>> list;
                        EmbeddedDetailFragment embeddedDetailFragment;
                        int i3;
                        BentoTheme bentoTheme;
                        int i4;
                        int i5;
                        Composer composer2;
                        Modifier.Companion companion2;
                        Composer composer3;
                        SduiActionHandler2 sduiActionHandler22;
                        Modifier.Companion companion3;
                        EmbeddedDetailFragment embeddedDetailFragment2;
                        Composer composer4;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1533122928, i2, -1, "com.robinhood.android.embeddedDetail.EmbeddedDetailFragment.ComposeContent.<anonymous>.<anonymous> (EmbeddedDetailFragment.kt:104)");
                        }
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(companion4, paddingValues);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Background3.m4872backgroundbw27NRU$default(modifierPadding, bentoTheme2.getColors(composer, i6).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                        UIComponent<GenericAction> uIComponent3 = this.$headerComponent;
                        SduiActionHandler2 sduiActionHandler23 = this.$chunkCallbacks;
                        UIComponent<GenericAction> uIComponent4 = this.$expandableMarkdownComponent;
                        UIComponent<GenericAction> uIComponent5 = this.$fundamentalComponent;
                        List<UIComponent<GenericAction>> list2 = this.$sduiContent;
                        EmbeddedDetailFragment embeddedDetailFragment3 = this.this$0;
                        SnapshotState4<EmbeddedDetailViewState> snapshotState4 = this.$viewState$delegate;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion5.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion6.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        if (EmbeddedDetailFragment.ComposeContent$lambda$0(snapshotState4).getContentLoaded()) {
                            composer.startReplaceGroup(-515655316);
                            composer.startReplaceGroup(537552586);
                            if (uIComponent3 != null) {
                                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(uIComponent3);
                                list = list2;
                                uIComponent2 = uIComponent5;
                                uIComponent = uIComponent4;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion4, bentoTheme2.getColors(composer, i6).m21371getBg0d7_KjU(), null, 2, null);
                                composer.startReplaceGroup(-1772220517);
                                sduiActionHandler2 = sduiActionHandler23;
                                bentoTheme = bentoTheme2;
                                companion = companion4;
                                i3 = 1;
                                embeddedDetailFragment = embeddedDetailFragment3;
                                i4 = i6;
                                i5 = 0;
                                SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, modifierM4872backgroundbw27NRU$default, null, sduiActionHandler2, HorizontalPadding.Default, arrangement.getTop(), companion5.getStart(), false, composer, 100663296, 0);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            } else {
                                companion = companion4;
                                sduiActionHandler2 = sduiActionHandler23;
                                uIComponent = uIComponent4;
                                uIComponent2 = uIComponent5;
                                list = list2;
                                embeddedDetailFragment = embeddedDetailFragment3;
                                i3 = 1;
                                bentoTheme = bentoTheme2;
                                i4 = i6;
                                i5 = 0;
                                composer2 = composer;
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(537567957);
                            if (uIComponent != null) {
                                UIComponent[] uIComponentArr = new UIComponent[i3];
                                uIComponentArr[i5] = uIComponent;
                                ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf(uIComponentArr);
                                Modifier.Companion companion7 = companion;
                                companion2 = companion7;
                                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion7, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i4).m21594getXlargeD9Ej5fM(), i3, null);
                                composer2.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(immutableList3PersistentListOf2, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler2, HorizontalPadding.Default, arrangement.getTop(), companion5.getStart(), false, composer, 100663296, 0);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            } else {
                                companion2 = companion;
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(537587139);
                            if (uIComponent2 != null) {
                                UIComponent[] uIComponentArr2 = new UIComponent[i3];
                                uIComponentArr2[i5] = uIComponent2;
                                ImmutableList3 immutableList3PersistentListOf3 = extensions2.persistentListOf(uIComponentArr2);
                                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), null, 2, null);
                                HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                composer2.startReplaceGroup(-1772220517);
                                composer3 = composer;
                                companion3 = companion2;
                                SduiColumns.SduiColumn(immutableList3PersistentListOf3, GenericAction.class, modifierM4872backgroundbw27NRU$default2, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion5.getStart(), false, composer3, 100859904, 0);
                                sduiActionHandler22 = sduiActionHandler2;
                                composer3.endReplaceGroup();
                            } else {
                                composer3 = composer2;
                                sduiActionHandler22 = sduiActionHandler2;
                                companion3 = companion2;
                            }
                            composer3.endReplaceGroup();
                            final HttpUrl prospectusUrl = EmbeddedDetailFragment.ComposeContent$lambda$0(snapshotState4).getProspectusUrl();
                            composer3.startReplaceGroup(537621865);
                            if (prospectusUrl == null) {
                                composer4 = composer3;
                                embeddedDetailFragment2 = embeddedDetailFragment;
                            } else {
                                composer3.startReplaceGroup(-1633490746);
                                final EmbeddedDetailFragment embeddedDetailFragment4 = embeddedDetailFragment;
                                boolean zChangedInstance = composer3.changedInstance(embeddedDetailFragment4) | composer3.changedInstance(prospectusUrl);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return EmbeddedDetailFragment.C144781.AnonymousClass2.invoke$lambda$3$lambda$2$lambda$1$lambda$0(embeddedDetailFragment4, prospectusUrl);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer3.endReplaceGroup();
                                String string2 = embeddedDetailFragment4.getResources().getString(C14480R.string.view_prospectus_and_reports);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM(), composer3, 6, i5);
                                embeddedDetailFragment2 = embeddedDetailFragment4;
                                BentoTextButton2.m20715BentoTextButtonPIknLig(function0, string2, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, composer, 0, 120);
                                composer4 = composer;
                                Unit unit = Unit.INSTANCE;
                            }
                            composer4.endReplaceGroup();
                            ImmutableList3 persistentList = extensions2.toPersistentList(list);
                            Modifier.Companion companion8 = companion3;
                            Modifier modifierM4872backgroundbw27NRU$default3 = Background3.m4872backgroundbw27NRU$default(companion8, bentoTheme.getColors(composer4, i4).m21371getBg0d7_KjU(), null, 2, null);
                            composer4.startReplaceGroup(-1772220517);
                            int i7 = i4;
                            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierM4872backgroundbw27NRU$default3, null, sduiActionHandler22, HorizontalPadding.Default, arrangement.getTop(), companion5.getStart(), false, composer, 100663296, 0);
                            composer.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.fillMaxHeight$default(companion8, 0.0f, 1, null), composer, 6);
                            Companion companion9 = EmbeddedDetailFragment.INSTANCE;
                            if (((EmbeddedDetailArgs) companion9.getArgs((Fragment) embeddedDetailFragment2)).getBasketFull() && !((EmbeddedDetailArgs) companion9.getArgs((Fragment) embeddedDetailFragment2)).getInBasket()) {
                                String string3 = embeddedDetailFragment2.getResources().getString(C14480R.string.item_limit_reached);
                                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                BentoText2.m20747BentoText38GnDrw(string3, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), bentoTheme.getSpacing(composer, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i7).m21590getDefaultD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(bentoTheme.getColors(composer, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i7).getTextS(), composer, 0, 0, 8120);
                            }
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-515861652);
                            LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composer, 0, 3);
                            composer.endReplaceGroup();
                        }
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) throws Resources.NotFoundException {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(EmbeddedDetailFragment embeddedDetailFragment, HttpUrl httpUrl) {
                        WebUtils webUtils = WebUtils.INSTANCE;
                        Context contextRequireContext = embeddedDetailFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        WebUtils.viewUrl$default(webUtils, contextRequireContext, httpUrl, 0, 4, null);
                        return Unit.INSTANCE;
                    }
                }
            };
            embeddedDetailFragment = this;
            BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1634539566, true, function2, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            embeddedDetailFragment = this;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.embeddedDetail.EmbeddedDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmbeddedDetailFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmbeddedDetailViewState ComposeContent$lambda$0(SnapshotState4<EmbeddedDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(GenericAlertContent genericAlertContent, SduiActionHandler6 sduiActionHandler6) {
        Intrinsics.checkNotNullParameter(genericAlertContent, "<unused var>");
        Intrinsics.checkNotNullParameter(sduiActionHandler6, "<unused var>");
        return Unit.INSTANCE;
    }

    /* compiled from: EmbeddedDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/embeddedDetail/EmbeddedDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/embeddedDetail/EmbeddedDetailFragment;", "Lcom/robinhood/android/embeddedDetail/EmbeddedDetailArgs;", "<init>", "()V", "lib-embedded-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EmbeddedDetailFragment, EmbeddedDetailArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EmbeddedDetailArgs getArgs(EmbeddedDetailFragment embeddedDetailFragment) {
            return (EmbeddedDetailArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, embeddedDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EmbeddedDetailFragment newInstance(EmbeddedDetailArgs embeddedDetailArgs) {
            return (EmbeddedDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, embeddedDetailArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EmbeddedDetailFragment embeddedDetailFragment, EmbeddedDetailArgs embeddedDetailArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, embeddedDetailFragment, embeddedDetailArgs);
        }
    }
}
