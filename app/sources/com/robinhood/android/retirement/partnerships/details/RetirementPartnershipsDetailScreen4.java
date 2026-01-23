package com.robinhood.android.retirement.partnerships.details;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementPartnershipDetailResponse;
import com.robinhood.android.retirement.lib.StickyFooterColumn;
import com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailViewState;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.serverdriven.experimental.api.RetirementPartnershipDetailAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementPartnershipsDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {RetirementPartnershipsDetailScreen4.DetailLoadingSpinner, "", RetirementPartnershipsDetailScreen4.DetailBackButton, "RetirementPartnershipDetailsScreen", "", "viewState", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;", "callbacks", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PartnershipDetailContent", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState$Loaded;", "(Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState$Loaded;Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DetailHeader", "header", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailHeader;", "(Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailHeader;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DetailFooter", Footer.f10637type, "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailFooter;", "(Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse$PartnershipDetailFooter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-partnerships_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementPartnershipsDetailScreen4 {
    public static final String DetailBackButton = "DetailBackButton";
    public static final String DetailLoadingSpinner = "DetailLoadingSpinner";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailFooter$lambda$6(ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter partnershipDetailFooter, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DetailFooter(partnershipDetailFooter, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailHeader$lambda$4(ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader partnershipDetailHeader, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DetailHeader(partnershipDetailHeader, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PartnershipDetailContent$lambda$2(RetirementPartnershipsDetailViewState.Loaded loaded, RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PartnershipDetailContent(loaded, retirementPartnershipsDetailScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementPartnershipDetailsScreen$lambda$1(RetirementPartnershipsDetailViewState retirementPartnershipsDetailViewState, RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RetirementPartnershipDetailsScreen(retirementPartnershipsDetailViewState, retirementPartnershipsDetailScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementPartnershipDetailsScreen(final RetirementPartnershipsDetailViewState viewState, final RetirementPartnershipsDetailScreen3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Ref.LongRef longRef;
        BentoTheme bentoTheme;
        int i4;
        final Ref.LongRef longRef2;
        Composer composer2;
        final Modifier modifier3;
        Color composeColor;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1860197561);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1860197561, i3, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen (RetirementPartnershipsDetailScreen.kt:52)");
                }
                longRef = new Ref.LongRef();
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                longRef.element = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
                longRef2 = new Ref.LongRef();
                longRef2.element = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
                composerStartRestartGroup.startReplaceGroup(943470661);
                if ((viewState instanceof RetirementPartnershipsDetailViewState.Loaded) && (composeColor = SduiColors2.toComposeColor(((RetirementPartnershipsDetailViewState.Loaded) viewState).getHeader().getBackground_color(), composerStartRestartGroup, 0)) != null) {
                    longRef.element = composeColor.getValue();
                    longRef2.element = bentoTheme.getColors(composerStartRestartGroup, i4).getNova();
                }
                composerStartRestartGroup.endReplaceGroup();
                SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), longRef.element, false, null, 6, null);
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-1105568643, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.RetirementPartnershipDetailsScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1105568643, i6, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen.<anonymous> (RetirementPartnershipsDetailScreen.kt:67)");
                        }
                        Function2<Composer, Integer, Unit> function2M2436xab8decac = RetirementPartnershipsDetailScreen.INSTANCE.m2436xab8decac();
                        final RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen3 = callbacks;
                        final Ref.LongRef longRef3 = longRef2;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2436xab8decac, null, ComposableLambda3.rememberComposableLambda(320016894, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.RetirementPartnershipDetailsScreen.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                int i8;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i8 = ((i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2) | i7;
                                } else {
                                    i8 = i7;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(320016894, i8, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen.<anonymous>.<anonymous> (RetirementPartnershipsDetailScreen.kt:70)");
                                }
                                RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen32 = retirementPartnershipsDetailScreen3;
                                composer4.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer4.changedInstance(retirementPartnershipsDetailScreen32);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RetirementPartnershipsDetailScreen5(retirementPartnershipsDetailScreen32);
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                composer4.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, RetirementPartnershipsDetailScreen4.DetailBackButton), false, Color.m6701boximpl(longRef3.element), (Function0) ((KFunction) objRememberedValue), composer4, ((i8 << 12) & 57344) | (BentoAppBarScope.$stable << 12) | 6, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(longRef.element), 0L, null, composer3, 390, 0, 1786);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1011135880, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.RetirementPartnershipDetailsScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1011135880, i7, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen.<anonymous> (RetirementPartnershipsDetailScreen.kt:82)");
                        }
                        RetirementPartnershipsDetailViewState retirementPartnershipsDetailViewState = viewState;
                        if (retirementPartnershipsDetailViewState instanceof RetirementPartnershipsDetailViewState.Loading) {
                            composer3.startReplaceGroup(1038975600);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(PaddingKt.padding(modifier4, paddingValues), RetirementPartnershipsDetailScreen4.DetailLoadingSpinner), new ShimmerLoaderType.Hero.Size.Relative(0.4f), false, true, composer3, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3072, 4);
                            composer3.endReplaceGroup();
                        } else if (retirementPartnershipsDetailViewState instanceof RetirementPartnershipsDetailViewState.Error) {
                            composer3.startReplaceGroup(2143847692);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            composer3.startReplaceGroup(1038990400);
                            Modifier modifierVerticalScroll$default = ((Boolean) composer3.consume(InspectionMode.getLocalInspectionMode())).booleanValue() ? ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null) : companion;
                            composer3.endReplaceGroup();
                            Modifier modifierThen = companion.then(modifierVerticalScroll$default);
                            RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen3 = callbacks;
                            Modifier modifier6 = modifier4;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierThen);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(retirementPartnershipsDetailScreen3);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RetirementPartnershipsDetailScreen6(retirementPartnershipsDetailScreen3);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(modifier6, paddingValues), (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        } else {
                            if (!(retirementPartnershipsDetailViewState instanceof RetirementPartnershipsDetailViewState.Loaded)) {
                                composer3.startReplaceGroup(1038974757);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(2144778033);
                            UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.RETIREMENT_1099_PARTNERSHIP_DETAIL, null, ((RetirementPartnershipsDetailViewState.Loaded) viewState).getLoggingIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, ((RetirementPartnershipsDetailViewState.Loaded) viewState).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null);
                            final RetirementPartnershipsDetailViewState retirementPartnershipsDetailViewState2 = viewState;
                            final RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen32 = callbacks;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default, ComposableLambda3.rememberComposableLambda(275804349, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.RetirementPartnershipDetailsScreen.3.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(275804349, i8, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen.<anonymous>.<anonymous> (RetirementPartnershipsDetailScreen.kt:120)");
                                    }
                                    RetirementPartnershipsDetailScreen4.PartnershipDetailContent((RetirementPartnershipsDetailViewState.Loaded) retirementPartnershipsDetailViewState2, retirementPartnershipsDetailScreen32, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementPartnershipsDetailScreen4.RetirementPartnershipDetailsScreen$lambda$1(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            longRef = new Ref.LongRef();
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            longRef.element = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
            longRef2 = new Ref.LongRef();
            longRef2.element = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(943470661);
            if (viewState instanceof RetirementPartnershipsDetailViewState.Loaded) {
                longRef.element = composeColor.getValue();
                longRef2.element = bentoTheme.getColors(composerStartRestartGroup, i4).getNova();
            }
            composerStartRestartGroup.endReplaceGroup();
            SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1), longRef.element, false, null, 6, null);
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-1105568643, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.RetirementPartnershipDetailsScreen.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1105568643, i6, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen.<anonymous> (RetirementPartnershipsDetailScreen.kt:67)");
                    }
                    Function2<Composer, Integer, Unit> function2M2436xab8decac = RetirementPartnershipsDetailScreen.INSTANCE.m2436xab8decac();
                    final RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen3 = callbacks;
                    final Ref.LongRef longRef3 = longRef2;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2436xab8decac, null, ComposableLambda3.rememberComposableLambda(320016894, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.RetirementPartnershipDetailsScreen.2.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            int i8;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i8 = ((i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2) | i7;
                            } else {
                                i8 = i7;
                            }
                            if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(320016894, i8, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen.<anonymous>.<anonymous> (RetirementPartnershipsDetailScreen.kt:70)");
                            }
                            RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen32 = retirementPartnershipsDetailScreen3;
                            composer4.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer4.changedInstance(retirementPartnershipsDetailScreen32);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RetirementPartnershipsDetailScreen5(retirementPartnershipsDetailScreen32);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            composer4.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, RetirementPartnershipsDetailScreen4.DetailBackButton), false, Color.m6701boximpl(longRef3.element), (Function0) ((KFunction) objRememberedValue), composer4, ((i8 << 12) & 57344) | (BentoAppBarScope.$stable << 12) | 6, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(longRef.element), 0L, null, composer3, 390, 0, 1786);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1011135880, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.RetirementPartnershipDetailsScreen.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final PaddingValues paddingValues, Composer composer3, int i6) {
                    int i7;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1011135880, i7, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen.<anonymous> (RetirementPartnershipsDetailScreen.kt:82)");
                    }
                    RetirementPartnershipsDetailViewState retirementPartnershipsDetailViewState = viewState;
                    if (retirementPartnershipsDetailViewState instanceof RetirementPartnershipsDetailViewState.Loading) {
                        composer3.startReplaceGroup(1038975600);
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(PaddingKt.padding(modifier4, paddingValues), RetirementPartnershipsDetailScreen4.DetailLoadingSpinner), new ShimmerLoaderType.Hero.Size.Relative(0.4f), false, true, composer3, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3072, 4);
                        composer3.endReplaceGroup();
                    } else if (retirementPartnershipsDetailViewState instanceof RetirementPartnershipsDetailViewState.Error) {
                        composer3.startReplaceGroup(2143847692);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer3.startReplaceGroup(1038990400);
                        Modifier modifierVerticalScroll$default = ((Boolean) composer3.consume(InspectionMode.getLocalInspectionMode())).booleanValue() ? ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null) : companion;
                        composer3.endReplaceGroup();
                        Modifier modifierThen = companion.then(modifierVerticalScroll$default);
                        RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen3 = callbacks;
                        Modifier modifier6 = modifier4;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierThen);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer3.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer3.changedInstance(retirementPartnershipsDetailScreen3);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RetirementPartnershipsDetailScreen6(retirementPartnershipsDetailScreen3);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(modifier6, paddingValues), (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        if (!(retirementPartnershipsDetailViewState instanceof RetirementPartnershipsDetailViewState.Loaded)) {
                            composer3.startReplaceGroup(1038974757);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(2144778033);
                        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.RETIREMENT_1099_PARTNERSHIP_DETAIL, null, ((RetirementPartnershipsDetailViewState.Loaded) viewState).getLoggingIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, ((RetirementPartnershipsDetailViewState.Loaded) viewState).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null);
                        final RetirementPartnershipsDetailViewState retirementPartnershipsDetailViewState2 = viewState;
                        final RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen32 = callbacks;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default, ComposableLambda3.rememberComposableLambda(275804349, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.RetirementPartnershipDetailsScreen.3.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(275804349, i8, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipDetailsScreen.<anonymous>.<anonymous> (RetirementPartnershipsDetailScreen.kt:120)");
                                }
                                RetirementPartnershipsDetailScreen4.PartnershipDetailContent((RetirementPartnershipsDetailViewState.Loaded) retirementPartnershipsDetailViewState2, retirementPartnershipsDetailScreen32, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PartnershipDetailContent(final RetirementPartnershipsDetailViewState.Loaded loaded, final RetirementPartnershipsDetailScreen3 retirementPartnershipsDetailScreen3, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1411074202);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(retirementPartnershipsDetailScreen3) : composerStartRestartGroup.changedInstance(retirementPartnershipsDetailScreen3) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1411074202, i3, -1, "com.robinhood.android.retirement.partnerships.details.PartnershipDetailContent (RetirementPartnershipsDetailScreen.kt:136)");
            }
            SduiActionHandler3.ProvideActionHandler(retirementPartnershipsDetailScreen3, ComposableLambda3.rememberComposableLambda(1617477529, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.PartnershipDetailContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1617477529, i5, -1, "com.robinhood.android.retirement.partnerships.details.PartnershipDetailContent.<anonymous> (RetirementPartnershipsDetailScreen.kt:138)");
                    }
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null), null, 1, null);
                    final RetirementPartnershipsDetailViewState.Loaded loaded2 = loaded;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(740026882, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.PartnershipDetailContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 StickyFooterColumn, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(StickyFooterColumn, "$this$StickyFooterColumn");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(740026882, i6, -1, "com.robinhood.android.retirement.partnerships.details.PartnershipDetailContent.<anonymous>.<anonymous> (RetirementPartnershipsDetailScreen.kt:143)");
                            }
                            RetirementPartnershipsDetailScreen4.DetailHeader(loaded2.getHeader(), null, composer3, 0, 2);
                            ImmutableList<UIComponent<RetirementPartnershipDetailAction>> bodyContent = loaded2.getBodyContent();
                            composer3.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(bodyContent, RetirementPartnershipDetailAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 0, 0);
                            composer3.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final RetirementPartnershipsDetailViewState.Loaded loaded3 = loaded;
                    StickyFooterColumn.m18132StickyFooterColumnFHprtrg(composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1011169713, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt.PartnershipDetailContent.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1011169713, i6, -1, "com.robinhood.android.retirement.partnerships.details.PartnershipDetailContent.<anonymous>.<anonymous> (RetirementPartnershipsDetailScreen.kt:148)");
                            }
                            RetirementPartnershipsDetailScreen4.DetailFooter(loaded3.getFooterContent(), null, composer3, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), modifierLogScreenTransitions$default, null, 0L, false, composer2, 54, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementPartnershipsDetailScreen4.PartnershipDetailContent$lambda$2(loaded, retirementPartnershipsDetailScreen3, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DetailHeader(final ApiRetirementPartnershipDetailResponse.PartnershipDetailHeader partnershipDetailHeader, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1848180780);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(partnershipDetailHeader) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1848180780, i3, -1, "com.robinhood.android.retirement.partnerships.details.DetailHeader (RetirementPartnershipsDetailScreen.kt:158)");
                }
                Color composeColor = SduiColors2.toComposeColor(partnershipDetailHeader.getBackground_color(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-2014725428);
                long jM21371getBg0d7_KjU = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                Alignment topCenter = Alignment.INSTANCE.getTopCenter();
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), jM21371getBg0d7_KjU, null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topCenter, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                SduiComponent3.SduiComponent(partnershipDetailHeader.getImage(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null), null, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementPartnershipsDetailScreen4.DetailHeader$lambda$4(partnershipDetailHeader, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Color composeColor2 = SduiColors2.toComposeColor(partnershipDetailHeader.getBackground_color(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-2014725428);
            long jM21371getBg0d7_KjU2 = composeColor2 != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor2.getValue();
            composerStartRestartGroup.endReplaceGroup();
            Alignment topCenter2 = Alignment.INSTANCE.getTopCenter();
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), jM21371getBg0d7_KjU2, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2, false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
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
                SduiComponent3.SduiComponent(partnershipDetailHeader.getImage(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null), null, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DetailFooter(final ApiRetirementPartnershipDetailResponse.PartnershipDetailFooter partnershipDetailFooter, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(703620752);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(partnershipDetailFooter) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(703620752, i3, -1, "com.robinhood.android.retirement.partnerships.details.DetailFooter (RetirementPartnershipsDetailScreen.kt:177)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                Modifier modifier4 = modifier3;
                BentoMarkdownText2.BentoMarkdownText(partnershipDetailFooter.getText(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                SduiComponent3.SduiComponent(partnershipDetailFooter.getPrimary_button(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementPartnershipsDetailScreen4.DetailFooter$lambda$6(partnershipDetailFooter, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(modifier3, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoMarkdownText2.BentoMarkdownText(partnershipDetailFooter.getText(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                SduiComponent3.SduiComponent(partnershipDetailFooter.getPrimary_button(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
