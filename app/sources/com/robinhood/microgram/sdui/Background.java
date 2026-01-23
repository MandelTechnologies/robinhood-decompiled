package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.LinearGradientColor;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Background.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/Background;", "Landroid/os/Parcelable;", "Solid", "Gradient", "AdapterModule", "Lcom/robinhood/microgram/sdui/Background$Gradient;", "Lcom/robinhood/microgram/sdui/Background$Solid;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Background extends Parcelable {

    /* compiled from: Background.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/Background$Solid;", "Lcom/robinhood/microgram/sdui/Background;", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;)V", "getColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Solid implements Background {

        /* renamed from: default, reason: not valid java name */
        private static final Solid f9362default;
        private final ThemedColor color;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Solid> CREATOR = new Creator();

        /* compiled from: Background.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<Solid> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Solid createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Solid((ThemedColor) parcel.readParcelable(Solid.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Solid[] newArray(int i) {
                return new Solid[i];
            }
        }

        public static /* synthetic */ Solid copy$default(Solid solid, ThemedColor themedColor, int i, Object obj) {
            if ((i & 1) != 0) {
                themedColor = solid.color;
            }
            return solid.copy(themedColor);
        }

        /* renamed from: component1, reason: from getter */
        public final ThemedColor getColor() {
            return this.color;
        }

        public final Solid copy(@Json(name = ResourceTypes.COLOR) ThemedColor color) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new Solid(color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Solid) && Intrinsics.areEqual(this.color, ((Solid) other).color);
        }

        public int hashCode() {
            return this.color.hashCode();
        }

        public String toString() {
            return "Solid(color=" + this.color + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.color, flags);
        }

        public Solid(@Json(name = ResourceTypes.COLOR) ThemedColor color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
        }

        public final ThemedColor getColor() {
            return this.color;
        }

        /* compiled from: Background.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/Background$Solid$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/microgram/sdui/Background$Solid;", "getDefault", "()Lcom/robinhood/microgram/sdui/Background$Solid;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Solid getDefault() {
                return Solid.f9362default;
            }
        }

        static {
            Color color = Color.f5843BG;
            f9362default = new Solid(new ThemedColor(color, color));
        }
    }

    /* compiled from: Background.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/Background$Gradient;", "Lcom/robinhood/microgram/sdui/Background;", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;)V", "getColor", "()Lcom/robinhood/models/serverdriven/experimental/api/LinearGradientColor;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Gradient implements Background {
        public static final Parcelable.Creator<Gradient> CREATOR = new Creator();
        private final LinearGradientColor color;

        /* compiled from: Background.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<Gradient> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gradient createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gradient((LinearGradientColor) parcel.readParcelable(Gradient.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gradient[] newArray(int i) {
                return new Gradient[i];
            }
        }

        public static /* synthetic */ Gradient copy$default(Gradient gradient, LinearGradientColor linearGradientColor, int i, Object obj) {
            if ((i & 1) != 0) {
                linearGradientColor = gradient.color;
            }
            return gradient.copy(linearGradientColor);
        }

        /* renamed from: component1, reason: from getter */
        public final LinearGradientColor getColor() {
            return this.color;
        }

        public final Gradient copy(@Json(name = ResourceTypes.COLOR) LinearGradientColor color) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new Gradient(color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Gradient) && Intrinsics.areEqual(this.color, ((Gradient) other).color);
        }

        public int hashCode() {
            return this.color.hashCode();
        }

        public String toString() {
            return "Gradient(color=" + this.color + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.color, flags);
        }

        public Gradient(@Json(name = ResourceTypes.COLOR) LinearGradientColor color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
        }

        public final LinearGradientColor getColor() {
            return this.color;
        }
    }

    /* compiled from: Background.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/Background$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(Background.class, "background_type").withSubtype(Solid.class, "SOLID_COLOR").withSubtype(Gradient.class, "GRADIENT_COLOR");
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
            return polymorphicJsonAdapterFactoryWithSubtype;
        }
    }
}
