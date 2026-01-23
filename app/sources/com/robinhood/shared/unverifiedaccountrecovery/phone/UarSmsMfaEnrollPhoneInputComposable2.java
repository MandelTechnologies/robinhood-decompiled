package com.robinhood.shared.unverifiedaccountrecovery.phone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
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
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxbinding3.widget.TextViewAfterTextChangeEvent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.models.p355ui.pathfinder.contexts.SmsMfaEnrollPhoneInputContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.unverifiedaccountrecovery.C41128R;
import com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposable2;
import com.robinhood.utils.extensions.StringsKt;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UarSmsMfaEnrollPhoneInputComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u001d\u001a1\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\"\u001a\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006$²\u0006\n\u0010%\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\f\u0010'\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002"}, m3636d2 = {"UarSmsMfaEnrollPhoneInputComposable", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/SmsMfaEnrollPhoneInputContext;", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "sendingInput", "", "onClickChangeCountryCode", "Lkotlin/Function0;", "onClickCta", "Lkotlin/Function2;", "", "Lcom/robinhood/models/api/pathfinder/contexts/CtaAction;", "onKeyEvent", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "(Lcom/robinhood/models/ui/pathfinder/contexts/SmsMfaEnrollPhoneInputContext;Lcom/robinhood/android/common/util/InternationalInfo;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ChangeCountryCodeButton", "onClick", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Heading", "heading", "Lcom/robinhood/models/serverdriven/db/RichText;", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/runtime/Composer;I)V", "PhoneNumberInput", "text", "onValueChange", "(Ljava/lang/String;Lcom/robinhood/android/common/util/InternationalInfo;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ConfirmationDialog", "phoneNumber", "onPrimaryButtonClick", "dismissDialog", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "formatPhoneNumber", "feature-unverified-account-recovery_externalDebug", "textInput", "showConfirmationDialog", "currentInternationalInfo"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UarSmsMfaEnrollPhoneInputComposable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeCountryCodeButton$lambda$11(Function0 function0, int i, Composer composer, int i2) {
        ChangeCountryCodeButton(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationDialog$lambda$22(String str, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ConfirmationDialog(str, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$12(RichText richText, int i, Composer composer, int i2) {
        Heading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberInput$lambda$21(String str, InternationalInfo internationalInfo, Function1 function1, int i, Composer composer, int i2) {
        PhoneNumberInput(str, internationalInfo, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UarSmsMfaEnrollPhoneInputComposable$lambda$10(SmsMfaEnrollPhoneInputContext smsMfaEnrollPhoneInputContext, InternationalInfo internationalInfo, boolean z, Function0 function0, Function2 function2, Function1 function1, int i, Composer composer, int i2) {
        UarSmsMfaEnrollPhoneInputComposable(smsMfaEnrollPhoneInputContext, internationalInfo, z, function0, function2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UarSmsMfaEnrollPhoneInputComposable(final SmsMfaEnrollPhoneInputContext context, final InternationalInfo internationalInfo, final boolean z, final Function0<Unit> onClickChangeCountryCode, final Function2<? super String, ? super CtaAction, Unit> onClickCta, final Function1<? super KeyEvent, Unit> onKeyEvent, Composer composer, final int i) {
        int i2;
        boolean z2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        Intrinsics.checkNotNullParameter(onClickChangeCountryCode, "onClickChangeCountryCode");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Intrinsics.checkNotNullParameter(onKeyEvent, "onKeyEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1444716348);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(internationalInfo) : composerStartRestartGroup.changedInstance(internationalInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickChangeCountryCode) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickCta) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onKeyEvent) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1444716348, i3, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposable (UarSmsMfaEnrollPhoneInputComposable.kt:47)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoNumpadScreenLayout.BentoNumpadScreenLayout(null, ComposableLambda3.rememberComposableLambda(-1328483903, true, new C411971(context, internationalInfo, onClickChangeCountryCode, snapshotState), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2088838959, true, new C411982(onKeyEvent, context, internationalInfo.getValidatePhoneNumber().invoke(UarSmsMfaEnrollPhoneInputComposable$lambda$1(snapshotState)).booleanValue(), z2, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 1);
            if (UarSmsMfaEnrollPhoneInputComposable$lambda$4(snapshotState2)) {
                String phoneNumber = formatPhoneNumber(UarSmsMfaEnrollPhoneInputComposable$lambda$1(snapshotState), internationalInfo);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(internationalInfo))) | ((i3 & 57344) == 16384) | composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UarSmsMfaEnrollPhoneInputComposable2.UarSmsMfaEnrollPhoneInputComposable$lambda$7$lambda$6(internationalInfo, onClickCta, context, snapshotState2, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function0);
                    objRememberedValue3 = function0;
                }
                Function0 function02 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UarSmsMfaEnrollPhoneInputComposable2.UarSmsMfaEnrollPhoneInputComposable$lambda$9$lambda$8(snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                ConfirmationDialog(phoneNumber, function02, (Function0) objRememberedValue4, composerStartRestartGroup, 384);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarSmsMfaEnrollPhoneInputComposable2.UarSmsMfaEnrollPhoneInputComposable$lambda$10(context, internationalInfo, z, onClickChangeCountryCode, onClickCta, onKeyEvent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UarSmsMfaEnrollPhoneInputComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: UarSmsMfaEnrollPhoneInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$UarSmsMfaEnrollPhoneInputComposable$1 */
    static final class C411971 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SmsMfaEnrollPhoneInputContext $context;
        final /* synthetic */ InternationalInfo $internationalInfo;
        final /* synthetic */ Function0<Unit> $onClickChangeCountryCode;
        final /* synthetic */ SnapshotState<String> $textInput$delegate;

        C411971(SmsMfaEnrollPhoneInputContext smsMfaEnrollPhoneInputContext, InternationalInfo internationalInfo, Function0<Unit> function0, SnapshotState<String> snapshotState) {
            this.$context = smsMfaEnrollPhoneInputContext;
            this.$internationalInfo = internationalInfo;
            this.$onClickChangeCountryCode = function0;
            this.$textInput$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UarSmsMfaEnrollPhoneInputComposable2.UarSmsMfaEnrollPhoneInputComposable$lambda$2(snapshotState, it);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1328483903, i, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposable.<anonymous> (UarSmsMfaEnrollPhoneInputComposable.kt:54)");
            }
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            SmsMfaEnrollPhoneInputContext smsMfaEnrollPhoneInputContext = this.$context;
            InternationalInfo internationalInfo = this.$internationalInfo;
            Function0<Unit> function0 = this.$onClickChangeCountryCode;
            final SnapshotState<String> snapshotState = this.$textInput$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            UarSmsMfaEnrollPhoneInputComposable2.Heading(smsMfaEnrollPhoneInputContext.getHeading(), composer, 0);
            String strUarSmsMfaEnrollPhoneInputComposable$lambda$1 = UarSmsMfaEnrollPhoneInputComposable2.UarSmsMfaEnrollPhoneInputComposable$lambda$1(snapshotState);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$UarSmsMfaEnrollPhoneInputComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarSmsMfaEnrollPhoneInputComposable2.C411971.invoke$lambda$2$lambda$1$lambda$0(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UarSmsMfaEnrollPhoneInputComposable2.PhoneNumberInput(strUarSmsMfaEnrollPhoneInputComposable$lambda$1, internationalInfo, (Function1) objRememberedValue, composer, (InternationalInfo.$stable << 3) | 384);
            UarSmsMfaEnrollPhoneInputComposable2.ChangeCountryCodeButton(function0, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: UarSmsMfaEnrollPhoneInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$UarSmsMfaEnrollPhoneInputComposable$2 */
    static final class C411982 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
        final /* synthetic */ SmsMfaEnrollPhoneInputContext $context;
        final /* synthetic */ Function1<KeyEvent, Unit> $onKeyEvent;
        final /* synthetic */ boolean $sendingInput;
        final /* synthetic */ SnapshotState<Boolean> $showConfirmationDialog$delegate;
        final /* synthetic */ boolean $validPhoneNumber;

        /* JADX WARN: Multi-variable type inference failed */
        C411982(Function1<? super KeyEvent, Unit> function1, SmsMfaEnrollPhoneInputContext smsMfaEnrollPhoneInputContext, boolean z, boolean z2, SnapshotState<Boolean> snapshotState) {
            this.$onKeyEvent = function1;
            this.$context = smsMfaEnrollPhoneInputContext;
            this.$validPhoneNumber = z;
            this.$sendingInput = z2;
            this.$showConfirmationDialog$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
            invoke(bentoNumpad4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2088838959, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposable.<anonymous> (UarSmsMfaEnrollPhoneInputComposable.kt:66)");
            }
            Function1<KeyEvent, Unit> function1 = this.$onKeyEvent;
            String text = this.$context.getPrimaryCta().getText();
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$showConfirmationDialog$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$UarSmsMfaEnrollPhoneInputComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UarSmsMfaEnrollPhoneInputComposable2.C411982.invoke$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoNumpadScreenLayout.BentoNumpadWithButton(null, function1, text, (Function0) objRememberedValue, false, this.$validPhoneNumber, false, this.$sendingInput, false, false, null, false, composer, 100666368, (BentoNumpad4.$stable << 6) | ((i2 << 6) & 896), 3665);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            UarSmsMfaEnrollPhoneInputComposable2.UarSmsMfaEnrollPhoneInputComposable$lambda$5(snapshotState, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UarSmsMfaEnrollPhoneInputComposable$lambda$7$lambda$6(InternationalInfo internationalInfo, Function2 function2, SmsMfaEnrollPhoneInputContext smsMfaEnrollPhoneInputContext, SnapshotState snapshotState, SnapshotState snapshotState2) {
        UarSmsMfaEnrollPhoneInputComposable$lambda$5(snapshotState, false);
        function2.invoke(internationalInfo.getDisplayCountryPhoneCode() + UarSmsMfaEnrollPhoneInputComposable$lambda$1(snapshotState2), smsMfaEnrollPhoneInputContext.getPrimaryCta().getAction());
        return Unit.INSTANCE;
    }

    private static final InternationalInfo PhoneNumberInput$lambda$14(SnapshotState<InternationalInfo> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UarSmsMfaEnrollPhoneInputComposable$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean UarSmsMfaEnrollPhoneInputComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UarSmsMfaEnrollPhoneInputComposable$lambda$9$lambda$8(SnapshotState snapshotState) {
        UarSmsMfaEnrollPhoneInputComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChangeCountryCodeButton(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(-627373108);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-627373108, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.ChangeCountryCodeButton (UarSmsMfaEnrollPhoneInputComposable.kt:94)");
            }
            function02 = function0;
            BentoTextButton2.m20715BentoTextButtonPIknLig(function02, StringResources_androidKt.stringResource(C41128R.string.uar_phone_update_input_change_country_code, composerStartRestartGroup, 0), null, null, null, false, null, composerStartRestartGroup, i2 & 14, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarSmsMfaEnrollPhoneInputComposable2.ChangeCountryCodeButton$lambda$11(function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Heading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-347533086);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-347533086, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.Heading (UarSmsMfaEnrollPhoneInputComposable.kt:102)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(richText, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21596getXxlargeD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarSmsMfaEnrollPhoneInputComposable2.Heading$lambda$12(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UarSmsMfaEnrollPhoneInputComposable$lambda$2(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InflateParams", "CheckResult"})
    public static final void PhoneNumberInput(final String str, final InternationalInfo internationalInfo, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2000721286);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(internationalInfo) : composerStartRestartGroup.changedInstance(internationalInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000721286, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.PhoneNumberInput (UarSmsMfaEnrollPhoneInputComposable.kt:116)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            boolean z = true;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i2 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarSmsMfaEnrollPhoneInputComposable2.PhoneNumberInput$lambda$18$lambda$17(function1, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z3 = (i2 & 14) == 4;
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !composerStartRestartGroup.changedInstance(internationalInfo))) {
                z = false;
            }
            boolean z4 = z3 | z;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarSmsMfaEnrollPhoneInputComposable2.PhoneNumberInput$lambda$20$lambda$19(str, internationalInfo, snapshotState, (UarSmsMfaEnrollPhoneInputComposable) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function12, modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarSmsMfaEnrollPhoneInputComposable2.PhoneNumberInput$lambda$21(str, internationalInfo, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UarSmsMfaEnrollPhoneInputComposable PhoneNumberInput$lambda$18$lambda$17(final Function1 function1, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final UarSmsMfaEnrollPhoneInputComposable uarSmsMfaEnrollPhoneInputComposable = new UarSmsMfaEnrollPhoneInputComposable(context);
        RxTextView.afterTextChangeEvents(uarSmsMfaEnrollPhoneInputComposable.getEditText()).map(new Function() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$PhoneNumberInput$1$1$1$1
            @Override // io.reactivex.functions.Function
            public final String apply(TextViewAfterTextChangeEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return uarSmsMfaEnrollPhoneInputComposable.getEditText().getTypedText();
            }
        }).distinctUntilChanged().subscribe(new Consumer() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$PhoneNumberInput$1$1$1$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(String str) {
                Function1<String, Unit> function12 = function1;
                Intrinsics.checkNotNull(str);
                function12.invoke(str);
            }
        });
        uarSmsMfaEnrollPhoneInputComposable.getEditText().requestFocus();
        return uarSmsMfaEnrollPhoneInputComposable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberInput$lambda$20$lambda$19(String str, InternationalInfo internationalInfo, SnapshotState snapshotState, UarSmsMfaEnrollPhoneInputComposable view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RdsFormattedEditText editText = view.getEditText();
        editText.setText(str);
        if (!Intrinsics.areEqual(PhoneNumberInput$lambda$14(snapshotState), internationalInfo)) {
            snapshotState.setValue(internationalInfo);
            editText.setTemplate(internationalInfo.getCountryCodePhoneNumberTemplate(), internationalInfo.getCountryCodePhoneNumberHint());
        }
        return Unit.INSTANCE;
    }

    private static final void ConfirmationDialog(final String str, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(590504011);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590504011, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.ConfirmationDialog (UarSmsMfaEnrollPhoneInputComposable.kt:147)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C41128R.string.uar_phone_update_input_dialog_title, composerStartRestartGroup, 0);
            int i3 = i2;
            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(C41128R.string.uar_phone_update_input_dialog_body, new Object[]{str}, composerStartRestartGroup, 0));
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0), function0);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composerStartRestartGroup, 0), function02);
            int i4 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
            int i5 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, function02, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12) | ((i3 << 18) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarSmsMfaEnrollPhoneInputComposable2.ConfirmationDialog$lambda$22(str, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String formatPhoneNumber(String str, InternationalInfo internationalInfo) {
        String numberToE164;
        String strFromE164ToNanpPhoneNumber;
        String iso3166CountryCode = internationalInfo.getCountryCode().getIso3166CountryCode();
        if (Intrinsics.areEqual(iso3166CountryCode, CountryCode.COUNTRY_CODE_US) && (numberToE164 = PhoneNumberUtils.formatNumberToE164(str, iso3166CountryCode)) != null && (strFromE164ToNanpPhoneNumber = StringsKt.fromE164ToNanpPhoneNumber(numberToE164)) != null) {
            str = strFromE164ToNanpPhoneNumber;
        }
        return internationalInfo.getDisplayCountryPhoneCode() + PlaceholderUtils.XXShortPlaceholderText + str;
    }
}
