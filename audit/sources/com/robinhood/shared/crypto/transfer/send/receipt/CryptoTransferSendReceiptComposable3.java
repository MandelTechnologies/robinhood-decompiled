package com.robinhood.shared.crypto.transfer.send.receipt;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.model.NetworkFeeData;
import com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposable3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferSendReceiptComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0011\u001aQ\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"CryptoTransferSendReceiptComposable", "", "title", "", "subtitle", PlaceTypes.ADDRESS, MemoInputActivity.EXTRA_MEMO, "network", "fee", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "totalValue", "totalLabel", "helperText", "primaryCtaText", "onDoneClicked", "Lkotlin/Function0;", "onViewTransferClicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ReceiptDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "PreviewCryptoTransferSendReceiptComposable", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendReceiptComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferSendReceiptComposable$lambda$0(String str, String str2, String str3, String str4, String str5, NetworkFeeData networkFeeData, String str6, String str7, String str8, String str9, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        CryptoTransferSendReceiptComposable(str, str2, str3, str4, str5, networkFeeData, str6, str7, str8, str9, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCryptoTransferSendReceiptComposable$lambda$5(int i, Composer composer, int i2) {
        PreviewCryptoTransferSendReceiptComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReceiptDetails$lambda$4(String str, String str2, String str3, String str4, String str5, NetworkFeeData networkFeeData, String str6, String str7, int i, Composer composer, int i2) {
        ReceiptDetails(str, str2, str3, str4, str5, networkFeeData, str6, str7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoTransferSendReceiptComposable(final String title, final String subtitle, final String address, final String str, final String str2, final NetworkFeeData fee, final String totalValue, final String totalLabel, final String helperText, final String primaryCtaText, final Function0<Unit> onDoneClicked, final Function0<Unit> onViewTransferClicked, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(fee, "fee");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(totalLabel, "totalLabel");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(onDoneClicked, "onDoneClicked");
        Intrinsics.checkNotNullParameter(onViewTransferClicked, "onViewTransferClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-400582031);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(subtitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(address) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= (i & 262144) == 0 ? composerStartRestartGroup.changed(fee) : composerStartRestartGroup.changedInstance(fee) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(totalValue) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(totalLabel) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(helperText) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryCtaText) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onDoneClicked) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onViewTransferClicked) ? 32 : 16;
        }
        int i5 = i4;
        if ((i3 & 306783379) != 306783378 || (i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-400582031, i3, i5, "com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposable (CryptoTransferSendReceiptComposable.kt:45)");
            }
            composer2 = composerStartRestartGroup;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-380210202, true, new C383641(helperText, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), onDoneClicked, primaryCtaText, onViewTransferClicked), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-498785447, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt.CryptoTransferSendReceiptComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                    invoke(boxScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-498785447, i6, -1, "com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposable.<anonymous> (CryptoTransferSendReceiptComposable.kt:50)");
                    }
                    CryptoTransferSendReceiptComposable3.ReceiptDetails(title, subtitle, address, str, str2, fee, totalValue, totalLabel, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendReceiptComposable3.CryptoTransferSendReceiptComposable$lambda$0(title, subtitle, address, str, str2, fee, totalValue, totalLabel, helperText, primaryCtaText, onDoneClicked, onViewTransferClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoTransferSendReceiptComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$CryptoTransferSendReceiptComposable$1 */
    static final class C383641 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ UserInteractionEventDescriptor $descriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ String $helperText;
        final /* synthetic */ Function0<Unit> $onDoneClicked;
        final /* synthetic */ Function0<Unit> $onViewTransferClicked;
        final /* synthetic */ String $primaryCtaText;

        C383641(String str, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            this.$helperText = str;
            this.$eventLogger = eventLogger;
            this.$descriptor = userInteractionEventDescriptor;
            this.$onDoneClicked = function0;
            this.$primaryCtaText = str2;
            this.$onViewTransferClicked = function02;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-380210202, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposable.<anonymous> (CryptoTransferSendReceiptComposable.kt:62)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_send_confirmation_view_transfer_btn, composer, 0);
            String str = this.$helperText;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$descriptor) | composer.changed(this.$onDoneClicked);
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
            final Function0<Unit> function0 = this.$onDoneClicked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$CryptoTransferSendReceiptComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferSendReceiptComposable3.C383641.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, str, null, false, null, null, (Function0) objRememberedValue, this.$primaryCtaText, false, null, false, this.$onViewTransferClicked, strStringResource, false, null, false, composer, 0, 3072, 51004);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReceiptDetails(final String str, final String str2, final String str3, final String str4, final String str5, final NetworkFeeData networkFeeData, final String str6, final String str7, Composer composer, final int i) {
        int i2;
        String str8;
        String str9;
        int i3;
        BentoTheme bentoTheme;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(532560660);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str8 = str3;
            i2 |= composerStartRestartGroup.changed(str8) ? 256 : 128;
        } else {
            str8 = str3;
        }
        if ((i & 3072) == 0) {
            str9 = str4;
            i2 |= composerStartRestartGroup.changed(str9) ? 2048 : 1024;
        } else {
            str9 = str4;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? composerStartRestartGroup.changed(networkFeeData) : composerStartRestartGroup.changedInstance(networkFeeData) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str6) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changed(str7) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(532560660, i2, -1, "com.robinhood.shared.crypto.transfer.send.receipt.ReceiptDetails (CryptoTransferSendReceiptComposable.kt:93)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Spacer2.Spacer(Column5.weight$default(Column6.INSTANCE, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i4).getBookCoverCapsuleSmall(), composerStartRestartGroup, i2 & 14, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, (i2 >> 3) & 14, 0, 8184);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
            Divider2.m5581DivideroMI9zvI(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme2.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composerStartRestartGroup, 390, 8);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072 || ((i2 & 262144) != 0 && composerStartRestartGroup.changedInstance(networkFeeData))) | ((29360128 & i2) == 8388608) | ((i2 & 3670016) == 1048576);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final String str10 = str8;
                i3 = i4;
                bentoTheme = bentoTheme2;
                final String str11 = str9;
                companion = companion2;
                Function1 function1 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTransferSendReceiptComposable3.ReceiptDetails$lambda$3$lambda$2$lambda$1(str11, str5, str10, networkFeeData, str7, str6, (LazyGridScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            } else {
                bentoTheme = bentoTheme2;
                companion = companion2;
                i3 = i4;
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 48, 0, 1020);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendReceiptComposable3.ReceiptDetails$lambda$4(str, str2, str3, str4, str5, networkFeeData, str6, str7, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReceiptDetails$lambda$3$lambda$2$lambda$1(final String str, final String str2, final String str3, final NetworkFeeData networkFeeData, final String str4, final String str5, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.item$default(LazyVerticalGrid, null, null, null, ComposableLambda3.composableLambdaInstance(784992342, true, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$ReceiptDetails$1$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                invoke(lazyGridItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(784992342, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.ReceiptDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendReceiptComposable.kt:120)");
                }
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_receipt_to_label, composer, 0), null, 2, null), null, null, null, new AnnotatedString(str3, null, 2, null), null, null, null, null, false, false, 4061, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, BentoDataRowState.$stable | 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 7, null);
        if (str != null) {
            LazyGridScope.item$default(LazyVerticalGrid, null, null, null, ComposableLambda3.composableLambdaInstance(301960027, true, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$ReceiptDetails$1$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                    invoke(lazyGridItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyGridItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(301960027, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.ReceiptDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendReceiptComposable.kt:130)");
                    }
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C37934R.string.crypto_send_review_memo_label, composer, 0), null, 2, null), null, null, null, new AnnotatedString(str, null, 2, null), null, null, null, null, false, false, 4061, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, BentoDataRowState.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 7, null);
        }
        if (str2 != null) {
            LazyGridScope.item$default(LazyVerticalGrid, null, null, null, ComposableLambda3.composableLambdaInstance(1632246980, true, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$ReceiptDetails$1$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                    invoke(lazyGridItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyGridItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1632246980, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.ReceiptDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendReceiptComposable.kt:141)");
                    }
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_receipt_network_label, composer, 0), null, 2, null), null, null, null, new AnnotatedString(str2, null, 2, null), null, null, null, null, false, false, 4061, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, BentoDataRowState.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 7, null);
        }
        LazyGridScope.item$default(LazyVerticalGrid, null, null, null, ComposableLambda3.composableLambdaInstance(1969833727, true, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$ReceiptDetails$1$1$1$4
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                invoke(lazyGridItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1969833727, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.ReceiptDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendReceiptComposable.kt:153)");
                }
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C37934R.string.crypt_send_review_network_fee_row_label, composer, 0), null, 2, null), null, null, null, networkFeeData.buildDisplayFee(composer, 0), null, null, null, null, false, false, 4061, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, BentoDataRowState.$stable | 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 7, null);
        LazyGridScope.item$default(LazyVerticalGrid, null, null, null, ComposableLambda3.composableLambdaInstance(515508446, true, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$ReceiptDetails$1$1$1$5
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                invoke(lazyGridItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(515508446, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.ReceiptDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendReceiptComposable.kt:162)");
                }
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(str4, null, 2, null), null, null, null, new AnnotatedString(str5, null, 2, null), null, null, null, null, false, false, 4061, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, BentoDataRowState.$stable | 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 7, null);
        return Unit.INSTANCE;
    }

    private static final void PreviewCryptoTransferSendReceiptComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1779116208);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1779116208, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.PreviewCryptoTransferSendReceiptComposable (CryptoTransferSendReceiptComposable.kt:181)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, CryptoTransferSendReceiptComposable.INSTANCE.getLambda$1812240376$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferSendReceiptComposable3.PreviewCryptoTransferSendReceiptComposable$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
