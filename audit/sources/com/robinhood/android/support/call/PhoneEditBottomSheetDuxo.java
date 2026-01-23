package com.robinhood.android.support.call;

import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.udf.OldBaseDuxo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneEditBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/call/PhoneEditBottomSheetDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/support/call/PhoneEditBottomSheetViewState;", "<init>", "()V", "setPhoneNumberTypedText", "", "typedText", "", "setInternationalInfo", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PhoneEditBottomSheetDuxo extends OldBaseDuxo<PhoneEditBottomSheetViewState> {
    public static final int $stable = OldBaseDuxo.$stable;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneEditBottomSheetDuxo() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        super(new PhoneEditBottomSheetViewState(null, objArr, 3, 0 == true ? 1 : 0), objArr2, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhoneEditBottomSheetViewState setPhoneNumberTypedText$lambda$0(String str, PhoneEditBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PhoneEditBottomSheetViewState.copy$default(applyMutation, str, null, 2, null);
    }

    public final void setPhoneNumberTypedText(final String typedText) {
        Intrinsics.checkNotNullParameter(typedText, "typedText");
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneEditBottomSheetDuxo.setPhoneNumberTypedText$lambda$0(typedText, (PhoneEditBottomSheetViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhoneEditBottomSheetViewState setInternationalInfo$lambda$1(InternationalInfo internationalInfo, PhoneEditBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PhoneEditBottomSheetViewState.copy$default(applyMutation, null, internationalInfo, 1, null);
    }

    public final void setInternationalInfo(final InternationalInfo internationalInfo) {
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneEditBottomSheetDuxo.setInternationalInfo$lambda$1(internationalInfo, (PhoneEditBottomSheetViewState) obj);
            }
        });
    }
}
