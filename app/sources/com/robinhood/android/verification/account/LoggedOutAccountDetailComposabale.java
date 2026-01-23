package com.robinhood.android.verification.account;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.verification.C31368R;
import com.robinhood.android.verification.account.LoggedOutAccountDetailComposabale;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.PhoneNumber;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoggedOutAccountDetailComposabale.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0010\u001a9\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0019\u001aA\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"LoggedOutAccountDetailComposable", "", "state", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailViewState;", "onEmailChanged", "Lkotlin/Function1;", "", "onNumberChanged", "Lcom/robinhood/models/ui/PhoneNumber;", "onClickContinue", "Lkotlin/Function2;", "emailVisualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "(Lcom/robinhood/android/verification/account/LoggedOutAccountDetailViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/runtime/Composer;II)V", "Title", "title", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SubTitle", "subTitle", "EmailInput", "email", "showInvalidWarning", "", "enabled", "onValueChange", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PhoneNumberInput", InquiryField.FloatField.TYPE2, "visualTransformation", "(Ljava/lang/String;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-verification_externalDebug", "emailInput", "numberInput"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LoggedOutAccountDetailComposabale {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailInput$lambda$3(String str, boolean z, boolean z2, Function1 function1, int i, Composer composer, int i2) {
        EmailInput(str, z, z2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoggedOutAccountDetailComposable$lambda$0(LoggedOutAccountDetailViewState loggedOutAccountDetailViewState, Function1 function1, Function1 function12, Function2 function2, VisualTransformation visualTransformation, int i, int i2, Composer composer, int i3) {
        LoggedOutAccountDetailComposable(loggedOutAccountDetailViewState, function1, function12, function2, visualTransformation, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberInput$lambda$4(String str, boolean z, VisualTransformation visualTransformation, boolean z2, Function1 function1, int i, Composer composer, int i2) {
        PhoneNumberInput(str, z, visualTransformation, z2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubTitle$lambda$2(String str, int i, Composer composer, int i2) {
        SubTitle(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$1(String str, int i, Composer composer, int i2) {
        Title(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: LoggedOutAccountDetailComposabale.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$LoggedOutAccountDetailComposable$1 */
    static final class C313761 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ VisualTransformation $emailVisualTransformation;
        final /* synthetic */ Function2<String, PhoneNumber, Unit> $onClickContinue;
        final /* synthetic */ Function1<String, Unit> $onEmailChanged;
        final /* synthetic */ Function1<PhoneNumber, Unit> $onNumberChanged;
        final /* synthetic */ LoggedOutAccountDetailViewState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C313761(LoggedOutAccountDetailViewState loggedOutAccountDetailViewState, Function1<? super String, Unit> function1, Function1<? super PhoneNumber, Unit> function12, Function2<? super String, ? super PhoneNumber, Unit> function2, VisualTransformation visualTransformation) {
            this.$state = loggedOutAccountDetailViewState;
            this.$onEmailChanged = function1;
            this.$onNumberChanged = function12;
            this.$onClickContinue = function2;
            this.$emailVisualTransformation = visualTransformation;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SnapshotState invoke$lambda$1$lambda$0(LoggedOutAccountDetailViewState loggedOutAccountDetailViewState) {
            return SnapshotState3.mutableStateOf$default(loggedOutAccountDetailViewState.getEmail(), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SnapshotState invoke$lambda$5$lambda$4(LoggedOutAccountDetailViewState loggedOutAccountDetailViewState) {
            return SnapshotState3.mutableStateOf$default(loggedOutAccountDetailViewState.getPhoneNumber(), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$12$lambda$9$lambda$8(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotState.setValue(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invoke$lambda$2(SnapshotState<String> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PhoneNumber invoke$lambda$6(SnapshotState<PhoneNumber> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$12$lambda$11$lambda$10(LoggedOutAccountDetailViewState loggedOutAccountDetailViewState, SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String strSubstring = it.substring(0, Math.min(it.length(), loggedOutAccountDetailViewState.getPhoneNumberMaxLength()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            snapshotState.setValue(PhoneNumber.copy$default(invoke$lambda$6(snapshotState), null, strSubstring, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$14$lambda$13(Function2 function2, LoggedOutAccountDetailViewState loggedOutAccountDetailViewState) {
            function2.invoke(loggedOutAccountDetailViewState.getEmail(), loggedOutAccountDetailViewState.getPhoneNumber());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Continuation continuation;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-842314001, i, -1, "com.robinhood.android.verification.account.LoggedOutAccountDetailComposable.<anonymous> (LoggedOutAccountDetailComposabale.kt:55)");
            }
            Object[] objArr = new Object[0];
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$state);
            final LoggedOutAccountDetailViewState loggedOutAccountDetailViewState = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$LoggedOutAccountDetailComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoggedOutAccountDetailComposabale.C313761.invoke$lambda$1$lambda$0(loggedOutAccountDetailViewState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 0, 6);
            Object[] objArr2 = new Object[0];
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.$state);
            final LoggedOutAccountDetailViewState loggedOutAccountDetailViewState2 = this.$state;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$LoggedOutAccountDetailComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoggedOutAccountDetailComposabale.C313761.invoke$lambda$5$lambda$4(loggedOutAccountDetailViewState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composer, 0, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            final LoggedOutAccountDetailViewState loggedOutAccountDetailViewState3 = this.$state;
            final Function2<String, PhoneNumber, Unit> function2 = this.$onClickContinue;
            VisualTransformation visualTransformation = this.$emailVisualTransformation;
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
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
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
            LoggedOutAccountDetailComposabale.Title(StringResources_androidKt.stringResource(C31368R.string.account_verification_title, composer, 0), composer, 0);
            LoggedOutAccountDetailComposabale.SubTitle(StringResources_androidKt.stringResource(C31368R.string.account_verification_subtitle, composer, 0), composer, 0);
            String strInvoke$lambda$2 = invoke$lambda$2(snapshotState);
            boolean showEmailWarning = loggedOutAccountDetailViewState3.getShowEmailWarning();
            boolean z = !loggedOutAccountDetailViewState3.isSubmitting();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(snapshotState);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$LoggedOutAccountDetailComposable$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoggedOutAccountDetailComposabale.C313761.invoke$lambda$15$lambda$12$lambda$9$lambda$8(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            LoggedOutAccountDetailComposabale.EmailInput(strInvoke$lambda$2, showEmailWarning, z, (Function1) objRememberedValue3, composer, 0);
            String number = invoke$lambda$6(snapshotState2).getNumber();
            boolean showPhoneWarning = loggedOutAccountDetailViewState3.getShowPhoneWarning();
            boolean z2 = !loggedOutAccountDetailViewState3.isSubmitting();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(loggedOutAccountDetailViewState3) | composer.changed(snapshotState2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$LoggedOutAccountDetailComposable$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoggedOutAccountDetailComposabale.C313761.invoke$lambda$15$lambda$12$lambda$11$lambda$10(loggedOutAccountDetailViewState3, snapshotState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            LoggedOutAccountDetailComposabale.PhoneNumberInput(number, showPhoneWarning, visualTransformation, z2, (Function1) objRememberedValue4, composer, 0);
            composer.endNode();
            Modifier modifierTestTag = TestTag3.testTag(companion, "CONTINUE_BUTTON");
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
            String string2 = loggedOutAccountDetailViewState3.getInquiryId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            String str = null;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierTestTag, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new Context(i2, i3, i4, null, null, null, null, null, i5, null, str, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388606, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null), false, false, false, true, false, null, 108, null);
            String strStringResource = StringResources_androidKt.stringResource(C31368R.string.account_verification_continue_cta, composer, 0);
            boolean zIsSubmitting = loggedOutAccountDetailViewState3.isSubmitting();
            boolean zIsSubmitButtonClickable = loggedOutAccountDetailViewState3.isSubmitButtonClickable();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer.changed(function2) | composer.changedInstance(loggedOutAccountDetailViewState3);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$LoggedOutAccountDetailComposable$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoggedOutAccountDetailComposabale.C313761.invoke$lambda$15$lambda$14$lambda$13(function2, loggedOutAccountDetailViewState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, null, null, false, null, null, (Function0) objRememberedValue5, strStringResource, zIsSubmitting, null, zIsSubmitButtonClickable, null, null, false, null, false, composer, 0, 0, 64062);
            composer.endNode();
            String strInvoke$lambda$22 = invoke$lambda$2(snapshotState);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged3 = composer.changed(this.$onEmailChanged) | composer.changed(snapshotState);
            Function1<String, Unit> function1 = this.$onEmailChanged;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                continuation = null;
                objRememberedValue6 = new LoggedOutAccountDetailComposabale2(function1, snapshotState, null);
                composer.updateRememberedValue(objRememberedValue6);
            } else {
                continuation = null;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(strInvoke$lambda$22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer, 0);
            PhoneNumber phoneNumberInvoke$lambda$6 = invoke$lambda$6(snapshotState2);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged4 = composer.changed(this.$onNumberChanged) | composer.changed(snapshotState2);
            Function1<PhoneNumber, Unit> function12 = this.$onNumberChanged;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new LoggedOutAccountDetailComposabale3(function12, snapshotState2, continuation);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(phoneNumberInvoke$lambda$6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoggedOutAccountDetailComposable(final LoggedOutAccountDetailViewState state, final Function1<? super String, Unit> onEmailChanged, final Function1<? super PhoneNumber, Unit> onNumberChanged, final Function2<? super String, ? super PhoneNumber, Unit> onClickContinue, VisualTransformation visualTransformation, Composer composer, final int i, final int i2) {
        int i3;
        VisualTransformation visualTransformation2;
        final VisualTransformation visualTransformation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEmailChanged, "onEmailChanged");
        Intrinsics.checkNotNullParameter(onNumberChanged, "onNumberChanged");
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(2062863268);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEmailChanged) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNumberChanged) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickContinue) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                visualTransformation2 = visualTransformation;
                i3 |= composerStartRestartGroup.changed(visualTransformation2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                VisualTransformation none = i4 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2062863268, i3, -1, "com.robinhood.android.verification.account.LoggedOutAccountDetailComposable (LoggedOutAccountDetailComposabale.kt:54)");
                }
                visualTransformation3 = none;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-842314001, true, new C313761(state, onEmailChanged, onNumberChanged, onClickContinue, visualTransformation3), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                visualTransformation3 = visualTransformation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoggedOutAccountDetailComposabale.LoggedOutAccountDetailComposable$lambda$0(state, onEmailChanged, onNumberChanged, onClickContinue, visualTransformation3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        visualTransformation2 = visualTransformation;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            visualTransformation3 = none;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-842314001, true, new C313761(state, onEmailChanged, onNumberChanged, onClickContinue, visualTransformation3), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void Title(final String title, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-477668027);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(title) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-477668027, i2, -1, "com.robinhood.android.verification.account.Title (LoggedOutAccountDetailComposabale.kt:140)");
            }
            BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, "TITLE"), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composerStartRestartGroup, i2 & 14, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoggedOutAccountDetailComposabale.Title$lambda$1(title, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SubTitle(final String subTitle, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Composer composerStartRestartGroup = composer.startRestartGroup(655455881);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(subTitle) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(655455881, i2, -1, "com.robinhood.android.verification.account.SubTitle (LoggedOutAccountDetailComposabale.kt:154)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, "SUB_TITLE"), 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(subTitle, PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, i2 & 14, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoggedOutAccountDetailComposabale.SubTitle$lambda$2(subTitle, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EmailInput(final String email, final boolean z, final boolean z2, final Function1<? super String, Unit> onValueChange, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1781989496);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(email) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onValueChange) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781989496, i2, -1, "com.robinhood.android.verification.account.EmailInput (LoggedOutAccountDetailComposabale.kt:172)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, "EMAIL_INPUT"), 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C31368R.string.account_verification_email_label, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1200031003);
            BentoTextInput8.Message.Error error = z ? new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C31368R.string.account_verification_invalid_format, composerStartRestartGroup, 0)) : null;
            composerStartRestartGroup.endReplaceGroup();
            BentoTextInput4.BentoTextInput(email, onValueChange, modifierM5146paddingqDBjuR0$default, strStringResource, null, null, error, null, null, null, null, null, null, z2, false, composerStartRestartGroup, (i2 & 14) | ((i2 >> 6) & 112) | (BentoTextInput8.Message.Error.$stable << 18), (i2 << 3) & 7168, 24496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoggedOutAccountDetailComposabale.EmailInput$lambda$3(email, z, z2, onValueChange, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PhoneNumberInput(final String number, final boolean z, final VisualTransformation visualTransformation, final boolean z2, final Function1<? super String, Unit> onValueChange, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1921618688);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(number) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(visualTransformation) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onValueChange) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1921618688, i2, -1, "com.robinhood.android.verification.account.PhoneNumberInput (LoggedOutAccountDetailComposabale.kt:197)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, "PHONE_NUMBER_INPUT"), 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C31368R.string.account_verification_phone_number_label, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(160394797);
            BentoTextInput8.Message.Error error = z ? new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C31368R.string.account_verification_invalid_format, composerStartRestartGroup, 0)) : null;
            composerStartRestartGroup.endReplaceGroup();
            BentoTextInput4.BentoTextInput(number, onValueChange, modifierM5146paddingqDBjuR0$default, strStringResource, null, null, error, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7781getNumberPjHm6EE(), 0, null, null, null, 123, null), null, visualTransformation, z2, false, composerStartRestartGroup, (i2 & 14) | ((i2 >> 9) & 112) | (BentoTextInput8.Message.Error.$stable << 18), (i2 & 896) | 6 | (i2 & 7168), 19376);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoggedOutAccountDetailComposabale.PhoneNumberInput$lambda$4(number, z, visualTransformation, z2, onValueChange, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
