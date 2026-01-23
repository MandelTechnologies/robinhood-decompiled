package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: ClientBuildImpactMetricsEvent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b$\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OBÿ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0017¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001dH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0085\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u00103R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u00106R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u00109R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b:\u00109R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b;\u00109R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b<\u00109R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b=\u00109R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b>\u00109R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b?\u00109R\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b@\u00109R\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\bA\u00109R\u001a\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\bB\u00109R\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\bC\u00109R\u001a\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\bD\u00109R\u001a\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\bE\u00109R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\bF\u00109R\u001a\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\bG\u00109R\u001a\u0010\u0018\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00107\u001a\u0004\bH\u00109R\u001a\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\bI\u00109R\u001a\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00107\u001a\u0004\bJ\u00109R\u001a\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\bK\u00109R\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\bL\u00109R\u001a\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010M\u001a\u0004\bN\u0010+¨\u0006P"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "daily_commits_total", "daily_commits_mean", "daily_commits_mean_percent", "daily_commits_median", "daily_commits_median_percent", "module_size_total", "module_size_mean", "module_size_mean_percent", "module_size_median", "module_size_median_percent", "dependent_modules_size_total", "dependent_modules_size_mean", "dependent_modules_size_mean_percent", "dependent_modules_size_median", "dependent_modules_size_median_percent", "build_impact_total", "build_impact_mean", "build_impact_mean_percent", "build_impact_median", "build_impact_median_percent", "", "module_count", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;DDDDDDDDDDDDDDDDDDDDILokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;DDDDDDDDDDDDDDDDDDDDILokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "D", "getDaily_commits_total", "()D", "getDaily_commits_mean", "getDaily_commits_mean_percent", "getDaily_commits_median", "getDaily_commits_median_percent", "getModule_size_total", "getModule_size_mean", "getModule_size_mean_percent", "getModule_size_median", "getModule_size_median_percent", "getDependent_modules_size_total", "getDependent_modules_size_mean", "getDependent_modules_size_mean_percent", "getDependent_modules_size_median", "getDependent_modules_size_median_percent", "getBuild_impact_total", "getBuild_impact_mean", "getBuild_impact_mean_percent", "getBuild_impact_median", "getBuild_impact_median_percent", "I", "getModule_count", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientBuildImpactMetricsEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientBuildImpactMetricsEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buildImpactMean", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final double build_impact_mean;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buildImpactMeanPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final double build_impact_mean_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buildImpactMedian", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final double build_impact_median;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buildImpactMedianPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final double build_impact_median_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buildImpactTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final double build_impact_total;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dailyCommitsMean", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double daily_commits_mean;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dailyCommitsMeanPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double daily_commits_mean_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dailyCommitsMedian", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double daily_commits_median;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dailyCommitsMedianPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double daily_commits_median_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dailyCommitsTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double daily_commits_total;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dependentModulesSizeMean", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final double dependent_modules_size_mean;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dependentModulesSizeMeanPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final double dependent_modules_size_mean_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dependentModulesSizeMedian", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final double dependent_modules_size_median;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dependentModulesSizeMedianPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final double dependent_modules_size_median_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dependentModulesSizeTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final double dependent_modules_size_total;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "moduleCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final int module_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "moduleSizeMean", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final double module_size_mean;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "moduleSizeMeanPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final double module_size_mean_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "moduleSizeMedian", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final double module_size_median;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "moduleSizeMedianPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final double module_size_median_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "moduleSizeTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double module_size_total;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClientBuildImpactMetricsEvent() {
        this(null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, null, 16777215, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24080newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientBuildImpactMetricsEvent(ClientPlatform clientPlatform, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? 0.0d : d3, (i2 & 32) != 0 ? 0.0d : d4, (i2 & 64) != 0 ? 0.0d : d5, (i2 & 128) != 0 ? 0.0d : d6, (i2 & 256) != 0 ? 0.0d : d7, (i2 & 512) != 0 ? 0.0d : d8, (i2 & 1024) != 0 ? 0.0d : d9, (i2 & 2048) != 0 ? 0.0d : d10, (i2 & 4096) != 0 ? 0.0d : d11, (i2 & 8192) != 0 ? 0.0d : d12, (i2 & 16384) != 0 ? 0.0d : d13, (32768 & i2) != 0 ? 0.0d : d14, (65536 & i2) != 0 ? 0.0d : d15, (131072 & i2) != 0 ? 0.0d : d16, (262144 & i2) != 0 ? 0.0d : d17, (524288 & i2) != 0 ? 0.0d : d18, (1048576 & i2) != 0 ? 0.0d : d19, (2097152 & i2) == 0 ? d20 : 0.0d, (4194304 & i2) != 0 ? 0 : i, (i2 & 8388608) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final double getDaily_commits_total() {
        return this.daily_commits_total;
    }

    public final double getDaily_commits_mean() {
        return this.daily_commits_mean;
    }

    public final double getDaily_commits_mean_percent() {
        return this.daily_commits_mean_percent;
    }

    public final double getDaily_commits_median() {
        return this.daily_commits_median;
    }

    public final double getDaily_commits_median_percent() {
        return this.daily_commits_median_percent;
    }

    public final double getModule_size_total() {
        return this.module_size_total;
    }

    public final double getModule_size_mean() {
        return this.module_size_mean;
    }

    public final double getModule_size_mean_percent() {
        return this.module_size_mean_percent;
    }

    public final double getModule_size_median() {
        return this.module_size_median;
    }

    public final double getModule_size_median_percent() {
        return this.module_size_median_percent;
    }

    public final double getDependent_modules_size_total() {
        return this.dependent_modules_size_total;
    }

    public final double getDependent_modules_size_mean() {
        return this.dependent_modules_size_mean;
    }

    public final double getDependent_modules_size_mean_percent() {
        return this.dependent_modules_size_mean_percent;
    }

    public final double getDependent_modules_size_median() {
        return this.dependent_modules_size_median;
    }

    public final double getDependent_modules_size_median_percent() {
        return this.dependent_modules_size_median_percent;
    }

    public final double getBuild_impact_total() {
        return this.build_impact_total;
    }

    public final double getBuild_impact_mean() {
        return this.build_impact_mean;
    }

    public final double getBuild_impact_mean_percent() {
        return this.build_impact_mean_percent;
    }

    public final double getBuild_impact_median() {
        return this.build_impact_median;
    }

    public final double getBuild_impact_median_percent() {
        return this.build_impact_median_percent;
    }

    public final int getModule_count() {
        return this.module_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientBuildImpactMetricsEvent(ClientPlatform platform, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.daily_commits_total = d;
        this.daily_commits_mean = d2;
        this.daily_commits_mean_percent = d3;
        this.daily_commits_median = d4;
        this.daily_commits_median_percent = d5;
        this.module_size_total = d6;
        this.module_size_mean = d7;
        this.module_size_mean_percent = d8;
        this.module_size_median = d9;
        this.module_size_median_percent = d10;
        this.dependent_modules_size_total = d11;
        this.dependent_modules_size_mean = d12;
        this.dependent_modules_size_mean_percent = d13;
        this.dependent_modules_size_median = d14;
        this.dependent_modules_size_median_percent = d15;
        this.build_impact_total = d16;
        this.build_impact_mean = d17;
        this.build_impact_mean_percent = d18;
        this.build_impact_median = d19;
        this.build_impact_median_percent = d20;
        this.module_count = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24080newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientBuildImpactMetricsEvent)) {
            return false;
        }
        ClientBuildImpactMetricsEvent clientBuildImpactMetricsEvent = (ClientBuildImpactMetricsEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientBuildImpactMetricsEvent.unknownFields()) && this.platform == clientBuildImpactMetricsEvent.platform && Intrinsics.areEqual(this.timestamp, clientBuildImpactMetricsEvent.timestamp) && this.daily_commits_total == clientBuildImpactMetricsEvent.daily_commits_total && this.daily_commits_mean == clientBuildImpactMetricsEvent.daily_commits_mean && this.daily_commits_mean_percent == clientBuildImpactMetricsEvent.daily_commits_mean_percent && this.daily_commits_median == clientBuildImpactMetricsEvent.daily_commits_median && this.daily_commits_median_percent == clientBuildImpactMetricsEvent.daily_commits_median_percent && this.module_size_total == clientBuildImpactMetricsEvent.module_size_total && this.module_size_mean == clientBuildImpactMetricsEvent.module_size_mean && this.module_size_mean_percent == clientBuildImpactMetricsEvent.module_size_mean_percent && this.module_size_median == clientBuildImpactMetricsEvent.module_size_median && this.module_size_median_percent == clientBuildImpactMetricsEvent.module_size_median_percent && this.dependent_modules_size_total == clientBuildImpactMetricsEvent.dependent_modules_size_total && this.dependent_modules_size_mean == clientBuildImpactMetricsEvent.dependent_modules_size_mean && this.dependent_modules_size_mean_percent == clientBuildImpactMetricsEvent.dependent_modules_size_mean_percent && this.dependent_modules_size_median == clientBuildImpactMetricsEvent.dependent_modules_size_median && this.dependent_modules_size_median_percent == clientBuildImpactMetricsEvent.dependent_modules_size_median_percent && this.build_impact_total == clientBuildImpactMetricsEvent.build_impact_total && this.build_impact_mean == clientBuildImpactMetricsEvent.build_impact_mean && this.build_impact_mean_percent == clientBuildImpactMetricsEvent.build_impact_mean_percent && this.build_impact_median == clientBuildImpactMetricsEvent.build_impact_median && this.build_impact_median_percent == clientBuildImpactMetricsEvent.build_impact_median_percent && this.module_count == clientBuildImpactMetricsEvent.module_count;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((((((((((((((((((((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + Double.hashCode(this.daily_commits_total)) * 37) + Double.hashCode(this.daily_commits_mean)) * 37) + Double.hashCode(this.daily_commits_mean_percent)) * 37) + Double.hashCode(this.daily_commits_median)) * 37) + Double.hashCode(this.daily_commits_median_percent)) * 37) + Double.hashCode(this.module_size_total)) * 37) + Double.hashCode(this.module_size_mean)) * 37) + Double.hashCode(this.module_size_mean_percent)) * 37) + Double.hashCode(this.module_size_median)) * 37) + Double.hashCode(this.module_size_median_percent)) * 37) + Double.hashCode(this.dependent_modules_size_total)) * 37) + Double.hashCode(this.dependent_modules_size_mean)) * 37) + Double.hashCode(this.dependent_modules_size_mean_percent)) * 37) + Double.hashCode(this.dependent_modules_size_median)) * 37) + Double.hashCode(this.dependent_modules_size_median_percent)) * 37) + Double.hashCode(this.build_impact_total)) * 37) + Double.hashCode(this.build_impact_mean)) * 37) + Double.hashCode(this.build_impact_mean_percent)) * 37) + Double.hashCode(this.build_impact_median)) * 37) + Double.hashCode(this.build_impact_median_percent)) * 37) + Integer.hashCode(this.module_count);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.platform);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("daily_commits_total=" + this.daily_commits_total);
        arrayList.add("daily_commits_mean=" + this.daily_commits_mean);
        arrayList.add("daily_commits_mean_percent=" + this.daily_commits_mean_percent);
        arrayList.add("daily_commits_median=" + this.daily_commits_median);
        arrayList.add("daily_commits_median_percent=" + this.daily_commits_median_percent);
        arrayList.add("module_size_total=" + this.module_size_total);
        arrayList.add("module_size_mean=" + this.module_size_mean);
        arrayList.add("module_size_mean_percent=" + this.module_size_mean_percent);
        arrayList.add("module_size_median=" + this.module_size_median);
        arrayList.add("module_size_median_percent=" + this.module_size_median_percent);
        arrayList.add("dependent_modules_size_total=" + this.dependent_modules_size_total);
        arrayList.add("dependent_modules_size_mean=" + this.dependent_modules_size_mean);
        arrayList.add("dependent_modules_size_mean_percent=" + this.dependent_modules_size_mean_percent);
        arrayList.add("dependent_modules_size_median=" + this.dependent_modules_size_median);
        arrayList.add("dependent_modules_size_median_percent=" + this.dependent_modules_size_median_percent);
        arrayList.add("build_impact_total=" + this.build_impact_total);
        arrayList.add("build_impact_mean=" + this.build_impact_mean);
        arrayList.add("build_impact_mean_percent=" + this.build_impact_mean_percent);
        arrayList.add("build_impact_median=" + this.build_impact_median);
        arrayList.add("build_impact_median_percent=" + this.build_impact_median_percent);
        arrayList.add("module_count=" + this.module_count);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientBuildImpactMetricsEvent{", "}", 0, null, null, 56, null);
    }

    public final ClientBuildImpactMetricsEvent copy(ClientPlatform platform, Instant timestamp, double daily_commits_total, double daily_commits_mean, double daily_commits_mean_percent, double daily_commits_median, double daily_commits_median_percent, double module_size_total, double module_size_mean, double module_size_mean_percent, double module_size_median, double module_size_median_percent, double dependent_modules_size_total, double dependent_modules_size_mean, double dependent_modules_size_mean_percent, double dependent_modules_size_median, double dependent_modules_size_median_percent, double build_impact_total, double build_impact_mean, double build_impact_mean_percent, double build_impact_median, double build_impact_median_percent, int module_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientBuildImpactMetricsEvent(platform, timestamp, daily_commits_total, daily_commits_mean, daily_commits_mean_percent, daily_commits_median, daily_commits_median_percent, module_size_total, module_size_mean, module_size_mean_percent, module_size_median, module_size_median_percent, dependent_modules_size_total, dependent_modules_size_mean, dependent_modules_size_mean_percent, dependent_modules_size_median, dependent_modules_size_median_percent, build_impact_total, build_impact_mean, build_impact_mean_percent, build_impact_median, build_impact_median_percent, module_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientBuildImpactMetricsEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientBuildImpactMetricsEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientBuildImpactMetricsEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientBuildImpactMetricsEvent value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Double.valueOf(value.getDaily_commits_total()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getDaily_commits_total()));
                }
                if (!Double.valueOf(value.getDaily_commits_mean()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getDaily_commits_mean()));
                }
                if (!Double.valueOf(value.getDaily_commits_mean_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getDaily_commits_mean_percent()));
                }
                if (!Double.valueOf(value.getDaily_commits_median()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getDaily_commits_median()));
                }
                if (!Double.valueOf(value.getDaily_commits_median_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getDaily_commits_median_percent()));
                }
                if (!Double.valueOf(value.getModule_size_total()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getModule_size_total()));
                }
                if (!Double.valueOf(value.getModule_size_mean()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(9, Double.valueOf(value.getModule_size_mean()));
                }
                if (!Double.valueOf(value.getModule_size_mean_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(10, Double.valueOf(value.getModule_size_mean_percent()));
                }
                if (!Double.valueOf(value.getModule_size_median()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getModule_size_median()));
                }
                if (!Double.valueOf(value.getModule_size_median_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getModule_size_median_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_total()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(13, Double.valueOf(value.getDependent_modules_size_total()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_mean()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(14, Double.valueOf(value.getDependent_modules_size_mean()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_mean_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(15, Double.valueOf(value.getDependent_modules_size_mean_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_median()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(16, Double.valueOf(value.getDependent_modules_size_median()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_median_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(17, Double.valueOf(value.getDependent_modules_size_median_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact_total()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(18, Double.valueOf(value.getBuild_impact_total()));
                }
                if (!Double.valueOf(value.getBuild_impact_mean()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(19, Double.valueOf(value.getBuild_impact_mean()));
                }
                if (!Double.valueOf(value.getBuild_impact_mean_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(20, Double.valueOf(value.getBuild_impact_mean_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact_median()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(21, Double.valueOf(value.getBuild_impact_median()));
                }
                if (!Double.valueOf(value.getBuild_impact_median_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(22, Double.valueOf(value.getBuild_impact_median_percent()));
                }
                return value.getModule_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(23, Integer.valueOf(value.getModule_count())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientBuildImpactMetricsEvent value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Double.valueOf(value.getDaily_commits_total()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDaily_commits_total()));
                }
                if (!Double.valueOf(value.getDaily_commits_mean()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDaily_commits_mean()));
                }
                if (!Double.valueOf(value.getDaily_commits_mean_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getDaily_commits_mean_percent()));
                }
                if (!Double.valueOf(value.getDaily_commits_median()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getDaily_commits_median()));
                }
                if (!Double.valueOf(value.getDaily_commits_median_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getDaily_commits_median_percent()));
                }
                if (!Double.valueOf(value.getModule_size_total()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getModule_size_total()));
                }
                if (!Double.valueOf(value.getModule_size_mean()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getModule_size_mean()));
                }
                if (!Double.valueOf(value.getModule_size_mean_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getModule_size_mean_percent()));
                }
                if (!Double.valueOf(value.getModule_size_median()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, (int) Double.valueOf(value.getModule_size_median()));
                }
                if (!Double.valueOf(value.getModule_size_median_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getModule_size_median_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_total()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getDependent_modules_size_total()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_mean()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getDependent_modules_size_mean()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_mean_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getDependent_modules_size_mean_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_median()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getDependent_modules_size_median()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_median_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 17, (int) Double.valueOf(value.getDependent_modules_size_median_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact_total()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 18, (int) Double.valueOf(value.getBuild_impact_total()));
                }
                if (!Double.valueOf(value.getBuild_impact_mean()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getBuild_impact_mean()));
                }
                if (!Double.valueOf(value.getBuild_impact_mean_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 20, (int) Double.valueOf(value.getBuild_impact_mean_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact_median()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 21, (int) Double.valueOf(value.getBuild_impact_median()));
                }
                if (!Double.valueOf(value.getBuild_impact_median_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 22, (int) Double.valueOf(value.getBuild_impact_median_percent()));
                }
                if (value.getModule_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 23, (int) Integer.valueOf(value.getModule_count()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientBuildImpactMetricsEvent value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getModule_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 23, (int) Integer.valueOf(value.getModule_count()));
                }
                if (!Double.valueOf(value.getBuild_impact_median_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 22, (int) Double.valueOf(value.getBuild_impact_median_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact_median()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 21, (int) Double.valueOf(value.getBuild_impact_median()));
                }
                if (!Double.valueOf(value.getBuild_impact_mean_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 20, (int) Double.valueOf(value.getBuild_impact_mean_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact_mean()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getBuild_impact_mean()));
                }
                if (!Double.valueOf(value.getBuild_impact_total()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 18, (int) Double.valueOf(value.getBuild_impact_total()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_median_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 17, (int) Double.valueOf(value.getDependent_modules_size_median_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_median()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getDependent_modules_size_median()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_mean_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getDependent_modules_size_mean_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_mean()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getDependent_modules_size_mean()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_total()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getDependent_modules_size_total()));
                }
                if (!Double.valueOf(value.getModule_size_median_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getModule_size_median_percent()));
                }
                if (!Double.valueOf(value.getModule_size_median()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, (int) Double.valueOf(value.getModule_size_median()));
                }
                if (!Double.valueOf(value.getModule_size_mean_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getModule_size_mean_percent()));
                }
                if (!Double.valueOf(value.getModule_size_mean()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getModule_size_mean()));
                }
                if (!Double.valueOf(value.getModule_size_total()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getModule_size_total()));
                }
                if (!Double.valueOf(value.getDaily_commits_median_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getDaily_commits_median_percent()));
                }
                if (!Double.valueOf(value.getDaily_commits_median()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getDaily_commits_median()));
                }
                if (!Double.valueOf(value.getDaily_commits_mean_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getDaily_commits_mean_percent()));
                }
                if (!Double.valueOf(value.getDaily_commits_mean()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDaily_commits_mean()));
                }
                if (!Double.valueOf(value.getDaily_commits_total()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDaily_commits_total()));
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0040. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public com.robinhood.rosetta.eventlogging.ClientBuildImpactMetricsEvent decode(com.squareup.wire.ProtoReader r52) {
                /*
                    Method dump skipped, instructions count: 510
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientBuildImpactMetricsEvent2.decode(com.squareup.wire.ProtoReader):com.robinhood.rosetta.eventlogging.ClientBuildImpactMetricsEvent");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientBuildImpactMetricsEvent redact(ClientBuildImpactMetricsEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return value.copy((8388605 & 1) != 0 ? value.platform : null, (8388605 & 2) != 0 ? value.timestamp : timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, (8388605 & 4) != 0 ? value.daily_commits_total : 0.0d, (8388605 & 8) != 0 ? value.daily_commits_mean : 0.0d, (8388605 & 16) != 0 ? value.daily_commits_mean_percent : 0.0d, (8388605 & 32) != 0 ? value.daily_commits_median : 0.0d, (8388605 & 64) != 0 ? value.daily_commits_median_percent : 0.0d, (8388605 & 128) != 0 ? value.module_size_total : 0.0d, (8388605 & 256) != 0 ? value.module_size_mean : 0.0d, (8388605 & 512) != 0 ? value.module_size_mean_percent : 0.0d, (8388605 & 1024) != 0 ? value.module_size_median : 0.0d, (8388605 & 2048) != 0 ? value.module_size_median_percent : 0.0d, (8388605 & 4096) != 0 ? value.dependent_modules_size_total : 0.0d, (8388605 & 8192) != 0 ? value.dependent_modules_size_mean : 0.0d, (8388605 & 16384) != 0 ? value.dependent_modules_size_mean_percent : 0.0d, (8388605 & 32768) != 0 ? value.dependent_modules_size_median : 0.0d, (8388605 & 65536) != 0 ? value.dependent_modules_size_median_percent : 0.0d, (8388605 & 131072) != 0 ? value.build_impact_total : 0.0d, (8388605 & 262144) != 0 ? value.build_impact_mean : 0.0d, (8388605 & 524288) != 0 ? value.build_impact_mean_percent : 0.0d, (8388605 & 1048576) != 0 ? value.build_impact_median : 0.0d, (8388605 & 2097152) != 0 ? value.build_impact_median_percent : 0.0d, (8388605 & 4194304) != 0 ? value.module_count : 0, (8388605 & 8388608) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
