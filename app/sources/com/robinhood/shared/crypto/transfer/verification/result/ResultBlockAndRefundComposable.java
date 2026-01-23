package com.robinhood.shared.crypto.transfer.verification.result;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import androidx.view.compose.LocalActivity;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable;
import com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundDuxo3;
import com.robinhood.shared.lib.crypto.transfer.CryptoTransferErrorHandler;
import com.robinhood.shared.remote.assets.SvgUrl;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitives;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ResultBlockAndRefundComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\"\u0010\u0010\u0010\u001a\u00020\u00118\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0012\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u008a\u0084\u0002"}, m3636d2 = {"ResultBlockAndRefundComposable", "", "transferId", "Ljava/util/UUID;", "verificationId", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "content", "Lcom/robinhood/models/api/transfer/verification/NextStepData$Content;", "done", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundDuxo;", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;Lcom/robinhood/models/api/transfer/verification/NextStepData$Content;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundDuxo;Landroidx/compose/runtime/Composer;II)V", "SASSY_FLOW_ID", "", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ResultBlockAndRefundComposable {
    public static final String SASSY_FLOW_ID = "crypto-transfers-refund";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultBlockAndRefundComposable$lambda$4(UUID uuid, UUID uuid2, VerificationType verificationType, ApiCryptoVerificationResponse3.Content content, Function0 function0, Modifier modifier, ResultBlockAndRefundDuxo resultBlockAndRefundDuxo, int i, int i2, Composer composer, int i3) {
        ResultBlockAndRefundComposable(uuid, uuid2, verificationType, content, function0, modifier, resultBlockAndRefundDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ResultBlockAndRefundComposable(UUID uuid, final UUID verificationId, final VerificationType verificationType, final ApiCryptoVerificationResponse3.Content content, final Function0<Unit> done, Modifier modifier, ResultBlockAndRefundDuxo resultBlockAndRefundDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ResultBlockAndRefundDuxo resultBlockAndRefundDuxo2;
        int i4;
        ResultBlockAndRefundDuxo resultBlockAndRefundDuxo3;
        int i5;
        final ResultBlockAndRefundDuxo resultBlockAndRefundDuxo4;
        CreationExtras defaultViewModelCreationExtras;
        Object objRememberedValue;
        Composer.Companion companion;
        final CryptoTransferErrorHandler cryptoTransferErrorHandler;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Event<ResultBlockAndRefundDuxo3> eventResultBlockAndRefundComposable$lambda$2;
        final ResultBlockAndRefundDuxo resultBlockAndRefundDuxo5;
        EventConsumer<ResultBlockAndRefundDuxo3> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final UUID uuid2 = uuid;
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(done, "done");
        Composer composerStartRestartGroup = composer.startRestartGroup(-774750380);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uuid2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(done) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    resultBlockAndRefundDuxo2 = resultBlockAndRefundDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(resultBlockAndRefundDuxo2) ? 1048576 : 524288;
                    i3 |= i7;
                } else {
                    resultBlockAndRefundDuxo2 = resultBlockAndRefundDuxo;
                }
                i3 |= i7;
            } else {
                resultBlockAndRefundDuxo2 = resultBlockAndRefundDuxo;
            }
            if ((599043 & i3) == 599042 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    ResultBlockAndRefundDuxo resultBlockAndRefundDuxo6 = resultBlockAndRefundDuxo2;
                    i5 = i3;
                    resultBlockAndRefundDuxo4 = resultBlockAndRefundDuxo6;
                    i4 = -1633490746;
                } else {
                    Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ResultBlockAndRefundDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$ResultBlockAndRefundComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$ResultBlockAndRefundComposable$$inlined$duxo$1.1
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
                        resultBlockAndRefundDuxo3 = (ResultBlockAndRefundDuxo) baseDuxo;
                        i3 &= -3670017;
                    } else {
                        i4 = -1633490746;
                        resultBlockAndRefundDuxo3 = resultBlockAndRefundDuxo2;
                    }
                    i5 = i3;
                    resultBlockAndRefundDuxo4 = resultBlockAndRefundDuxo3;
                    modifier2 = modifier3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-774750380, i5, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable (ResultBlockAndRefundComposable.kt:57)");
                }
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) objConsume;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    CryptoTransferErrorHandler cryptoTransferErrorHandler2 = new CryptoTransferErrorHandler(activity, null, null, null, null, false, 48, null);
                    composerStartRestartGroup.updateRememberedValue(cryptoTransferErrorHandler2);
                    objRememberedValue = cryptoTransferErrorHandler2;
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.CRYPTO_TRANSFER_RECEIVE_FAILED, null, null, null, 14, null), null, null, null, null, 61, null);
                int i8 = i4;
                final Modifier modifier4 = modifier2;
                Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt.ResultBlockAndRefundComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1941321225, i9, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable.<anonymous> (ResultBlockAndRefundComposable.kt:72)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(721975860, true, new AnonymousClass1(resultBlockAndRefundDuxo4, uuid2, done), composer2, 54);
                        final ApiCryptoVerificationResponse3.Content content2 = content;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-565378527, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt.ResultBlockAndRefundComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i10) {
                                int i11;
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i10 & 6) == 0) {
                                    i11 = i10 | (composer3.changed(BentoButtonBarScreenLayout) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-565378527, i11, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable.<anonymous>.<anonymous> (ResultBlockAndRefundComposable.kt:75)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Modifier modifierAlign = BentoButtonBarScreenLayout.align(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, companion3.getCenter());
                                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                ApiCryptoVerificationResponse3.Content content3 = content2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(SvgUrl.ALERT.getUrl(), CoilUtils2.rememberImageLoader(0.0d, null, composer3, 0, 3), null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i12 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i12).m21591getLargeD9Ej5fM()), composer3, 0);
                                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(content3.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getDisplayCapsuleMedium(), composer3, 0, 0, 8126);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i12).m21593getSmallD9Ej5fM()), composer3, 0);
                                BentoMarkdownText2.BentoMarkdownText(content3.getBodyMarkdown(), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer3, BentoMarkdownText.$stable), null, null, null, null, null, null, null, 0L, null, companion5.m7919getCentere0LSkKk(), null, 1535, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ResultBlockAndRefundComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$ResultBlockAndRefundComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $done;
                        final /* synthetic */ ResultBlockAndRefundDuxo $duxo;
                        final /* synthetic */ UUID $transferId;

                        AnonymousClass1(ResultBlockAndRefundDuxo resultBlockAndRefundDuxo, UUID uuid, Function0<Unit> function0) {
                            this.$duxo = resultBlockAndRefundDuxo;
                            this.$transferId = uuid;
                            this.$done = function0;
                        }

                        private static final ResultBlockAndRefundViewState invoke$lambda$0(SnapshotState4<ResultBlockAndRefundViewState> snapshotState4) {
                            return snapshotState4.getValue();
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 6) == 0) {
                                i2 = i | ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(721975860, i2, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable.<anonymous>.<anonymous> (ResultBlockAndRefundComposable.kt:108)");
                            }
                            final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.$duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.result_block_refund_primary_cta, composer, 0);
                            boolean loading = invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoading();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(snapshotState4CollectAsStateWithLifecycle) | composer.changedInstance(this.$transferId) | composer.changed(this.$done);
                            final Function0<Unit> function0 = this.$done;
                            final UUID uuid = this.$transferId;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$ResultBlockAndRefundComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ResultBlockAndRefundComposable.C385471.AnonymousClass1.invoke$lambda$5$lambda$4(navigator, context, function0, uuid, snapshotState4CollectAsStateWithLifecycle);
                                    }
                                };
                                composer.updateRememberedValue(obj);
                                objRememberedValue = obj;
                            }
                            composer.endReplaceGroup();
                            BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierAutoLogEvents$default, null, (Function0) objRememberedValue, strStringResource, loading, null, false, composer, (BentoButtonBar3.$stable << 21) | (29360128 & (i2 << 21)), 98);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(Navigator navigator, Context context, Function0 function0, UUID uuid, SnapshotState4 snapshotState4) {
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            String currency = invoke$lambda$0(snapshotState4).getCurrency();
                            if (currency != null) {
                            }
                            if (uuid != null) {
                                mapCreateMapBuilder.put("transfer_uuid", JsonPrimitives.toJsonPrimitive(uuid));
                            }
                            Unit unit = Unit.INSTANCE;
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new ContactSupportFragmentKey.Sassy(ResultBlockAndRefundComposable.SASSY_FLOW_ID, null, MapsKt.build(mapCreateMapBuilder), 2, null), false, false, false, false, null, true, null, null, 892, null);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                };
                uuid2 = uuid2;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default, ComposableLambda3.rememberComposableLambda(1941321225, true, function2, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(i8);
                zChangedInstance = composerStartRestartGroup.changedInstance(resultBlockAndRefundDuxo4) | composerStartRestartGroup.changedInstance(uuid2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ResultBlockAndRefundComposable2(resultBlockAndRefundDuxo4, uuid2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(uuid2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5 & 14);
                eventResultBlockAndRefundComposable$lambda$2 = ResultBlockAndRefundComposable$lambda$2(FlowExtKt.collectAsStateWithLifecycle(resultBlockAndRefundDuxo4.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (eventResultBlockAndRefundComposable$lambda$2 != null && (eventResultBlockAndRefundComposable$lambda$2.getData() instanceof ResultBlockAndRefundDuxo3.Error) && (eventConsumerInvoke = eventResultBlockAndRefundComposable$lambda$2.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventResultBlockAndRefundComposable$lambda$2, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$ResultBlockAndRefundComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25201invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25201invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((ResultBlockAndRefundDuxo3.Error) eventResultBlockAndRefundComposable$lambda$2.getData()).getThrowable(), false, 2, null);
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                resultBlockAndRefundDuxo5 = resultBlockAndRefundDuxo4;
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                resultBlockAndRefundDuxo5 = resultBlockAndRefundDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ResultBlockAndRefundComposable.ResultBlockAndRefundComposable$lambda$4(uuid2, verificationId, verificationType, content, done, modifier5, resultBlockAndRefundDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599043 & i3) == 599042) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                i5 = i3;
                resultBlockAndRefundDuxo4 = resultBlockAndRefundDuxo3;
                modifier2 = modifier3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) objConsume2;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                cryptoTransferErrorHandler = (CryptoTransferErrorHandler) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default2 = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.CRYPTO_TRANSFER_RECEIVE_FAILED, null, null, null, 14, null), null, null, null, null, 61, null);
                int i82 = i4;
                final Modifier modifier42 = modifier2;
                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt.ResultBlockAndRefundComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i9) {
                        if ((i9 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1941321225, i9, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable.<anonymous> (ResultBlockAndRefundComposable.kt:72)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier42, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(721975860, true, new AnonymousClass1(resultBlockAndRefundDuxo4, uuid2, done), composer2, 54);
                        final ApiCryptoVerificationResponse3.Content content2 = content;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-565378527, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt.ResultBlockAndRefundComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i10) {
                                int i11;
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i10 & 6) == 0) {
                                    i11 = i10 | (composer3.changed(BentoButtonBarScreenLayout) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-565378527, i11, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable.<anonymous>.<anonymous> (ResultBlockAndRefundComposable.kt:75)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ScrollKt.verticalScroll$default(companion2, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Modifier modifierAlign = BentoButtonBarScreenLayout.align(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, companion3.getCenter());
                                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                ApiCryptoVerificationResponse3.Content content3 = content2;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(SvgUrl.ALERT.getUrl(), CoilUtils2.rememberImageLoader(0.0d, null, composer3, 0, 3), null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, 120);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i12 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i12).m21591getLargeD9Ej5fM()), composer3, 0);
                                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(content3.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getDisplayCapsuleMedium(), composer3, 0, 0, 8126);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer3, i12).m21593getSmallD9Ej5fM()), composer3, 0);
                                BentoMarkdownText2.BentoMarkdownText(content3.getBodyMarkdown(), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer3, BentoMarkdownText.$stable), null, null, null, null, null, null, null, 0L, null, companion5.m7919getCentere0LSkKk(), null, 1535, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ResultBlockAndRefundComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$ResultBlockAndRefundComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $done;
                        final /* synthetic */ ResultBlockAndRefundDuxo $duxo;
                        final /* synthetic */ UUID $transferId;

                        AnonymousClass1(ResultBlockAndRefundDuxo resultBlockAndRefundDuxo, UUID uuid, Function0<Unit> function0) {
                            this.$duxo = resultBlockAndRefundDuxo;
                            this.$transferId = uuid;
                            this.$done = function0;
                        }

                        private static final ResultBlockAndRefundViewState invoke$lambda$0(SnapshotState4<ResultBlockAndRefundViewState> snapshotState4) {
                            return snapshotState4.getValue();
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 6) == 0) {
                                i2 = i | ((i & 8) == 0 ? composer.changed(BentoButtonBarScreenLayout) : composer.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(721975860, i2, -1, "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposable.<anonymous>.<anonymous> (ResultBlockAndRefundComposable.kt:108)");
                            }
                            final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.$duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.result_block_refund_primary_cta, composer, 0);
                            boolean loading = invoke$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoading();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(snapshotState4CollectAsStateWithLifecycle) | composer.changedInstance(this.$transferId) | composer.changed(this.$done);
                            final Function0 function0 = this.$done;
                            final UUID uuid = this.$transferId;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object obj = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$ResultBlockAndRefundComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ResultBlockAndRefundComposable.C385471.AnonymousClass1.invoke$lambda$5$lambda$4(navigator, context, function0, uuid, snapshotState4CollectAsStateWithLifecycle);
                                    }
                                };
                                composer.updateRememberedValue(obj);
                                objRememberedValue = obj;
                            }
                            composer.endReplaceGroup();
                            BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierAutoLogEvents$default, null, (Function0) objRememberedValue, strStringResource, loading, null, false, composer, (BentoButtonBar3.$stable << 21) | (29360128 & (i2 << 21)), 98);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(Navigator navigator, Context context, Function0 function0, UUID uuid, SnapshotState4 snapshotState4) {
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            String currency = invoke$lambda$0(snapshotState4).getCurrency();
                            if (currency != null) {
                            }
                            if (uuid != null) {
                                mapCreateMapBuilder.put("transfer_uuid", JsonPrimitives.toJsonPrimitive(uuid));
                            }
                            Unit unit = Unit.INSTANCE;
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new ContactSupportFragmentKey.Sassy(ResultBlockAndRefundComposable.SASSY_FLOW_ID, null, MapsKt.build(mapCreateMapBuilder), 2, null), false, false, false, false, null, true, null, null, 892, null);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                };
                uuid2 = uuid2;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorCopy$default2, ComposableLambda3.rememberComposableLambda(1941321225, true, function22, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(i82);
                zChangedInstance = composerStartRestartGroup.changedInstance(resultBlockAndRefundDuxo4) | composerStartRestartGroup.changedInstance(uuid2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new ResultBlockAndRefundComposable2(resultBlockAndRefundDuxo4, uuid2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(uuid2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5 & 14);
                    eventResultBlockAndRefundComposable$lambda$2 = ResultBlockAndRefundComposable$lambda$2(FlowExtKt.collectAsStateWithLifecycle(resultBlockAndRefundDuxo4.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                    if (eventResultBlockAndRefundComposable$lambda$2 != null) {
                        eventConsumerInvoke.consume(eventResultBlockAndRefundComposable$lambda$2, new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundComposableKt$ResultBlockAndRefundComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25201invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25201invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AbsErrorHandler.handleError$default(cryptoTransferErrorHandler, ((ResultBlockAndRefundDuxo3.Error) eventResultBlockAndRefundComposable$lambda$2.getData()).getThrowable(), false, 2, null);
                            }
                        });
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    resultBlockAndRefundDuxo5 = resultBlockAndRefundDuxo4;
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Event<ResultBlockAndRefundDuxo3> ResultBlockAndRefundComposable$lambda$2(SnapshotState4<Event<ResultBlockAndRefundDuxo3>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
