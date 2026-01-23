package com.truelayer.payments.core.network.experience.entity.response;

import com.truelayer.payments.core.domain.experience.scheme.SchemeSelection;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SchemeSelectionResponse.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BC\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\n\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0002J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0005HÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006."}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionSelect;", "Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionResponse;", "seen1", "", "subtitle", "", "schemes", "", "Lcom/truelayer/payments/core/network/experience/entity/response/Scheme;", "autoSelectSchemeId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAutoSelectSchemeId$annotations", "()V", "getAutoSelectSchemeId", "()Ljava/lang/String;", "getSchemes$annotations", "getSchemes", "()Ljava/util/List;", "getSubtitle$annotations", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getAutoSelectedSchemeId", "hashCode", "intoDomain", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelection;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SerialName(Fields4.TYPE)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class SchemeSelectionSelect extends SchemeSelectionResponse {
    private final String autoSelectSchemeId;
    private final List<Scheme> schemes;
    private final String subtitle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SchemeSelectionResponse3.INSTANCE), null};

    public SchemeSelectionSelect() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemeSelectionSelect copy$default(SchemeSelectionSelect schemeSelectionSelect, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemeSelectionSelect.subtitle;
        }
        if ((i & 2) != 0) {
            list = schemeSelectionSelect.schemes;
        }
        if ((i & 4) != 0) {
            str2 = schemeSelectionSelect.autoSelectSchemeId;
        }
        return schemeSelectionSelect.copy(str, list, str2);
    }

    @SerialName("auto_select_scheme_id")
    public static /* synthetic */ void getAutoSelectSchemeId$annotations() {
    }

    @SerialName("schemes")
    public static /* synthetic */ void getSchemes$annotations() {
    }

    @SerialName("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Scheme> component2() {
        return this.schemes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutoSelectSchemeId() {
        return this.autoSelectSchemeId;
    }

    public final SchemeSelectionSelect copy(String subtitle, List<Scheme> schemes, String autoSelectSchemeId) {
        return new SchemeSelectionSelect(subtitle, schemes, autoSelectSchemeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchemeSelectionSelect)) {
            return false;
        }
        SchemeSelectionSelect schemeSelectionSelect = (SchemeSelectionSelect) other;
        return Intrinsics.areEqual(this.subtitle, schemeSelectionSelect.subtitle) && Intrinsics.areEqual(this.schemes, schemeSelectionSelect.schemes) && Intrinsics.areEqual(this.autoSelectSchemeId, schemeSelectionSelect.autoSelectSchemeId);
    }

    public int hashCode() {
        String str = this.subtitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Scheme> list = this.schemes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.autoSelectSchemeId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SchemeSelectionSelect(subtitle=" + this.subtitle + ", schemes=" + this.schemes + ", autoSelectSchemeId=" + this.autoSelectSchemeId + ")";
    }

    /* compiled from: SchemeSelectionResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionSelect$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionSelect;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SchemeSelectionSelect> serializer() {
            return SchemeSelectionResponse7.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SchemeSelectionSelect(int i, @SerialName("subtitle") String str, @SerialName("schemes") List list, @SerialName("auto_select_scheme_id") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((i & 1) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str;
        }
        if ((i & 2) == 0) {
            this.schemes = null;
        } else {
            this.schemes = list;
        }
        if ((i & 4) == 0) {
            this.autoSelectSchemeId = null;
        } else {
            this.autoSelectSchemeId = str2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(SchemeSelectionSelect self, Encoding3 output, SerialDescriptor serialDesc) {
        SchemeSelectionResponse.write$Self(self, output, serialDesc);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.schemes != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.schemes);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.autoSelectSchemeId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.autoSelectSchemeId);
    }

    public /* synthetic */ SchemeSelectionSelect(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Scheme> getSchemes() {
        return this.schemes;
    }

    public final String getAutoSelectSchemeId() {
        return this.autoSelectSchemeId;
    }

    public SchemeSelectionSelect(String str, List<Scheme> list, String str2) {
        super(null);
        this.subtitle = str;
        this.schemes = list;
        this.autoSelectSchemeId = str2;
    }

    private final Scheme getAutoSelectedSchemeId() {
        ArrayList arrayList;
        List<Scheme> list = this.schemes;
        boolean z = false;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Boolean enabled = ((Scheme) obj).getEnabled();
                if (enabled != null ? enabled.booleanValue() : false) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && arrayList.size() == 1) {
            z = true;
        }
        if (z) {
            return (Scheme) CollectionsKt.first((List) arrayList);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public SchemeSelection intoDomain2() {
        ArrayList arrayList;
        String str = this.subtitle;
        List<Scheme> list = this.schemes;
        String id = null;
        if (list != null) {
            List<Scheme> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Scheme) it.next()).intoDomain2());
            }
        } else {
            arrayList = null;
        }
        String str2 = this.autoSelectSchemeId;
        if (str2 == null) {
            Scheme autoSelectedSchemeId = getAutoSelectedSchemeId();
            if (autoSelectedSchemeId != null) {
                id = autoSelectedSchemeId.getId();
            }
        } else {
            id = str2;
        }
        return new com.truelayer.payments.core.domain.experience.scheme.SchemeSelectionSelect(str, arrayList, id);
    }
}
