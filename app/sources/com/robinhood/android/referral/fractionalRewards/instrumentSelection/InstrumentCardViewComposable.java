package com.robinhood.android.referral.fractionalRewards.instrumentSelection;

import android.content.Context;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Size;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.ClaimableInstrument;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RewardContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: InstrumentCardViewComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0011\u0010\t\u001a\u00020\n*\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u000eX\u008a\u008e\u0002"}, m3636d2 = {"InstrumentCardViewComposable", "", "instrument", "Lcom/robinhood/models/ui/ClaimableInstrument;", "onCardClicked", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/ui/ClaimableInstrument;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toHttpUrl", "Lokhttp3/HttpUrl;", "Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "(Lcom/robinhood/models/serverdriven/db/ThemedImageSource;Landroidx/compose/runtime/Composer;I)Lokhttp3/HttpUrl;", "FractionalRewardInstrumentSelectionFragmentDescription", "", InstrumentCardViewComposable.InstrumentCardStockImage, InstrumentCardViewComposable.InstrumentCardStockName, InstrumentCardViewComposable.InstrumentCardStockSymbol, "feature-referral_externalDebug", "text"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InstrumentCardViewComposable {
    private static final String FractionalRewardInstrumentSelectionFragmentDescription = "FractionalRewardInstrumentSelectionFragment";
    public static final String InstrumentCardStockImage = "InstrumentCardStockImage";
    public static final String InstrumentCardStockName = "InstrumentCardStockName";
    public static final String InstrumentCardStockSymbol = "InstrumentCardStockSymbol";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentCardViewComposable$lambda$0(ClaimableInstrument claimableInstrument, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InstrumentCardViewComposable(claimableInstrument, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentCardViewComposable(final ClaimableInstrument instrument, final Function1<? super ClaimableInstrument, Unit> onCardClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(onCardClicked, "onCardClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-564413458);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrument) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-564413458, i3, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposable (InstrumentCardViewComposable.kt:52)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.PICK_STOCK_SCREEN, FractionalRewardInstrumentSelectionFragmentDescription, null, null, 12, null), UserInteractionEventData.Action.SELECT, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RewardContext(null, null, 0.0d, null, null, Booleans2.toProtobuf(Boolean.valueOf(!instrument.getAvailableToClaim())), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1048577, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ASSET_ROW, instrument.getName(), null, 4, null), null, 33, null), ComposableLambda3.rememberComposableLambda(694142627, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt.InstrumentCardViewComposable.1
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
                            ComposerKt.traceEventStart(694142627, i5, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposable.<anonymous> (InstrumentCardViewComposable.kt:66)");
                        }
                        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m5174width3ABfNKs(modifier3, PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_instrument_card_width, composer2, 0)), null, false, 3, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        SurfaceKt.m5643SurfaceFjzlyU(PaddingKt.m5146paddingqDBjuR0$default(modifierWrapContentHeight$default, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 11, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer2, i6).m21427getFg30d7_KjU()), 0.0f, ComposableLambda3.rememberComposableLambda(1535139551, true, new AnonymousClass1(context, instrument, onCardClicked), composer2, 54), composer2, 1572864, 40);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: InstrumentCardViewComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt$InstrumentCardViewComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ ClaimableInstrument $instrument;
                        final /* synthetic */ Function1<ClaimableInstrument, Unit> $onCardClicked;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Context context, ClaimableInstrument claimableInstrument, Function1<? super ClaimableInstrument, Unit> function1) {
                            this.$context = context;
                            this.$instrument = claimableInstrument;
                            this.$onCardClicked = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        private static final String invoke$lambda$8$lambda$2(SnapshotState<String> snapshotState) {
                            return snapshotState.getValue();
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1535139551, i, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposable.<anonymous>.<anonymous> (InstrumentCardViewComposable.kt:78)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, companion2.getCenter(), false, 2, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierWrapContentSize$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            Context context = this.$context;
                            final ClaimableInstrument claimableInstrument = this.$instrument;
                            final Function1<ClaimableInstrument, Unit> function1 = this.$onCardClicked;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentSize$default(companion, null, false, 3, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(InstrumentCardViewComposable.toHttpUrl(claimableInstrument.getIconUrl(), composer, 0)).size(Size.ORIGINAL).build(), null, null, null, 0, null, composer, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_company_logo_width, composer, 0)), PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_company_logo_height, composer, 0)), InstrumentCardViewComposable.InstrumentCardStockImage), companion2.getCenter(), (ContentScale) null, 0.0f, (ColorFilter) null, composer, 3120, 112);
                            composer.endNode();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            Composer.Companion companion4 = Composer.INSTANCE;
                            if (objRememberedValue == companion4.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(claimableInstrument.getName(), null, 2, null);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            composer.endReplaceGroup();
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(companion, null, false, 3, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), InstrumentCardViewComposable.InstrumentCardStockName);
                            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
                            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                            String strInvoke$lambda$8$lambda$2 = invoke$lambda$8$lambda$2(snapshotState);
                            TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                            composer.startReplaceGroup(5004770);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == companion4.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt$InstrumentCardViewComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InstrumentCardViewComposable.C266941.AnonymousClass1.invoke$lambda$8$lambda$5$lambda$4(snapshotState, (TextLayoutResult) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(strInvoke$lambda$8$lambda$2, modifierTestTag, null, null, null, null, textAlignM7912boximpl, 0, false, 2, 0, (Function1) objRememberedValue2, 0, displayCapsuleSmall, composer, 805306368, 48, 5564);
                            Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.wrapContentSize$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion, null, true, false, false, true, false, null, 109, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null), null, false, 3, null), InstrumentCardViewComposable.InstrumentCardStockSymbol);
                            String string2 = context.getString(C26659R.string.fractional_reward_card_claim_button_placeholder, claimableInstrument.getSymbol());
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            boolean availableToClaim = claimableInstrument.getAvailableToClaim();
                            BentoButtons.Type type2 = BentoButtons.Type.Text;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            long jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(claimableInstrument) | composer.changed(function1);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue3 == companion4.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt$InstrumentCardViewComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InstrumentCardViewComposable.C266941.AnonymousClass1.invoke$lambda$8$lambda$7$lambda$6(claimableInstrument, function1);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, string2, modifierTestTag2, null, type2, availableToClaim, false, Color.m6701boximpl(jM21371getBg0d7_KjU), Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21427getFg30d7_KjU), null, false, null, composer, 24576, 0, 7240);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$5$lambda$4(SnapshotState snapshotState, TextLayoutResult textLayoutResult) {
                            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                            if (textLayoutResult.getLineCount() < 2) {
                                snapshotState.setValue(invoke$lambda$8$lambda$2(snapshotState) + StringsKt.repeat("\n ", 2 - textLayoutResult.getLineCount()));
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$8$lambda$7$lambda$6(ClaimableInstrument claimableInstrument, Function1 function1) {
                            if (claimableInstrument.getAvailableToClaim()) {
                                function1.invoke(claimableInstrument);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentCardViewComposable.InstrumentCardViewComposable$lambda$0(instrument, onCardClicked, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.PICK_STOCK_SCREEN, FractionalRewardInstrumentSelectionFragmentDescription, null, null, 12, null), UserInteractionEventData.Action.SELECT, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RewardContext(null, null, 0.0d, null, null, Booleans2.toProtobuf(Boolean.valueOf(!instrument.getAvailableToClaim())), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1048577, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ASSET_ROW, instrument.getName(), null, 4, null), null, 33, null), ComposableLambda3.rememberComposableLambda(694142627, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt.InstrumentCardViewComposable.1
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
                        ComposerKt.traceEventStart(694142627, i5, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposable.<anonymous> (InstrumentCardViewComposable.kt:66)");
                    }
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m5174width3ABfNKs(modifier3, PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_instrument_card_width, composer2, 0)), null, false, 3, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    SurfaceKt.m5643SurfaceFjzlyU(PaddingKt.m5146paddingqDBjuR0$default(modifierWrapContentHeight$default, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 11, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composer2, i6).m21427getFg30d7_KjU()), 0.0f, ComposableLambda3.rememberComposableLambda(1535139551, true, new AnonymousClass1(context2, instrument, onCardClicked), composer2, 54), composer2, 1572864, 40);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: InstrumentCardViewComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt$InstrumentCardViewComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ ClaimableInstrument $instrument;
                    final /* synthetic */ Function1<ClaimableInstrument, Unit> $onCardClicked;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Context context, ClaimableInstrument claimableInstrument, Function1<? super ClaimableInstrument, Unit> function1) {
                        this.$context = context;
                        this.$instrument = claimableInstrument;
                        this.$onCardClicked = function1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    private static final String invoke$lambda$8$lambda$2(SnapshotState<String> snapshotState) {
                        return snapshotState.getValue();
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1535139551, i, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposable.<anonymous>.<anonymous> (InstrumentCardViewComposable.kt:78)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, companion2.getCenter(), false, 2, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierWrapContentSize$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                        Context context = this.$context;
                        final ClaimableInstrument claimableInstrument = this.$instrument;
                        final Function1 function1 = this.$onCardClicked;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.wrapContentSize$default(companion, null, false, 3, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(InstrumentCardViewComposable.toHttpUrl(claimableInstrument.getIconUrl(), composer, 0)).size(Size.ORIGINAL).build(), null, null, null, 0, null, composer, 0, 62), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_company_logo_width, composer, 0)), PrimitiveResources_androidKt.dimensionResource(C26659R.dimen.fractional_reward_company_logo_height, composer, 0)), InstrumentCardViewComposable.InstrumentCardStockImage), companion2.getCenter(), (ContentScale) null, 0.0f, (ColorFilter) null, composer, 3120, 112);
                        composer.endNode();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion4 = Composer.INSTANCE;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(claimableInstrument.getName(), null, 2, null);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composer.endReplaceGroup();
                        Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.wrapContentSize$default(companion, null, false, 3, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), InstrumentCardViewComposable.InstrumentCardStockName);
                        TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        String strInvoke$lambda$8$lambda$2 = invoke$lambda$8$lambda$2(snapshotState);
                        TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                        composer.startReplaceGroup(5004770);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion4.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt$InstrumentCardViewComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstrumentCardViewComposable.C266941.AnonymousClass1.invoke$lambda$8$lambda$5$lambda$4(snapshotState, (TextLayoutResult) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(strInvoke$lambda$8$lambda$2, modifierTestTag, null, null, null, null, textAlignM7912boximpl, 0, false, 2, 0, (Function1) objRememberedValue2, 0, displayCapsuleSmall, composer, 805306368, 48, 5564);
                        Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.wrapContentSize$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion, null, true, false, false, true, false, null, 109, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null), null, false, 3, null), InstrumentCardViewComposable.InstrumentCardStockSymbol);
                        String string2 = context.getString(C26659R.string.fractional_reward_card_claim_button_placeholder, claimableInstrument.getSymbol());
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        boolean availableToClaim = claimableInstrument.getAvailableToClaim();
                        BentoButtons.Type type2 = BentoButtons.Type.Text;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                        long jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(claimableInstrument) | composer.changed(function1);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == companion4.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.referral.fractionalRewards.instrumentSelection.InstrumentCardViewComposableKt$InstrumentCardViewComposable$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InstrumentCardViewComposable.C266941.AnonymousClass1.invoke$lambda$8$lambda$7$lambda$6(claimableInstrument, function1);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, string2, modifierTestTag2, null, type2, availableToClaim, false, Color.m6701boximpl(jM21371getBg0d7_KjU), Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21427getFg30d7_KjU), null, false, null, composer, 24576, 0, 7240);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$5$lambda$4(SnapshotState snapshotState, TextLayoutResult textLayoutResult) {
                        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                        if (textLayoutResult.getLineCount() < 2) {
                            snapshotState.setValue(invoke$lambda$8$lambda$2(snapshotState) + StringsKt.repeat("\n ", 2 - textLayoutResult.getLineCount()));
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$7$lambda$6(ClaimableInstrument claimableInstrument, Function1 function1) {
                        if (claimableInstrument.getAvailableToClaim()) {
                            function1.invoke(claimableInstrument);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpUrl toHttpUrl(ThemedImageSource themedImageSource, Composer composer, int i) {
        composer.startReplaceGroup(-621010394);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-621010394, i, -1, "com.robinhood.android.referral.fractionalRewards.instrumentSelection.toHttpUrl (InstrumentCardViewComposable.kt:150)");
        }
        HttpUrl imageUrl = (BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay() ? themedImageSource.getLight() : themedImageSource.getDark()).toImageUrl((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return imageUrl;
    }
}
