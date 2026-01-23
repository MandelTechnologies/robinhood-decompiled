package com.robinhood.android.isa.contributions;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.section.HistorySection4;
import com.robinhood.android.common.history.p082ui.section.HistorySectionState;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.isa.contributions.IsaContributionHub3;
import com.robinhood.android.isa.contributions.IsaContributionHubDuxo;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContribution;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions2;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions4;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaTabBannerConfig;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IsaContributionHub.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\u001a)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0016\u001aC\u0010\u0017\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u001d2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001e\u001a5\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010$\u001a'\u0010%\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010(\u001a'\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010.\u001a\u001d\u0010/\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010*\u001a\u00020'H\u0003¢\u0006\u0002\u00100\u001a\u000e\u00101\u001a\u0002022\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u000e\u00103\u001a\u0002022\u0006\u0010\u0007\u001a\u00020\u0001\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067²\u0006\n\u00108\u001a\u000209X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002"}, m3636d2 = {"ISA_CONTRIBUTION_HUB_INFO_BANNER", "", "getISA_CONTRIBUTION_HUB_INFO_BANNER$annotations", "()V", "PLACEHOLDER_AMOUNT", "IsaContributionHub", "", "accountNumber", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/isa/contributions/IsaContributionHubDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/isa/contributions/IsaContributionHubDuxo;Landroidx/compose/runtime/Composer;II)V", "Header", "contributed", "remaining", "onInfoIconClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MaxLottieWithDot", "contribution", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContribution;", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaContribution;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TimeSelector", "contributions", "Lkotlinx/collections/immutable/PersistentList;", "selectedTaxYear", "", "onSelect", "Lkotlin/Function1;", "(Lkotlinx/collections/immutable/PersistentList;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TimeSelectorItem", "taxYearLabel", "isSelected", "", "onClick", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoBanner", "contributionState", "Lcom/robinhood/android/isa/models/isa/db/entity/ContributionState;", "(Ljava/lang/String;Lcom/robinhood/android/isa/models/isa/db/entity/ContributionState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HistorySection", "state", "Lcom/robinhood/android/common/history/ui/section/HistorySectionState;", "footerNavKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "(Lcom/robinhood/android/common/history/ui/section/HistorySectionState;Lcom/robinhood/android/navigation/keys/FragmentKey;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomBar", "(Ljava/lang/String;Lcom/robinhood/android/isa/models/isa/db/entity/ContributionState;Landroidx/compose/runtime/Composer;I)V", "startTransferDeeplink", "Landroid/net/Uri;", "addMoneyDeeplink", "DURATION", "EASING", "Landroidx/compose/animation/core/CubicBezierEasing;", "lib-isa-contributions_externalDebug", "viewState", "Lcom/robinhood/android/isa/contributions/IsaContributionHubViewState;", "showBottomSheet", "animatedProgress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionHubKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionHub3 {
    private static final int DURATION = 350;
    private static final CubicBezierEasing EASING = new CubicBezierEasing(0.33f, 0.0f, 0.1f, 1.0f);
    public static final String ISA_CONTRIBUTION_HUB_INFO_BANNER = "IsaContributionHubInfoBanner";
    private static final String PLACEHOLDER_AMOUNT = "£XX,XXX.XX";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$31(String str, IsaContributions2 isaContributions2, int i, Composer composer, int i2) {
        BottomBar(str, isaContributions2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$12(String str, String str2, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        Header(str, str2, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistorySection$lambda$30(HistorySectionState historySectionState, FragmentKey fragmentKey, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HistorySection(historySectionState, fragmentKey, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBanner$lambda$29(String str, IsaContributions2 isaContributions2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoBanner(str, isaContributions2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaContributionHub$lambda$4(String str, Modifier modifier, IsaContributionHubDuxo isaContributionHubDuxo, int i, int i2, Composer composer, int i3) {
        IsaContributionHub(str, modifier, isaContributionHubDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaxLottieWithDot$lambda$15(IsaContribution isaContribution, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MaxLottieWithDot(isaContribution, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeSelector$lambda$22(ImmutableList3 immutableList3, Integer num, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TimeSelector(immutableList3, num, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeSelectorItem$lambda$25(String str, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TimeSelectorItem(str, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getISA_CONTRIBUTION_HUB_INFO_BANNER$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsaContributionHubViewState IsaContributionHub$lambda$0(SnapshotState4<IsaContributionHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IsaContributionHub$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float MaxLottieWithDot$lambda$14$lambda$13(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IsaContributionHub(final String accountNumber, Modifier modifier, IsaContributionHubDuxo isaContributionHubDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        IsaContributionHubDuxo isaContributionHubDuxo2;
        Modifier modifier3;
        IsaContributionHubDuxo isaContributionHubDuxo3;
        Object objRememberedValue;
        final Modifier modifier4;
        final IsaContributionHubDuxo isaContributionHubDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(1945837294);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    isaContributionHubDuxo2 = isaContributionHubDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(isaContributionHubDuxo2) ? 256 : 128;
                    i3 |= i5;
                } else {
                    isaContributionHubDuxo2 = isaContributionHubDuxo;
                }
                i3 |= i5;
            } else {
                isaContributionHubDuxo2 = isaContributionHubDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        IsaContributionHubDuxo.InitArgs initArgs = new IsaContributionHubDuxo.InitArgs(accountNumber);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IsaContributionHubDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        isaContributionHubDuxo3 = (IsaContributionHubDuxo) baseDuxo;
                        i3 &= -897;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1945837294, i3, -1, "com.robinhood.android.isa.contributions.IsaContributionHub (IsaContributionHub.kt:87)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(isaContributionHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1231039815, true, new C199081(modifier5, accountNumber, lifecycleAwareNavigator, snapshotState4CollectAsStateWithLifecycle, isaContributionHubDuxo3, (SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    isaContributionHubDuxo4 = isaContributionHubDuxo3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                isaContributionHubDuxo3 = isaContributionHubDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(isaContributionHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                LifecycleAwareNavigator lifecycleAwareNavigator2 = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier3;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1231039815, true, new C199081(modifier52, accountNumber, lifecycleAwareNavigator2, snapshotState4CollectAsStateWithLifecycle2, isaContributionHubDuxo3, (SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
                isaContributionHubDuxo4 = isaContributionHubDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                isaContributionHubDuxo4 = isaContributionHubDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionHub3.IsaContributionHub$lambda$4(accountNumber, modifier4, isaContributionHubDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                    isaContributionHubDuxo3 = isaContributionHubDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(isaContributionHubDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                LifecycleAwareNavigator lifecycleAwareNavigator22 = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier522 = modifier3;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1231039815, true, new C199081(modifier522, accountNumber, lifecycleAwareNavigator22, snapshotState4CollectAsStateWithLifecycle22, isaContributionHubDuxo3, (SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier522;
                isaContributionHubDuxo4 = isaContributionHubDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: IsaContributionHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$1 */
    static final class C199081 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ LifecycleAwareNavigator $composeNavigator;
        final /* synthetic */ IsaContributionHubDuxo $duxo;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState<Boolean> $showBottomSheet$delegate;
        final /* synthetic */ SnapshotState4<IsaContributionHubViewState> $viewState$delegate;

        C199081(Modifier modifier, String str, LifecycleAwareNavigator lifecycleAwareNavigator, SnapshotState4<IsaContributionHubViewState> snapshotState4, IsaContributionHubDuxo isaContributionHubDuxo, SnapshotState<Boolean> snapshotState) {
            this.$modifier = modifier;
            this.$accountNumber = str;
            this.$composeNavigator = lifecycleAwareNavigator;
            this.$viewState$delegate = snapshotState4;
            this.$duxo = isaContributionHubDuxo;
            this.$showBottomSheet$delegate = snapshotState;
        }

        /* compiled from: IsaContributionHub.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$1$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ IsaContributionHubDuxo $duxo;
            final /* synthetic */ SnapshotState<Boolean> $showBottomSheet$delegate;
            final /* synthetic */ SnapshotState4<IsaContributionHubViewState> $viewState$delegate;

            AnonymousClass3(IsaContributionHubDuxo isaContributionHubDuxo, String str, SnapshotState4<IsaContributionHubViewState> snapshotState4, SnapshotState<Boolean> snapshotState) {
                this.$duxo = isaContributionHubDuxo;
                this.$accountNumber = str;
                this.$viewState$delegate = snapshotState4;
                this.$showBottomSheet$delegate = snapshotState;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                int i2;
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
                    ComposerKt.traceEventStart(623971912, i2, -1, "com.robinhood.android.isa.contributions.IsaContributionHub.<anonymous>.<anonymous> (IsaContributionHub.kt:113)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(companion, paddingValues), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierVerticalScroll$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM(), 7, null);
                IsaContributionHubDuxo isaContributionHubDuxo = this.$duxo;
                String str = this.$accountNumber;
                SnapshotState4<IsaContributionHubViewState> snapshotState4 = this.$viewState$delegate;
                final SnapshotState<Boolean> snapshotState = this.$showBottomSheet$delegate;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                String selectedContributed = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getSelectedContributed();
                StringResource selectedRemaining = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getSelectedRemaining();
                composer.startReplaceGroup(-1395382627);
                String string2 = selectedRemaining == null ? null : StringResource2.getString(selectedRemaining, composer, StringResource.$stable);
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objRememberedValue == companion3.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$1$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IsaContributionHub3.C199081.AnonymousClass3.invoke$lambda$3$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IsaContributionHub3.Header(selectedContributed, string2, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, (Function0) objRememberedValue, composer, 3072, 0);
                IsaContributionHub3.MaxLottieWithDot(IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getSelectedContribution(), AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), composer, 48, 0);
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                ImmutableList3<IsaContribution> contributions = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getContributions();
                if (contributions == null) {
                    contributions = extensions2.persistentListOf();
                }
                IsaContribution selectedContribution = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getSelectedContribution();
                Integer numValueOf = selectedContribution != null ? Integer.valueOf(selectedContribution.getTaxYear()) : null;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(isaContributionHubDuxo);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
                    objRememberedValue2 = new IsaContributionHub5(isaContributionHubDuxo);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                IsaContributionHub3.TimeSelector(contributions, numValueOf, (Function1) ((KFunction) objRememberedValue2), modifierM5146paddingqDBjuR0$default2, composer, 0, 0);
                IsaContributions2 contributionState = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getContributionState();
                composer.startReplaceGroup(-1395357034);
                if (contributionState == IsaContributions2.NONE || contributionState == IsaContributions2.SOME) {
                    IsaTabBannerConfig upsellConfig = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getUpsellConfig();
                    if (upsellConfig != null) {
                        composer.startReplaceGroup(-306173163);
                        IsaPromotionBanner.IsaPromotionBanner(upsellConfig, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM(), 0.0f, 2, null), composer, 0, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-305850267);
                        IsaContributionHub3.InfoBanner(str, contributionState, TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM(), 0.0f, 2, null), IsaContributionHub3.ISA_CONTRIBUTION_HUB_INFO_BANNER), composer, 0, 0);
                        composer.endReplaceGroup();
                    }
                } else if (contributionState != IsaContributions2.MAX && contributionState != null) {
                    throw new NoWhenBranchMatchedException();
                }
                composer.endReplaceGroup();
                HistorySectionState historyState = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getHistoryState();
                AccountsHistoryContract.Key historyFooterNavKey = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getHistoryFooterNavKey();
                composer.startReplaceGroup(-1395317097);
                if (historyState != null && historyFooterNavKey != null) {
                    IsaContributionHub3.HistorySection(historyState, historyFooterNavKey, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, HistorySectionState.$stable, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$1$lambda$0(SnapshotState snapshotState) {
                IsaContributionHub3.IsaContributionHub$lambda$3(snapshotState, true);
                return Unit.INSTANCE;
            }
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
                ComposerKt.traceEventStart(-1231039815, i, -1, "com.robinhood.android.isa.contributions.IsaContributionHub.<anonymous> (IsaContributionHub.kt:94)");
            }
            Modifier modifier = this.$modifier;
            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$composeNavigator;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1077803139, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt.IsaContributionHub.1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1077803139, i2, -1, "com.robinhood.android.isa.contributions.IsaContributionHub.<anonymous>.<anonymous> (IsaContributionHub.kt:97)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(IsaContributionHub.INSTANCE.m15713getLambda$901338902$lib_isa_contributions_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-93733314, true, new C502461(lifecycleAwareNavigator), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: IsaContributionHub.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C502461 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ LifecycleAwareNavigator $composeNavigator;

                    C502461(LifecycleAwareNavigator lifecycleAwareNavigator) {
                        this.$composeNavigator = lifecycleAwareNavigator;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator) {
                        LifecycleAwareNavigator.navigateUp$default(lifecycleAwareNavigator, false, 1, null);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-93733314, i, -1, "com.robinhood.android.isa.contributions.IsaContributionHub.<anonymous>.<anonymous>.<anonymous> (IsaContributionHub.kt:100)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(this.$composeNavigator);
                        final LifecycleAwareNavigator lifecycleAwareNavigator = this.$composeNavigator;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$1$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IsaContributionHub3.C199081.AnonymousClass1.C502461.invoke$lambda$1$lambda$0(lifecycleAwareNavigator);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composer, 54);
            final SnapshotState4<IsaContributionHubViewState> snapshotState4 = this.$viewState$delegate;
            final String str = this.$accountNumber;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(412765566, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt.IsaContributionHub.1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(412765566, i2, -1, "com.robinhood.android.isa.contributions.IsaContributionHub.<anonymous>.<anonymous> (IsaContributionHub.kt:105)");
                    }
                    IsaContributions2 contributionState = IsaContributionHub3.IsaContributionHub$lambda$0(snapshotState4).getContributionState();
                    if (contributionState != null) {
                        IsaContributionHub3.BottomBar(str, contributionState, composer2, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(623971912, true, new AnonymousClass3(this.$duxo, this.$accountNumber, this.$viewState$delegate, this.$showBottomSheet$delegate), composer, 54), composer, 805306800, 504);
            IsaContribution selectedContribution = IsaContributionHub3.IsaContributionHub$lambda$0(this.$viewState$delegate).getSelectedContribution();
            if (IsaContributionHub3.IsaContributionHub$lambda$2(this.$showBottomSheet$delegate) && selectedContribution != null) {
                String str2 = this.$accountNumber;
                int taxYear = selectedContribution.getTaxYear();
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState = this.$showBottomSheet$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$IsaContributionHub$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IsaContributionHub3.C199081.invoke$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IsaContributionBottomSheet4.IsaContributionBottomSheet(str2, taxYear, (Function0) objRememberedValue, null, null, composer, 384, 24);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            IsaContributionHub3.IsaContributionHub$lambda$3(snapshotState, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IsaContributionHub$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: IsaContributionHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionHubKt$BottomBar$1 */
    static final class C199061 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Context $context;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ IsaContributions2 $state;

        C199061(IsaContributions2 isaContributions2, String str, Navigator navigator, Context context) {
            this.$state = isaContributions2;
            this.$accountNumber = str;
            this.$navigator = navigator;
            this.$context = context;
        }

        public final void invoke(Composer composer, int i) {
            Tuples3 tuples3;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1075657384, i, -1, "com.robinhood.android.isa.contributions.BottomBar.<anonymous> (IsaContributionHub.kt:421)");
            }
            IsaContributions2 isaContributions2 = this.$state;
            String str = this.$accountNumber;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            if (isaContributions2 == IsaContributions2.MAX) {
                composer.startReplaceGroup(1115113568);
                tuples3 = new Tuples3(StringResources_androidKt.stringResource(C19913R.string.contribution_hub_max_contribution_helper_text, composer, 0), StringResources_androidKt.stringResource(C19913R.string.contribution_hub_cta_start_transfer, composer, 0), IsaContributionHub3.startTransferDeeplink(str));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1115402860);
                tuples3 = new Tuples3(null, StringResources_androidKt.stringResource(C19913R.string.contribution_hub_cta_add_money, composer, 0), IsaContributionHub3.addMoneyDeeplink(str));
                composer.endReplaceGroup();
            }
            String str2 = (String) tuples3.component1();
            String str3 = (String) tuples3.component2();
            final Uri uri = (Uri) tuples3.component3();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(uri);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$BottomBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IsaContributionHub3.C199061.invoke$lambda$2$lambda$1$lambda$0(navigator, context, uri);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, str2, null, false, null, null, (Function0) objRememberedValue, str3, false, null, false, null, null, false, null, false, composer, 0, 0, 65340);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Navigator navigator, Context context, Uri uri) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(final String str, final String str2, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function0<Unit> function03;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        Object objRememberedValue2;
        final Function0<Unit> function04;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final Function0<Unit> function05;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1482459326);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function05 = function02;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function02 = (Function0) objRememberedValue3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1482459326, i3, -1, "com.robinhood.android.isa.contributions.Header (IsaContributionHub.kt:198)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C19913R.string.contribution_hub_header, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    function03 = function02;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(str != null ? PLACEHOLDER_AMOUNT : str, ModifiersKt.bentoPlaceholder$default(companion4, str != null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (i3 & 7168) != 2048;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue2 == companion.getEmpty()) {
                        function04 = function03;
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IsaContributionHub3.Header$lambda$11$lambda$9$lambda$8(function04);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        function04 = function03;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5146paddingqDBjuR0$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion4, str2 != null, null, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-826425520);
                    String strStringResource2 = str2 != null ? StringResources_androidKt.stringResource(C19913R.string.contribution_hub_remaining, new Object[]{PLACEHOLDER_AMOUNT}, composerStartRestartGroup, 0) : str2;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Function0<Unit> function06 = function04;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierBentoPlaceholder$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composer2, 0, 0, 8184);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer2, 0), bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer2, i6).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer2, BentoIcon4.Size16.$stable, 48);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function05 = function06;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IsaContributionHub3.Header$lambda$12(str, str2, modifier3, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String strStringResource3 = StringResources_androidKt.stringResource(C19913R.string.contribution_hub_header, composerStartRestartGroup, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    function03 = function02;
                    BentoText2.m20747BentoText38GnDrw(strStringResource3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(str != null ? PLACEHOLDER_AMOUNT : str, ModifiersKt.bentoPlaceholder$default(companion42, str != null, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 7168) != 2048) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        function04 = function03;
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IsaContributionHub3.Header$lambda$11$lambda$9$lambda$8(function04);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierM5146paddingqDBjuR0$default2, interactionSource32, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier modifierBentoPlaceholder$default2 = ModifiersKt.bentoPlaceholder$default(companion42, str2 != null, null, 2, null);
                            composerStartRestartGroup.startReplaceGroup(-826425520);
                            if (str2 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            Function0<Unit> function062 = function04;
                            BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierBentoPlaceholder$default2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composer2, 0, 0, 8184);
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer2, 0), bentoTheme2.getColors(composer2, i62).m21426getFg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion42, bentoTheme2.getSpacing(composer2, i62).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer2, BentoIcon4.Size16.$stable, 48);
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function05 = function062;
                            modifier3 = modifier52;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$11$lambda$9$lambda$8(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MaxLottieWithDot(final IsaContribution isaContribution, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1775558216);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(isaContribution) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1775558216, i3, -1, "com.robinhood.android.isa.contributions.MaxLottieWithDot (IsaContributionHub.kt:240)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Float progress = IsaContributions4.getProgress(isaContribution);
            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(progress != null ? progress.floatValue() : 0.0f, AnimationSpecKt.tween$default(DURATION, 0, EASING, 2, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            float fMaxLottieWithDot$lambda$14$lambda$13 = MaxLottieWithDot$lambda$14$lambda$13(snapshotState4AnimateFloatAsState);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            IsaContributionLotties.MaxLottie(fMaxLottieWithDot$lambda$14$lambda$13, boxScopeInstance.matchParentSize(companion2), composerStartRestartGroup, 0, 0);
            IsaContributionLotties.DotLottie(MaxLottieWithDot$lambda$14$lambda$13(snapshotState4AnimateFloatAsState), boxScopeInstance.matchParentSize(companion2), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IsaContributionHub3.MaxLottieWithDot$lambda$15(isaContribution, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeSelector(final ImmutableList3<IsaContribution> immutableList3, final Integer num, final Function1<? super Integer, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-525974142);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-525974142, i3, -1, "com.robinhood.android.isa.contributions.TimeSelector (IsaContributionHub.kt:269)");
                }
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                Integer numValueOf = Integer.valueOf(immutableList3.size());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(immutableList3) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new IsaContributionHub6(immutableList3, lazyListStateRememberLazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = Arrangement.INSTANCE.m5090spacedByD5KLDUw(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), Alignment.INSTANCE.getCenterHorizontally());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(immutableList3) | ((i3 & 896) == 256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IsaContributionHub3.TimeSelector$lambda$21$lambda$20(immutableList3, num, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = (i3 >> 9) & 14;
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyRow(modifier4, lazyListStateRememberLazyListState, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalM5090spacedByD5KLDUw, null, null, false, null, (Function1) objRememberedValue2, composer2, i6, 488);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionHub3.TimeSelector$lambda$22(immutableList3, num, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Integer numValueOf2 = Integer.valueOf(immutableList3.size());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(immutableList3) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new IsaContributionHub6(immutableList3, lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = PaddingKt.m5137PaddingValuesYgX7TsA$default(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                Arrangement.Horizontal horizontalM5090spacedByD5KLDUw2 = Arrangement.INSTANCE.m5090spacedByD5KLDUw(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM(), Alignment.INSTANCE.getCenterHorizontally());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(immutableList3) | ((i3 & 896) == 256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IsaContributionHub3.TimeSelector$lambda$21$lambda$20(immutableList3, num, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    int i62 = (i3 >> 9) & 14;
                    Modifier modifier42 = modifier2;
                    composer2 = composerStartRestartGroup;
                    LazyDslKt.LazyRow(modifier42, lazyListStateRememberLazyListState, paddingValuesM5137PaddingValuesYgX7TsA$default2, false, horizontalM5090spacedByD5KLDUw2, null, null, false, null, (Function1) objRememberedValue2, composer2, i62, 488);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeSelector$lambda$21$lambda$20(final ImmutableList3 immutableList3, final Integer num, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final Function1 function12 = new Function1() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsaContributionHub3.TimeSelector$lambda$21$lambda$20$lambda$17((IsaContribution) obj);
            }
        };
        final C19902x99cdb6c9 c19902x99cdb6c9 = new Function1() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$TimeSelector$lambda$21$lambda$20$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(IsaContribution isaContribution) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((IsaContribution) obj);
            }
        };
        LazyRow.items(immutableList3.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$TimeSelector$lambda$21$lambda$20$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num2) {
                return invoke(num2.intValue());
            }

            public final Object invoke(int i) {
                return function12.invoke(immutableList3.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$TimeSelector$lambda$21$lambda$20$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num2) {
                return invoke(num2.intValue());
            }

            public final Object invoke(int i) {
                return c19902x99cdb6c9.invoke(immutableList3.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$TimeSelector$lambda$21$lambda$20$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num2, Composer composer, Integer num3) {
                invoke(lazyItemScope, num2.intValue(), composer, num3.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final IsaContribution isaContribution = (IsaContribution) immutableList3.get(i);
                composer.startReplaceGroup(-1481513706);
                int taxYear = isaContribution.getTaxYear();
                Integer num2 = num;
                boolean z = num2 != null && taxYear == num2.intValue();
                String taxYearLabel = isaContribution.getTaxYearLabel();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(isaContribution);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$TimeSelector$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(Integer.valueOf(isaContribution.getTaxYear()));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IsaContributionHub3.TimeSelectorItem(taxYearLabel, z, (Function0) objRememberedValue, null, composer, 0, 8);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TimeSelector$lambda$21$lambda$20$lambda$17(IsaContribution it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getTaxYear());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeSelectorItem(final String str, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Modifier modifier2;
        boolean z2;
        Object objRememberedValue;
        long jM21425getFg0d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2044035649);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2044035649, i3, -1, "com.robinhood.android.isa.contributions.TimeSelectorItem (IsaContributionHub.kt:306)");
                }
                Modifier modifierClip = Clip.clip(modifier4, RoundedCornerShape2.RoundedCornerShape(50));
                composerStartRestartGroup.startReplaceGroup(5004770);
                z2 = (i3 & 896) != 256;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IsaContributionHub3.TimeSelectorItem$lambda$24$lambda$23(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null);
                composerStartRestartGroup.startReplaceGroup(1518215548);
                long jM21425getFg0d7_KjU2 = !z ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM4893clickableXHw0xAI$default, jM21425getFg0d7_KjU2, null, 2, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(1));
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(1518226691);
                    jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1518225859);
                    jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, modifierM5143paddingVpY3zN4, Color.m6701boximpl(jM21425getFg0d7_KjU), null, !z ? FontWeight.INSTANCE.getBold() : null, null, null, 0, false, 0, 0, null, 0, textS, composer2, i3 & 14, 0, 8168);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionHub3.TimeSelectorItem$lambda$25(str, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierClip2 = Clip.clip(modifier4, RoundedCornerShape2.RoundedCornerShape(50));
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 896) != 256) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IsaContributionHub3.TimeSelectorItem$lambda$24$lambda$23(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierClip2, false, null, null, (Function0) objRememberedValue, 7, null);
                composerStartRestartGroup.startReplaceGroup(1518215548);
                long jM21425getFg0d7_KjU22 = !z ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierM4893clickableXHw0xAI$default2, jM21425getFg0d7_KjU22, null, 2, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(1));
                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, modifierM5143paddingVpY3zN42, Color.m6701boximpl(jM21425getFg0d7_KjU), null, !z ? FontWeight.INSTANCE.getBold() : null, null, null, 0, false, 0, 0, null, 0, textS2, composer2, i3 & 14, 0, 8168);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeSelectorItem$lambda$24$lambda$23(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoBanner(final String str, final IsaContributions2 isaContributions2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        final Context context;
        final Navigator navigator;
        IsaContributions2 isaContributions22;
        int i4;
        int i5;
        String strStringResource;
        AnnotatedString.Builder builder;
        boolean zChangedInstance;
        Object objRememberedValue;
        int iPushLink;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1604959633);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(isaContributions2.ordinal()) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1604959633, i3, -1, "com.robinhood.android.isa.contributions.InfoBanner (IsaContributionHub.kt:330)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                isaContributions22 = IsaContributions2.NONE;
                if (isaContributions2 != isaContributions22) {
                    i4 = C19913R.string.contribution_hub_no_contribution_info_banner_text;
                } else {
                    i4 = C19913R.string.contribution_hub_some_contribution_info_banner_text;
                }
                String strStringResource2 = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                if (isaContributions2 != isaContributions22) {
                    i5 = C19913R.string.contribution_hub_no_contribution_info_banner_link_text;
                } else {
                    i5 = C19913R.string.contribution_hub_some_contribution_info_banner_link_text;
                }
                strStringResource = StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-472921494);
                builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(strStringResource2);
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null), null, null, null, 14, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$InfoBanner$annotatedText$1$1$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, IsaContributionHub3.startTransferDeeplink(str), null, null, false, null, 60, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                iPushLink = builder.pushLink(new LinkAnnotation.Clickable("startTransfer", textLinkStyles, (LinkInteractionListener) objRememberedValue));
                try {
                    builder.append(strStringResource);
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushLink);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.TRANSFERS_24);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedString, null, bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), modifier3, size24, null, null, composerStartRestartGroup, (57344 & (i3 << 6)) | 48 | (BentoIcon4.Size24.$stable << 15), 192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } catch (Throwable th) {
                    builder.pop(iPushLink);
                    throw th;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionHub3.InfoBanner$lambda$29(str, isaContributions2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            isaContributions22 = IsaContributions2.NONE;
            if (isaContributions2 != isaContributions22) {
            }
            String strStringResource22 = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
            if (isaContributions2 != isaContributions22) {
            }
            strStringResource = StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-472921494);
            builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(strStringResource22);
            builder.append(PlaceholderUtils.XXShortPlaceholderText);
            TextLinkStyles textLinkStyles2 = new TextLinkStyles(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null), null, null, null, 14, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 14) == 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$InfoBanner$annotatedText$1$1$1
                    @Override // androidx.compose.p011ui.text.LinkInteractionListener
                    public final void onClick(LinkAnnotation it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, IsaContributionHub3.startTransferDeeplink(str), null, null, false, null, 60, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                iPushLink = builder.pushLink(new LinkAnnotation.Clickable("startTransfer", textLinkStyles2, (LinkInteractionListener) objRememberedValue));
                builder.append(strStringResource);
                Unit unit2 = Unit.INSTANCE;
                builder.pop(iPushLink);
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.TRANSFERS_24);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedString2, null, bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i72).m21372getBg20d7_KjU(), modifier3, size242, null, null, composerStartRestartGroup, (57344 & (i3 << 6)) | 48 | (BentoIcon4.Size24.$stable << 15), 192);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistorySection(final HistorySectionState historySectionState, final FragmentKey fragmentKey, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-211995429);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(historySectionState) : composerStartRestartGroup.changedInstance(historySectionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fragmentKey) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-211995429, i3, -1, "com.robinhood.android.isa.contributions.HistorySection (IsaContributionHub.kt:387)");
                }
                Modifier modifier5 = modifier4;
                HistorySection4.HistorySection(historySectionState, modifier5, null, ComposableLambda3.rememberComposableLambda(1115860636, true, new C199071((Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fragmentKey), composerStartRestartGroup, 54), false, false, false, false, null, composerStartRestartGroup, 199680 | HistorySectionState.$stable | (i3 & 14) | ((i3 >> 3) & 112), 468);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionHub3.HistorySection$lambda$30(historySectionState, fragmentKey, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            HistorySection4.HistorySection(historySectionState, modifier52, null, ComposableLambda3.rememberComposableLambda(1115860636, true, new C199071((Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fragmentKey), composerStartRestartGroup, 54), false, false, false, false, null, composerStartRestartGroup, 199680 | HistorySectionState.$stable | (i3 & 14) | ((i3 >> 3) & 112), 468);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: IsaContributionHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionHubKt$HistorySection$1 */
    static final class C199071 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ FragmentKey $footerNavKey;
        final /* synthetic */ Navigator $navigator;

        C199071(Navigator navigator, Context context, FragmentKey fragmentKey) {
            this.$navigator = navigator;
            this.$context = context;
            this.$footerNavKey = fragmentKey;
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
                ComposerKt.traceEventStart(1115860636, i, -1, "com.robinhood.android.isa.contributions.HistorySection.<anonymous> (IsaContributionHub.kt:395)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C19913R.string.contribution_hub_history_section_cta, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$footerNavKey);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final FragmentKey fragmentKey = this.$footerNavKey;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$HistorySection$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IsaContributionHub3.C199071.invoke$lambda$1$lambda$0(navigator, context, fragmentKey);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            HistoryRowsKt.HistoryFooterTextButton(strStringResource, (Function0) objRememberedValue, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, FragmentKey fragmentKey) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar(final String str, final IsaContributions2 isaContributions2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-638939642);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(isaContributions2.ordinal()) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-638939642, i2, -1, "com.robinhood.android.isa.contributions.BottomBar (IsaContributionHub.kt:413)");
            }
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1075657384, true, new C199061(isaContributions2, str, (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 54), composer2, 805306368, 507);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionHubKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IsaContributionHub3.BottomBar$lambda$31(str, isaContributions2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Uri startTransferDeeplink(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Uri.parse("robinhood://isa_acats_create?accountNumber=" + accountNumber);
    }

    public static final Uri addMoneyDeeplink(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return Uri.parse("robinhood://transfer_funds?transfer_direction=deposit&entry_point=isa_contribution&to_account_id=" + accountNumber);
    }
}
