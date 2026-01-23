package com.robinhood.wiretransfers.contracts;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: LaunchArguments.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/LaunchArguments;", "", "seen1", "", "screenStartType", "Lcom/robinhood/wiretransfers/contracts/ScreenStartType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/wiretransfers/contracts/ScreenStartType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/wiretransfers/contracts/ScreenStartType;)V", "getScreenStartType", "()Lcom/robinhood/wiretransfers/contracts/ScreenStartType;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final /* data */ class LaunchArguments {
    private final ScreenStartType screenStartType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {ScreenStartType.INSTANCE.serializer()};

    public static /* synthetic */ LaunchArguments copy$default(LaunchArguments launchArguments, ScreenStartType screenStartType, int i, Object obj) {
        if ((i & 1) != 0) {
            screenStartType = launchArguments.screenStartType;
        }
        return launchArguments.copy(screenStartType);
    }

    /* renamed from: component1, reason: from getter */
    public final ScreenStartType getScreenStartType() {
        return this.screenStartType;
    }

    public final LaunchArguments copy(ScreenStartType screenStartType) {
        return new LaunchArguments(screenStartType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LaunchArguments) && this.screenStartType == ((LaunchArguments) other).screenStartType;
    }

    public int hashCode() {
        ScreenStartType screenStartType = this.screenStartType;
        if (screenStartType == null) {
            return 0;
        }
        return screenStartType.hashCode();
    }

    public String toString() {
        return "LaunchArguments(screenStartType=" + this.screenStartType + ")";
    }

    /* compiled from: LaunchArguments.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/LaunchArguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/wiretransfers/contracts/LaunchArguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LaunchArguments> serializer() {
            return LaunchArguments2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ LaunchArguments(int i, ScreenStartType screenStartType, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, LaunchArguments2.INSTANCE.getDescriptor());
        }
        this.screenStartType = screenStartType;
    }

    public LaunchArguments(ScreenStartType screenStartType) {
        this.screenStartType = screenStartType;
    }

    public final ScreenStartType getScreenStartType() {
        return this.screenStartType;
    }
}
