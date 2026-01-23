package com.robinhood.scarlet.util.resource;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import com.robinhood.enums.RhEnum;
import com.robinhood.enums.RhEnum2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.utils.extensions.ParcelableAdapter;
import com.robinhood.utils.extensions.Parcelables;
import com.robinhood.utils.extensions.Parcels;
import com.robinhood.utils.extensions.TypedValues;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: ResourceType.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\b\u0018\u0000 .*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001.B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u0004\u0018\u00018\u00002\n\u0010\u0011\u001a\u00060\u0012R\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014¢\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\u0004\u0018\u00018\u00002\n\u0010\u0011\u001a\u00060\u0012R\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J=\u0010 \u001a\u0004\u0018\u00018\u0000\"\b\b\u0001\u0010!*\u00020\"2\n\u0010\u0011\u001a\u00060\u0012R\u00020\u00132\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u0002H!0\u00042\u0006\u0010$\u001a\u0002H!H\u0014¢\u0006\u0002\u0010%J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010+\u001a\u00020\u0019HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/EnumResourceType;", "E", "", "Lcom/robinhood/enums/RhEnum;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Lcom/robinhood/utils/extensions/ParcelableAdapter;", "javaType", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getJavaType", "()Ljava/lang/Class;", "converter", "Lcom/robinhood/enums/RhEnum$Converter;", "getConverter$annotations", "()V", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ljava/lang/Enum;", "getResource", "resId", "", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Enum;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "convert", "C", "", "sourceType", "sourceValue", "(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Ljava/lang/Enum;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
final /* data */ class EnumResourceType<E extends Enum<E> & RhEnum<E>> extends ResourceType<E> implements ParcelableAdapter {

    @JvmField
    public static final Parcelable.Creator<EnumResourceType<?>> CREATOR;
    private final RhEnum.Converter<E> converter;
    private final Class<E> javaType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnumResourceType copy$default(EnumResourceType enumResourceType, Class cls, int i, Object obj) {
        if ((i & 1) != 0) {
            cls = enumResourceType.javaType;
        }
        return enumResourceType.copy(cls);
    }

    private static /* synthetic */ void getConverter$annotations() {
    }

    public final Class<E> component1() {
        return this.javaType;
    }

    public final EnumResourceType<E> copy(Class<E> javaType) {
        Intrinsics.checkNotNullParameter(javaType, "javaType");
        return new EnumResourceType<>(javaType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EnumResourceType) && Intrinsics.areEqual(this.javaType, ((EnumResourceType) other).javaType);
    }

    public int hashCode() {
        return this.javaType.hashCode();
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceType
    public String toString() {
        return "EnumResourceType(javaType=" + this.javaType + ")";
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public int describeContents() {
        return ParcelableAdapter.DefaultImpls.describeContents(this);
    }

    @Override // com.robinhood.scarlet.util.resource.ResourceType
    public Class<E> getJavaType() {
        return this.javaType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumResourceType(Class<E> javaType) {
        super(null);
        Intrinsics.checkNotNullParameter(javaType, "javaType");
        this.javaType = javaType;
        this.converter = RhEnum2.getConverter(getJavaType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect return type in method signature: (Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)TE; */
    @Override // com.robinhood.scarlet.util.resource.ResourceType
    public Enum readDirect(Resources.Theme theme, TypedValue value) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = value.type;
        PrimitiveRanges2 range_int = TypedValues.INSTANCE.getRANGE_INT();
        int first = range_int.getFirst();
        if (i <= range_int.getLast() && first <= i) {
            E[] enumConstants = getJavaType().getEnumConstants();
            Intrinsics.checkNotNull(enumConstants);
            return ((Enum[]) enumConstants)[value.data];
        }
        if (i == 3) {
            RhEnum.Converter<E> converter = this.converter;
            CharSequence charSequence = value.string;
            return converter.fromServerValue(charSequence != null ? charSequence.toString() : null);
        }
        if (i == 1) {
            return getResource(theme, value.resourceId);
        }
        throw new IllegalStateException(("Unexpected resource type for " + value + ": " + i).toString());
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/content/res/Resources$Theme;I)TE; */
    @Override // com.robinhood.scarlet.util.resource.ResourceType
    public Enum getResource(Resources.Theme theme, int resId) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(theme, "theme");
        String resourceTypeName = theme.getResources().getResourceTypeName(resId);
        if (Intrinsics.areEqual(resourceTypeName, "integer")) {
            E[] enumConstants = getJavaType().getEnumConstants();
            Intrinsics.checkNotNull(enumConstants);
            return ((Enum[]) enumConstants)[theme.getResources().getInteger(resId)];
        }
        if (Intrinsics.areEqual(resourceTypeName, "string")) {
            return this.converter.fromServerValue(theme.getResources().getString(resId));
        }
        throw new IllegalStateException(("Unexpected resource type for " + resId + " (" + theme.getResources().getResourceName(resId) + ")").toString());
    }

    @Override // android.os.Parcelable, com.robinhood.utils.extensions.ParcelableAdapter
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(getJavaType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect return type in method signature: <C:Ljava/lang/Object;>(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType<+TC;>;TC;)TE; */
    @Override // com.robinhood.scarlet.util.resource.ResourceType
    public Enum convert(Resources.Theme theme, ResourceType sourceType, Object sourceValue) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
        if (!Intrinsics.areEqual(sourceType, ResourceType.STRING.INSTANCE)) {
            return (Enum) super.convert(theme, (ResourceType<? extends ResourceType>) sourceType, (ResourceType) sourceValue);
        }
        Enum enumFromServerValue = this.converter.fromServerValue((String) sourceValue);
        Intrinsics.checkNotNull(enumFromServerValue);
        return enumFromServerValue;
    }

    static {
        Parcelables parcelables = Parcelables.INSTANCE;
        CREATOR = new Parcelable.Creator<EnumResourceType<?>>() { // from class: com.robinhood.scarlet.util.resource.EnumResourceType$special$$inlined$creator$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public EnumResourceType<?>[] newArray(int size) {
                return new EnumResourceType[size];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public EnumResourceType<?> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return (EnumResourceType) EnumResourceType.class.getConstructor(Class.class).newInstance(Parcels.readTypedSerializable(source));
            }
        };
    }
}
