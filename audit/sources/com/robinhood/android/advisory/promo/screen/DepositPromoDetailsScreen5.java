package com.robinhood.android.advisory.promo.screen;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.Coil;
import coil.compose.AsyncImagePainter4;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen5;
import com.robinhood.android.advisory.promo.screen.DepositPromoDetailsViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.advisory.p304db.promo.PromoDetailsAsset;
import com.robinhood.models.advisory.p304db.promo.PromoDetailsScreen;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: DepositPromoDetailsScreen.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001c\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"TopMostColorDarkMode", "Landroidx/compose/ui/graphics/Color;", "J", "TopMostColorLightMode", "DarkModeGradient", "", "LightModeGradient", "ButtonGradient", "TAG_LOADING", "", "TAG_ERROR", "DepositPromoDetailsScreen", "", "onBackClick", "Lkotlin/Function0;", "viewState", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AssetSection", "assetIsImage", "", "asset", "Lcom/robinhood/models/advisory/db/promo/PromoDetailsAsset;", "useGradientBackground", "(ZLcom/robinhood/models/advisory/db/promo/PromoDetailsAsset;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DepositPromoDetailsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-advisory-promo_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DepositPromoDetailsScreen5 {
    private static final List<Color> ButtonGradient;
    private static final List<Color> DarkModeGradient;
    private static final List<Color> LightModeGradient;
    public static final String TAG_ERROR = "promo_details_error";
    public static final String TAG_LOADING = "promo_details_loading";
    private static final long TopMostColorDarkMode;
    private static final long TopMostColorLightMode;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetSection$lambda$3(boolean z, PromoDetailsAsset promoDetailsAsset, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AssetSection(z, promoDetailsAsset, z2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositPromoDetailsScreen$lambda$0(Function0 function0, DepositPromoDetailsViewState depositPromoDetailsViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DepositPromoDetailsScreen(function0, depositPromoDetailsViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositPromoDetailsScreenPreview$lambda$4(int i, Composer composer, int i2) {
        DepositPromoDetailsScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        long jColor = Color2.Color(4286613146L);
        TopMostColorDarkMode = jColor;
        long jColor2 = Color2.Color(4278255873L);
        TopMostColorLightMode = jColor2;
        DarkModeGradient = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(jColor), Color.m6701boximpl(Color2.Color(4280424758L)), Color.m6701boximpl(Color2.Color(4278190080L))});
        LightModeGradient = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(jColor2), Color.m6701boximpl(Color2.Color(4283521397L)), Color.m6701boximpl(Color2.Color(4294967295L))});
        ButtonGradient = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294954089L)), Color.m6701boximpl(Color2.Color(4294829494L)), Color.m6701boximpl(Color2.Color(4294958491L))});
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DepositPromoDetailsScreen(final Function0<Unit> onBackClick, final DepositPromoDetailsViewState viewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Color colorM6701boximpl;
        final PromoDetailsScreen details;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(2113021866);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
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
                    ComposerKt.traceEventStart(2113021866, i3, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen (DepositPromoDetailsScreen.kt:81)");
                }
                colorM6701boximpl = null;
                DepositPromoDetailsViewState.Loaded loaded = !(viewState instanceof DepositPromoDetailsViewState.Loaded) ? (DepositPromoDetailsViewState.Loaded) viewState : null;
                details = loaded == null ? loaded.getDetails() : null;
                composerStartRestartGroup.startReplaceGroup(-905509017);
                if ((details == null ? details.getImage() : null) != null && details.getBackground() == PromoDetailsScreen.Background.GRADIENT) {
                    colorM6701boximpl = Color.m6701boximpl(!BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? TopMostColorLightMode : TopMostColorDarkMode);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                int i6 = ((i3 >> 6) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(493780070, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt.DepositPromoDetailsScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(493780070, i7, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen.<anonymous> (DepositPromoDetailsScreen.kt:92)");
                        }
                        DepositPromoDetailsScreen depositPromoDetailsScreen = DepositPromoDetailsScreen.INSTANCE;
                        Function2<Composer, Integer, Unit> lambda$1660834777$feature_advisory_promo_externalDebug = depositPromoDetailsScreen.getLambda$1660834777$feature_advisory_promo_externalDebug();
                        final PromoDetailsScreen promoDetailsScreen = details;
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1660834777$feature_advisory_promo_externalDebug, null, ComposableLambda3.rememberComposableLambda(-910098939, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt.DepositPromoDetailsScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                long jM21425getFg0d7_KjU;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-910098939, i8, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen.<anonymous>.<anonymous> (DepositPromoDetailsScreen.kt:94)");
                                }
                                PromoDetailsScreen promoDetailsScreen2 = promoDetailsScreen;
                                Color colorM6701boximpl2 = null;
                                PromoDetailsScreen.Background background = promoDetailsScreen2 != null ? promoDetailsScreen2.getBackground() : null;
                                composer4.startReplaceGroup(1568252151);
                                if (background == PromoDetailsScreen.Background.GRADIENT) {
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    if (bentoTheme2.getColors(composer4, i9).getIsDay()) {
                                        composer4.startReplaceGroup(1568257575);
                                        jM21425getFg0d7_KjU = bentoTheme2.getColors(composer4, i9).m21371getBg0d7_KjU();
                                    } else {
                                        composer4.startReplaceGroup(1568258407);
                                        jM21425getFg0d7_KjU = bentoTheme2.getColors(composer4, i9).m21425getFg0d7_KjU();
                                    }
                                    composer4.endReplaceGroup();
                                    colorM6701boximpl2 = Color.m6701boximpl(jM21425getFg0d7_KjU);
                                }
                                composer4.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl2, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), depositPromoDetailsScreen.getLambda$831822724$feature_advisory_promo_externalDebug(), null, false, false, null, colorM6701boximpl, 0L, null, composer3, 3462, 0, 1778);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-39284293, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt.DepositPromoDetailsScreen.2

                    /* compiled from: DepositPromoDetailsScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt$DepositPromoDetailsScreen$2$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ PaddingValues $paddingValues;
                        final /* synthetic */ UriHandler $uriHandler;
                        final /* synthetic */ DepositPromoDetailsViewState $viewState;

                        AnonymousClass2(PaddingValues paddingValues, DepositPromoDetailsViewState depositPromoDetailsViewState, Navigator navigator, Context context, UriHandler uriHandler) {
                            this.$paddingValues = paddingValues;
                            this.$viewState = depositPromoDetailsViewState;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$uriHandler = uriHandler;
                        }

                        public final void invoke(Composer composer, int i) {
                            Object obj;
                            Column6 column6;
                            UriHandler uriHandler;
                            Composer composer2;
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1601237346, i, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen.<anonymous>.<anonymous> (DepositPromoDetailsScreen.kt:133)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(PaddingKt.padding(companion, this.$paddingValues), null, 1, null), 0.0f, 1, null);
                            final DepositPromoDetailsViewState depositPromoDetailsViewState = this.$viewState;
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            UriHandler uriHandler2 = this.$uriHandler;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                            Column6 column62 = Column6.INSTANCE;
                            DepositPromoDetailsViewState.Loaded loaded = (DepositPromoDetailsViewState.Loaded) depositPromoDetailsViewState;
                            PromoDetailsAsset image = loaded.getDetails().getImage();
                            composer.startReplaceGroup(2013030206);
                            if (image == null) {
                                composer2 = composer;
                                column6 = column62;
                                obj = null;
                                uriHandler = uriHandler2;
                            } else {
                                obj = null;
                                column6 = column62;
                                uriHandler = uriHandler2;
                                composer2 = composer;
                                DepositPromoDetailsScreen5.AssetSection(true, image, loaded.getDetails().getBackground() == PromoDetailsScreen.Background.GRADIENT, Column5.weight$default(column62, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), composer2, 6, 0);
                            }
                            composer2.endReplaceGroup();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
                            String title = loaded.getDetails().getTitle();
                            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i2).getBookCoverMartinaSmall(), 0L, TextUnit2.getSp(32), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU();
                            TextAlign.Companion companion3 = TextAlign.INSTANCE;
                            Object obj2 = obj;
                            final UriHandler uriHandler3 = uriHandler;
                            BentoText2.m20747BentoText38GnDrw(title, modifierM21618defaultFillMaxWidthPadding3ABfNKs, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default, composer, 0, 0, 8120);
                            BentoText2.m20747BentoText38GnDrw(loaded.getDetails().getDescription(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, obj2), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8120);
                            Spacer2.Spacer(Column5.weight$default(column6, companion, 0.5f, false, 2, null), composer, 0);
                            BentoMarkdownText2.BentoMarkdownText(loaded.getDetails().getDisclosureMarkdown(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, obj2), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), companion3.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                            boolean zIsUserGoldMember = loaded.getDetails().isUserGoldMember();
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 47, null)), true, false, false, true, false, null, 108, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                            if (zIsUserGoldMember) {
                                modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = Background3.background$default(modifierM21618defaultFillMaxWidthPadding3ABfNKs2, Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, DepositPromoDetailsScreen5.ButtonGradient, 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShape2.getCircleShape(), 0.0f, 4, null);
                            }
                            Modifier modifier = modifierM21618defaultFillMaxWidthPadding3ABfNKs2;
                            Color colorM6701boximpl = zIsUserGoldMember ? Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()) : null;
                            composer.startReplaceGroup(2013169533);
                            Color colorM6701boximpl2 = zIsUserGoldMember ? Color.m6701boximpl(bentoTheme.getColors(composer, i2).getJet()) : null;
                            composer.endReplaceGroup();
                            String ctaTitle = loaded.getDetails().getCtaTitle();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(depositPromoDetailsViewState) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(uriHandler3);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt$DepositPromoDetailsScreen$2$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return DepositPromoDetailsScreen5.C93322.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(depositPromoDetailsViewState, navigator, context, uriHandler3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaTitle, modifier, null, null, false, false, colorM6701boximpl, colorM6701boximpl2, null, null, false, null, composer, 0, 0, 7800);
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
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(DepositPromoDetailsViewState depositPromoDetailsViewState, Navigator navigator, Context context, UriHandler uriHandler) {
                            DepositPromoDetailsViewState.Loaded loaded = (DepositPromoDetailsViewState.Loaded) depositPromoDetailsViewState;
                            if (StringsKt.startsWith$default(loaded.getDetails().getCtaDeeplink(), DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD(), false, 2, (Object) null)) {
                                Uri uri = Uri.parse(loaded.getDetails().getCtaDeeplink());
                                if (navigator.isDeepLinkSupported(uri)) {
                                    Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
                                }
                            } else {
                                uriHandler.openUri(loaded.getDetails().getCtaDeeplink());
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-39284293, i8, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen.<anonymous> (DepositPromoDetailsScreen.kt:113)");
                        }
                        DepositPromoDetailsViewState depositPromoDetailsViewState = viewState;
                        if (depositPromoDetailsViewState instanceof DepositPromoDetailsViewState.Loaded) {
                            composer3.startReplaceGroup(-2086995201);
                            Navigator navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                            Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            UriHandler uriHandler = (UriHandler) composer3.consume(CompositionLocalsKt.getLocalUriHandler());
                            Color color = colorM6701boximpl;
                            composer3.startReplaceGroup(902510002);
                            if (color != null) {
                                SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composer3, 0, 1), color.getValue(), false, null, 6, null);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer3.endReplaceGroup();
                            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_ACATS_PROMO, null, null, null, 14, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(-1601237346, true, new AnonymousClass2(paddingValues, viewState, navigator, context, uriHandler), composer3, 54), composer3, 48);
                            composer3.endReplaceGroup();
                        } else if (depositPromoDetailsViewState instanceof DepositPromoDetailsViewState.Loading) {
                            composer3.startReplaceGroup(-2081537620);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), DepositPromoDetailsScreen5.TAG_LOADING), new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null), true, true, composer3, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3456, 0);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(depositPromoDetailsViewState instanceof DepositPromoDetailsViewState.Error)) {
                                composer3.startReplaceGroup(902507427);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-2081109851);
                            ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), DepositPromoDetailsScreen5.TAG_ERROR), null, 0, null, null, null, null, false, composer3, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i6, 316);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DepositPromoDetailsScreen5.DepositPromoDetailsScreen$lambda$0(onBackClick, viewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            colorM6701boximpl = null;
            if (!(viewState instanceof DepositPromoDetailsViewState.Loaded)) {
            }
            if (loaded == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-905509017);
            if ((details == null ? details.getImage() : null) != null) {
                colorM6701boximpl = Color.m6701boximpl(!BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? TopMostColorLightMode : TopMostColorDarkMode);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            int i62 = ((i3 >> 6) & 14) | 805306416;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(493780070, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt.DepositPromoDetailsScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(493780070, i7, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen.<anonymous> (DepositPromoDetailsScreen.kt:92)");
                    }
                    DepositPromoDetailsScreen depositPromoDetailsScreen = DepositPromoDetailsScreen.INSTANCE;
                    Function2<Composer, Integer, Unit> lambda$1660834777$feature_advisory_promo_externalDebug = depositPromoDetailsScreen.getLambda$1660834777$feature_advisory_promo_externalDebug();
                    final PromoDetailsScreen promoDetailsScreen = details;
                    final Function0<Unit> function0 = onBackClick;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1660834777$feature_advisory_promo_externalDebug, null, ComposableLambda3.rememberComposableLambda(-910098939, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt.DepositPromoDetailsScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                            long jM21425getFg0d7_KjU;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i8 & 6) == 0) {
                                i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-910098939, i8, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen.<anonymous>.<anonymous> (DepositPromoDetailsScreen.kt:94)");
                            }
                            PromoDetailsScreen promoDetailsScreen2 = promoDetailsScreen;
                            Color colorM6701boximpl2 = null;
                            PromoDetailsScreen.Background background = promoDetailsScreen2 != null ? promoDetailsScreen2.getBackground() : null;
                            composer4.startReplaceGroup(1568252151);
                            if (background == PromoDetailsScreen.Background.GRADIENT) {
                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                if (bentoTheme22.getColors(composer4, i9).getIsDay()) {
                                    composer4.startReplaceGroup(1568257575);
                                    jM21425getFg0d7_KjU = bentoTheme22.getColors(composer4, i9).m21371getBg0d7_KjU();
                                } else {
                                    composer4.startReplaceGroup(1568258407);
                                    jM21425getFg0d7_KjU = bentoTheme22.getColors(composer4, i9).m21425getFg0d7_KjU();
                                }
                                composer4.endReplaceGroup();
                                colorM6701boximpl2 = Color.m6701boximpl(jM21425getFg0d7_KjU);
                            }
                            composer4.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl2, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), depositPromoDetailsScreen.getLambda$831822724$feature_advisory_promo_externalDebug(), null, false, false, null, colorM6701boximpl, 0L, null, composer3, 3462, 0, 1778);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-39284293, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt.DepositPromoDetailsScreen.2

                /* compiled from: DepositPromoDetailsScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt$DepositPromoDetailsScreen$2$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ PaddingValues $paddingValues;
                    final /* synthetic */ UriHandler $uriHandler;
                    final /* synthetic */ DepositPromoDetailsViewState $viewState;

                    AnonymousClass2(PaddingValues paddingValues, DepositPromoDetailsViewState depositPromoDetailsViewState, Navigator navigator, Context context, UriHandler uriHandler) {
                        this.$paddingValues = paddingValues;
                        this.$viewState = depositPromoDetailsViewState;
                        this.$navigator = navigator;
                        this.$context = context;
                        this.$uriHandler = uriHandler;
                    }

                    public final void invoke(Composer composer, int i) {
                        Object obj;
                        Column6 column6;
                        UriHandler uriHandler;
                        Composer composer2;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1601237346, i, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen.<anonymous>.<anonymous> (DepositPromoDetailsScreen.kt:133)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(PaddingKt.padding(companion, this.$paddingValues), null, 1, null), 0.0f, 1, null);
                        final DepositPromoDetailsViewState depositPromoDetailsViewState = this.$viewState;
                        final Navigator navigator = this.$navigator;
                        final Context context = this.$context;
                        UriHandler uriHandler2 = this.$uriHandler;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
                        Column6 column62 = Column6.INSTANCE;
                        DepositPromoDetailsViewState.Loaded loaded = (DepositPromoDetailsViewState.Loaded) depositPromoDetailsViewState;
                        PromoDetailsAsset image = loaded.getDetails().getImage();
                        composer.startReplaceGroup(2013030206);
                        if (image == null) {
                            composer2 = composer;
                            column6 = column62;
                            obj = null;
                            uriHandler = uriHandler2;
                        } else {
                            obj = null;
                            column6 = column62;
                            uriHandler = uriHandler2;
                            composer2 = composer;
                            DepositPromoDetailsScreen5.AssetSection(true, image, loaded.getDetails().getBackground() == PromoDetailsScreen.Background.GRADIENT, Column5.weight$default(column62, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), composer2, 6, 0);
                        }
                        composer2.endReplaceGroup();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
                        String title = loaded.getDetails().getTitle();
                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i2).getBookCoverMartinaSmall(), 0L, TextUnit2.getSp(32), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU();
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        Object obj2 = obj;
                        final UriHandler uriHandler3 = uriHandler;
                        BentoText2.m20747BentoText38GnDrw(title, modifierM21618defaultFillMaxWidthPadding3ABfNKs, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyleM7655copyp1EtxEg$default, composer, 0, 0, 8120);
                        BentoText2.m20747BentoText38GnDrw(loaded.getDetails().getDescription(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, obj2), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8120);
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 0.5f, false, 2, null), composer, 0);
                        BentoMarkdownText2.BentoMarkdownText(loaded.getDetails().getDisclosureMarkdown(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, obj2), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), companion3.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                        boolean zIsUserGoldMember = loaded.getDetails().isUserGoldMember();
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 47, null)), true, false, false, true, false, null, 108, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                        if (zIsUserGoldMember) {
                            modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = Background3.background$default(modifierM21618defaultFillMaxWidthPadding3ABfNKs2, Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, DepositPromoDetailsScreen5.ButtonGradient, 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShape2.getCircleShape(), 0.0f, 4, null);
                        }
                        Modifier modifier = modifierM21618defaultFillMaxWidthPadding3ABfNKs2;
                        Color colorM6701boximpl = zIsUserGoldMember ? Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()) : null;
                        composer.startReplaceGroup(2013169533);
                        Color colorM6701boximpl2 = zIsUserGoldMember ? Color.m6701boximpl(bentoTheme.getColors(composer, i2).getJet()) : null;
                        composer.endReplaceGroup();
                        String ctaTitle = loaded.getDetails().getCtaTitle();
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(depositPromoDetailsViewState) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(uriHandler3);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt$DepositPromoDetailsScreen$2$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DepositPromoDetailsScreen5.C93322.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(depositPromoDetailsViewState, navigator, context, uriHandler3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaTitle, modifier, null, null, false, false, colorM6701boximpl, colorM6701boximpl2, null, null, false, null, composer, 0, 0, 7800);
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
                    public static final Unit invoke$lambda$4$lambda$3$lambda$2(DepositPromoDetailsViewState depositPromoDetailsViewState, Navigator navigator, Context context, UriHandler uriHandler) {
                        DepositPromoDetailsViewState.Loaded loaded = (DepositPromoDetailsViewState.Loaded) depositPromoDetailsViewState;
                        if (StringsKt.startsWith$default(loaded.getDetails().getCtaDeeplink(), DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD(), false, 2, (Object) null)) {
                            Uri uri = Uri.parse(loaded.getDetails().getCtaDeeplink());
                            if (navigator.isDeepLinkSupported(uri)) {
                                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
                            }
                        } else {
                            uriHandler.openUri(loaded.getDetails().getCtaDeeplink());
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                    int i8;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i7 & 6) == 0) {
                        i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-39284293, i8, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreen.<anonymous> (DepositPromoDetailsScreen.kt:113)");
                    }
                    DepositPromoDetailsViewState depositPromoDetailsViewState = viewState;
                    if (depositPromoDetailsViewState instanceof DepositPromoDetailsViewState.Loaded) {
                        composer3.startReplaceGroup(-2086995201);
                        Navigator navigator = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                        Context context = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        UriHandler uriHandler = (UriHandler) composer3.consume(CompositionLocalsKt.getLocalUriHandler());
                        Color color = colorM6701boximpl;
                        composer3.startReplaceGroup(902510002);
                        if (color != null) {
                            SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composer3, 0, 1), color.getValue(), false, null, 6, null);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer3.endReplaceGroup();
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ADVISORY_ACATS_PROMO, null, null, null, 14, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(-1601237346, true, new AnonymousClass2(paddingValues, viewState, navigator, context, uriHandler), composer3, 54), composer3, 48);
                        composer3.endReplaceGroup();
                    } else if (depositPromoDetailsViewState instanceof DepositPromoDetailsViewState.Loading) {
                        composer3.startReplaceGroup(-2081537620);
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), DepositPromoDetailsScreen5.TAG_LOADING), new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null), true, true, composer3, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3456, 0);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(depositPromoDetailsViewState instanceof DepositPromoDetailsViewState.Error)) {
                            composer3.startReplaceGroup(902507427);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-2081109851);
                        ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), DepositPromoDetailsScreen5.TAG_ERROR), null, 0, null, null, null, null, false, composer3, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i62, 316);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssetSection(final boolean z, final PromoDetailsAsset asset, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifierBackground$default;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1919693870);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(asset) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifierBackground$default = modifier;
                i3 |= composerStartRestartGroup.changed(modifierBackground$default) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifierBackground$default;
            } else {
                if (i4 != 0) {
                    modifierBackground$default = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1919693870, i3, -1, "com.robinhood.android.advisory.promo.screen.AssetSection (DepositPromoDetailsScreen.kt:254)");
                }
                composerStartRestartGroup.startReplaceGroup(2010135260);
                if (z2) {
                    modifier2 = modifierBackground$default;
                } else {
                    modifier2 = modifierBackground$default;
                    modifierBackground$default = Background3.background$default(modifierBackground$default, Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? LightModeGradient : DarkModeGradient, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierBackground$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(286673483);
                if (z) {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay() ? asset.getUrlLight() : asset.getUrlDark(), Coil.imageLoader((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, null, ContentScale.INSTANCE.getFillWidth(), 0, null, composerStartRestartGroup, 24576, 108), (String) null, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21596getXxlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 5, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DepositPromoDetailsScreen5.AssetSection$lambda$3(z, asset, z2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifierBackground$default = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(2010135260);
            if (z2) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierBackground$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(286673483);
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void DepositPromoDetailsScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-507811466);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-507811466, i, -1, "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenPreview (DepositPromoDetailsScreen.kt:286)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, DepositPromoDetailsScreen.INSTANCE.getLambda$48063166$feature_advisory_promo_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DepositPromoDetailsScreen5.DepositPromoDetailsScreenPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
