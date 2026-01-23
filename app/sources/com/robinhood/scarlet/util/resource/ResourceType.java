package com.robinhood.scarlet.util.resource;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.android.graphics.Gradient3;
import com.robinhood.enums.RhEnum;
import com.robinhood.scarlet.util.Themes3;
import com.robinhood.utils.extensions.PrimitivesKt;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.Themes4;
import com.robinhood.utils.extensions.TypedValues;
import com.robinhood.utils.extensions.TypedValues2;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: ResourceType.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 1*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0010\"#$%&'()*+,-./01B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0001\u0010\u000b*\u00020\u00022\n\u0010\f\u001a\u00060\rR\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u00002\u0006\u0010\u0010\u001a\u0002H\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0001\u0010\u000b*\u00020\u00022\n\u0010\f\u001a\u00060\rR\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u000b0\u00002\u0006\u0010\u0010\u001a\u0002H\u000bH\u0014¢\u0006\u0002\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\n\u0010\f\u001a\u00060\rR\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J#\u0010\u001b\u001a\u0004\u0018\u00018\u00002\n\u0010\f\u001a\u00060\rR\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0014¢\u0006\u0002\u0010\u0017J%\u0010\u001c\u001a\u0004\u0018\u00018\u00002\n\u0010\f\u001a\u00060\rR\u00020\u000e2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0016R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0018\u001a\u00020\u0016X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u001023456789:;<=>?@A¨\u0006B"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType;", "T", "", "Landroid/os/Parcelable;", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "convertFrom", "C", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "sourceType", "sourceValue", "convertFrom$lib_scarlet_externalRelease", "(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Ljava/lang/Object;", "convert", "readFrom", "value", "Landroid/util/TypedValue;", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ljava/lang/Object;", "tempValue", "getTempValue", "()Landroid/util/TypedValue;", "readDirect", "getResource", "resId", "", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Object;", "toString", "", "STRING", "FLOAT", "DIMENSION", "INTEGER", "BOOLEAN", "COLOR", "COLOR_STATE_LIST", "DRAWABLE", "RESOURCE_ID", "STYLE", "RAW", "GRADIENT", "NOTHING", "ARRAY", "DYNAMIC", "Companion", "Lcom/robinhood/scarlet/util/resource/EnumResourceType;", "Lcom/robinhood/scarlet/util/resource/ResourceType$ARRAY;", "Lcom/robinhood/scarlet/util/resource/ResourceType$BOOLEAN;", "Lcom/robinhood/scarlet/util/resource/ResourceType$COLOR;", "Lcom/robinhood/scarlet/util/resource/ResourceType$COLOR_STATE_LIST;", "Lcom/robinhood/scarlet/util/resource/ResourceType$DIMENSION;", "Lcom/robinhood/scarlet/util/resource/ResourceType$DRAWABLE;", "Lcom/robinhood/scarlet/util/resource/ResourceType$DYNAMIC;", "Lcom/robinhood/scarlet/util/resource/ResourceType$FLOAT;", "Lcom/robinhood/scarlet/util/resource/ResourceType$GRADIENT;", "Lcom/robinhood/scarlet/util/resource/ResourceType$INTEGER;", "Lcom/robinhood/scarlet/util/resource/ResourceType$NOTHING;", "Lcom/robinhood/scarlet/util/resource/ResourceType$RAW;", "Lcom/robinhood/scarlet/util/resource/ResourceType$RESOURCE_ID;", "Lcom/robinhood/scarlet/util/resource/ResourceType$STRING;", "Lcom/robinhood/scarlet/util/resource/ResourceType$STYLE;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public abstract class ResourceType<T> implements Parcelable {
    private final TypedValue tempValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ResourceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Class<T> getJavaType();

    private ResourceType() {
        this.tempValue = new TypedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <C> T convertFrom$lib_scarlet_externalRelease(Resources.Theme theme, ResourceType<? extends C> sourceType, C sourceValue) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
        if (Intrinsics.areEqual(sourceType, this)) {
            return sourceValue;
        }
        if (!Intrinsics.areEqual(sourceType, RESOURCE_ID.INSTANCE)) {
            return Intrinsics.areEqual(sourceType, DYNAMIC.INSTANCE) ? (T) readFrom(theme, (TypedValue) sourceValue) : (T) convert(theme, sourceType, sourceValue);
        }
        Companion companion = INSTANCE;
        String resourceTypeName = theme.getResources().getResourceTypeName(((Integer) sourceValue).intValue());
        Intrinsics.checkNotNullExpressionValue(resourceTypeName, "getResourceTypeName(...)");
        ResourceType<?> resourceTypeFrom = companion.from(resourceTypeName);
        Intrinsics.checkNotNull(resourceTypeFrom, "null cannot be cast to non-null type com.robinhood.scarlet.util.resource.ResourceType<kotlin.Any>");
        Object resource = resourceTypeFrom.getResource(theme, ((Number) sourceValue).intValue());
        if (resource != null) {
            return (T) convertFrom$lib_scarlet_externalRelease(theme, resourceTypeFrom, resource);
        }
        return null;
    }

    protected <C> T convert(Resources.Theme theme, ResourceType<? extends C> sourceType, C sourceValue) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
        throw new UnsupportedOperationException("Don't know how to convert " + sourceType + " value " + sourceValue + " into " + this);
    }

    public final T readFrom(Resources.Theme theme, TypedValue value) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = value.type;
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return getResource(theme, value.data);
        }
        if (i == 2) {
            TypedValue typedValueResolveAttribute$default = Themes3.resolveAttribute$default(theme, value.data, false, 2, null);
            if (typedValueResolveAttribute$default != null) {
                return readFrom(theme, typedValueResolveAttribute$default);
            }
            return null;
        }
        int i2 = value.resourceId;
        if (i2 == 0) {
            return readDirect(theme, value);
        }
        return getResource(theme, i2);
    }

    protected final TypedValue getTempValue() {
        return this.tempValue;
    }

    protected T readDirect(Resources.Theme theme, TypedValue value) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException(this + ": don't know how to read " + value);
    }

    public T getResource(Resources.Theme theme, int resId) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(theme, "theme");
        throw new UnsupportedOperationException(this + ": don't know how to read " + theme.getResources().getResourceName(resId));
    }

    public String toString() {
        return "ResourceType." + getClass().getSimpleName();
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u001e\u0010\u000f\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$STRING;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "getResource", "resId", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class STRING extends ResourceType<CharSequence> {
        public static final STRING INSTANCE = new STRING();
        public static final int $stable = 8;
        public static final Parcelable.Creator<STRING> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<STRING> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final STRING createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return STRING.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final STRING[] newArray(int i) {
                return new STRING[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private STRING() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<CharSequence> getJavaType() {
            return CharSequence.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public CharSequence readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            CharSequence string2 = value.string;
            Intrinsics.checkNotNullExpressionValue(string2, "string");
            return string2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public CharSequence getResource(Resources.Theme theme, int resId) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(theme, "theme");
            CharSequence text = theme.getResources().getText(resId);
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return text;
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$FLOAT;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ljava/lang/Float;", "getResource", "resId", "", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Float;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FLOAT extends ResourceType<Float> {
        public static final FLOAT INSTANCE = new FLOAT();
        public static final int $stable = 8;
        public static final Parcelable.Creator<FLOAT> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FLOAT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FLOAT createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FLOAT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FLOAT[] newArray(int i) {
                return new FLOAT[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private FLOAT() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<Float> getJavaType() {
            return Float.TYPE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Float readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return Float.valueOf(value.getFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Float getResource(Resources.Theme theme, int resId) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(theme, "theme");
            theme.getResources().getValue(resId, getTempValue(), true);
            return Float.valueOf(getTempValue().getFloat());
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$DIMENSION;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ljava/lang/Float;", "getResource", "resId", "", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Float;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DIMENSION extends ResourceType<Float> {
        public static final DIMENSION INSTANCE = new DIMENSION();
        public static final int $stable = 8;
        public static final Parcelable.Creator<DIMENSION> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DIMENSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DIMENSION createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DIMENSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DIMENSION[] newArray(int i) {
                return new DIMENSION[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private DIMENSION() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<Float> getJavaType() {
            return Float.TYPE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Float readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return Float.valueOf(value.getDimension(theme.getResources().getDisplayMetrics()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Float getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return Float.valueOf(theme.getResources().getDimension(resId));
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$INTEGER;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ljava/lang/Integer;", "getResource", "resId", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class INTEGER extends ResourceType<Integer> {
        public static final INTEGER INSTANCE = new INTEGER();
        public static final int $stable = 8;
        public static final Parcelable.Creator<INTEGER> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<INTEGER> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INTEGER createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return INTEGER.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INTEGER[] newArray(int i) {
                return new INTEGER[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private INTEGER() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<Integer> getJavaType() {
            return Integer.TYPE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Integer readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return Integer.valueOf(value.data);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Integer getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return Integer.valueOf(theme.getResources().getInteger(resId));
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J=\u0010\u0014\u001a\u0004\u0018\u00010\u0002\"\b\b\u0001\u0010\u0015*\u00020\u00162\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00150\u00012\u0006\u0010\u0018\u001a\u0002H\u0015H\u0014¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0012J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$BOOLEAN;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ljava/lang/Boolean;", "getResource", "resId", "", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Boolean;", "convert", "C", "", "sourceType", "sourceValue", "(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Ljava/lang/Boolean;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BOOLEAN extends ResourceType<Boolean> {
        public static final BOOLEAN INSTANCE = new BOOLEAN();
        public static final int $stable = 8;
        public static final Parcelable.Creator<BOOLEAN> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BOOLEAN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BOOLEAN createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BOOLEAN.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BOOLEAN[] newArray(int i) {
                return new BOOLEAN[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public /* bridge */ /* synthetic */ Boolean convert(Resources.Theme theme, ResourceType resourceType, Object obj) {
            return convert(theme, (ResourceType<? extends ResourceType>) resourceType, (ResourceType) obj);
        }

        private BOOLEAN() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<Boolean> getJavaType() {
            return Boolean.TYPE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Boolean readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return Boolean.valueOf(PrimitivesKt.toBoolean$default(value.data, false, 1, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Boolean getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return Boolean.valueOf(theme.getResources().getBoolean(resId));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        protected <C> Boolean convert(Resources.Theme theme, ResourceType<? extends C> sourceType, C sourceValue) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
            if (Intrinsics.areEqual(sourceType, INTEGER.INSTANCE) || Intrinsics.areEqual(sourceType, COLOR.INSTANCE)) {
                return Boolean.valueOf(PrimitivesKt.toBoolean(((Integer) sourceValue).intValue(), true));
            }
            return (Boolean) super.convert(theme, (ResourceType<? extends ResourceType<? extends C>>) sourceType, (ResourceType<? extends C>) sourceValue);
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0012J=\u0010\u0013\u001a\u0004\u0018\u00010\u0002\"\b\b\u0001\u0010\u0014*\u00020\u00152\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00140\u00012\u0006\u0010\u0017\u001a\u0002H\u0014H\u0014¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$COLOR;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ljava/lang/Integer;", "getResource", "resId", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;", "convert", "C", "", "sourceType", "sourceValue", "(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class COLOR extends ResourceType<Integer> {
        public static final COLOR INSTANCE = new COLOR();
        public static final int $stable = 8;
        public static final Parcelable.Creator<COLOR> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<COLOR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final COLOR createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return COLOR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final COLOR[] newArray(int i) {
                return new COLOR[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public /* bridge */ /* synthetic */ Integer convert(Resources.Theme theme, ResourceType resourceType, Object obj) {
            return convert(theme, (ResourceType<? extends ResourceType>) resourceType, (ResourceType) obj);
        }

        private COLOR() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<Integer> getJavaType() {
            return Integer.TYPE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Integer readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return Integer.valueOf(value.data);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Integer getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return Integer.valueOf(Themes4.getColor(theme, resId));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        protected <C> Integer convert(Resources.Theme theme, ResourceType<? extends C> sourceType, C sourceValue) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
            return Intrinsics.areEqual(sourceType, COLOR_STATE_LIST.INSTANCE) ? Integer.valueOf(((ColorStateList) sourceValue).getDefaultColor()) : Intrinsics.areEqual(sourceType, INTEGER.INSTANCE) ? (Integer) sourceValue : (Integer) super.convert(theme, (ResourceType<? extends ResourceType<? extends C>>) sourceType, (ResourceType<? extends C>) sourceValue);
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u001c\u0010\u000f\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J=\u0010\u0012\u001a\u0004\u0018\u00010\u0002\"\b\b\u0001\u0010\u0013*\u00020\u00142\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00130\u00012\u0006\u0010\u0016\u001a\u0002H\u0013H\u0014¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0011J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$COLOR_STATE_LIST;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Landroid/content/res/ColorStateList;", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "getResource", "resId", "", "convert", "C", "", "sourceType", "sourceValue", "(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Landroid/content/res/ColorStateList;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class COLOR_STATE_LIST extends ResourceType<ColorStateList> {
        public static final COLOR_STATE_LIST INSTANCE = new COLOR_STATE_LIST();
        public static final int $stable = 8;
        public static final Parcelable.Creator<COLOR_STATE_LIST> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<COLOR_STATE_LIST> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final COLOR_STATE_LIST createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return COLOR_STATE_LIST.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final COLOR_STATE_LIST[] newArray(int i) {
                return new COLOR_STATE_LIST[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public /* bridge */ /* synthetic */ ColorStateList convert(Resources.Theme theme, ResourceType resourceType, Object obj) {
            return convert(theme, (ResourceType<? extends ResourceType>) resourceType, (ResourceType) obj);
        }

        private COLOR_STATE_LIST() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<ColorStateList> getJavaType() {
            return ColorStateList.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public ColorStateList readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            int i = value.type;
            PrimitiveRanges2 range_color = TypedValues.INSTANCE.getRANGE_COLOR();
            int first = range_color.getFirst();
            if (i <= range_color.getLast() && first <= i) {
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(value.data);
                Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                return colorStateListValueOf;
            }
            if (i == 3) {
                return Themes4.getColorStateList(theme, value.resourceId);
            }
            throw new UnsupportedOperationException("Unexpected type for ColorStateList: " + value);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public ColorStateList getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return Themes4.getColorStateList(theme, resId);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        protected <C> ColorStateList convert(Resources.Theme theme, ResourceType<? extends C> sourceType, C sourceValue) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
            if (!Intrinsics.areEqual(sourceType, COLOR.INSTANCE) && !Intrinsics.areEqual(sourceType, INTEGER.INSTANCE)) {
                return (ColorStateList) super.convert(theme, (ResourceType<? extends ResourceType<? extends C>>) sourceType, (ResourceType<? extends C>) sourceValue);
            }
            return ColorStateList.valueOf(((Integer) sourceValue).intValue());
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J=\u0010\u0012\u001a\u0004\u0018\u00010\u0002\"\b\b\u0001\u0010\u0013*\u00020\u00142\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00130\u00012\u0006\u0010\u0016\u001a\u0002H\u0013H\u0014¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$DRAWABLE;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "getResource", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "resId", "", "readDirect", "value", "Landroid/util/TypedValue;", "convert", "C", "", "sourceType", "sourceValue", "(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DRAWABLE extends ResourceType<Drawable> {
        public static final DRAWABLE INSTANCE = new DRAWABLE();
        public static final int $stable = 8;
        public static final Parcelable.Creator<DRAWABLE> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DRAWABLE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DRAWABLE createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DRAWABLE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DRAWABLE[] newArray(int i) {
                return new DRAWABLE[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public /* bridge */ /* synthetic */ Drawable convert(Resources.Theme theme, ResourceType resourceType, Object obj) {
            return convert(theme, (ResourceType<? extends ResourceType>) resourceType, (ResourceType) obj);
        }

        private DRAWABLE() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<Drawable> getJavaType() {
            return Drawable.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Drawable getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return theme.getDrawable(resId);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Drawable readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return TypedValues2.isColorInt(value) ? new ColorDrawable(value.data) : (Drawable) super.readDirect(theme, value);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        protected <C> Drawable convert(Resources.Theme theme, ResourceType<? extends C> sourceType, C sourceValue) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
            if (Intrinsics.areEqual(sourceType, COLOR_STATE_LIST.INSTANCE)) {
                if (Build.VERSION.SDK_INT < 29) {
                    return new ColorDrawable(((ColorStateList) sourceValue).getDefaultColor());
                }
                ResourceType$DRAWABLE$$ExternalSyntheticApiModelOutline1.m2749m();
                return ResourceType$DRAWABLE$$ExternalSyntheticApiModelOutline0.m2748m((ColorStateList) sourceValue);
            }
            if (!Intrinsics.areEqual(sourceType, COLOR.INSTANCE) && !Intrinsics.areEqual(sourceType, INTEGER.INSTANCE)) {
                return (Drawable) super.convert(theme, (ResourceType<? extends ResourceType<? extends C>>) sourceType, (ResourceType<? extends C>) sourceValue);
            }
            return new ColorDrawable(((Integer) sourceValue).intValue());
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0015¢\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0002\u0010\u0012J=\u0010\u0013\u001a\u0004\u0018\u00010\u0002\"\b\b\u0001\u0010\u0014*\u00020\u00152\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00140\u00012\u0006\u0010\u0017\u001a\u0002H\u0014H\u0014¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$RESOURCE_ID;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)Ljava/lang/Integer;", "getResource", "resId", "(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;", "convert", "C", "", "sourceType", "sourceValue", "(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RESOURCE_ID extends ResourceType<Integer> {
        public static final RESOURCE_ID INSTANCE = new RESOURCE_ID();
        public static final int $stable = 8;
        public static final Parcelable.Creator<RESOURCE_ID> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RESOURCE_ID> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RESOURCE_ID createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RESOURCE_ID.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RESOURCE_ID[] newArray(int i) {
                return new RESOURCE_ID[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public /* bridge */ /* synthetic */ Integer convert(Resources.Theme theme, ResourceType resourceType, Object obj) {
            return convert(theme, (ResourceType<? extends ResourceType>) resourceType, (ResourceType) obj);
        }

        private RESOURCE_ID() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<Integer> getJavaType() {
            return Integer.TYPE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Integer readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return Integer.valueOf(value.data);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Integer getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return Integer.valueOf(resId);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        protected <C> Integer convert(Resources.Theme theme, ResourceType<? extends C> sourceType, C sourceValue) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
            return Intrinsics.areEqual(sourceType, ARRAY.INSTANCE) ? Integer.valueOf(((ArrayResource) sourceValue).getResId()) : Intrinsics.areEqual(sourceType, STYLE.INSTANCE) ? Integer.valueOf(((StyleResource) sourceValue).getResId()) : Intrinsics.areEqual(sourceType, RAW.INSTANCE) ? Integer.valueOf(((RawResource) sourceValue).getResId()) : (Integer) super.convert(theme, (ResourceType<? extends ResourceType<? extends C>>) sourceType, (ResourceType<? extends C>) sourceValue);
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u001c\u0010\u000f\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$STYLE;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "getResource", "resId", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class STYLE extends ResourceType<StyleResource> {
        public static final STYLE INSTANCE = new STYLE();
        public static final int $stable = 8;
        public static final Parcelable.Creator<STYLE> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<STYLE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final STYLE createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return STYLE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final STYLE[] newArray(int i) {
                return new STYLE[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private STYLE() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<StyleResource> getJavaType() {
            return StyleResource.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public StyleResource readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return new StyleResource(value.data);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public StyleResource getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new StyleResource(resId);
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u001c\u0010\u000f\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$RAW;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Lcom/robinhood/scarlet/util/resource/RawResource;", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "getResource", "resId", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RAW extends ResourceType<RawResource> {
        public static final RAW INSTANCE = new RAW();
        public static final int $stable = 8;
        public static final Parcelable.Creator<RAW> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RAW> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RAW createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RAW.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RAW[] newArray(int i) {
                return new RAW[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private RAW() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<RawResource> getJavaType() {
            return RawResource.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public RawResource readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return new RawResource(value.data);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public RawResource getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new RawResource(resId);
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u001c\u0010\u000f\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J=\u0010\u0012\u001a\u0004\u0018\u00010\u0002\"\b\b\u0001\u0010\u0013*\u00020\u00142\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00130\u00012\u0006\u0010\u0016\u001a\u0002H\u0013H\u0014¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0011J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$GRADIENT;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Lcom/robinhood/android/graphics/Gradient;", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "getResource", "resId", "", "convert", "C", "", "sourceType", "sourceValue", "(Landroid/content/res/Resources$Theme;Lcom/robinhood/scarlet/util/resource/ResourceType;Ljava/lang/Object;)Lcom/robinhood/android/graphics/Gradient;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GRADIENT extends ResourceType<Gradient> {
        public static final GRADIENT INSTANCE = new GRADIENT();
        public static final int $stable = 8;
        public static final Parcelable.Creator<GRADIENT> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<GRADIENT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GRADIENT createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GRADIENT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GRADIENT[] newArray(int i) {
                return new GRADIENT[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public /* bridge */ /* synthetic */ Gradient convert(Resources.Theme theme, ResourceType resourceType, Object obj) {
            return convert(theme, (ResourceType<? extends ResourceType>) resourceType, (ResourceType) obj);
        }

        private GRADIENT() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<Gradient> getJavaType() {
            return Gradient.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Gradient readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return Gradient.INSTANCE.fromTypedValue(theme, value);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Gradient getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return Gradient3.getGradient(theme, resId);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        protected <C> Gradient convert(Resources.Theme theme, ResourceType<? extends C> sourceType, C sourceValue) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(sourceValue, "sourceValue");
            if (Intrinsics.areEqual(sourceType, ARRAY.INSTANCE)) {
                return getResource(theme, ((ArrayResource) sourceValue).getResId());
            }
            if (Intrinsics.areEqual(sourceType, COLOR.INSTANCE) || Intrinsics.areEqual(sourceType, INTEGER.INSTANCE)) {
                return Gradient.INSTANCE.m2057of(((Integer) sourceValue).intValue());
            }
            return Intrinsics.areEqual(sourceType, COLOR_STATE_LIST.INSTANCE) ? Gradient.INSTANCE.m2057of(((ColorStateList) sourceValue).getDefaultColor()) : (Gradient) super.convert(theme, (ResourceType<? extends ResourceType<? extends C>>) sourceType, (ResourceType<? extends C>) sourceValue);
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0010\u000b\u001a\u00060\fR\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u001c\u0010\u0010\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\fR\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$NOTHING;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "throwUnsupported", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "getResource", "resId", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NOTHING extends ResourceType {
        public static final NOTHING INSTANCE = new NOTHING();
        public static final int $stable = 8;
        public static final Parcelable.Creator<NOTHING> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<NOTHING> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NOTHING createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NOTHING.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NOTHING[] newArray(int i) {
                return new NOTHING[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Void readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private NOTHING() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class getJavaType() {
            return Void.class;
        }

        private final Void throwUnsupported() {
            throw new UnsupportedOperationException(this + " resource types cannot have a value");
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Void getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            throwUnsupported();
            throw new ExceptionsH();
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u001c\u0010\u000f\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$ARRAY;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Lcom/robinhood/scarlet/util/resource/ArrayResource;", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "Landroid/util/TypedValue;", "getResource", "resId", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class ARRAY extends ResourceType<ArrayResource> {
        public static final ARRAY INSTANCE = new ARRAY();
        public static final int $stable = 8;
        public static final Parcelable.Creator<ARRAY> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ARRAY> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ARRAY createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ARRAY.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ARRAY[] newArray(int i) {
                return new ARRAY[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ARRAY() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<ArrayResource> getJavaType() {
            return ArrayResource.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public ArrayResource readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            return new ArrayResource(value.data);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public ArrayResource getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new ArrayResource(resId);
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u001c\u0010\u000e\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$DYNAMIC;", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "Landroid/util/TypedValue;", "<init>", "()V", "javaType", "Ljava/lang/Class;", "getJavaType", "()Ljava/lang/Class;", "readDirect", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "value", "getResource", "resId", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DYNAMIC extends ResourceType<TypedValue> {
        public static final DYNAMIC INSTANCE = new DYNAMIC();
        public static final int $stable = 8;
        public static final Parcelable.Creator<DYNAMIC> CREATOR = new Creator();

        /* compiled from: ResourceType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DYNAMIC> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DYNAMIC createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DYNAMIC.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DYNAMIC[] newArray(int i) {
                return new DYNAMIC[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private DYNAMIC() {
            super(null);
        }

        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public Class<TypedValue> getJavaType() {
            return TypedValue.class;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public TypedValue readDirect(Resources.Theme theme, TypedValue value) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(value, "value");
            TypedValue typedValue = new TypedValue();
            typedValue.setTo(value);
            return typedValue;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.scarlet.util.resource.ResourceType
        public TypedValue getResource(Resources.Theme theme, int resId) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            TypedValue typedValue = new TypedValue();
            typedValue.type = 1;
            typedValue.data = resId;
            typedValue.resourceId = resId;
            return typedValue;
        }
    }

    /* compiled from: ResourceType.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0018\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0007*\b\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nJ+\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u001a\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0007*\b\u0012\u0004\u0012\u0002H\u00060\bH\u0086\bJ\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/scarlet/util/resource/ResourceType$Companion;", "", "<init>", "()V", "ofEnum", "Lcom/robinhood/scarlet/util/resource/ResourceType;", "E", "", "Lcom/robinhood/enums/RhEnum;", "javaType", "Ljava/lang/Class;", "from", "typeName", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <E extends Enum<E> & RhEnum<E>> ResourceType<E> ofEnum(Class<E> javaType) {
            Intrinsics.checkNotNullParameter(javaType, "javaType");
            return new ResourceType2(javaType);
        }

        public final /* synthetic */ <E extends Enum<E> & RhEnum<E>> ResourceType<E> ofEnum() {
            Intrinsics.reifiedOperationMarker(4, "E");
            return ofEnum(Enum.class);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ResourceType<?> from(String typeName) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            switch (typeName.hashCode()) {
                case -891985903:
                    if (typeName.equals("string")) {
                        return STRING.INSTANCE;
                    }
                    break;
                case -826507106:
                    if (typeName.equals(ResourceTypes.DRAWABLE)) {
                        return DRAWABLE.INSTANCE;
                    }
                    break;
                case 3355:
                    if (typeName.equals("id")) {
                        return RESOURCE_ID.INSTANCE;
                    }
                    break;
                case 112680:
                    if (typeName.equals(ResourceTypes.RAW)) {
                        return RAW.INSTANCE;
                    }
                    break;
                case 93090393:
                    if (typeName.equals(ResourceTypes.ARRAY)) {
                        return ARRAY.INSTANCE;
                    }
                    break;
                case 94842723:
                    if (typeName.equals(ResourceTypes.COLOR)) {
                        return COLOR_STATE_LIST.INSTANCE;
                    }
                    break;
                case 95588145:
                    if (typeName.equals(ResourceTypes.DIMENSION)) {
                        return DIMENSION.INSTANCE;
                    }
                    break;
                case 97526364:
                    if (typeName.equals("float")) {
                        return FLOAT.INSTANCE;
                    }
                    break;
                case 109780401:
                    if (typeName.equals(ResourceTypes.STYLE)) {
                        return STYLE.INSTANCE;
                    }
                    break;
                case 1958052158:
                    if (typeName.equals("integer")) {
                        return INTEGER.INSTANCE;
                    }
                    break;
            }
            throw new Standard2("Unsupported resource type: " + typeName);
        }
    }
}
