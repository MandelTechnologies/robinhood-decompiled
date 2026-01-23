package com.robinhood.shared.stepupverification.support;

import android.view.KeyEvent;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.designsystem.textinput.format.InputFormatCharacterList;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.utils.extensions.KeyEvents2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PhoneInputBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\b2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/PhoneInputBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/shared/stepupverification/support/PhoneInputBottomSheetViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;)V", "onCountryChanged", "", "handleKeyPress", "event", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PhoneInputBottomSheetDuxo extends BaseDuxo4<PhoneInputBottomSheetViewState> {
    public static final int $stable = BaseDuxo4.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneInputBottomSheetDuxo(DuxoBundle duxoBundle) {
        super(new PhoneInputBottomSheetViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }

    /* compiled from: PhoneInputBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/support/PhoneInputBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetDuxo$onCountryChanged$1", m3645f = "PhoneInputBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetDuxo$onCountryChanged$1 */
    static final class C399301 extends ContinuationImpl7 implements Function2<PhoneInputBottomSheetViewState, Continuation<? super PhoneInputBottomSheetViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C399301(Continuation<? super C399301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399301 c399301 = new C399301(continuation);
            c399301.L$0 = obj;
            return c399301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PhoneInputBottomSheetViewState phoneInputBottomSheetViewState, Continuation<? super PhoneInputBottomSheetViewState> continuation) {
            return ((C399301) create(phoneInputBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((PhoneInputBottomSheetViewState) this.L$0).copy("");
        }
    }

    public final void onCountryChanged() {
        applyMutation(new C399301(null));
    }

    public final void handleKeyPress(KeyEvent event, InternationalInfo internationalInfo) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        applyMutation(new C399291(event, new InputFormatCharacterList(internationalInfo.getCountryCodePhoneNumberTemplate(), internationalInfo.getCountryCodePhoneNumberHint()).getPlaceholderCount(), null));
    }

    /* compiled from: PhoneInputBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/support/PhoneInputBottomSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetDuxo$handleKeyPress$1", m3645f = "PhoneInputBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetDuxo$handleKeyPress$1 */
    static final class C399291 extends ContinuationImpl7 implements Function2<PhoneInputBottomSheetViewState, Continuation<? super PhoneInputBottomSheetViewState>, Object> {
        final /* synthetic */ KeyEvent $event;
        final /* synthetic */ int $phoneNumberMaxLength;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399291(KeyEvent keyEvent, int i, Continuation<? super C399291> continuation) {
            super(2, continuation);
            this.$event = keyEvent;
            this.$phoneNumberMaxLength = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399291 c399291 = new C399291(this.$event, this.$phoneNumberMaxLength, continuation);
            c399291.L$0 = obj;
            return c399291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PhoneInputBottomSheetViewState phoneInputBottomSheetViewState, Continuation<? super PhoneInputBottomSheetViewState> continuation) {
            return ((C399291) create(phoneInputBottomSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String phoneNumber;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PhoneInputBottomSheetViewState phoneInputBottomSheetViewState = (PhoneInputBottomSheetViewState) this.L$0;
            if (KeyEvents2.isDelete(this.$event) && phoneInputBottomSheetViewState.getPhoneNumber().length() <= 1) {
                phoneNumber = "";
            } else if (KeyEvents2.isDelete(this.$event)) {
                phoneNumber = StringsKt.dropLast(phoneInputBottomSheetViewState.getPhoneNumber(), 1);
            } else if ((!KeyEvents2.isDigit(this.$event) || phoneInputBottomSheetViewState.getPhoneNumber().length() < this.$phoneNumberMaxLength) && KeyEvents2.isDigit(this.$event)) {
                phoneNumber = phoneInputBottomSheetViewState.getPhoneNumber() + this.$event.getNumber();
            } else {
                phoneNumber = phoneInputBottomSheetViewState.getPhoneNumber();
            }
            return phoneInputBottomSheetViewState.copy(phoneNumber);
        }
    }
}
