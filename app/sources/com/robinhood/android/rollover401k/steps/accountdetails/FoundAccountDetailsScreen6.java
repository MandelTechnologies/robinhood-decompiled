package com.robinhood.android.rollover401k.steps.accountdetails;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
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
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys;
import com.robinhood.android.rollover401k.C27696R;
import com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreen6;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FoundAccountDetailsScreen.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001a\u001d\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\b\u001aA\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u001fX\u008a\u008e\u0002"}, m3636d2 = {"AccountDetailsScreen", "", "viewModel", "Lcom/robinhood/android/rollover401k/steps/accountdetails/AccountDetailsViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/rollover401k/steps/accountdetails/AccountDetailsViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountDetailHeaderCard", "(Lcom/robinhood/android/rollover401k/steps/accountdetails/AccountDetailsViewModel;Landroidx/compose/runtime/Composer;I)V", "AccountDetailPortfolioRegion", "AccountDetailPortfolioRegionElement", "title", "", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "AccountDetailPortfolioDisclaimers", "InfoBottomSheet", "bodyText", "bulletPoints", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/rollover401k/steps/accountdetails/BulletPoint;", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BulletPointItem", "bulletPoint", "(Lcom/robinhood/android/rollover401k/steps/accountdetails/BulletPoint;Landroidx/compose/runtime/Composer;I)V", "AccountDetailsPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-rollover-401k_externalDebug", "showContributionTypeSheet", "", "showLastContributionSheet", "showAccountFeesSheet", "showPortfolioAllocationSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class FoundAccountDetailsScreen6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailHeaderCard$lambda$25(AccountDetailsViewModel accountDetailsViewModel, int i, Composer composer, int i2) throws Resources.NotFoundException {
        AccountDetailHeaderCard(accountDetailsViewModel, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailPortfolioDisclaimers$lambda$47(AccountDetailsViewModel accountDetailsViewModel, int i, Composer composer, int i2) {
        AccountDetailPortfolioDisclaimers(accountDetailsViewModel, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailPortfolioRegion$lambda$42(AccountDetailsViewModel accountDetailsViewModel, int i, Composer composer, int i2) {
        AccountDetailPortfolioRegion(accountDetailsViewModel, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailPortfolioRegionElement$lambda$44(String str, String str2, int i, Composer composer, int i2) {
        AccountDetailPortfolioRegionElement(str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsPreview$lambda$55(int i, Composer composer, int i2) {
        AccountDetailsPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailsScreen$lambda$0(AccountDetailsViewModel accountDetailsViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountDetailsScreen(accountDetailsViewModel, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BulletPointItem$lambda$54(BulletPoint bulletPoint, int i, Composer composer, int i2) {
        BulletPointItem(bulletPoint, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoBottomSheet$lambda$48(String str, String str2, ImmutableList immutableList, Function0 function0, int i, int i2, Composer composer, int i3) {
        InfoBottomSheet(str, str2, immutableList, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountDetailsScreen(final AccountDetailsViewModel accountDetailsViewModel, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1575413781);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountDetailsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1575413781, i3, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen (FoundAccountDetailsScreen.kt:78)");
                }
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(720484561, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt.AccountDetailsScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(720484561, i5, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous> (FoundAccountDetailsScreen.kt:82)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        final AccountDetailsViewModel accountDetailsViewModel2 = accountDetailsViewModel;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1671580860, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt.AccountDetailsScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1671580860, i6, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous>.<anonymous> (FoundAccountDetailsScreen.kt:85)");
                                }
                                AccountDetailsViewModel accountDetailsViewModel3 = accountDetailsViewModel2;
                                String brokerName = accountDetailsViewModel3 != null ? accountDetailsViewModel3.getBrokerName() : null;
                                if (brokerName != null) {
                                    BentoText2.m20747BentoText38GnDrw(brokerName, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, FoundAccountDetailsScreen2.INSTANCE.getLambda$861096304$feature_rollover_401k_externalDebug(), null, null, false, false, appBarType, null, 0L, null, composer3, 12583302, 0, 1914);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-632491226, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt.AccountDetailsScreen.2

                    /* compiled from: FoundAccountDetailsScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$AccountDetailsScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ AccountDetailsViewModel $viewModel;

                        AnonymousClass1(AccountDetailsViewModel accountDetailsViewModel) {
                            this.$viewModel = accountDetailsViewModel;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            Modifier.Companion companion;
                            Composer composer2 = composer;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1715496907, i, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous>.<anonymous> (FoundAccountDetailsScreen.kt:115)");
                            }
                            AccountDetailsViewModel accountDetailsViewModel = this.$viewModel;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(-65106865);
                            if (accountDetailsViewModel.getFooterDisclaimer().length() > 0) {
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                companion = companion2;
                                BentoText2.m20747BentoText38GnDrw(accountDetailsViewModel.getFooterDisclaimer(), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextS(), composer, 0, 0, 8120);
                                composer2 = composer;
                            } else {
                                companion = companion2;
                            }
                            composer2.endReplaceGroup();
                            final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                            final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_ACCOUNT_DETAILS, null, null, null, 14, null), UserInteractionEventData.Action.PRIMARY_CTA, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null)), false, false, false, true, false, null, 110, null);
                            String strStringResource = StringResources_androidKt.stringResource(C27696R.string.gated_options_rollover_401k_see_account_options_cta, composer2, 0);
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$AccountDetailsScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FoundAccountDetailsScreen6.C277422.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(navigator, context);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Navigator navigator, Context context) {
                            Navigator.DefaultImpls.startActivity$default(navigator, context, RetirementIntentKeys.INSTANCE, null, false, null, null, 60, null);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632491226, i6, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous> (FoundAccountDetailsScreen.kt:96)");
                        }
                        if (accountDetailsViewModel == null) {
                            composer3.startReplaceGroup(-524527932);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null), true, true, composer3, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3456, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-524150228);
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_ACCOUNT_DETAILS, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1715496907, true, new AnonymousClass1(accountDetailsViewModel), composer3, 54);
                            final AccountDetailsViewModel accountDetailsViewModel2 = accountDetailsViewModel;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierAutoLogEvents$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(442025698, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt.AccountDetailsScreen.2.2
                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i7) throws Resources.NotFoundException {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(442025698, i7, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous>.<anonymous> (FoundAccountDetailsScreen.kt:156)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                                    AccountDetailsViewModel accountDetailsViewModel3 = accountDetailsViewModel2;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    FoundAccountDetailsScreen6.AccountDetailHeaderCard(accountDetailsViewModel3, composer4, 0);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    Spacer2.Spacer(SizeKt.m5159requiredHeight3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21592getMediumD9Ej5fM()), composer4, 0);
                                    FoundAccountDetailsScreen6.AccountDetailPortfolioRegion(accountDetailsViewModel3, composer4, 0);
                                    Spacer2.Spacer(SizeKt.m5159requiredHeight3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21591getLargeD9Ej5fM()), composer4, 0);
                                    FoundAccountDetailsScreen6.AccountDetailPortfolioDisclaimers(accountDetailsViewModel3, composer4, 0);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) throws Resources.NotFoundException {
                                    invoke(boxScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 3504, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FoundAccountDetailsScreen6.AccountDetailsScreen$lambda$0(accountDetailsViewModel, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(720484561, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt.AccountDetailsScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(720484561, i5, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous> (FoundAccountDetailsScreen.kt:82)");
                    }
                    AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                    final AccountDetailsViewModel accountDetailsViewModel2 = accountDetailsViewModel;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1671580860, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt.AccountDetailsScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1671580860, i6, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous>.<anonymous> (FoundAccountDetailsScreen.kt:85)");
                            }
                            AccountDetailsViewModel accountDetailsViewModel3 = accountDetailsViewModel2;
                            String brokerName = accountDetailsViewModel3 != null ? accountDetailsViewModel3.getBrokerName() : null;
                            if (brokerName != null) {
                                BentoText2.m20747BentoText38GnDrw(brokerName, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, FoundAccountDetailsScreen2.INSTANCE.getLambda$861096304$feature_rollover_401k_externalDebug(), null, null, false, false, appBarType, null, 0L, null, composer3, 12583302, 0, 1914);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-632491226, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt.AccountDetailsScreen.2

                /* compiled from: FoundAccountDetailsScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$AccountDetailsScreen$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                    final /* synthetic */ AccountDetailsViewModel $viewModel;

                    AnonymousClass1(AccountDetailsViewModel accountDetailsViewModel) {
                        this.$viewModel = accountDetailsViewModel;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                        Modifier.Companion companion;
                        Composer composer2 = composer;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1715496907, i, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous>.<anonymous> (FoundAccountDetailsScreen.kt:115)");
                        }
                        AccountDetailsViewModel accountDetailsViewModel = this.$viewModel;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer2.startReplaceGroup(-65106865);
                        if (accountDetailsViewModel.getFooterDisclaimer().length() > 0) {
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                            companion = companion2;
                            BentoText2.m20747BentoText38GnDrw(accountDetailsViewModel.getFooterDisclaimer(), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextS(), composer, 0, 0, 8120);
                            composer2 = composer;
                        } else {
                            companion = companion2;
                        }
                        composer2.endReplaceGroup();
                        final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                        final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_ACCOUNT_DETAILS, null, null, null, 14, null), UserInteractionEventData.Action.PRIMARY_CTA, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null)), false, false, false, true, false, null, 110, null);
                        String strStringResource = StringResources_androidKt.stringResource(C27696R.string.gated_options_rollover_401k_see_account_options_cta, composer2, 0);
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$AccountDetailsScreen$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FoundAccountDetailsScreen6.C277422.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(navigator, context);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                        invoke(bentoButtonBar3, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Navigator navigator, Context context) {
                        Navigator.DefaultImpls.startActivity$default(navigator, context, RetirementIntentKeys.INSTANCE, null, false, null, null, 60, null);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632491226, i6, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous> (FoundAccountDetailsScreen.kt:96)");
                    }
                    if (accountDetailsViewModel == null) {
                        composer3.startReplaceGroup(-524527932);
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null), true, true, composer3, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3456, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-524150228);
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_ACCOUNT_DETAILS, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1715496907, true, new AnonymousClass1(accountDetailsViewModel), composer3, 54);
                        final AccountDetailsViewModel accountDetailsViewModel2 = accountDetailsViewModel;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierAutoLogEvents$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(442025698, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt.AccountDetailsScreen.2.2
                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i7) throws Resources.NotFoundException {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(442025698, i7, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsScreen.<anonymous>.<anonymous> (FoundAccountDetailsScreen.kt:156)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                                AccountDetailsViewModel accountDetailsViewModel3 = accountDetailsViewModel2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                FoundAccountDetailsScreen6.AccountDetailHeaderCard(accountDetailsViewModel3, composer4, 0);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5159requiredHeight3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21592getMediumD9Ej5fM()), composer4, 0);
                                FoundAccountDetailsScreen6.AccountDetailPortfolioRegion(accountDetailsViewModel3, composer4, 0);
                                Spacer2.Spacer(SizeKt.m5159requiredHeight3ABfNKs(companion, bentoTheme.getSpacing(composer4, i8).m21591getLargeD9Ej5fM()), composer4, 0);
                                FoundAccountDetailsScreen6.AccountDetailPortfolioDisclaimers(accountDetailsViewModel3, composer4, 0);
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) throws Resources.NotFoundException {
                                invoke(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 3504, 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean AccountDetailHeaderCard$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean AccountDetailHeaderCard$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean AccountDetailHeaderCard$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean AccountDetailPortfolioRegion$lambda$27(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: FoundAccountDetailsScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$InfoBottomSheet$1 */
    static final class C277431 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ String $bodyText;
        final /* synthetic */ ImmutableList<BulletPoint> $bulletPoints;
        final /* synthetic */ String $title;

        C277431(String str, String str2, ImmutableList<BulletPoint> immutableList) {
            this.$title = str;
            this.$bodyText = str2;
            this.$bulletPoints = immutableList;
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x02e3  */
        /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            int i3;
            final RhModalBottomSheet5 rhModalBottomSheet5;
            int i4;
            Object objRememberedValue;
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1313552051, i2, -1, "com.robinhood.android.rollover401k.steps.accountdetails.InfoBottomSheet.<anonymous> (FoundAccountDetailsScreen.kt:388)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i5).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            int i6 = i2;
            String str = this.$title;
            String str2 = this.$bodyText;
            ImmutableList<BulletPoint> immutableList = this.$bulletPoints;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), 0.0f, bentoTheme.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(str, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composer, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i5).getDisplayCapsuleSmall(), composer, 0, 0, 8184);
            Composer composer2 = composer;
            composer2.startReplaceGroup(1078134586);
            if (str2 != null) {
                BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer, 0, 0, 8186);
                composer2 = composer;
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1078143707);
            if (immutableList == null) {
                i3 = 0;
            } else {
                i3 = 0;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                composer2.startReplaceGroup(1078147808);
                Iterator<BulletPoint> it = immutableList.iterator();
                while (it.hasNext()) {
                    FoundAccountDetailsScreen6.BulletPointItem(it.next(), composer2, 0);
                }
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            String strStringResource = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_bottom_sheet_cta, composer2, i3);
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null);
            composer2.startReplaceGroup(5004770);
            if ((i6 & 14) != 4) {
                if ((i6 & 8) != 0) {
                    rhModalBottomSheet5 = RhModalBottomSheet;
                    if (composer2.changedInstance(rhModalBottomSheet5)) {
                    }
                    objRememberedValue = composer2.rememberedValue();
                    if (i4 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$InfoBottomSheet$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FoundAccountDetailsScreen6.C277431.invoke$lambda$6$lambda$5$lambda$4(rhModalBottomSheet5);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                rhModalBottomSheet5 = RhModalBottomSheet;
                i4 = i3;
                objRememberedValue = composer2.rememberedValue();
                if (i4 != 0) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$InfoBottomSheet$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FoundAccountDetailsScreen6.C277431.invoke$lambda$6$lambda$5$lambda$4(rhModalBottomSheet5);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                rhModalBottomSheet5 = RhModalBottomSheet;
            }
            i4 = 1;
            objRememberedValue = composer2.rememberedValue();
            if (i4 != 0) {
            }
            composer2.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountDetailHeaderCard(final AccountDetailsViewModel accountDetailsViewModel, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1919813202);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(accountDetailsViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1919813202, i2, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailHeaderCard (FoundAccountDetailsScreen.kt:175)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState5 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState snapshotState6 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
            float f = 70;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 13, null);
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(modifierM5146paddingqDBjuR0$default, fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(20)));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4876borderxT4_qwU);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            Spacer2.Spacer(SizeKt.m5159requiredHeight3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
            float f2 = 12;
            Spacer2.Spacer(SizeKt.m5159requiredHeight3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 6);
            BentoText2.m20747BentoText38GnDrw(accountDetailsViewModel.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8122);
            BentoText2.m20747BentoText38GnDrw(accountDetailsViewModel.getConnectedMessage(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 0, 0, 8186);
            Spacer2.Spacer(SizeKt.m5159requiredHeight3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 6);
            float f3 = 0;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(f3), 1, null), null, StringResources_androidKt.stringResource(C27696R.string.rollover_401k_account_balance_label, composerStartRestartGroup, 0), null, null, new BentoBaseRowState.Meta.SingleLine(accountDetailsViewModel.getAccountBalance()), null, false, false, false, 0L, null, composerStartRestartGroup, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 6, 0, 4058);
            String strStringResource = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_contribution_type_label, composerStartRestartGroup, 0);
            String contributionType = accountDetailsViewModel.getContributionType();
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.INFO_16;
            BentoBaseRowState.Meta.SingleLineAndIcon singleLineAndIcon = new BentoBaseRowState.Meta.SingleLineAndIcon(contributionType, serverToBentoAssetMapper2, StringResources_androidKt.stringResource(C27696R.string.content_description_contribution_type_info, composerStartRestartGroup, 0), (Color) null, 8, (DefaultConstructorMarker) null);
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(f3), 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                snapshotState = snapshotState4;
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FoundAccountDetailsScreen6.m2448x6c9ac2e4(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                snapshotState = snapshotState4;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i4 = BentoBaseRowState.Meta.SingleLineAndIcon.$stable;
            final SnapshotState snapshotState7 = snapshotState;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierM5144paddingVpY3zN4$default, null, strStringResource, null, null, singleLineAndIcon, null, false, false, false, 0L, (Function0) objRememberedValue4, composerStartRestartGroup, (i4 << 15) | 6, 48, 2010);
            String strStringResource2 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_last_contribution_label, composerStartRestartGroup, 0);
            BentoBaseRowState.Meta.SingleLineAndIcon singleLineAndIcon2 = new BentoBaseRowState.Meta.SingleLineAndIcon(accountDetailsViewModel.getLastContributionDate(), serverToBentoAssetMapper2, StringResources_androidKt.stringResource(C27696R.string.content_description_last_contribution_info, composerStartRestartGroup, 0), (Color) null, 8, (DefaultConstructorMarker) null);
            Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(f3), 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                snapshotState2 = snapshotState5;
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FoundAccountDetailsScreen6.m2449x96642868(snapshotState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                snapshotState2 = snapshotState5;
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState8 = snapshotState2;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierM5144paddingVpY3zN4$default2, null, strStringResource2, null, null, singleLineAndIcon2, null, false, false, false, 0L, (Function0) objRememberedValue5, composerStartRestartGroup, (i4 << 15) | 6, 48, 2010);
            String strStringResource3 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_account_fees_label, composerStartRestartGroup, 0);
            BentoBaseRowState.Meta.SingleLineAndIcon singleLineAndIcon3 = new BentoBaseRowState.Meta.SingleLineAndIcon(accountDetailsViewModel.getAccountFees(), serverToBentoAssetMapper2, StringResources_androidKt.stringResource(C27696R.string.content_description_account_fees_info, composerStartRestartGroup, 0), (Color) null, 8, (DefaultConstructorMarker) null);
            Modifier modifierM5144paddingVpY3zN4$default3 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(f3), 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                snapshotState3 = snapshotState6;
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FoundAccountDetailsScreen6.m2450xc02d8dec(snapshotState3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                snapshotState3 = snapshotState6;
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState9 = snapshotState3;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierM5144paddingVpY3zN4$default3, null, strStringResource3, null, null, singleLineAndIcon3, null, false, false, false, 0L, (Function0) objRememberedValue6, composerStartRestartGroup, (i4 << 15) | 6, 48, 2010);
            composerStartRestartGroup.endNode();
            BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(StringResources_androidKt.stringResource(C27696R.string.rollover_401k_account_detail_image_url, composerStartRestartGroup, 0), null, null, null, 0, null, composerStartRestartGroup, 0, 62), StringResources_androidKt.stringResource(C27696R.string.rollover_401k_account_detail_image_description, composerStartRestartGroup, 0), Background3.m4872backgroundbw27NRU$default(SizeKt.m5162requiredSize3ABfNKs(companion3, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE)), bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null), null, null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0, 2, null), composerStartRestartGroup, 0, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(741956592);
            if (AccountDetailHeaderCard$lambda$2(snapshotState7)) {
                String strStringResource4 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_contribution_type_title, composerStartRestartGroup, 0);
                String strStringResource5 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_contribution_type_body, composerStartRestartGroup, 0);
                ImmutableList immutableList = extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new BulletPoint[]{new BulletPoint(StringResources_androidKt.stringResource(C27696R.string.rollover_401k_contribution_type_pre_tax_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27696R.string.rollover_401k_contribution_type_pre_tax_body, composerStartRestartGroup, 0)), new BulletPoint(StringResources_androidKt.stringResource(C27696R.string.rollover_401k_contribution_type_roth_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27696R.string.rollover_401k_contribution_type_roth_body, composerStartRestartGroup, 0))}));
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FoundAccountDetailsScreen6.AccountDetailHeaderCard$lambda$24$lambda$19$lambda$18(snapshotState7);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                InfoBottomSheet(strStringResource4, strStringResource5, immutableList, (Function0) objRememberedValue7, composerStartRestartGroup, 3072, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(741986348);
            if (AccountDetailHeaderCard$lambda$5(snapshotState8)) {
                String strStringResource6 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_last_contribution_title, composerStartRestartGroup, 0);
                String strStringResource7 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_last_contribution_body, new Object[]{accountDetailsViewModel.getBrokerName()}, composerStartRestartGroup, 0);
                ImmutableList immutableList2 = extensions2.toImmutableList(CollectionsKt.listOf((Object[]) new BulletPoint[]{new BulletPoint(StringResources_androidKt.stringResource(C27696R.string.rollover_401k_last_contribution_active_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27696R.string.rollover_401k_last_contribution_active_body, composerStartRestartGroup, 0)), new BulletPoint(StringResources_androidKt.stringResource(C27696R.string.rollover_401k_last_contribution_inactive_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27696R.string.rollover_401k_last_contribution_inactive_body, composerStartRestartGroup, 0))}));
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FoundAccountDetailsScreen6.AccountDetailHeaderCard$lambda$24$lambda$21$lambda$20(snapshotState8);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                InfoBottomSheet(strStringResource6, strStringResource7, immutableList2, (Function0) objRememberedValue8, composerStartRestartGroup, 3072, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(742016333);
            if (AccountDetailHeaderCard$lambda$8(snapshotState9)) {
                String strStringResource8 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_account_fees_title, composerStartRestartGroup, 0);
                String strStringResource9 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_account_fees_body, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FoundAccountDetailsScreen6.AccountDetailHeaderCard$lambda$24$lambda$23$lambda$22(snapshotState9);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                InfoBottomSheet(strStringResource8, strStringResource9, null, (Function0) objRememberedValue9, composerStartRestartGroup, 3072, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FoundAccountDetailsScreen6.AccountDetailHeaderCard$lambda$25(accountDetailsViewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AccountDetailHeaderCard$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void AccountDetailHeaderCard$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void AccountDetailHeaderCard$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AccountDetailHeaderCard$lambda$24$lambda$17$lambda$16$lambda$11$lambda$10 */
    public static final Unit m2448x6c9ac2e4(SnapshotState snapshotState) {
        AccountDetailHeaderCard$lambda$3(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AccountDetailHeaderCard$lambda$24$lambda$17$lambda$16$lambda$13$lambda$12 */
    public static final Unit m2449x96642868(SnapshotState snapshotState) {
        AccountDetailHeaderCard$lambda$6(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AccountDetailHeaderCard$lambda$24$lambda$17$lambda$16$lambda$15$lambda$14 */
    public static final Unit m2450xc02d8dec(SnapshotState snapshotState) {
        AccountDetailHeaderCard$lambda$9(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailHeaderCard$lambda$24$lambda$19$lambda$18(SnapshotState snapshotState) {
        AccountDetailHeaderCard$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailHeaderCard$lambda$24$lambda$21$lambda$20(SnapshotState snapshotState) {
        AccountDetailHeaderCard$lambda$6(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailHeaderCard$lambda$24$lambda$23$lambda$22(SnapshotState snapshotState) {
        AccountDetailHeaderCard$lambda$9(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountDetailPortfolioRegion(final AccountDetailsViewModel accountDetailsViewModel, Composer composer, final int i) {
        final SnapshotState snapshotState;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1735035057);
        int i2 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(accountDetailsViewModel) ? 4 : 2) : i;
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1735035057, i2, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailPortfolioRegion (FoundAccountDetailsScreen.kt:305)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String portfolioAllocationHeading = accountDetailsViewModel.getPortfolioAllocationHeading();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(portfolioAllocationHeading, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8186);
            Spacer2.Spacer(SizeKt.m5166requiredWidth3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21597getXxsmallD9Ej5fM()), composerStartRestartGroup, 0);
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16);
            String strStringResource = StringResources_androidKt.stringResource(C27696R.string.content_description_portfolio_allocation_info, composerStartRestartGroup, 0);
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                snapshotState = snapshotState2;
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FoundAccountDetailsScreen6.m2451x324c8321(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                snapshotState = snapshotState2;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, jM21426getFg20d7_KjU, null, (Function0) objRememberedValue2, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 24576, 40);
            composerStartRestartGroup.endNode();
            Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(spaceEvenly, companion3.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            composerStartRestartGroup.startReplaceGroup(-54410974);
            List<DataRow> portfolioAllocationRows = accountDetailsViewModel.getPortfolioAllocationRows();
            ArrayList<DataRow> arrayList = new ArrayList();
            int i4 = 0;
            for (Object obj : portfolioAllocationRows) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i4 % 2 == 0) {
                    arrayList.add(obj);
                }
                i4 = i5;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (DataRow dataRow : arrayList) {
                AccountDetailPortfolioRegionElement(dataRow.getLabel(), dataRow.getValue(), composerStartRestartGroup, 0);
                arrayList2.add(Unit.INSTANCE);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            final SnapshotState snapshotState3 = snapshotState;
            Modifier modifierWeight$default2 = Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
            Column6 column62 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-749627047);
            List<DataRow> portfolioAllocationRows2 = accountDetailsViewModel.getPortfolioAllocationRows();
            ArrayList<DataRow> arrayList3 = new ArrayList();
            int i6 = 0;
            for (Object obj2 : portfolioAllocationRows2) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i6 % 2 == 1) {
                    arrayList3.add(obj2);
                }
                i6 = i7;
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (DataRow dataRow2 : arrayList3) {
                AccountDetailPortfolioRegionElement(dataRow2.getLabel(), dataRow2.getValue(), composerStartRestartGroup, 0);
                arrayList4.add(Unit.INSTANCE);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-890850662);
            if (AccountDetailPortfolioRegion$lambda$27(snapshotState3)) {
                String strStringResource2 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_portfolio_allocation_title, composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C27696R.string.rollover_401k_portfolio_allocation_body, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FoundAccountDetailsScreen6.AccountDetailPortfolioRegion$lambda$41$lambda$40$lambda$39(snapshotState3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                InfoBottomSheet(strStringResource2, strStringResource3, null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 4);
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return FoundAccountDetailsScreen6.AccountDetailPortfolioRegion$lambda$42(accountDetailsViewModel, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final void AccountDetailPortfolioRegion$lambda$28(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AccountDetailPortfolioRegion$lambda$41$lambda$31$lambda$30$lambda$29 */
    public static final Unit m2451x324c8321(SnapshotState snapshotState) {
        AccountDetailPortfolioRegion$lambda$28(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDetailPortfolioRegion$lambda$41$lambda$40$lambda$39(SnapshotState snapshotState) {
        AccountDetailPortfolioRegion$lambda$28(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final void AccountDetailPortfolioRegionElement(final String str, String str2, Composer composer, final int i) {
        int i2;
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1869693842);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1869693842, i2, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailPortfolioRegionElement (FoundAccountDetailsScreen.kt:347)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, i2 & 14, 0, 8184);
            str3 = str2;
            BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextL(), composerStartRestartGroup, (i2 >> 3) & 14, 0, 8186);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FoundAccountDetailsScreen6.AccountDetailPortfolioRegionElement$lambda$44(str, str3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountDetailPortfolioDisclaimers(final AccountDetailsViewModel accountDetailsViewModel, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162220229);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(accountDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162220229, i2, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailPortfolioDisclaimers (FoundAccountDetailsScreen.kt:360)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1257571239);
            if (accountDetailsViewModel.getPlaidDisclaimer().length() > 0) {
                UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                String plaidDisclaimer = accountDetailsViewModel.getPlaidDisclaimer();
                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), 0, bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 26);
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance = composer2.changedInstance(uriHandler);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FoundAccountDetailsScreen7(uriHandler);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(plaidDisclaimer, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) ((KFunction) objRememberedValue), composer2, MarkdownStyle.$stable << 6, 10);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FoundAccountDetailsScreen6.AccountDetailPortfolioDisclaimers$lambda$47(accountDetailsViewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void InfoBottomSheet(final String str, String str2, ImmutableList<BulletPoint> immutableList, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        ImmutableList<BulletPoint> immutableList2;
        final ImmutableList<BulletPoint> immutableList3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1655086202);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str2;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    immutableList2 = immutableList;
                    i3 |= composerStartRestartGroup.changed(immutableList2) ? 256 : 128;
                }
                if ((i2 & 8) == 0) {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        if (i5 != 0) {
                            str3 = null;
                        }
                        immutableList3 = i4 == 0 ? null : immutableList2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1655086202, i3, -1, "com.robinhood.android.rollover401k.steps.accountdetails.InfoBottomSheet (FoundAccountDetailsScreen.kt:384)");
                        }
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1313552051, true, new C277431(str, str3, immutableList3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 1572864, 62);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        immutableList3 = immutableList2;
                    }
                    final String str4 = str3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return FoundAccountDetailsScreen6.InfoBottomSheet$lambda$48(str, str4, immutableList3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                if ((i3 & 1171) == 1170) {
                    if (i5 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1313552051, true, new C277431(str, str3, immutableList3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                final String str42 = str3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            immutableList2 = immutableList;
            if ((i2 & 8) == 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            final String str422 = str3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str3 = str2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        immutableList2 = immutableList;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        final String str4222 = str3;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BulletPointItem(final BulletPoint bulletPoint, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(621722089);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(bulletPoint) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(621722089, i2, -1, "com.robinhood.android.rollover401k.steps.accountdetails.BulletPointItem (FoundAccountDetailsScreen.kt:440)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 7, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw("• ", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 6, 0, 8184);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append(bulletPoint.getTitle());
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    builder.append(bulletPoint.getBody());
                    builder.pop(iPushStyle);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composer2, 0, 0, 8186);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } finally {
                }
            } finally {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FoundAccountDetailsScreen6.BulletPointItem$lambda$54(bulletPoint, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AccountDetailsPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1092865791);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1092865791, i, -1, "com.robinhood.android.rollover401k.steps.accountdetails.AccountDetailsPreview (FoundAccountDetailsScreen.kt:472)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, FoundAccountDetailsScreen2.INSTANCE.getLambda$1145110199$feature_rollover_401k_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FoundAccountDetailsScreen6.AccountDetailsPreview$lambda$55(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
