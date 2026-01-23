package com.truelayer.payments.p419ui.screens.result;

import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.payments.PaymentFailureReason;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import com.truelayer.payments.p419ui.components.ResponsiveContainer;
import com.truelayer.payments.p419ui.components.TextWithHTML;
import com.truelayer.payments.p419ui.screens.result.components.BoxWithBadge;
import com.truelayer.payments.p419ui.screens.result.components.ResultIcons;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.theme.Theme5;
import com.truelayer.payments.p419ui.utils.ModifierExtensions;
import com.truelayer.payments.p419ui.utils.TestTags;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Result.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aO\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u0012\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aQ\u0010\u001b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001d\u0010\u0015\u001a9\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001f\u0010 \u001aI\u0010#\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020!2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0004\u0010%\u001a+\u0010&\u001a\u00020\u0003*\u00020!2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0003H\u0001¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010(\u001a\u00020\u0001*\u00020!2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b(\u0010)\u001a\u000f\u0010*\u001a\u00020\u0001H\u0001¢\u0006\u0004\b*\u0010+\u001a\u000f\u0010,\u001a\u00020\u0001H\u0001¢\u0006\u0004\b,\u0010+\u001a\u000f\u0010-\u001a\u00020\u0001H\u0001¢\u0006\u0004\b-\u0010+\u001a\u000f\u0010.\u001a\u00020\u0001H\u0001¢\u0006\u0004\b.\u0010+\u001a\u000f\u0010/\u001a\u00020\u0001H\u0001¢\u0006\u0004\b/\u0010+\u001a\u000f\u00100\u001a\u00020\u0001H\u0001¢\u0006\u0004\b0\u0010+\u001a\u000f\u00101\u001a\u00020\u0001H\u0001¢\u0006\u0004\b1\u0010+¨\u00062"}, m3636d2 = {"Lkotlin/Function0;", "", "imageContent", "", "title", "message", "reference", "buttonLabel", "onContinue", "Result", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/truelayer/payments/core/domain/common/Currency;", "currency", "", "amountInMinor", "clientName", "Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;", "paymentType", "ResultInProgress", "(Lcom/truelayer/payments/core/domain/common/Currency;JLjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "getResultInProgressTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "type", "getResultInProgressMessage", "(Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;Lcom/truelayer/payments/core/domain/common/Currency;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Ljava/lang/String;", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "provider", "ResultSuccess", "(Lcom/truelayer/payments/core/domain/common/Currency;JLjava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "getResultSuccessTitle", "providerName", "getResultSuccessMessage", "(Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;Lcom/truelayer/payments/core/domain/common/Currency;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Ljava/lang/String;", "Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "failureReason", "ResultFailed", "(Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "(Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "subtitle", "(Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "FailureIcon", "(Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Landroidx/compose/runtime/Composer;I)V", "ResultInProgressPreview", "(Landroidx/compose/runtime/Composer;I)V", "ResultAllDonePreview", "ResultFailedPreview", "ResultProviderFailedPreview", "ResultInProgressMandatePreview", "ResultAllDoneMandatePreview", "ResultFailedMandatePreview", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ResultKt {

    /* compiled from: Result.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ResultScreen8.values().length];
            try {
                iArr[ResultScreen8.Payment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultScreen8.Mandate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentFailureReason.values().length];
            try {
                iArr2[PaymentFailureReason.InsufficientFunds.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PaymentFailureReason.PaymentLimitExceeded.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PaymentFailureReason.UserCanceledAtProvider.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaymentFailureReason.AuthorizationFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PaymentFailureReason.Expired.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PaymentFailureReason.InvalidAccountDetails.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PaymentFailureReason.ProviderError.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PaymentFailureReason.ProviderRejected.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PaymentFailureReason.ProviderExpired.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Result(final Function2<? super Composer, ? super Integer, Unit> imageContent, final String title, final String message, final String str, final String buttonLabel, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(imageContent, "imageContent");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1766993319);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(imageContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(message) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= composerStartRestartGroup.changed(buttonLabel) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((458752 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((374491 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        function02 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.Result.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1766993319, i3, -1, "com.truelayer.payments.ui.screens.result.Result (Result.kt:48)");
                    }
                    final Function0<Unit> function04 = function02;
                    final String str3 = str2;
                    ResponsiveContainer.ResponsiveContainer(null, null, ResponsiveContainer.confirmationBodyBreakpoints(Modifier.INSTANCE), ComposableLambda3.composableLambda(composerStartRestartGroup, 235113263, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.Result.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer2, Integer num) {
                            invoke(modifier, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Modifier it, Composer composer2, int i5) {
                            int i6;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((i5 & 14) == 0) {
                                i6 = i5 | (composer2.changed(it) ? 4 : 2);
                            } else {
                                i6 = i5;
                            }
                            if ((i6 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(235113263, i6, -1, "com.truelayer.payments.ui.screens.result.Result.<anonymous> (Result.kt:52)");
                            }
                            Modifier modifierSystemBarSafeAreaAndImePadding = ModifierExtensions.systemBarSafeAreaAndImePadding(SizeKt.fillMaxSize$default(it, 0.0f, 1, null));
                            Spacing spacing = Spacing.INSTANCE;
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierSystemBarSafeAreaAndImePadding, spacing.m27177getREGULARD9Ej5fM());
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                            Function0<Unit> function05 = function04;
                            Function2<Composer, Integer, Unit> function2 = imageContent;
                            String str4 = title;
                            String str5 = message;
                            String str6 = str3;
                            final String str7 = buttonLabel;
                            composer2.startReplaceableGroup(-483455358);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5142padding3ABfNKs);
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
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            Column6 column6 = Column6.INSTANCE;
                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                            Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                            Arrangement.Vertical verticalM5091spacedByD5KLDUw = arrangement.m5091spacedByD5KLDUw(spacing.m27177getREGULARD9Ej5fM(), companion.getCenterVertically());
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(verticalM5091spacedByD5KLDUw, centerHorizontally2, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            function2.invoke(composer2, 0);
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            int i7 = MaterialTheme.$stable;
                            TextKt.m6028Text4IGK_g(str4, null, materialTheme.getColorScheme(composer2, i7).getOnSurface(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i7).getTitleLarge(), composer2, 0, 0, 65530);
                            Composer composer3 = composer2;
                            TextWithHTML.TextWithHTML(str5, null, TextStyle.m7655copyp1EtxEg$default((TextStyle) composer3.consume(TextKt.getLocalTextStyle()), materialTheme.getColorScheme(composer3, i7).getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), null, null, composer3, 0, 26);
                            composer3.startReplaceableGroup(691236445);
                            if (str6 != null) {
                                TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.payment_result_reference, new Object[]{str6}, composer3, 64), null, materialTheme.getColorScheme(composer3, i7).getOnSurface(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i7).getBodySmall(), composer2, 0, 0, 65530);
                                composer3 = composer2;
                            }
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            ButtonKt.Button(function05, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableLambda3.composableLambda(composer3, -1928915703, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt$Result$2$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                    invoke(row5, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 Button, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i8 & 81) != 16 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1928915703, i8, -1, "com.truelayer.payments.ui.screens.result.Result.<anonymous>.<anonymous>.<anonymous> (Result.kt:97)");
                                        }
                                        String string2 = str7;
                                        if (string2.length() > 0) {
                                            StringBuilder sb = new StringBuilder();
                                            String strValueOf = String.valueOf(string2.charAt(0));
                                            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                                            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                            sb.append((Object) upperCase);
                                            String strSubstring = string2.substring(1);
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                            sb.append(strSubstring);
                                            string2 = sb.toString();
                                        }
                                        TextKt.m6028Text4IGK_g(string2, null, 0L, 0L, null, null, null, 0L, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 130558);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer2, 805306416, 508);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, 3072, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function03 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.Result.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            ResultKt.Result(imageContent, title, message, str, buttonLabel, function03, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            if ((374491 & i3) != 74898) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Function0<Unit> function042 = function02;
                final String str32 = str2;
                ResponsiveContainer.ResponsiveContainer(null, null, ResponsiveContainer.confirmationBodyBreakpoints(Modifier.INSTANCE), ComposableLambda3.composableLambda(composerStartRestartGroup, 235113263, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.Result.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer2, Integer num) {
                        invoke(modifier, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Modifier it, Composer composer2, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i5 & 14) == 0) {
                            i6 = i5 | (composer2.changed(it) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(235113263, i6, -1, "com.truelayer.payments.ui.screens.result.Result.<anonymous> (Result.kt:52)");
                        }
                        Modifier modifierSystemBarSafeAreaAndImePadding = ModifierExtensions.systemBarSafeAreaAndImePadding(SizeKt.fillMaxSize$default(it, 0.0f, 1, null));
                        Spacing spacing = Spacing.INSTANCE;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierSystemBarSafeAreaAndImePadding, spacing.m27177getREGULARD9Ej5fM());
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                        Function0<Unit> function05 = function042;
                        Function2<Composer, Integer, Unit> function2 = imageContent;
                        String str4 = title;
                        String str5 = message;
                        String str6 = str32;
                        final String str7 = buttonLabel;
                        composer2.startReplaceableGroup(-483455358);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5142padding3ABfNKs);
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
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        Column6 column6 = Column6.INSTANCE;
                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                        Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                        Arrangement.Vertical verticalM5091spacedByD5KLDUw = arrangement.m5091spacedByD5KLDUw(spacing.m27177getREGULARD9Ej5fM(), companion.getCenterVertically());
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(verticalM5091spacedByD5KLDUw, centerHorizontally2, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        function2.invoke(composer2, 0);
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i7 = MaterialTheme.$stable;
                        TextKt.m6028Text4IGK_g(str4, null, materialTheme.getColorScheme(composer2, i7).getOnSurface(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i7).getTitleLarge(), composer2, 0, 0, 65530);
                        Composer composer3 = composer2;
                        TextWithHTML.TextWithHTML(str5, null, TextStyle.m7655copyp1EtxEg$default((TextStyle) composer3.consume(TextKt.getLocalTextStyle()), materialTheme.getColorScheme(composer3, i7).getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), null, null, composer3, 0, 26);
                        composer3.startReplaceableGroup(691236445);
                        if (str6 != null) {
                            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.payment_result_reference, new Object[]{str6}, composer3, 64), null, materialTheme.getColorScheme(composer3, i7).getOnSurface(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i7).getBodySmall(), composer2, 0, 0, 65530);
                            composer3 = composer2;
                        }
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        ButtonKt.Button(function05, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableLambda3.composableLambda(composer3, -1928915703, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt$Result$2$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer4, Integer num) {
                                invoke(row5, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 Button, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i8 & 81) != 16 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1928915703, i8, -1, "com.truelayer.payments.ui.screens.result.Result.<anonymous>.<anonymous>.<anonymous> (Result.kt:97)");
                                    }
                                    String string2 = str7;
                                    if (string2.length() > 0) {
                                        StringBuilder sb = new StringBuilder();
                                        String strValueOf = String.valueOf(string2.charAt(0));
                                        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        sb.append((Object) upperCase);
                                        String strSubstring = string2.substring(1);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        sb.append(strSubstring);
                                        string2 = sb.toString();
                                    }
                                    TextKt.m6028Text4IGK_g(string2, null, 0L, 0L, null, null, null, 0L, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 130558);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer2, 805306416, 508);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, 3072, 3);
                if (ComposerKt.isTraceInProgress()) {
                }
                function03 = function042;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str2 = str;
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((374491 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void ResultInProgress(final Currency currency, final long j, final String str, final String clientName, final ResultScreen8 paymentType, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1657496271);
        final Function0<Unit> function02 = (i2 & 32) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultInProgress.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1657496271, i, -1, "com.truelayer.payments.ui.screens.result.ResultInProgress (Result.kt:114)");
        }
        Result(ComposableSingletons$ResultKt.INSTANCE.m27128getLambda1$payments_ui_release(), getResultInProgressTitle(composerStartRestartGroup, 0), getResultInProgressMessage(paymentType, currency, clientName, j, composerStartRestartGroup, ((i >> 12) & 14) | 64 | ((i >> 3) & 896) | ((i << 6) & 7168), 0), str, StringResources_androidKt.stringResource(C42830R.string.button_continue, composerStartRestartGroup, 0), function02, composerStartRestartGroup, ((i << 3) & 7168) | 6 | (458752 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultInProgress.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ResultKt.ResultInProgress(currency, j, str, clientName, paymentType, function02, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final String getResultInProgressTitle(Composer composer, int i) {
        composer.startReplaceableGroup(-1239613370);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239613370, i, -1, "com.truelayer.payments.ui.screens.result.getResultInProgressTitle (Result.kt:132)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_initiated_title, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    public static final String getResultInProgressMessage(ResultScreen8 type2, Currency currency, String clientName, long j, Composer composer, int i, int i2) throws Resources.NotFoundException {
        String strStringResource;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        composer.startReplaceableGroup(-1515745872);
        if ((i2 & 8) != 0) {
            j = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1515745872, i, -1, "com.truelayer.payments.ui.screens.result.getResultInProgressMessage (Result.kt:135)");
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i3 == 1) {
            composer.startReplaceableGroup(1803543834);
            if (Intrinsics.areEqual(currency, Currency.Defaults.INSTANCE.getGBP())) {
                composer.startReplaceableGroup(1803543887);
                strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_initiated_subtitle_uk, new Object[]{currency.formatAmount(j), clientName}, composer, 64);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1803544033);
                strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_initiated_subtitle_eu, new Object[]{currency.formatAmount(j), clientName}, composer, 64);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
        } else {
            if (i3 != 2) {
                composer.startReplaceableGroup(1803538564);
                composer.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceableGroup(1803544209);
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.mandate_result_initiated_subtitle_uk, new Object[]{clientName}, composer, 64);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    public static final void ResultSuccess(final Currency currency, final long j, final String str, final String clientName, final PaymentProvider provider, final ResultScreen8 paymentType, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-184334581);
        final Function0<Unit> function02 = (i2 & 64) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultSuccess.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-184334581, i, -1, "com.truelayer.payments.ui.screens.result.ResultSuccess (Result.kt:157)");
        }
        Result(ComposableLambda3.composableLambda(composerStartRestartGroup, 1976832545, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultSuccess.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1976832545, i3, -1, "com.truelayer.payments.ui.screens.result.ResultSuccess.<anonymous> (Result.kt:160)");
                    }
                    Function3<C2002Dp, Composer, Integer, Unit> function3M27130getLambda2$payments_ui_release = ComposableSingletons$ResultKt.INSTANCE.m27130getLambda2$payments_ui_release();
                    final PaymentProvider paymentProvider = provider;
                    BoxWithBadge.m27144BoxWithBadgeDzVHIIc(null, 0.0f, function3M27130getLambda2$payments_ui_release, ComposableLambda3.composableLambda(composer2, -2083740897, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultSuccess.2.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2083740897, i4, -1, "com.truelayer.payments.ui.screens.result.ResultSuccess.<anonymous>.<anonymous> (Result.kt:167)");
                                }
                                EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(null, 0.0f, paymentProvider.getExtendedIcon(), paymentProvider.getIconUri(), null, null, composer3, 0, 51);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 3456, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), getResultSuccessTitle(composerStartRestartGroup, 0), getResultSuccessMessage(paymentType, currency, provider.getDisplayName(), clientName, j, composerStartRestartGroup, ((i >> 15) & 14) | 64 | (i & 7168) | ((i << 9) & 57344), 0), str, StringResources_androidKt.stringResource(C42830R.string.button_continue, composerStartRestartGroup, 0), function02, composerStartRestartGroup, ((i << 3) & 7168) | 6 | (458752 & (i >> 3)), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultSuccess.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ResultKt.ResultSuccess(currency, j, str, clientName, provider, paymentType, function02, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final String getResultSuccessTitle(Composer composer, int i) {
        composer.startReplaceableGroup(-1348008769);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1348008769, i, -1, "com.truelayer.payments.ui.screens.result.getResultSuccessTitle (Result.kt:184)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_success_title, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    public static final String getResultSuccessMessage(ResultScreen8 type2, Currency currency, String providerName, String clientName, long j, Composer composer, int i, int i2) throws Resources.NotFoundException {
        String strStringResource;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        composer.startReplaceableGroup(-801729282);
        if ((i2 & 16) != 0) {
            j = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-801729282, i, -1, "com.truelayer.payments.ui.screens.result.getResultSuccessMessage (Result.kt:187)");
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i3 == 1) {
            composer.startReplaceableGroup(1730098465);
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_success_subtitle, new Object[]{currency.formatAmount(j), clientName}, composer, 64);
            composer.endReplaceableGroup();
        } else {
            if (i3 != 2) {
                composer.startReplaceableGroup(1730091297);
                composer.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceableGroup(1730098610);
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.mandate_result_success_subtitle, new Object[]{providerName, clientName}, composer, 64);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    public static final void ResultFailed(final PaymentFailureReason failureReason, final String clientName, final String str, final PaymentProvider provider, final ResultScreen8 paymentType, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-122086198);
        Function0<Unit> function02 = (i2 & 32) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultFailed.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-122086198, i, -1, "com.truelayer.payments.ui.screens.result.ResultFailed (Result.kt:200)");
        }
        int i3 = i & 14;
        int i4 = (i >> 9) & 112;
        Result(ComposableLambda3.composableLambda(composerStartRestartGroup, -1169244320, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultFailed.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1169244320, i5, -1, "com.truelayer.payments.ui.screens.result.ResultFailed.<anonymous> (Result.kt:203)");
                }
                ResultKt.FailureIcon(failureReason, provider, composer2, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), title(failureReason, paymentType, composerStartRestartGroup, i3 | i4), subtitle(failureReason, paymentType, provider, clientName, composerStartRestartGroup, ((i << 6) & 7168) | i3 | 512 | i4), str, StringResources_androidKt.stringResource(C42830R.string.go_back, composerStartRestartGroup, 0), function02, composerStartRestartGroup, ((i << 3) & 7168) | 6 | (458752 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function03 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultFailed.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ResultKt.ResultFailed(failureReason, clientName, str, provider, paymentType, function03, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final String title(PaymentFailureReason paymentFailureReason, ResultScreen8 paymentType, Composer composer, int i) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(paymentFailureReason, "<this>");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        composer.startReplaceableGroup(659524402);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(659524402, i, -1, "com.truelayer.payments.ui.screens.result.title (Result.kt:214)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
        if (i2 == 1) {
            composer.startReplaceableGroup(-647628884);
            switch (WhenMappings.$EnumSwitchMapping$1[paymentFailureReason.ordinal()]) {
                case 1:
                    composer.startReplaceableGroup(-647628826);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_insufficient_funds_title, composer, 0);
                    composer.endReplaceableGroup();
                    break;
                case 2:
                    composer.startReplaceableGroup(-647628702);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_payment_limit_exceeded_title, composer, 0);
                    composer.endReplaceableGroup();
                    break;
                case 3:
                    composer.startReplaceableGroup(-647628572);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_canceled_title, composer, 0);
                    composer.endReplaceableGroup();
                    break;
                case 4:
                    composer.startReplaceableGroup(-647628459);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_authorization_failed_title, composer, 0);
                    composer.endReplaceableGroup();
                    break;
                case 5:
                    composer.startReplaceableGroup(-647628346);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_expired_title, composer, 0);
                    composer.endReplaceableGroup();
                    break;
                case 6:
                    composer.startReplaceableGroup(-647628232);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_invalid_account_details_title, composer, 0);
                    composer.endReplaceableGroup();
                    break;
                default:
                    composer.startReplaceableGroup(-647628140);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_generic_title, composer, 0);
                    composer.endReplaceableGroup();
                    break;
            }
            composer.endReplaceableGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceableGroup(-647637088);
                composer.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceableGroup(-647628041);
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_generic_title, composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    public static final String subtitle(PaymentFailureReason paymentFailureReason, ResultScreen8 paymentType, PaymentProvider provider, String clientName, Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        Intrinsics.checkNotNullParameter(paymentFailureReason, "<this>");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        composer.startReplaceableGroup(2040255046);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2040255046, i, -1, "com.truelayer.payments.ui.screens.result.subtitle (Result.kt:228)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
        if (i2 == 1) {
            composer.startReplaceableGroup(1924079024);
            switch (WhenMappings.$EnumSwitchMapping$1[paymentFailureReason.ordinal()]) {
                case 1:
                    composer.startReplaceableGroup(1924079082);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_insufficient_funds_subtitle, new Object[]{clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
                case 2:
                    composer.startReplaceableGroup(1924079221);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_payment_limit_exceeded_subtitle, new Object[]{clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
                case 3:
                    composer.startReplaceableGroup(1924079366);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_canceled_subtitle, new Object[]{clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
                case 4:
                    composer.startReplaceableGroup(1924079494);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_authorization_failed_subtitle, new Object[]{clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
                case 5:
                    composer.startReplaceableGroup(1924079622);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_expired_subtitle, new Object[]{clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
                case 6:
                    composer.startReplaceableGroup(1924079751);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_invalid_account_details_subtitle, new Object[]{clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
                case 7:
                    composer.startReplaceableGroup(1924079888);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_provider_error_subtitle, new Object[]{provider.getDisplayName(), clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
                case 8:
                    composer.startReplaceableGroup(1924080041);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_provider_rejected_subtitle, new Object[]{provider.getDisplayName(), clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
                default:
                    composer.startReplaceableGroup(1924080164);
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.payment_result_error_generic_subtitle, new Object[]{clientName}, composer, 64);
                    composer.endReplaceableGroup();
                    break;
            }
            composer.endReplaceableGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceableGroup(1924069710);
                composer.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceableGroup(1924080278);
            strStringResource = StringResources_androidKt.stringResource(C42830R.string.mandate_result_error_generic_subtitle, new Object[]{clientName}, composer, 64);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    public static final void FailureIcon(final PaymentFailureReason paymentFailureReason, final PaymentProvider provider, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(paymentFailureReason, "<this>");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2127326010);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2127326010, i, -1, "com.truelayer.payments.ui.screens.result.FailureIcon (Result.kt:244)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[paymentFailureReason.ordinal()];
        if (i2 == 7 || i2 == 9) {
            composerStartRestartGroup.startReplaceableGroup(1327556074);
            BoxWithBadge.m27144BoxWithBadgeDzVHIIc(TestTag3.testTag(Modifier.INSTANCE, TestTags.RESULT_PROVIDER_FAILED_ICON), 0.0f, ComposableSingletons$ResultKt.INSTANCE.m27131getLambda3$payments_ui_release(), ComposableLambda3.composableLambda(composerStartRestartGroup, -2041103488, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.FailureIcon.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2041103488, i3, -1, "com.truelayer.payments.ui.screens.result.FailureIcon.<anonymous> (Result.kt:254)");
                        }
                        EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(null, 0.0f, provider.getExtendedIcon(), provider.getIconUri(), null, null, composer2, 0, 51);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 3462, 2);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1327556565);
            ResultIcons.m27151ResultFailedIcon9IZ8Weo(TestTag3.testTag(Modifier.INSTANCE, TestTags.RESULT_FAILED_ICON), 0.0f, 0L, composerStartRestartGroup, 6, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.FailureIcon.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ResultKt.FailureIcon(paymentFailureReason, provider, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ResultInProgressPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-381911773);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-381911773, i, -1, "com.truelayer.payments.ui.screens.result.ResultInProgressPreview (Result.kt:276)");
            }
            Theme5.Theme(null, false, null, ComposableSingletons$ResultKt.INSTANCE.m27132getLambda4$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultInProgressPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ResultKt.ResultInProgressPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ResultAllDonePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1084712616);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1084712616, i, -1, "com.truelayer.payments.ui.screens.result.ResultAllDonePreview (Result.kt:299)");
            }
            Theme5.Theme(null, false, null, ComposableSingletons$ResultKt.INSTANCE.m27133getLambda5$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultAllDonePreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ResultKt.ResultAllDonePreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ResultFailedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(990672440);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(990672440, i, -1, "com.truelayer.payments.ui.screens.result.ResultFailedPreview (Result.kt:333)");
            }
            Theme5.Theme(null, false, null, ComposableSingletons$ResultKt.INSTANCE.m27134getLambda6$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultFailedPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ResultKt.ResultFailedPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ResultProviderFailedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2080074503);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2080074503, i, -1, "com.truelayer.payments.ui.screens.result.ResultProviderFailedPreview (Result.kt:366)");
            }
            Theme5.Theme(null, false, null, ComposableSingletons$ResultKt.INSTANCE.m27135getLambda7$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultProviderFailedPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ResultKt.ResultProviderFailedPreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ResultInProgressMandatePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-635342379);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-635342379, i, -1, "com.truelayer.payments.ui.screens.result.ResultInProgressMandatePreview (Result.kt:391)");
            }
            Theme5.Theme(null, false, null, ComposableSingletons$ResultKt.INSTANCE.m27136getLambda8$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultInProgressMandatePreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ResultKt.ResultInProgressMandatePreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ResultAllDoneMandatePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(558545072);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(558545072, i, -1, "com.truelayer.payments.ui.screens.result.ResultAllDoneMandatePreview (Result.kt:408)");
            }
            Theme5.Theme(null, false, null, ComposableSingletons$ResultKt.INSTANCE.m27137getLambda9$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultAllDoneMandatePreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ResultKt.ResultAllDoneMandatePreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ResultFailedMandatePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(999294752);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999294752, i, -1, "com.truelayer.payments.ui.screens.result.ResultFailedMandatePreview (Result.kt:433)");
            }
            Theme5.Theme(null, false, null, ComposableSingletons$ResultKt.INSTANCE.m27129getLambda10$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.ResultKt.ResultFailedMandatePreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ResultKt.ResultFailedMandatePreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
