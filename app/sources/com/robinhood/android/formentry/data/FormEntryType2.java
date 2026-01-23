package com.robinhood.android.formentry.data;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormTypeDto;

/* compiled from: FormEntryType.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"formEntryDto", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormTypeDto;", "Lcom/robinhood/android/formentry/data/FormEntryType;", "getFormEntryDto", "(Lcom/robinhood/android/formentry/data/FormEntryType;)Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormTypeDto;", "lib-form-entry_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.formentry.data.FormEntryTypeKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FormEntryType2 {

    /* compiled from: FormEntryType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.formentry.data.FormEntryTypeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormEntryType.values().length];
            try {
                iArr[FormEntryType.FIRST_PARTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormEntryType.THIRD_PARTY_WIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FormTypeDto getFormEntryDto(FormEntryType formEntryType) {
        Intrinsics.checkNotNullParameter(formEntryType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[formEntryType.ordinal()];
        if (i == 1) {
            return FormTypeDto.FIRST_PARTY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FormTypeDto.THIRD_PARTY;
    }
}
