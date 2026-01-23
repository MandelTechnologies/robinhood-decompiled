package com.robinhood.android.shared.serverui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.idl.Dto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: UiObject.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000b*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\u0012\b\u0001\u0010\u0003 \u0001*\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00042\u00020\u0002:\u0003\t\n\u000bR\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/shared/serverui/utils/UiObject;", "LegacyT", "Landroid/os/Parcelable;", "IdlT", "Lcom/robinhood/idl/Dto;", "value", "", "getValue", "()Ljava/lang/Object;", "Legacy", "Idl", "Companion", "Lcom/robinhood/android/shared/serverui/utils/UiObject$Idl;", "Lcom/robinhood/android/shared/serverui/utils/UiObject$Legacy;", "lib-sdui-utils_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface UiObject<LegacyT extends Parcelable, IdlT extends Parcelable & Dto<?>> extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object getValue();

    /* compiled from: UiObject.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\n\b\u0002\u0010\u0001 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/shared/serverui/utils/UiObject$Legacy;", "LegacyT", "Landroid/os/Parcelable;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "", "value", "<init>", "(Landroid/os/Parcelable;)V", "getValue", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "component1", "copy", "(Landroid/os/Parcelable;)Lcom/robinhood/android/shared/serverui/utils/UiObject$Legacy;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-sdui-utils_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Legacy<LegacyT extends Parcelable> implements UiObject {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Legacy<?>> CREATOR = new Creator();
        private final LegacyT value;

        /* compiled from: UiObject.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Legacy<?>> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Legacy<?> createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Legacy<>(parcel.readParcelable(Legacy.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Legacy<?>[] newArray(int i) {
                return new Legacy[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Legacy copy$default(Legacy legacy, Parcelable parcelable, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = legacy.value;
            }
            return legacy.copy(parcelable);
        }

        public final LegacyT component1() {
            return this.value;
        }

        public final Legacy<LegacyT> copy(LegacyT value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Legacy<>(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Legacy) && Intrinsics.areEqual(this.value, ((Legacy) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Legacy(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.value, flags);
        }

        public Legacy(LegacyT value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @Override // com.robinhood.android.shared.serverui.utils.UiObject
        public LegacyT getValue() {
            return this.value;
        }
    }

    /* compiled from: UiObject.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0012\b\u0002\u0010\u0001 \u0001*\u0006\u0012\u0002\b\u00030\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00010\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0016\u0010\u0006\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/shared/serverui/utils/UiObject$Idl;", "IdlT", "Lcom/robinhood/idl/Dto;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "", "value", "<init>", "(Lcom/robinhood/idl/Dto;)V", "getValue", "()Lcom/robinhood/idl/Dto;", "Lcom/robinhood/idl/Dto;", "component1", "copy", "(Lcom/robinhood/idl/Dto;)Lcom/robinhood/android/shared/serverui/utils/UiObject$Idl;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-sdui-utils_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Idl<IdlT extends Dto<?> & Parcelable> implements UiObject {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Idl<?>> CREATOR = new Creator();

        /* JADX INFO: Incorrect field signature: TIdlT; */
        private final Dto value;

        /* compiled from: UiObject.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Idl<?>> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Idl<?> createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Idl<>((Dto) parcel.readValue(Idl.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Idl<?>[] newArray(int i) {
                return new Idl[i];
            }
        }

        public static /* synthetic */ Idl copy$default(Idl idl2, Dto dto, int i, Object obj) {
            if ((i & 1) != 0) {
                dto = idl2.value;
            }
            return idl2.copy(dto);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TIdlT; */
        /* renamed from: component1, reason: from getter */
        public final Dto getValue() {
            return this.value;
        }

        /* JADX WARN: Incorrect types in method signature: (TIdlT;)Lcom/robinhood/android/shared/serverui/utils/UiObject$Idl<TIdlT;>; */
        public final Idl copy(Dto value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Idl(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Idl) && Intrinsics.areEqual(this.value, ((Idl) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Idl(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeValue(this.value);
        }

        /* JADX WARN: Incorrect types in method signature: (TIdlT;)V */
        public Idl(Dto value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TIdlT; */
        @Override // com.robinhood.android.shared.serverui.utils.UiObject
        public Dto getValue() {
            return this.value;
        }
    }

    /* compiled from: UiObject.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J|\u0010\u0004\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0006\u0012\u0004\u0012\u0002H\t0\u0005\"\b\b\u0002\u0010\u0007*\u00020\n\"\u0010\b\u0003\u0010\b*\u0006\u0012\u0002\b\u00030\u000b*\u00020\n\"\u0004\b\u0004\u0010\t2\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\t0\r¢\u0006\u0002\b\u000e2\u0019\b\u0004\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\r¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000J¤\u0001\u0010\u0010\u001a(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0012\u0018\u00010\u00060\u0005\"\b\b\u0002\u0010\u0007*\u00020\n\"\u0010\b\u0003\u0010\b*\u0006\u0012\u0002\b\u00030\u000b*\u00020\n\"\b\b\u0004\u0010\u0011*\u00020\n\"\u0010\b\u0005\u0010\u0012*\u0006\u0012\u0002\b\u00030\u000b*\u00020\n2\u001b\b\u0004\u0010\f\u001a\u0015\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\r¢\u0006\u0002\b\u000e2\u001b\b\u0004\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u0002H\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00120\r¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/shared/serverui/utils/UiObject$Companion;", "", "<init>", "()V", "identicalProperty", "Lkotlin/properties/ReadOnlyProperty;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "LegacyT", "IdlT", "R", "Landroid/os/Parcelable;", "Lcom/robinhood/idl/Dto;", "legacyProperty", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "idlProperty", "similarProperty", "LegacyR", "IdlR", "lib-sdui-utils_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <LegacyT extends Parcelable, IdlT extends Dto<?> & Parcelable, R> Interfaces2<UiObject<? extends LegacyT, ? extends IdlT>, R> identicalProperty(final Function1<? super LegacyT, ? extends R> legacyProperty, final Function1<? super IdlT, ? extends R> idlProperty) {
            Intrinsics.checkNotNullParameter(legacyProperty, "legacyProperty");
            Intrinsics.checkNotNullParameter(idlProperty, "idlProperty");
            return new Interfaces2() { // from class: com.robinhood.android.shared.serverui.utils.UiObject$Companion$identicalProperty$1
                @Override // kotlin.properties.Interfaces2
                public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                    return getValue((UiObject) obj, (KProperty<?>) kProperty);
                }

                /* JADX WARN: Type inference failed for: r2v4, types: [R, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r2v7, types: [R, java.lang.Object] */
                public final R getValue(UiObject<? extends LegacyT, ? extends IdlT> thisRef, KProperty<?> kProperty) {
                    Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                    Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                    if (thisRef instanceof UiObject.Legacy) {
                        return legacyProperty.invoke(((UiObject.Legacy) thisRef).getValue());
                    }
                    if (thisRef instanceof UiObject.Idl) {
                        return idlProperty.invoke(((UiObject.Idl) thisRef).getValue());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            };
        }

        public final <LegacyT extends Parcelable, IdlT extends Dto<?> & Parcelable, LegacyR extends Parcelable, IdlR extends Dto<?> & Parcelable> Interfaces2<UiObject<? extends LegacyT, ? extends IdlT>, UiObject<LegacyR, IdlR>> similarProperty(final Function1<? super LegacyT, ? extends LegacyR> legacyProperty, final Function1<? super IdlT, ? extends IdlR> idlProperty) {
            Intrinsics.checkNotNullParameter(legacyProperty, "legacyProperty");
            Intrinsics.checkNotNullParameter(idlProperty, "idlProperty");
            return new Interfaces2() { // from class: com.robinhood.android.shared.serverui.utils.UiObject$Companion$similarProperty$1
                @Override // kotlin.properties.Interfaces2
                public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
                    return getValue((UiObject) obj, (KProperty<?>) kProperty);
                }

                public final UiObject<LegacyR, IdlR> getValue(UiObject<? extends LegacyT, ? extends IdlT> thisRef, KProperty<?> kProperty) {
                    Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                    Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
                    if (thisRef instanceof UiObject.Legacy) {
                        Parcelable parcelable = (Parcelable) legacyProperty.invoke(((UiObject.Legacy) thisRef).getValue());
                        if (parcelable != null) {
                            return new UiObject.Legacy(parcelable);
                        }
                        return null;
                    }
                    if (!(thisRef instanceof UiObject.Idl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Dto dto = (Dto) idlProperty.invoke(((UiObject.Idl) thisRef).getValue());
                    if (dto != null) {
                        return new UiObject.Idl(dto);
                    }
                    return null;
                }
            };
        }
    }
}
