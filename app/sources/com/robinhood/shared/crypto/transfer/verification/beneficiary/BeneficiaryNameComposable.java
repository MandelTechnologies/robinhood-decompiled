package com.robinhood.shared.crypto.transfer.verification.beneficiary;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BeneficiaryNameComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"BeneficiaryNameComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "onBeneficiaryName", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "maxCharacterLength", "", "FirstNameTestTag", "LastNameTestTag", "feature-crypto-transfer_externalDebug", "firstName", "lastName", "ctaEnabled", "", "requestFocus"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class BeneficiaryNameComposable {
    public static final String FirstNameTestTag = "firstNameTestTag";
    public static final String LastNameTestTag = "lastNameTestTag";
    private static final int maxCharacterLength = 35;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryNameComposable$lambda$16(Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        BeneficiaryNameComposable(modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BeneficiaryNameComposable(Modifier modifier, final Function2<? super String, ? super String, Unit> onBeneficiaryName, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onBeneficiaryName, "onBeneficiaryName");
        Composer composerStartRestartGroup = composer.startRestartGroup(215010391);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBeneficiaryName) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(215010391, i3, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposable (BeneficiaryNameComposable.kt:50)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$1$lambda$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$5$lambda$4();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$9$lambda$8(snapshotState, snapshotState2));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.CRYPTO_TRANSFER_SEND_WALLET_SELECTION, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1884060926, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt.BeneficiaryNameComposable.1
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
                        ComposerKt.traceEventStart(-1884060926, i5, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposable.<anonymous> (BeneficiaryNameComposable.kt:63)");
                    }
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), false, ComposableLambda3.rememberComposableLambda(-1538214537, true, new AnonymousClass1(onBeneficiaryName, snapshotState, snapshotState2, snapshotState4), composer2, 54), ComposableLambda3.rememberComposableLambda(1719800810, true, new AnonymousClass2(snapshotState, snapshotState2, onBeneficiaryName, focusRequester, snapshotState3, snapshotState4), composer2, 54), composer2, 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: BeneficiaryNameComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<Boolean> $ctaEnabled$delegate;
                    final /* synthetic */ SnapshotState<String> $firstName$delegate;
                    final /* synthetic */ FocusRequester $focusRequester;
                    final /* synthetic */ SnapshotState<String> $lastName$delegate;
                    final /* synthetic */ Function2<String, String, Unit> $onBeneficiaryName;
                    final /* synthetic */ SnapshotState<Boolean> $requestFocus$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, Function2<? super String, ? super String, Unit> function2, FocusRequester focusRequester, SnapshotState<Boolean> snapshotState3, SnapshotState4<Boolean> snapshotState4) {
                        this.$firstName$delegate = snapshotState;
                        this.$lastName$delegate = snapshotState2;
                        this.$onBeneficiaryName = function2;
                        this.$focusRequester = focusRequester;
                        this.$requestFocus$delegate = snapshotState3;
                        this.$ctaEnabled$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                        invoke(boxScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1719800810, i, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposable.<anonymous>.<anonymous> (BeneficiaryNameComposable.kt:67)");
                        }
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM());
                        BeneficiaryNameComposable4 beneficiaryNameComposable4 = BeneficiaryNameComposable4.INSTANCE;
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged = composer.changed(this.$firstName$delegate) | composer.changed(this.$lastName$delegate) | composer.changed(this.$onBeneficiaryName);
                        final FocusRequester focusRequester = this.$focusRequester;
                        final SnapshotState<String> snapshotState = this.$firstName$delegate;
                        final Function2<String, String, Unit> function2 = this.$onBeneficiaryName;
                        final SnapshotState<String> snapshotState2 = this.$lastName$delegate;
                        final SnapshotState<Boolean> snapshotState3 = this.$requestFocus$delegate;
                        final SnapshotState4<Boolean> snapshotState4 = this.$ctaEnabled$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Function1 function1 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BeneficiaryNameComposable.C385171.AnonymousClass2.invoke$lambda$1$lambda$0(focusRequester, snapshotState, function2, snapshotState2, snapshotState3, snapshotState4, (LazyListScope) obj);
                                }
                            };
                            composer.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, beneficiaryNameComposable4, null, null, false, null, (Function1) objRememberedValue, composer, 24576, 494);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(FocusRequester focusRequester, SnapshotState snapshotState, Function2 function2, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, BeneficiaryNameComposable5.INSTANCE.m25192getLambda$2013289793$feature_crypto_transfer_externalDebug(), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(278331126, true, new BeneficiaryNameComposable2(focusRequester, snapshotState, function2, snapshotState2, snapshotState3, snapshotState4)), 3, null);
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: BeneficiaryNameComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<Boolean> $ctaEnabled$delegate;
                    final /* synthetic */ SnapshotState<String> $firstName$delegate;
                    final /* synthetic */ SnapshotState<String> $lastName$delegate;
                    final /* synthetic */ Function2<String, String, Unit> $onBeneficiaryName;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Function2<? super String, ? super String, Unit> function2, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState4<Boolean> snapshotState4) {
                        this.$onBeneficiaryName = function2;
                        this.$firstName$delegate = snapshotState;
                        this.$lastName$delegate = snapshotState2;
                        this.$ctaEnabled$delegate = snapshotState4;
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
                            ComposerKt.traceEventStart(-1538214537, i2, -1, "com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposable.<anonymous>.<anonymous> (BeneficiaryNameComposable.kt:149)");
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                        String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_continue_button_label, composer, 0);
                        boolean zBeneficiaryNameComposable$lambda$10 = BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$10(this.$ctaEnabled$delegate);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged = composer.changed(this.$onBeneficiaryName) | composer.changed(this.$firstName$delegate) | composer.changed(this.$lastName$delegate);
                        final Function2<String, String, Unit> function2 = this.$onBeneficiaryName;
                        final SnapshotState<String> snapshotState = this.$firstName$delegate;
                        final SnapshotState<String> snapshotState2 = this.$lastName$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$BeneficiaryNameComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BeneficiaryNameComposable.C385171.AnonymousClass1.invoke$lambda$1$lambda$0(function2, snapshotState, snapshotState2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBarScreenLayout.PrimaryButtonOnly(modifierAutoLogEvents$default, null, (Function0) objRememberedValue, strStringResource, false, null, zBeneficiaryNameComposable$lambda$10, composer, (BentoButtonBar3.$stable << 21) | ((i2 << 21) & 29360128), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, SnapshotState snapshotState, SnapshotState snapshotState2) {
                        function2.invoke(BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$2(snapshotState), BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$6(snapshotState2));
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            Boolean boolValueOf = Boolean.valueOf(BeneficiaryNameComposable$lambda$13(snapshotState3));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new BeneficiaryNameComposable3(focusRequester, snapshotState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.beneficiary.BeneficiaryNameComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryNameComposable.BeneficiaryNameComposable$lambda$16(modifier3, onBeneficiaryName, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BeneficiaryNameComposable$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BeneficiaryNameComposable$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BeneficiaryNameComposable$lambda$9$lambda$8(SnapshotState snapshotState, SnapshotState snapshotState2) {
        return (StringsKt.isBlank(BeneficiaryNameComposable$lambda$2(snapshotState)) || StringsKt.isBlank(BeneficiaryNameComposable$lambda$6(snapshotState2))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BeneficiaryNameComposable$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BeneficiaryNameComposable$lambda$10(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BeneficiaryNameComposable$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BeneficiaryNameComposable$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BeneficiaryNameComposable$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }
}
