package com.robinhood.android.crypto.tab.p093ui.interest;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.crypto.tab.p093ui.interest.CryptoHomeInterestViewState;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeInterestSection.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a?\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001ao\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0003¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001c\u001a7\u0010\u001d\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002"}, m3636d2 = {"CryptoHomeInterestSection", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDuxo;Landroidx/compose/runtime/Composer;II)V", "PreEnrollmentComposable", "title", "", CarResultComposable2.BODY, "Landroidx/compose/ui/text/AnnotatedString;", AccountOverviewOptionsSettingCard4.CTA, "onClickCta", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "EnrolledComposable", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/tab/ui/interest/DataRowWithIconClickHandler;", "onClickTitle", "badgeText", "onClickBadge", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RowInfoDialog", "content", "Lcom/robinhood/android/crypto/tab/ui/interest/InfoDialogContent;", "onDismiss", "(Lcom/robinhood/android/crypto/tab/ui/interest/InfoDialogContent;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HowItWorksBottomSheet", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "protectedAmount", "settingsDeeplink", "extraBodyText", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "PreEnrollmentPreview", "(Landroidx/compose/runtime/Composer;I)V", "EnrolledPreview", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState;", "showRowInfoDialogContent", "openBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeInterestSection4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeInterestSection$lambda$28(Modifier modifier, CryptoHomeInterestDuxo cryptoHomeInterestDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeInterestSection(modifier, cryptoHomeInterestDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrolledComposable$lambda$42(String str, ImmutableList immutableList, String str2, Function0 function0, Function0 function02, Modifier modifier, String str3, Function0 function03, int i, int i2, Composer composer, int i3) {
        EnrolledComposable(str, immutableList, str2, function0, function02, modifier, str3, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrolledPreview$lambda$53(int i, Composer composer, int i2) {
        EnrolledPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HowItWorksBottomSheet$lambda$51(RhModalBottomSheet5 rhModalBottomSheet5, String str, String str2, Modifier modifier, String str3, int i, int i2, Composer composer, int i3) {
        HowItWorksBottomSheet(rhModalBottomSheet5, str, str2, modifier, str3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreEnrollmentComposable$lambda$32(String str, AnnotatedString annotatedString, String str2, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        PreEnrollmentComposable(str, annotatedString, str2, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreEnrollmentPreview$lambda$52(int i, Composer composer, int i2) {
        PreEnrollmentPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowInfoDialog$lambda$43(InfoDialogContent infoDialogContent, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RowInfoDialog(infoDialogContent, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeInterestSection(Modifier modifier, CryptoHomeInterestDuxo cryptoHomeInterestDuxo, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final CryptoHomeInterestDuxo cryptoHomeInterestDuxo2;
        Modifier modifier3;
        CryptoHomeInterestDuxo cryptoHomeInterestDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        CryptoHomeInterestViewState cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0;
        final String settingsDeeplink;
        final CryptoHomeInterestViewState cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02;
        Modifier modifier4;
        int i4;
        final String str;
        final SnapshotState snapshotState;
        SnapshotState snapshotState2;
        String str2;
        CryptoHomeInterestViewState.PreEnrollment preEnrollment;
        AnnotatedString annotatedString;
        InfoDialogContent infoDialogContentCryptoHomeInterestSection$lambda$3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1578065471);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cryptoHomeInterestDuxo2 = cryptoHomeInterestDuxo;
                int i6 = composerStartRestartGroup.changedInstance(cryptoHomeInterestDuxo2) ? 32 : 16;
                i3 |= i6;
            } else {
                cryptoHomeInterestDuxo2 = cryptoHomeInterestDuxo;
            }
            i3 |= i6;
        } else {
            cryptoHomeInterestDuxo2 = cryptoHomeInterestDuxo;
        }
        int i7 = i3;
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeInterestDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$CryptoHomeInterestSection$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$CryptoHomeInterestSection$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i7 &= -113;
                    cryptoHomeInterestDuxo3 = (CryptoHomeInterestDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1578065471, i7, -1, "com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSection (CryptoHomeInterestSection.kt:64)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeInterestDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$2$lambda$1();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$6$lambda$5();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState snapshotState4 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0 = CryptoHomeInterestSection$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (!(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0 instanceof CryptoHomeInterestViewState.Enrolled)) {
                    settingsDeeplink = ((CryptoHomeInterestViewState.Enrolled) cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0).getSettingsDeeplink();
                } else if (Intrinsics.areEqual(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0, CryptoHomeInterestViewState.Loading.INSTANCE)) {
                    settingsDeeplink = "";
                } else {
                    if (!(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0 instanceof CryptoHomeInterestViewState.PreEnrollment)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    settingsDeeplink = ((CryptoHomeInterestViewState.PreEnrollment) cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0).getSettingsDeeplink();
                }
                cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02 = CryptoHomeInterestSection$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (!Intrinsics.areEqual(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02, CryptoHomeInterestViewState.Loading.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(-562739135);
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = snapshotState4;
                    str = settingsDeeplink;
                    modifier4 = modifier3;
                    i4 = 5004770;
                } else if (cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02 instanceof CryptoHomeInterestViewState.PreEnrollment) {
                    composerStartRestartGroup.startReplaceGroup(-562635874);
                    CryptoHomeInterestViewState.PreEnrollment preEnrollment2 = (CryptoHomeInterestViewState.PreEnrollment) cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02;
                    StringResource title = preEnrollment2.getTitle();
                    int i8 = StringResource.$stable;
                    String textAsString = StringResources6.getTextAsString(title, composerStartRestartGroup, i8);
                    TextWithPartialHighlight subtitle = preEnrollment2.getSubtitle();
                    composerStartRestartGroup.startReplaceGroup(397496921);
                    if (subtitle == null) {
                        snapshotState2 = snapshotState4;
                        str2 = settingsDeeplink;
                        preEnrollment = preEnrollment2;
                        annotatedString = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(397498081);
                        snapshotState2 = snapshotState4;
                        str2 = settingsDeeplink;
                        preEnrollment = preEnrollment2;
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        builder.append(StringResources6.getText(subtitle.getPreHighlight(), composerStartRestartGroup, i8));
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        composerStartRestartGroup.startReplaceGroup(397502515);
                        int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        try {
                            builder.append(StringResources6.getText(subtitle.getHighlight(), composerStartRestartGroup, i8));
                            builder.pop(iPushStyle);
                            composerStartRestartGroup.endReplaceGroup();
                            builder.append(PlaceholderUtils.XXShortPlaceholderText);
                            builder.append(StringResources6.getText(subtitle.getPostHighlight(), composerStartRestartGroup, i8));
                            AnnotatedString annotatedString2 = builder.toAnnotatedString();
                            composerStartRestartGroup.endReplaceGroup();
                            annotatedString = annotatedString2;
                        } catch (Throwable th) {
                            builder.pop(iPushStyle);
                            throw th;
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    String ctaText = preEnrollment.getCtaText();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$13$lambda$12(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02, navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    Modifier modifier5 = modifier3;
                    PreEnrollmentComposable(textAsString, annotatedString, ctaText, modifier5, (Function0) objRememberedValue4, composer2, (i7 << 9) & 7168, 0);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                    modifier4 = modifier5;
                    str = str2;
                    i4 = 5004770;
                    snapshotState = snapshotState2;
                } else {
                    Modifier modifier6 = modifier3;
                    if (!(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02 instanceof CryptoHomeInterestViewState.Enrolled)) {
                        composerStartRestartGroup.startReplaceGroup(397489695);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-561497213);
                    CryptoHomeInterestViewState.Enrolled enrolled = (CryptoHomeInterestViewState.Enrolled) cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02;
                    String textAsString2 = StringResources6.getTextAsString(enrolled.getTitle(), composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.startReplaceGroup(397533066);
                    ImmutableList<DataRowWithInfoDialogContent> dataRows = enrolled.getDataRows();
                    modifier4 = modifier6;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataRows, 10));
                    Iterator<DataRowWithInfoDialogContent> it = dataRows.iterator();
                    while (it.hasNext()) {
                        final DataRowWithInfoDialogContent next = it.next();
                        Iterator<DataRowWithInfoDialogContent> it2 = it;
                        String str3 = textAsString2;
                        StringResource label = next.getLabel();
                        CryptoHomeInterestViewState.Enrolled enrolled2 = enrolled;
                        int i9 = StringResource.$stable;
                        int i10 = i7;
                        AnnotatedString annotatedString3 = new AnnotatedString(StringResources6.getTextAsString(label, composerStartRestartGroup, i9), null, 2, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString3, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i11).m21425getFg0d7_KjU()), next.getInfoDialogContent() == null ? null : new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i11).m21426getFg20d7_KjU()), new AnnotatedString(StringResources6.getTextAsString(next.getValue(), composerStartRestartGroup, i9), null, 2, null), null, null, null, null, false, false, 4033, null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = composerStartRestartGroup.changed(snapshotState3) | composerStartRestartGroup.changedInstance(next);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$16$lambda$15$lambda$14(next, snapshotState3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        arrayList.add(new DataRowWithIconClickHandler(bentoDataRowState, (Function0) objRememberedValue5));
                        it = it2;
                        textAsString2 = str3;
                        enrolled = enrolled2;
                        i7 = i10;
                    }
                    String str4 = textAsString2;
                    CryptoHomeInterestViewState.Enrolled enrolled3 = enrolled;
                    int i12 = i7;
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                    String ctaText2 = enrolled3.getCtaText();
                    StringResource apyBadge = enrolled3.getApyBadge();
                    composerStartRestartGroup.startReplaceGroup(397580688);
                    String textAsString3 = apyBadge == null ? null : StringResources6.getTextAsString(apyBadge, composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$18$lambda$17(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02, navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    Function0 function0 = (Function0) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(settingsDeeplink);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$20$lambda$19(navigator, context, settingsDeeplink);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function02 = (Function0) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$22$lambda$21(snapshotState4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer3 = composerStartRestartGroup;
                    i4 = 5004770;
                    str = settingsDeeplink;
                    snapshotState = snapshotState4;
                    EnrolledComposable(str4, persistentList, ctaText2, function0, function02, modifier4, textAsString3, (Function0) objRememberedValue8, composer3, (BentoDataRowState.$stable << 3) | ((i12 << 15) & 458752), 0);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endReplaceGroup();
                }
                infoDialogContentCryptoHomeInterestSection$lambda$3 = CryptoHomeInterestSection$lambda$3(snapshotState3);
                composerStartRestartGroup.startReplaceGroup(397586098);
                if (infoDialogContentCryptoHomeInterestSection$lambda$3 != null) {
                    composerStartRestartGroup.startReplaceGroup(i4);
                    boolean zChanged3 = composerStartRestartGroup.changed(snapshotState3);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$25$lambda$24$lambda$23(snapshotState3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer4 = composerStartRestartGroup;
                    RowInfoDialog(infoDialogContentCryptoHomeInterestSection$lambda$3, (Function0) objRememberedValue9, null, composer4, StringResource.$stable, 4);
                    composerStartRestartGroup = composer4;
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                if (CryptoHomeInterestSection$lambda$7(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(i4);
                    boolean zChanged4 = composerStartRestartGroup.changed(snapshotState);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$27$lambda$26(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer5 = composerStartRestartGroup;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue10, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2), null, 0L, ComposableLambda3.rememberComposableLambda(-1840987277, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt.CryptoHomeInterestSection.9
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer6, Integer num) {
                            invoke(rhModalBottomSheet5, composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer6, int i13) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i13 & 6) == 0) {
                                i13 |= (i13 & 8) == 0 ? composer6.changed(RhModalBottomSheet) : composer6.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i13 & 19) == 18 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1840987277, i13, -1, "com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSection.<anonymous> (CryptoHomeInterestSection.kt:166)");
                            }
                            final String str5 = str;
                            final SnapshotState4<CryptoHomeInterestViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1634800514, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt.CryptoHomeInterestSection.9.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                    invoke(composer7, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer7, int i14) {
                                    if ((i14 & 3) == 2 && composer7.getSkipping()) {
                                        composer7.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1634800514, i14, -1, "com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSection.<anonymous>.<anonymous> (CryptoHomeInterestSection.kt:167)");
                                    }
                                    CryptoHomeInterestViewState cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$03 = CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$0(snapshotState42);
                                    CryptoHomeInterestViewState.Enrolled enrolled4 = cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$03 instanceof CryptoHomeInterestViewState.Enrolled ? (CryptoHomeInterestViewState.Enrolled) cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$03 : null;
                                    String protectedAmountValue = enrolled4 != null ? enrolled4.getProtectedAmountValue() : null;
                                    if (protectedAmountValue == null) {
                                        protectedAmountValue = "";
                                    }
                                    String str6 = protectedAmountValue;
                                    CryptoHomeInterestViewState cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$04 = CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$0(snapshotState42);
                                    if (cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$04 instanceof CryptoHomeInterestViewState.Enrolled) {
                                        composer7.startReplaceGroup(-1707544103);
                                        StringResource feeDisclaimer = ((CryptoHomeInterestViewState.Enrolled) cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$04).getFeeDisclaimer();
                                        string = feeDisclaimer != null ? StringResource2.getString(feeDisclaimer, composer7, StringResource.$stable) : null;
                                        composer7.endReplaceGroup();
                                    } else if (Intrinsics.areEqual(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$04, CryptoHomeInterestViewState.Loading.INSTANCE)) {
                                        composer7.startReplaceGroup(-1707469921);
                                        composer7.endReplaceGroup();
                                    } else {
                                        if (!(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$04 instanceof CryptoHomeInterestViewState.PreEnrollment)) {
                                            composer7.startReplaceGroup(914745763);
                                            composer7.endReplaceGroup();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        composer7.startReplaceGroup(-1707372487);
                                        StringResource feeDisclaimer2 = ((CryptoHomeInterestViewState.PreEnrollment) cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$04).getFeeDisclaimer();
                                        string = feeDisclaimer2 != null ? StringResource2.getString(feeDisclaimer2, composer7, StringResource.$stable) : null;
                                        composer7.endReplaceGroup();
                                    }
                                    CryptoHomeInterestSection4.HowItWorksBottomSheet(RhModalBottomSheet, str6, str5, null, string, composer7, RhModalBottomSheet5.$stable, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer6, 54), composer6, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer5, 1572864, 54);
                    composerStartRestartGroup = composer5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoHomeInterestDuxo2 = cryptoHomeInterestDuxo3;
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                }
                modifier3 = modifier2;
            }
            cryptoHomeInterestDuxo3 = cryptoHomeInterestDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<? extends CryptoHomeInterestViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeInterestDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState32 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr22 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState42 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0 = CryptoHomeInterestSection$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
            if (!(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$0 instanceof CryptoHomeInterestViewState.Enrolled)) {
            }
            cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02 = CryptoHomeInterestSection$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
            if (!Intrinsics.areEqual(cryptoHomeInterestViewStateCryptoHomeInterestSection$lambda$02, CryptoHomeInterestViewState.Loading.INSTANCE)) {
            }
            infoDialogContentCryptoHomeInterestSection$lambda$3 = CryptoHomeInterestSection$lambda$3(snapshotState32);
            composerStartRestartGroup.startReplaceGroup(397586098);
            if (infoDialogContentCryptoHomeInterestSection$lambda$3 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (CryptoHomeInterestSection$lambda$7(snapshotState)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            cryptoHomeInterestDuxo2 = cryptoHomeInterestDuxo3;
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeInterestSection4.CryptoHomeInterestSection$lambda$28(modifier2, cryptoHomeInterestDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoHomeInterestSection$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoHomeInterestSection$lambda$6$lambda$5() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void CryptoHomeInterestSection$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoHomeInterestViewState CryptoHomeInterestSection$lambda$0(SnapshotState4<? extends CryptoHomeInterestViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final InfoDialogContent CryptoHomeInterestSection$lambda$3(SnapshotState<InfoDialogContent> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean CryptoHomeInterestSection$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeInterestSection$lambda$13$lambda$12(CryptoHomeInterestViewState cryptoHomeInterestViewState, Navigator navigator, Context context) {
        CryptoHomeInterestViewState.PreEnrollment preEnrollment = (CryptoHomeInterestViewState.PreEnrollment) cryptoHomeInterestViewState;
        if (!StringsKt.isBlank(preEnrollment.getCtaDeeplink())) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(preEnrollment.getCtaDeeplink()), null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeInterestSection$lambda$16$lambda$15$lambda$14(DataRowWithInfoDialogContent dataRowWithInfoDialogContent, SnapshotState snapshotState) {
        snapshotState.setValue(dataRowWithInfoDialogContent.getInfoDialogContent());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeInterestSection$lambda$18$lambda$17(CryptoHomeInterestViewState cryptoHomeInterestViewState, Navigator navigator, Context context) {
        CryptoHomeInterestViewState.Enrolled enrolled = (CryptoHomeInterestViewState.Enrolled) cryptoHomeInterestViewState;
        if (!StringsKt.isBlank(enrolled.getCtaDeeplink())) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(enrolled.getCtaDeeplink()), null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeInterestSection$lambda$20$lambda$19(Navigator navigator, Context context, String str) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(str), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeInterestSection$lambda$22$lambda$21(SnapshotState snapshotState) {
        CryptoHomeInterestSection$lambda$8(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeInterestSection$lambda$25$lambda$24$lambda$23(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeInterestSection$lambda$27$lambda$26(SnapshotState snapshotState) {
        CryptoHomeInterestSection$lambda$8(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PreEnrollmentComposable(final String str, final AnnotatedString annotatedString, final String str2, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1213457419);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 6) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(annotatedString) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1213457419, i3, -1, "com.robinhood.android.crypto.tab.ui.interest.PreEnrollmentComposable (CryptoHomeInterestSection.kt:189)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        int i6 = i3;
                        Modifier modifier5 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(str3, Row6.INSTANCE.weight(companion3, 1.0f, false), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, i3 & 14, 0, 8188);
                        composer2 = composerStartRestartGroup;
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()), composer2, 0);
                        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_section_badge_new, composer2, 0), null, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21456getPositive0d7_KjU()), null, false, null, null, composer2, 12582912, 118);
                        composer2.endNode();
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                        composer2.startReplaceGroup(-1030619954);
                        if (annotatedString != null) {
                            BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8190);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, str2, null, null, null, false, null, composer2, ((i6 >> 12) & 14) | ((i6 >> 3) & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoHomeInterestSection4.PreEnrollmentComposable$lambda$32(str, annotatedString, str2, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                if ((i3 & 9363) != 9362) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            int i62 = i3;
                            Modifier modifier52 = modifier4;
                            BentoText2.m20747BentoText38GnDrw(str3, Row6.INSTANCE.weight(companion32, 1.0f, false), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, i3 & 14, 0, 8188);
                            composer2 = composerStartRestartGroup;
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme2.getSpacing(composer2, i52).m21593getSmallD9Ej5fM()), composer2, 0);
                            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_section_badge_new, composer2, 0), null, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i52).m21456getPositive0d7_KjU()), null, false, null, null, composer2, 12582912, 118);
                            composer2.endNode();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM()), composer2, 0);
                            composer2.startReplaceGroup(-1030619954);
                            if (annotatedString != null) {
                            }
                            composer2.endReplaceGroup();
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function0, str2, null, null, null, false, null, composer2, ((i62 >> 12) & 14) | ((i62 >> 3) & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 16) == 0) {
            }
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03f5 A[LOOP:0: B:168:0x03ef->B:170:0x03f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EnrolledComposable(final String str, final ImmutableList<DataRowWithIconClickHandler> immutableList, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, String str3, Function0<Unit> function03, Composer composer, final int i, final int i2) {
        String str4;
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        String str5;
        int i6;
        int i7;
        String str6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Modifier.Companion companion;
        String str7;
        final String str8;
        final Modifier modifier3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1627185023);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str4 = str;
        } else if ((i & 6) == 0) {
            str4 = str;
            i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                i4 = i2 & 32;
                if (i4 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                    i5 = i2 & 64;
                    if (i5 != 0) {
                        if ((1572864 & i) == 0) {
                            str5 = str3;
                            i3 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
                        }
                        i6 = i2 & 128;
                        int i8 = i3;
                        if (i6 != 0) {
                            i8 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
                        }
                        i7 = i8;
                        if ((i7 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function04 = function03;
                            modifier3 = modifier2;
                            str8 = str5;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            str6 = i5 == 0 ? null : str5;
                            Function0<Unit> function05 = i6 == 0 ? null : function03;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1627185023, i7, -1, "com.robinhood.android.crypto.tab.ui.interest.EnrolledComposable (CryptoHomeInterestSection.kt:231)");
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
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor);
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
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor2);
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
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            int i10 = i7 & 57344;
                            z = i10 != 16384;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoHomeInterestSection4.EnrolledComposable$lambda$41$lambda$39$lambda$34$lambda$33(function02);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion4, false, null, null, (Function0) objRememberedValue, 7, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor3);
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            final Function0<Unit> function06 = function05;
                            BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleMedium(), composerStartRestartGroup, i7 & 14, 0, 8190);
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                            Modifier modifier5 = modifier4;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", bentoTheme.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU(), null, function02, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48 | i10, 40);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(1089743955);
                            if (str6 != null) {
                                str7 = str6;
                                companion = companion4;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean z2 = (i7 & 29360128) == 8388608;
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda18
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoHomeInterestSection4.m1902x3b20f49e(function06);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                Function0 function07 = (Function0) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                String str9 = str6;
                                companion = companion4;
                                InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(str9, null, null, null, false, null, function07, composerStartRestartGroup, 0, 62);
                                str7 = str9;
                                Unit unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-50707317);
                            for (DataRowWithIconClickHandler dataRowWithIconClickHandler : immutableList) {
                                Composer composer2 = composerStartRestartGroup;
                                BentoDataRowKt.BentoCondensedDataRow(dataRowWithIconClickHandler.getState(), null, dataRowWithIconClickHandler.getOnClick(), null, null, composer2, BentoDataRowState.$stable, 26);
                                composerStartRestartGroup = composer2;
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(companion5, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme2.getColors(composerStartRestartGroup, i11).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion6 = Modifier.INSTANCE;
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i12 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function0, str2, PaddingKt.m5144paddingVpY3zN4$default(companion6, bentoTheme3.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, composerStartRestartGroup, ((i7 >> 9) & 14) | ((i7 >> 3) & 112), 120);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str8 = str7;
                            modifier3 = modifier5;
                            function04 = function06;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CryptoHomeInterestSection4.EnrolledComposable$lambda$42(str, immutableList, str2, function0, function02, modifier3, str8, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    str5 = str3;
                    i6 = i2 & 128;
                    int i82 = i3;
                    if (i6 != 0) {
                    }
                    i7 = i82;
                    if ((i7 & 4793491) == 4793490) {
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top2 = arrangement2.getTop();
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                            int i92 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion42, bentoTheme4.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                int i102 = i7 & 57344;
                                if (i102 != 16384) {
                                }
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda17
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoHomeInterestSection4.EnrolledComposable$lambda$41$lambda$39$lambda$34$lambda$33(function02);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(companion42, false, null, null, (Function0) objRememberedValue, 7, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl3.getInserting()) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                        final Function0 function062 = function05;
                                        BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composerStartRestartGroup, i92).getDisplayCapsuleMedium(), composerStartRestartGroup, i7 & 14, 0, 8190);
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion42, bentoTheme4.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                                        Modifier modifier52 = modifier4;
                                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", bentoTheme4.getColors(composerStartRestartGroup, i92).m21426getFg20d7_KjU(), null, function02, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48 | i102, 40);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        composerStartRestartGroup.endNode();
                                        Spacer2.Spacer(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceGroup(1089743955);
                                        if (str6 != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme4.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceGroup(-50707317);
                                        while (r0.hasNext()) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier.Companion companion62 = Modifier.INSTANCE;
                                        BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
                                        int i122 = BentoTheme.$stable;
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion62, bentoTheme32.getSpacing(composerStartRestartGroup, i122).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, str2, PaddingKt.m5144paddingVpY3zN4$default(companion62, bentoTheme32.getSpacing(composerStartRestartGroup, i122).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, composerStartRestartGroup, ((i7 >> 9) & 14) | ((i7 >> 3) & 112), 120);
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        str8 = str7;
                                        modifier3 = modifier52;
                                        function04 = function062;
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i5 = i2 & 64;
                if (i5 != 0) {
                }
                str5 = str3;
                i6 = i2 & 128;
                int i822 = i3;
                if (i6 != 0) {
                }
                i7 = i822;
                if ((i7 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 16) != 0) {
            }
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            str5 = str3;
            i6 = i2 & 128;
            int i8222 = i3;
            if (i6 != 0) {
            }
            i7 = i8222;
            if ((i7 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        str5 = str3;
        i6 = i2 & 128;
        int i82222 = i3;
        if (i6 != 0) {
        }
        i7 = i82222;
        if ((i7 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrolledComposable$lambda$41$lambda$39$lambda$34$lambda$33(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EnrolledComposable$lambda$41$lambda$39$lambda$38$lambda$37$lambda$36 */
    public static final Unit m1902x3b20f49e(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void RowInfoDialog(final InfoDialogContent infoDialogContent, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(955364237);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(infoDialogContent) : composerStartRestartGroup.changedInstance(infoDialogContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(955364237, i3, -1, "com.robinhood.android.crypto.tab.ui.interest.RowInfoDialog (CryptoHomeInterestSection.kt:283)");
                }
                StringResource title = infoDialogContent.getTitle();
                int i5 = StringResource.$stable;
                int i6 = i3;
                BentoAlertDialog.BentoAlertDialog(StringResource2.getString(title, composerStartRestartGroup, i5), new BentoAlertDialog2.Body.Text(StringResource2.getString(infoDialogContent.getBody(), composerStartRestartGroup, i5)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composerStartRestartGroup, 0), function0), modifier2, null, null, false, null, function0, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i6 << 3) & 7168) | ((i6 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoHomeInterestSection4.RowInfoDialog$lambda$43(infoDialogContent, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            StringResource title2 = infoDialogContent.getTitle();
            int i52 = StringResource.$stable;
            int i62 = i3;
            BentoAlertDialog.BentoAlertDialog(StringResource2.getString(title2, composerStartRestartGroup, i52), new BentoAlertDialog2.Body.Text(StringResource2.getString(infoDialogContent.getBody(), composerStartRestartGroup, i52)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composerStartRestartGroup, 0), function0), modifier2, null, null, false, null, function0, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i62 << 3) & 7168) | ((i62 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HowItWorksBottomSheet(final RhModalBottomSheet5 rhModalBottomSheet5, final String str, String str2, Modifier modifier, String str3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        String str4;
        final Navigator navigator;
        final Context context;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final String str5;
        boolean z;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final String str6;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1289926983);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i2 & 2) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        str4 = str3;
                        i3 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        str6 = str2;
                        modifier3 = modifier2;
                        str5 = str4;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            str4 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1289926983, i3, -1, "com.robinhood.android.crypto.tab.ui.interest.HowItWorksBottomSheet (CryptoHomeInterestSection.kt:302)");
                        }
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifier5 = modifier4;
                        str5 = str4;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_how_it_works_sheet_title, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8186);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1396189923);
                        StringBuilder sb = new StringBuilder();
                        sb.append(StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_how_it_works_sheet_body, new Object[]{str}, composerStartRestartGroup, 0));
                        if (str5 != null) {
                            sb.append(PlaceholderUtils.XXShortPlaceholderText);
                            sb.append(str5);
                        }
                        String string2 = sb.toString();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8122);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        String strStringResource = StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_how_it_works_sheet_primary_cta, composerStartRestartGroup, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_how_it_works_sheet_secondary_cta, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z = (i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5));
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoHomeInterestSection4.HowItWorksBottomSheet$lambda$50$lambda$47$lambda$46(rhModalBottomSheet5);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 896) == 256);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            str6 = str2;
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoHomeInterestSection4.HowItWorksBottomSheet$lambda$50$lambda$49$lambda$48(navigator, context, str6);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            str6 = str2;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composerStartRestartGroup, 0, 0, 59199);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final String str7 = str6;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoHomeInterestSection4.HowItWorksBottomSheet$lambda$51(rhModalBottomSheet5, str, str7, modifier3, str5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                str4 = str3;
                if ((i3 & 9363) != 9362) {
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier modifier52 = modifier4;
                        str5 = str4;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_how_it_works_sheet_title, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8186);
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-1396189923);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_how_it_works_sheet_body, new Object[]{str}, composerStartRestartGroup, 0));
                        if (str5 != null) {
                        }
                        String string22 = sb2.toString();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(string22, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8122);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        String strStringResource3 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_how_it_works_sheet_primary_cta, composerStartRestartGroup, 0);
                        String strStringResource22 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_interest_how_it_works_sheet_secondary_cta, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i3 & 14) != 4) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoHomeInterestSection4.HowItWorksBottomSheet$lambda$50$lambda$47$lambda$46(rhModalBottomSheet5);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                Function0 function02 = (Function0) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i3 & 896) == 256);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    str6 = str2;
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoHomeInterestSection4.HowItWorksBottomSheet$lambda$50$lambda$49$lambda$48(navigator, context, str6);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceGroup();
                                    BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, strStringResource3, false, null, false, (Function0) objRememberedValue2, strStringResource22, false, null, false, composerStartRestartGroup, 0, 0, 59199);
                                    composer2 = composerStartRestartGroup;
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            str4 = str3;
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 2) == 0) {
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        str4 = str3;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HowItWorksBottomSheet$lambda$50$lambda$47$lambda$46(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HowItWorksBottomSheet$lambda$50$lambda$49$lambda$48(Navigator navigator, Context context, String str) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(str), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    @DayNightPreview
    private static final void PreEnrollmentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(227597708);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(227597708, i, -1, "com.robinhood.android.crypto.tab.ui.interest.PreEnrollmentPreview (CryptoHomeInterestSection.kt:355)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, CryptoHomeInterestSection.INSTANCE.getLambda$1022222660$feature_crypto_tab_externalDebug(), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeInterestSection4.PreEnrollmentPreview$lambda$52(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    private static final void EnrolledPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1229480934);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1229480934, i, -1, "com.robinhood.android.crypto.tab.ui.interest.EnrolledPreview (CryptoHomeInterestSection.kt:376)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, CryptoHomeInterestSection.INSTANCE.m13023getLambda$1932137170$feature_crypto_tab_externalDebug(), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.interest.CryptoHomeInterestSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeInterestSection4.EnrolledPreview$lambda$53(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
