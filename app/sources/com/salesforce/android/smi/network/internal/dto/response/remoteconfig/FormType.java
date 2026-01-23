package com.salesforce.android.smi.network.internal.dto.response.remoteconfig;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormType.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/remoteconfig/FormType;", "", "<init>", "(Ljava/lang/String;I)V", "PreChat", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FormType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FormType[] $VALUES;
    public static final FormType PreChat = new FormType("PreChat", 0);

    private static final /* synthetic */ FormType[] $values() {
        return new FormType[]{PreChat};
    }

    public static EnumEntries<FormType> getEntries() {
        return $ENTRIES;
    }

    private FormType(String str, int i) {
    }

    static {
        FormType[] formTypeArr$values = $values();
        $VALUES = formTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(formTypeArr$values);
    }

    public static FormType valueOf(String str) {
        return (FormType) Enum.valueOf(FormType.class, str);
    }

    public static FormType[] values() {
        return (FormType[]) $VALUES.clone();
    }
}
