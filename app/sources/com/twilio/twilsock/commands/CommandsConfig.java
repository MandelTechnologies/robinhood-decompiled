package com.twilio.twilsock.commands;

import com.twilio.util.RetrierConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: CommandsConfig.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0014\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\fJ\u0016\u0010\u0016\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\fJ\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, m3636d2 = {"Lcom/twilio/twilsock/commands/CommandsConfig;", "", "httpTimeout", "Lkotlin/time/Duration;", "commandTimeout", "maxParallelCommands", "", "pageSize", "retrierConfig", "Lcom/twilio/util/RetrierConfig;", "(JJIILcom/twilio/util/RetrierConfig;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCommandTimeout-UwyO8pc", "()J", "J", "getHttpTimeout-UwyO8pc", "getMaxParallelCommands", "()I", "getPageSize", "getRetrierConfig", "()Lcom/twilio/util/RetrierConfig;", "component1", "component1-UwyO8pc", "component2", "component2-UwyO8pc", "component3", "component4", "component5", "copy", "copy-ePrTys8", "(JJIILcom/twilio/util/RetrierConfig;)Lcom/twilio/twilsock/commands/CommandsConfig;", "equals", "", "other", "hashCode", "toString", "", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommandsConfig {
    private final long commandTimeout;
    private final long httpTimeout;
    private final int maxParallelCommands;
    private final int pageSize;
    private final RetrierConfig retrierConfig;

    public /* synthetic */ CommandsConfig(long j, long j2, int i, int i2, RetrierConfig retrierConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, i2, retrierConfig);
    }

    /* renamed from: copy-ePrTys8$default, reason: not valid java name */
    public static /* synthetic */ CommandsConfig m27227copyePrTys8$default(CommandsConfig commandsConfig, long j, long j2, int i, int i2, RetrierConfig retrierConfig, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = commandsConfig.httpTimeout;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            j2 = commandsConfig.commandTimeout;
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            i = commandsConfig.maxParallelCommands;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = commandsConfig.pageSize;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            retrierConfig = commandsConfig.retrierConfig;
        }
        return commandsConfig.m27230copyePrTys8(j3, j4, i4, i5, retrierConfig);
    }

    /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
    public final long getHttpTimeout() {
        return this.httpTimeout;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getCommandTimeout() {
        return this.commandTimeout;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxParallelCommands() {
        return this.maxParallelCommands;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: component5, reason: from getter */
    public final RetrierConfig getRetrierConfig() {
        return this.retrierConfig;
    }

    /* renamed from: copy-ePrTys8, reason: not valid java name */
    public final CommandsConfig m27230copyePrTys8(long httpTimeout, long commandTimeout, int maxParallelCommands, int pageSize, RetrierConfig retrierConfig) {
        Intrinsics.checkNotNullParameter(retrierConfig, "retrierConfig");
        return new CommandsConfig(httpTimeout, commandTimeout, maxParallelCommands, pageSize, retrierConfig, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommandsConfig)) {
            return false;
        }
        CommandsConfig commandsConfig = (CommandsConfig) other;
        return Duration.m28733equalsimpl0(this.httpTimeout, commandsConfig.httpTimeout) && Duration.m28733equalsimpl0(this.commandTimeout, commandsConfig.commandTimeout) && this.maxParallelCommands == commandsConfig.maxParallelCommands && this.pageSize == commandsConfig.pageSize && Intrinsics.areEqual(this.retrierConfig, commandsConfig.retrierConfig);
    }

    public int hashCode() {
        return (((((((Duration.m28747hashCodeimpl(this.httpTimeout) * 31) + Duration.m28747hashCodeimpl(this.commandTimeout)) * 31) + Integer.hashCode(this.maxParallelCommands)) * 31) + Integer.hashCode(this.pageSize)) * 31) + this.retrierConfig.hashCode();
    }

    public String toString() {
        return "CommandsConfig(httpTimeout=" + ((Object) Duration.m28761toStringimpl(this.httpTimeout)) + ", commandTimeout=" + ((Object) Duration.m28761toStringimpl(this.commandTimeout)) + ", maxParallelCommands=" + this.maxParallelCommands + ", pageSize=" + this.pageSize + ", retrierConfig=" + this.retrierConfig + ')';
    }

    private CommandsConfig(long j, long j2, int i, int i2, RetrierConfig retrierConfig) {
        Intrinsics.checkNotNullParameter(retrierConfig, "retrierConfig");
        this.httpTimeout = j;
        this.commandTimeout = j2;
        this.maxParallelCommands = i;
        this.pageSize = i2;
        this.retrierConfig = retrierConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommandsConfig(long j, long j2, int i, int i2, RetrierConfig retrierConfig, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        long duration;
        long duration2;
        if ((i3 & 1) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            duration = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
        } else {
            duration = j;
        }
        if ((i3 & 2) != 0) {
            Duration.Companion companion2 = Duration.INSTANCE;
            duration2 = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
        } else {
            duration2 = j2;
        }
        this(duration, duration2, (i3 & 4) != 0 ? 1000 : i, (i3 & 8) != 0 ? 100 : i2, (i3 & 16) != 0 ? new RetrierConfig(0L, 0L, 0L, 0.0d, null, duration2, 15, null) : retrierConfig, null);
    }

    /* renamed from: getHttpTimeout-UwyO8pc, reason: not valid java name */
    public final long m27232getHttpTimeoutUwyO8pc() {
        return this.httpTimeout;
    }

    /* renamed from: getCommandTimeout-UwyO8pc, reason: not valid java name */
    public final long m27231getCommandTimeoutUwyO8pc() {
        return this.commandTimeout;
    }

    public final int getMaxParallelCommands() {
        return this.maxParallelCommands;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final RetrierConfig getRetrierConfig() {
        return this.retrierConfig;
    }
}
