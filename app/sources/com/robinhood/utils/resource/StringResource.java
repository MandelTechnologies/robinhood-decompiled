package com.robinhood.utils.resource;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringResource.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦\u0002J\b\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/utils/resource/StringResource;", "Landroid/os/Parcelable;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "getText", "", "resources", "Landroid/content/res/Resources;", "FromString", "FromResource", "FromPluralsResource", "PluralsResource", "Join", "Companion", "Lcom/robinhood/utils/resource/StringResource$FromPluralsResource;", "Lcom/robinhood/utils/resource/StringResource$FromResource;", "Lcom/robinhood/utils/resource/StringResource$FromString;", "Lcom/robinhood/utils/resource/StringResource$Join;", "lib-utils-resource_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class StringResource implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ StringResource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean equals(Object other);

    public abstract int hashCode();

    private StringResource() {
    }

    /* compiled from: StringResource.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/utils/resource/StringResource$FromString;", "Lcom/robinhood/utils/resource/StringResource;", "string", "", "<init>", "(Ljava/lang/CharSequence;)V", "getString", "()Ljava/lang/CharSequence;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-utils-resource_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FromString extends StringResource {
        public static final int $stable = 8;
        public static final Parcelable.Creator<FromString> CREATOR = new Creator();
        private final CharSequence string;

        /* compiled from: StringResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FromString> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromString createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromString((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromString[] newArray(int i) {
                return new FromString[i];
            }
        }

        public static /* synthetic */ FromString copy$default(FromString fromString, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = fromString.string;
            }
            return fromString.copy(charSequence);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getString() {
            return this.string;
        }

        public final FromString copy(CharSequence string2) {
            Intrinsics.checkNotNullParameter(string2, "string");
            return new FromString(string2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.robinhood.utils.resource.StringResource
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FromString) && Intrinsics.areEqual(this.string, ((FromString) other).string);
        }

        @Override // com.robinhood.utils.resource.StringResource
        public int hashCode() {
            return this.string.hashCode();
        }

        public String toString() {
            return "FromString(string=" + ((Object) this.string) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            TextUtils.writeToParcel(this.string, dest, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromString(CharSequence string2) {
            super(null);
            Intrinsics.checkNotNullParameter(string2, "string");
            this.string = string2;
        }

        public final CharSequence getString() {
            return this.string;
        }
    }

    /* compiled from: StringResource.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/utils/resource/StringResource$FromResource;", "Lcom/robinhood/utils/resource/StringResource;", "", "stringId", "", "", "args", "<init>", "(ILjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/robinhood/utils/resource/StringResource$FromResource;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStringId", "Ljava/util/List;", "getArgs", "lib-utils-resource_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FromResource extends StringResource {
        public static final int $stable = 8;
        public static final Parcelable.Creator<FromResource> CREATOR = new Creator();
        private final List<Object> args;
        private final int stringId;

        /* compiled from: StringResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FromResource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromResource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(parcel.readValue(FromResource.class.getClassLoader()));
                }
                return new FromResource(i, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromResource[] newArray(int i) {
                return new FromResource[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FromResource copy$default(FromResource fromResource, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fromResource.stringId;
            }
            if ((i2 & 2) != 0) {
                list = fromResource.args;
            }
            return fromResource.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStringId() {
            return this.stringId;
        }

        public final List<Object> component2() {
            return this.args;
        }

        public final FromResource copy(int stringId, List<? extends Object> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new FromResource(stringId, args);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.robinhood.utils.resource.StringResource
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromResource)) {
                return false;
            }
            FromResource fromResource = (FromResource) other;
            return this.stringId == fromResource.stringId && Intrinsics.areEqual(this.args, fromResource.args);
        }

        @Override // com.robinhood.utils.resource.StringResource
        public int hashCode() {
            return (Integer.hashCode(this.stringId) * 31) + this.args.hashCode();
        }

        public String toString() {
            return "FromResource(stringId=" + this.stringId + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.stringId);
            List<Object> list = this.args;
            dest.writeInt(list.size());
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                dest.writeValue(it.next());
            }
        }

        public final int getStringId() {
            return this.stringId;
        }

        public final List<Object> getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromResource(int i, List<? extends Object> args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.stringId = i;
            this.args = args;
        }
    }

    /* compiled from: StringResource.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/utils/resource/StringResource$FromPluralsResource;", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/utils/resource/StringResource$PluralsResource;", "pluralsRes", "", "", "args", "<init>", "(Lcom/robinhood/utils/resource/StringResource$PluralsResource;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/utils/resource/StringResource$PluralsResource;", "component2", "()Ljava/util/List;", "copy", "(Lcom/robinhood/utils/resource/StringResource$PluralsResource;Ljava/util/List;)Lcom/robinhood/utils/resource/StringResource$FromPluralsResource;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/utils/resource/StringResource$PluralsResource;", "getPluralsRes", "Ljava/util/List;", "getArgs", "lib-utils-resource_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FromPluralsResource extends StringResource {
        public static final int $stable = 8;
        public static final Parcelable.Creator<FromPluralsResource> CREATOR = new Creator();
        private final List<Object> args;
        private final PluralsResource pluralsRes;

        /* compiled from: StringResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FromPluralsResource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromPluralsResource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PluralsResource pluralsResourceCreateFromParcel = PluralsResource.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readValue(FromPluralsResource.class.getClassLoader()));
                }
                return new FromPluralsResource(pluralsResourceCreateFromParcel, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromPluralsResource[] newArray(int i) {
                return new FromPluralsResource[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FromPluralsResource copy$default(FromPluralsResource fromPluralsResource, PluralsResource pluralsResource, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                pluralsResource = fromPluralsResource.pluralsRes;
            }
            if ((i & 2) != 0) {
                list = fromPluralsResource.args;
            }
            return fromPluralsResource.copy(pluralsResource, list);
        }

        /* renamed from: component1, reason: from getter */
        public final PluralsResource getPluralsRes() {
            return this.pluralsRes;
        }

        public final List<Object> component2() {
            return this.args;
        }

        public final FromPluralsResource copy(PluralsResource pluralsRes, List<? extends Object> args) {
            Intrinsics.checkNotNullParameter(pluralsRes, "pluralsRes");
            Intrinsics.checkNotNullParameter(args, "args");
            return new FromPluralsResource(pluralsRes, args);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.robinhood.utils.resource.StringResource
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromPluralsResource)) {
                return false;
            }
            FromPluralsResource fromPluralsResource = (FromPluralsResource) other;
            return Intrinsics.areEqual(this.pluralsRes, fromPluralsResource.pluralsRes) && Intrinsics.areEqual(this.args, fromPluralsResource.args);
        }

        @Override // com.robinhood.utils.resource.StringResource
        public int hashCode() {
            return (this.pluralsRes.hashCode() * 31) + this.args.hashCode();
        }

        public String toString() {
            return "FromPluralsResource(pluralsRes=" + this.pluralsRes + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.pluralsRes.writeToParcel(dest, flags);
            List<Object> list = this.args;
            dest.writeInt(list.size());
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                dest.writeValue(it.next());
            }
        }

        public final PluralsResource getPluralsRes() {
            return this.pluralsRes;
        }

        public final List<Object> getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromPluralsResource(PluralsResource pluralsRes, List<? extends Object> args) {
            super(null);
            Intrinsics.checkNotNullParameter(pluralsRes, "pluralsRes");
            Intrinsics.checkNotNullParameter(args, "args");
            this.pluralsRes = pluralsRes;
            this.args = args;
        }
    }

    /* compiled from: StringResource.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/utils/resource/StringResource$PluralsResource;", "Landroid/os/Parcelable;", "resId", "", "quantity", "<init>", "(II)V", "getResId", "()I", "getQuantity", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-utils-resource_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PluralsResource implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PluralsResource> CREATOR = new Creator();
        private final int quantity;
        private final int resId;

        /* compiled from: StringResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PluralsResource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PluralsResource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PluralsResource(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PluralsResource[] newArray(int i) {
                return new PluralsResource[i];
            }
        }

        public static /* synthetic */ PluralsResource copy$default(PluralsResource pluralsResource, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = pluralsResource.resId;
            }
            if ((i3 & 2) != 0) {
                i2 = pluralsResource.quantity;
            }
            return pluralsResource.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        public final PluralsResource copy(int resId, int quantity) {
            return new PluralsResource(resId, quantity);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PluralsResource)) {
                return false;
            }
            PluralsResource pluralsResource = (PluralsResource) other;
            return this.resId == pluralsResource.resId && this.quantity == pluralsResource.quantity;
        }

        public int hashCode() {
            return (Integer.hashCode(this.resId) * 31) + Integer.hashCode(this.quantity);
        }

        public String toString() {
            return "PluralsResource(resId=" + this.resId + ", quantity=" + this.quantity + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.resId);
            dest.writeInt(this.quantity);
        }

        public PluralsResource(int i, int i2) {
            this.resId = i;
            this.quantity = i2;
        }

        public final int getResId() {
            return this.resId;
        }

        public final int getQuantity() {
            return this.quantity;
        }
    }

    /* compiled from: StringResource.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/utils/resource/StringResource$Join;", "Lcom/robinhood/utils/resource/StringResource;", "stringResources", "", "separator", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getStringResources", "()Ljava/util/List;", "getSeparator", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-utils-resource_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Join extends StringResource {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Join> CREATOR = new Creator();
        private final String separator;
        private final List<StringResource> stringResources;

        /* compiled from: StringResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Join> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Join createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Join.class.getClassLoader()));
                }
                return new Join(arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Join[] newArray(int i) {
                return new Join[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Join copy$default(Join join, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = join.stringResources;
            }
            if ((i & 2) != 0) {
                str = join.separator;
            }
            return join.copy(list, str);
        }

        public final List<StringResource> component1() {
            return this.stringResources;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSeparator() {
            return this.separator;
        }

        public final Join copy(List<? extends StringResource> stringResources, String separator) {
            Intrinsics.checkNotNullParameter(stringResources, "stringResources");
            Intrinsics.checkNotNullParameter(separator, "separator");
            return new Join(stringResources, separator);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.robinhood.utils.resource.StringResource
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Join)) {
                return false;
            }
            Join join = (Join) other;
            return Intrinsics.areEqual(this.stringResources, join.stringResources) && Intrinsics.areEqual(this.separator, join.separator);
        }

        @Override // com.robinhood.utils.resource.StringResource
        public int hashCode() {
            return (this.stringResources.hashCode() * 31) + this.separator.hashCode();
        }

        public String toString() {
            return "Join(stringResources=" + this.stringResources + ", separator=" + this.separator + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<StringResource> list = this.stringResources;
            dest.writeInt(list.size());
            Iterator<StringResource> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.separator);
        }

        public final List<StringResource> getStringResources() {
            return this.stringResources;
        }

        public final String getSeparator() {
            return this.separator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Join(List<? extends StringResource> stringResources, String separator) {
            super(null);
            Intrinsics.checkNotNullParameter(stringResources, "stringResources");
            Intrinsics.checkNotNullParameter(separator, "separator");
            this.stringResources = stringResources;
            this.separator = separator;
        }
    }

    /* compiled from: StringResource.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002J0\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0002\u0010\fJ.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/resource/StringResource$Companion;", "", "<init>", "()V", "invoke", "Lcom/robinhood/utils/resource/StringResource;", "string", "", "id", "", "args", "", "(I[Ljava/lang/Object;)Lcom/robinhood/utils/resource/StringResource;", "res", "Lcom/robinhood/utils/resource/StringResource$PluralsResource;", "(Lcom/robinhood/utils/resource/StringResource$PluralsResource;[Ljava/lang/Object;)Lcom/robinhood/utils/resource/StringResource;", "lib-utils-resource_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StringResource invoke(CharSequence string2) {
            Intrinsics.checkNotNullParameter(string2, "string");
            return new FromString(string2);
        }

        public final StringResource invoke(int id, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new FromResource(id, ArraysKt.toList(args));
        }

        public final StringResource invoke(PluralsResource res, Object... args) {
            Intrinsics.checkNotNullParameter(res, "res");
            Intrinsics.checkNotNullParameter(args, "args");
            return new FromPluralsResource(res, ArraysKt.toList(args));
        }
    }

    public final CharSequence getText(final Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this instanceof FromString) {
            return ((FromString) this).getString();
        }
        if (this instanceof FromResource) {
            FromResource fromResource = (FromResource) this;
            if (fromResource.getArgs().isEmpty()) {
                CharSequence text = resources.getText(fromResource.getStringId());
                Intrinsics.checkNotNull(text);
                return text;
            }
            int stringId = fromResource.getStringId();
            List<Object> args = fromResource.getArgs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(args, 10));
            for (Object text2 : args) {
                if (text2 instanceof StringResource) {
                    text2 = ((StringResource) text2).getText(resources);
                }
                arrayList.add(text2);
            }
            Object[] array2 = arrayList.toArray(new Object[0]);
            String string2 = resources.getString(stringId, Arrays.copyOf(array2, array2.length));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (this instanceof FromPluralsResource) {
            FromPluralsResource fromPluralsResource = (FromPluralsResource) this;
            if (fromPluralsResource.getArgs().isEmpty()) {
                CharSequence quantityText = resources.getQuantityText(fromPluralsResource.getPluralsRes().getResId(), fromPluralsResource.getPluralsRes().getQuantity());
                Intrinsics.checkNotNull(quantityText);
                return quantityText;
            }
            int resId = fromPluralsResource.getPluralsRes().getResId();
            int quantity = fromPluralsResource.getPluralsRes().getQuantity();
            List<Object> args2 = fromPluralsResource.getArgs();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(args2, 10));
            for (Object text3 : args2) {
                if (text3 instanceof StringResource) {
                    text3 = ((StringResource) text3).getText(resources);
                }
                arrayList2.add(text3);
            }
            Object[] array3 = arrayList2.toArray(new Object[0]);
            String quantityString = resources.getQuantityString(resId, quantity, Arrays.copyOf(array3, array3.length));
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        if (!(this instanceof Join)) {
            throw new NoWhenBranchMatchedException();
        }
        Join join = (Join) this;
        return CollectionsKt.joinToString$default(join.getStringResources(), join.getSeparator(), null, null, 0, null, new Function1() { // from class: com.robinhood.utils.resource.StringResource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringResource.getText$lambda$2(resources, (StringResource) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getText$lambda$2(Resources resources, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        return stringResource.getText(resources);
    }
}
