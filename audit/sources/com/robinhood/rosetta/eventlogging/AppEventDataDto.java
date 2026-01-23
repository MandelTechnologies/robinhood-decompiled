package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.AppEventDataAdditionalInfoDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: AppEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0006\n\u0003\b\u0089\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Þ\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\bÝ\u0001Þ\u0001ß\u0001à\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BÁ\u0007\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\t\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020\t\u0012\b\b\u0002\u0010)\u001a\u00020\t\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\t\u0012\b\b\u0002\u0010.\u001a\u00020\t\u0012\b\b\u0002\u0010/\u001a\u00020\t\u0012\b\b\u0002\u00100\u001a\u00020\t\u0012\b\b\u0002\u00101\u001a\u00020\t\u0012\b\b\u0002\u00102\u001a\u00020\t\u0012\b\b\u0002\u00103\u001a\u00020\t\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\t\u0012\b\b\u0002\u00106\u001a\u00020\t\u0012\b\b\u0002\u00107\u001a\u00020\t\u0012\b\b\u0002\u00108\u001a\u00020\t\u0012\b\b\u0002\u00109\u001a\u00020\t\u0012\b\b\u0002\u0010:\u001a\u00020\t\u0012\b\b\u0002\u0010;\u001a\u00020\t\u0012\b\b\u0002\u0010<\u001a\u00020\t\u0012\b\b\u0002\u0010=\u001a\u00020\t\u0012\b\b\u0002\u0010>\u001a\u00020\t\u0012\b\b\u0002\u0010?\u001a\u00020\t\u0012\b\b\u0002\u0010@\u001a\u00020\t\u0012\b\b\u0002\u0010A\u001a\u00020\t\u0012\b\b\u0002\u0010B\u001a\u00020\t\u0012\b\b\u0002\u0010C\u001a\u00020\t\u0012\b\b\u0002\u0010D\u001a\u00020\t\u0012\b\b\u0002\u0010E\u001a\u00020\t\u0012\b\b\u0002\u0010F\u001a\u00020\u000b\u0012\b\b\u0002\u0010G\u001a\u00020\t\u0012\b\b\u0002\u0010H\u001a\u00020I\u0012\b\b\u0002\u0010J\u001a\u00020I\u0012\b\b\u0002\u0010K\u001a\u00020I\u0012\b\b\u0002\u0010L\u001a\u00020\t\u0012\b\b\u0002\u0010M\u001a\u00020\t\u0012\b\b\u0002\u0010N\u001a\u00020\t\u0012\b\b\u0002\u0010O\u001a\u00020\t\u0012\b\b\u0002\u0010P\u001a\u00020I\u0012\b\b\u0002\u0010Q\u001a\u00020\t\u0012\b\b\u0002\u0010R\u001a\u00020\t\u0012\b\b\u0002\u0010S\u001a\u00020\u000b\u0012\b\b\u0002\u0010T\u001a\u00020\t\u0012\b\b\u0002\u0010U\u001a\u00020\t\u0012\b\b\u0002\u0010V\u001a\u00020\t\u0012\b\b\u0002\u0010W\u001a\u00020I\u0012\b\b\u0002\u0010X\u001a\u00020\t\u0012\b\b\u0002\u0010Y\u001a\u00020I\u0012\b\b\u0002\u0010Z\u001a\u00020\t\u0012\b\b\u0002\u0010[\u001a\u00020I\u0012\b\b\u0002\u0010\\\u001a\u00020I\u0012\b\b\u0002\u0010]\u001a\u00020\t\u0012\b\b\u0002\u0010^\u001a\u00020\u000b\u0012\b\b\u0002\u0010_\u001a\u00020\t\u0012\b\b\u0002\u0010`\u001a\u00020\t\u0012\b\b\u0002\u0010a\u001a\u00020\t\u0012\b\b\u0002\u0010b\u001a\u00020I\u0012\b\b\u0002\u0010c\u001a\u00020\t\u0012\b\b\u0002\u0010d\u001a\u00020\u000b\u0012\b\b\u0002\u0010e\u001a\u00020\u000b\u0012\b\b\u0002\u0010f\u001a\u00020\t\u0012\b\b\u0002\u0010g\u001a\u00020\t\u0012\b\b\u0002\u0010h\u001a\u00020\t\u0012\b\b\u0002\u0010i\u001a\u00020\t\u0012\b\b\u0002\u0010j\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010kJ¿\u0007\u0010Ï\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\t2\b\b\u0002\u00103\u001a\u00020\t2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t2\b\b\u0002\u0010;\u001a\u00020\t2\b\b\u0002\u0010<\u001a\u00020\t2\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020\t2\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020\t2\b\b\u0002\u0010C\u001a\u00020\t2\b\b\u0002\u0010D\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020\t2\b\b\u0002\u0010F\u001a\u00020\u000b2\b\b\u0002\u0010G\u001a\u00020\t2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\t2\b\b\u0002\u0010N\u001a\u00020\t2\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020I2\b\b\u0002\u0010Q\u001a\u00020\t2\b\b\u0002\u0010R\u001a\u00020\t2\b\b\u0002\u0010S\u001a\u00020\u000b2\b\b\u0002\u0010T\u001a\u00020\t2\b\b\u0002\u0010U\u001a\u00020\t2\b\b\u0002\u0010V\u001a\u00020\t2\b\b\u0002\u0010W\u001a\u00020I2\b\b\u0002\u0010X\u001a\u00020\t2\b\b\u0002\u0010Y\u001a\u00020I2\b\b\u0002\u0010Z\u001a\u00020\t2\b\b\u0002\u0010[\u001a\u00020I2\b\b\u0002\u0010\\\u001a\u00020I2\b\b\u0002\u0010]\u001a\u00020\t2\b\b\u0002\u0010^\u001a\u00020\u000b2\b\b\u0002\u0010_\u001a\u00020\t2\b\b\u0002\u0010`\u001a\u00020\t2\b\b\u0002\u0010a\u001a\u00020\t2\b\b\u0002\u0010b\u001a\u00020I2\b\b\u0002\u0010c\u001a\u00020\t2\b\b\u0002\u0010d\u001a\u00020\u000b2\b\b\u0002\u0010e\u001a\u00020\u000b2\b\b\u0002\u0010f\u001a\u00020\t2\b\b\u0002\u0010g\u001a\u00020\t2\b\b\u0002\u0010h\u001a\u00020\t2\b\b\u0002\u0010i\u001a\u00020\t2\b\b\u0002\u0010j\u001a\u00020\tJ\t\u0010Ð\u0001\u001a\u00020\u0002H\u0016J\t\u0010Ñ\u0001\u001a\u00020\tH\u0016J\u0017\u0010Ò\u0001\u001a\u00030Ó\u00012\n\u0010Ô\u0001\u001a\u0005\u0018\u00010Õ\u0001H\u0096\u0002J\t\u0010Ö\u0001\u001a\u00020\u000bH\u0016J\u001d\u0010×\u0001\u001a\u00030Ø\u00012\b\u0010Ù\u0001\u001a\u00030Ú\u00012\u0007\u0010Û\u0001\u001a\u00020\u000bH\u0016J\t\u0010Ü\u0001\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bp\u0010mR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bq\u0010oR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\br\u0010mR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bs\u0010mR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bt\u0010mR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bu\u0010mR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bv\u0010mR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bw\u0010mR\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bx\u0010mR\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\by\u0010mR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bz\u0010oR\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b{\u0010mR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b|\u0010mR\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b}\u0010mR\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b~\u0010mR\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010mR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0012\u0010\u001e\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010mR\u0012\u0010\u001f\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010mR\u0012\u0010 \u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010mR\u0012\u0010!\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010mR\u0012\u0010\"\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010mR\u0012\u0010#\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010mR\u0012\u0010$\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010mR\u0012\u0010%\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010mR\u0012\u0010&\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010mR\u0012\u0010'\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010mR\u0012\u0010(\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010mR\u0012\u0010)\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010mR\u0012\u0010*\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010mR\u0012\u0010+\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010mR\u0012\u0010,\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010mR\u0012\u0010-\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010mR\u0012\u0010.\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010mR\u0012\u0010/\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010mR\u0012\u00100\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010mR\u0012\u00101\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010mR\u0012\u00102\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010mR\u0012\u00103\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010mR\u0012\u00104\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010mR\u0012\u00105\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010mR\u0012\u00106\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010mR\u0012\u00107\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010mR\u0012\u00108\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010mR\u0012\u00109\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010mR\u0012\u0010:\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010mR\u0012\u0010;\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010mR\u0012\u0010<\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010mR\u0012\u0010=\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010mR\u0012\u0010>\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010mR\u0012\u0010?\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010mR\u0012\u0010@\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010mR\u0012\u0010A\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010mR\u0012\u0010B\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010mR\u0012\u0010C\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010mR\u0012\u0010D\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010mR\u0012\u0010E\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010mR\u0012\u0010F\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010oR\u0012\u0010G\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010mR\u0013\u0010H\u001a\u00020I8F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0013\u0010J\u001a\u00020I8F¢\u0006\b\u001a\u0006\b®\u0001\u0010\u00ad\u0001R\u0013\u0010K\u001a\u00020I8F¢\u0006\b\u001a\u0006\b¯\u0001\u0010\u00ad\u0001R\u0012\u0010L\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010mR\u0012\u0010M\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010mR\u0012\u0010N\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010mR\u0012\u0010O\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010mR\u0013\u0010P\u001a\u00020I8F¢\u0006\b\u001a\u0006\b´\u0001\u0010\u00ad\u0001R\u0012\u0010Q\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010mR\u0012\u0010R\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010mR\u0012\u0010S\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010oR\u0012\u0010T\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010mR\u0012\u0010U\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010mR\u0012\u0010V\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010mR\u0013\u0010W\u001a\u00020I8F¢\u0006\b\u001a\u0006\b»\u0001\u0010\u00ad\u0001R\u0012\u0010X\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010mR\u0013\u0010Y\u001a\u00020I8F¢\u0006\b\u001a\u0006\b½\u0001\u0010\u00ad\u0001R\u0012\u0010Z\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010mR\u0013\u0010[\u001a\u00020I8F¢\u0006\b\u001a\u0006\b¿\u0001\u0010\u00ad\u0001R\u0013\u0010\\\u001a\u00020I8F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010\u00ad\u0001R\u0012\u0010]\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010mR\u0012\u0010^\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010oR\u0012\u0010_\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010mR\u0012\u0010`\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010mR\u0012\u0010a\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010mR\u0013\u0010b\u001a\u00020I8F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010\u00ad\u0001R\u0012\u0010c\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010mR\u0012\u0010d\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010oR\u0012\u0010e\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010oR\u0012\u0010f\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010mR\u0012\u0010g\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bË\u0001\u0010mR\u0012\u0010h\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010mR\u0012\u0010i\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010mR\u0012\u0010j\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010m¨\u0006á\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AppEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$Surrogate;)V", "screen_name", "", "screen_depth", "", "screen_description", "time_spent", "transition_reason", "type", "message_type", "message_uuid", "entity_id", "source", "source_screen_name", "message", "number_of_notifications", "field_name", "user_input", "tab_group_name", "tab_name", "tag", "additional_info", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;", "button_group_title", "button_title", "button_description", "entity_type", Constants.REFERRER, "root_url", "email_address", "email_category", "test_version", "uuid", "user_agent", "action_name", "url", "page", "section", "component", "element", "name", "url_params", "performance_data", "recipient", "sender", "event_name", ErrorResponse.ERROR_CODE, "error_message", "error_type", "display_message", "exit_status", "institution_id", "institution_name", "institution_search_query", "link_session_id", "mfa_type", "request_id", "plaid_timestamp", "view_name", "status", "accounts", MatchSelectionActivity.TRANSFER_ID_EXTRA, "relationship_id", "duration", "target_screen_name", "clp_value", "", "lcp_value", "etr_value", "description", "instrument_id", "symbol", "direction", "fid_value", "source_tag", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "time", "event_type", "asset_class", "payload", "milliseconds", "po_box", "inp_value", "debug_target", "loading_navigation_value", "loading_navigation_largest_request_duration", "loading_navigation_largest_request_url", "loading_navigation_num_requests", "recommendation_id", "invest_flow_schedule_id", "invest_flow_order_id", "request_duration", "request_url", "response_status_code", "item_index", "message_title", "message_body", "masked_referrer", "masked_email_address", "masked_recipient", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DLjava/lang/String;DDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScreen_name", "()Ljava/lang/String;", "getScreen_depth", "()I", "getScreen_description", "getTime_spent", "getTransition_reason", "getType", "getMessage_type", "getMessage_uuid", "getEntity_id", "getSource", "getSource_screen_name", "getMessage", "getNumber_of_notifications", "getField_name", "getUser_input", "getTab_group_name", "getTab_name", "getTag", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;", "getButton_group_title", "getButton_title", "getButton_description", "getEntity_type", "getReferrer", "getRoot_url", "getEmail_address", "getEmail_category", "getTest_version", "getUuid", "getUser_agent", "getAction_name", "getUrl", "getPage", "getSection", "getComponent", "getElement", "getName", "getUrl_params", "getPerformance_data", "getRecipient", "getSender", "getEvent_name", "getError_code", "getError_message", "getError_type", "getDisplay_message", "getExit_status", "getInstitution_id", "getInstitution_name", "getInstitution_search_query", "getLink_session_id", "getMfa_type", "getRequest_id", "getPlaid_timestamp", "getView_name", "getStatus", "getAccounts", "getTransfer_id", "getRelationship_id", "getDuration", "getTarget_screen_name", "getClp_value", "()D", "getLcp_value", "getEtr_value", "getDescription", "getInstrument_id", "getSymbol", "getDirection", "getFid_value", "getSource_tag", "getItem", "getTime", "getEvent_type", "getAsset_class", "getPayload", "getMilliseconds", "getPo_box", "getInp_value", "getDebug_target", "getLoading_navigation_value", "getLoading_navigation_largest_request_duration", "getLoading_navigation_largest_request_url", "getLoading_navigation_num_requests", "getRecommendation_id", "getInvest_flow_schedule_id", "getInvest_flow_order_id", "getRequest_duration", "getRequest_url", "getResponse_status_code", "getItem_index", "getMessage_title", "getMessage_body", "getMasked_referrer", "getMasked_email_address", "getMasked_recipient", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class AppEventDataDto implements Dto3<AppEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AppEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AppEventDataDto, AppEventData>> binaryBase64Serializer$delegate;
    private static final AppEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AppEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AppEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getScreen_name() {
        return this.surrogate.getScreen_name();
    }

    public final int getScreen_depth() {
        return this.surrogate.getScreen_depth();
    }

    public final String getScreen_description() {
        return this.surrogate.getScreen_description();
    }

    public final int getTime_spent() {
        return this.surrogate.getTime_spent();
    }

    public final String getTransition_reason() {
        return this.surrogate.getTransition_reason();
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final String getMessage_type() {
        return this.surrogate.getMessage_type();
    }

    public final String getMessage_uuid() {
        return this.surrogate.getMessage_uuid();
    }

    public final String getEntity_id() {
        return this.surrogate.getEntity_id();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final String getSource_screen_name() {
        return this.surrogate.getSource_screen_name();
    }

    public final String getMessage() {
        return this.surrogate.getMessage();
    }

    public final int getNumber_of_notifications() {
        return this.surrogate.getNumber_of_notifications();
    }

    public final String getField_name() {
        return this.surrogate.getField_name();
    }

    public final String getUser_input() {
        return this.surrogate.getUser_input();
    }

    public final String getTab_group_name() {
        return this.surrogate.getTab_group_name();
    }

    public final String getTab_name() {
        return this.surrogate.getTab_name();
    }

    public final String getTag() {
        return this.surrogate.getTag();
    }

    public final AppEventDataAdditionalInfoDto getAdditional_info() {
        return this.surrogate.getAdditional_info();
    }

    public final String getButton_group_title() {
        return this.surrogate.getButton_group_title();
    }

    public final String getButton_title() {
        return this.surrogate.getButton_title();
    }

    public final String getButton_description() {
        return this.surrogate.getButton_description();
    }

    public final String getEntity_type() {
        return this.surrogate.getEntity_type();
    }

    public final String getReferrer() {
        return this.surrogate.getReferrer();
    }

    public final String getRoot_url() {
        return this.surrogate.getRoot_url();
    }

    public final String getEmail_address() {
        return this.surrogate.getEmail_address();
    }

    public final String getEmail_category() {
        return this.surrogate.getEmail_category();
    }

    public final String getTest_version() {
        return this.surrogate.getTest_version();
    }

    public final String getUuid() {
        return this.surrogate.getUuid();
    }

    public final String getUser_agent() {
        return this.surrogate.getUser_agent();
    }

    public final String getAction_name() {
        return this.surrogate.getAction_name();
    }

    public final String getUrl() {
        return this.surrogate.getUrl();
    }

    public final String getPage() {
        return this.surrogate.getPage();
    }

    public final String getSection() {
        return this.surrogate.getSection();
    }

    public final String getComponent() {
        return this.surrogate.getComponent();
    }

    public final String getElement() {
        return this.surrogate.getElement();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getUrl_params() {
        return this.surrogate.getUrl_params();
    }

    public final String getPerformance_data() {
        return this.surrogate.getPerformance_data();
    }

    public final String getRecipient() {
        return this.surrogate.getRecipient();
    }

    public final String getSender() {
        return this.surrogate.getSender();
    }

    public final String getEvent_name() {
        return this.surrogate.getEvent_name();
    }

    public final String getError_code() {
        return this.surrogate.getError_code();
    }

    public final String getError_message() {
        return this.surrogate.getError_message();
    }

    public final String getError_type() {
        return this.surrogate.getError_type();
    }

    public final String getDisplay_message() {
        return this.surrogate.getDisplay_message();
    }

    public final String getExit_status() {
        return this.surrogate.getExit_status();
    }

    public final String getInstitution_id() {
        return this.surrogate.getInstitution_id();
    }

    public final String getInstitution_name() {
        return this.surrogate.getInstitution_name();
    }

    public final String getInstitution_search_query() {
        return this.surrogate.getInstitution_search_query();
    }

    public final String getLink_session_id() {
        return this.surrogate.getLink_session_id();
    }

    public final String getMfa_type() {
        return this.surrogate.getMfa_type();
    }

    public final String getRequest_id() {
        return this.surrogate.getRequest_id();
    }

    public final String getPlaid_timestamp() {
        return this.surrogate.getPlaid_timestamp();
    }

    public final String getView_name() {
        return this.surrogate.getView_name();
    }

    public final String getStatus() {
        return this.surrogate.getStatus();
    }

    public final String getAccounts() {
        return this.surrogate.getAccounts();
    }

    public final String getTransfer_id() {
        return this.surrogate.getTransfer_id();
    }

    public final String getRelationship_id() {
        return this.surrogate.getRelationship_id();
    }

    public final int getDuration() {
        return this.surrogate.getDuration();
    }

    public final String getTarget_screen_name() {
        return this.surrogate.getTarget_screen_name();
    }

    public final double getClp_value() {
        return this.surrogate.getClp_value();
    }

    public final double getLcp_value() {
        return this.surrogate.getLcp_value();
    }

    public final double getEtr_value() {
        return this.surrogate.getEtr_value();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getDirection() {
        return this.surrogate.getDirection();
    }

    public final double getFid_value() {
        return this.surrogate.getFid_value();
    }

    public final String getSource_tag() {
        return this.surrogate.getSource_tag();
    }

    public final String getItem() {
        return this.surrogate.getItem();
    }

    public final int getTime() {
        return this.surrogate.getTime();
    }

    public final String getEvent_type() {
        return this.surrogate.getEvent_type();
    }

    public final String getAsset_class() {
        return this.surrogate.getAsset_class();
    }

    public final String getPayload() {
        return this.surrogate.getPayload();
    }

    public final double getMilliseconds() {
        return this.surrogate.getMilliseconds();
    }

    public final String getPo_box() {
        return this.surrogate.getPo_box();
    }

    public final double getInp_value() {
        return this.surrogate.getInp_value();
    }

    public final String getDebug_target() {
        return this.surrogate.getDebug_target();
    }

    public final double getLoading_navigation_value() {
        return this.surrogate.getLoading_navigation_value();
    }

    public final double getLoading_navigation_largest_request_duration() {
        return this.surrogate.getLoading_navigation_largest_request_duration();
    }

    public final String getLoading_navigation_largest_request_url() {
        return this.surrogate.getLoading_navigation_largest_request_url();
    }

    public final int getLoading_navigation_num_requests() {
        return this.surrogate.getLoading_navigation_num_requests();
    }

    public final String getRecommendation_id() {
        return this.surrogate.getRecommendation_id();
    }

    public final String getInvest_flow_schedule_id() {
        return this.surrogate.getInvest_flow_schedule_id();
    }

    public final String getInvest_flow_order_id() {
        return this.surrogate.getInvest_flow_order_id();
    }

    public final double getRequest_duration() {
        return this.surrogate.getRequest_duration();
    }

    public final String getRequest_url() {
        return this.surrogate.getRequest_url();
    }

    public final int getResponse_status_code() {
        return this.surrogate.getResponse_status_code();
    }

    public final int getItem_index() {
        return this.surrogate.getItem_index();
    }

    public final String getMessage_title() {
        return this.surrogate.getMessage_title();
    }

    public final String getMessage_body() {
        return this.surrogate.getMessage_body();
    }

    public final String getMasked_referrer() {
        return this.surrogate.getMasked_referrer();
    }

    public final String getMasked_email_address() {
        return this.surrogate.getMasked_email_address();
    }

    public final String getMasked_recipient() {
        return this.surrogate.getMasked_recipient();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppEventDataDto(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, String str11, String str12, String str13, String str14, String str15, AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, int i4, String str56, double d, double d2, double d3, String str57, String str58, String str59, String str60, double d4, String str61, String str62, int i5, String str63, String str64, String str65, double d5, String str66, double d6, String str67, double d7, double d8, String str68, int i6, String str69, String str70, String str71, double d9, String str72, int i7, int i8, String str73, String str74, String str75, String str76, String str77, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str78 = (i9 & 1) != 0 ? "" : str;
        int i12 = (i9 & 2) != 0 ? 0 : i;
        String str79 = (i9 & 4) != 0 ? "" : str2;
        int i13 = (i9 & 8) != 0 ? 0 : i2;
        String str80 = (i9 & 16) != 0 ? "" : str3;
        String str81 = (i9 & 32) != 0 ? "" : str4;
        String str82 = (i9 & 64) != 0 ? "" : str5;
        String str83 = (i9 & 128) != 0 ? "" : str6;
        String str84 = (i9 & 256) != 0 ? "" : str7;
        String str85 = (i9 & 512) != 0 ? "" : str8;
        String str86 = (i9 & 1024) != 0 ? "" : str9;
        String str87 = (i9 & 2048) != 0 ? "" : str10;
        String str88 = str78;
        int i14 = (i9 & 4096) != 0 ? 0 : i3;
        String str89 = (i9 & 8192) != 0 ? "" : str11;
        String str90 = (i9 & 16384) != 0 ? "" : str12;
        String str91 = (i9 & 32768) != 0 ? "" : str13;
        String str92 = (i9 & 65536) != 0 ? "" : str14;
        String str93 = (i9 & 131072) != 0 ? "" : str15;
        AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto2 = (i9 & 262144) != 0 ? null : appEventDataAdditionalInfoDto;
        String str94 = (i9 & 524288) != 0 ? "" : str16;
        String str95 = (i9 & 1048576) != 0 ? "" : str17;
        String str96 = (i9 & 2097152) != 0 ? "" : str18;
        String str97 = (i9 & 4194304) != 0 ? "" : str19;
        String str98 = (i9 & 8388608) != 0 ? "" : str20;
        String str99 = (i9 & 16777216) != 0 ? "" : str21;
        String str100 = (i9 & 33554432) != 0 ? "" : str22;
        String str101 = (i9 & 67108864) != 0 ? "" : str23;
        String str102 = (i9 & 134217728) != 0 ? "" : str24;
        String str103 = (i9 & 268435456) != 0 ? "" : str25;
        String str104 = (i9 & 536870912) != 0 ? "" : str26;
        String str105 = (i9 & 1073741824) != 0 ? "" : str27;
        String str106 = (i9 & Integer.MIN_VALUE) != 0 ? "" : str28;
        this(str88, i12, str79, i13, str80, str81, str82, str83, str84, str85, str86, str87, i14, str89, str90, str91, str92, str93, appEventDataAdditionalInfoDto2, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, (i10 & 1) != 0 ? "" : str29, (i10 & 2) != 0 ? "" : str30, (i10 & 4) != 0 ? "" : str31, (i10 & 8) != 0 ? "" : str32, (i10 & 16) != 0 ? "" : str33, (i10 & 32) != 0 ? "" : str34, (i10 & 64) != 0 ? "" : str35, (i10 & 128) != 0 ? "" : str36, (i10 & 256) != 0 ? "" : str37, (i10 & 512) != 0 ? "" : str38, (i10 & 1024) != 0 ? "" : str39, (i10 & 2048) != 0 ? "" : str40, (i10 & 4096) != 0 ? "" : str41, (i10 & 8192) != 0 ? "" : str42, (i10 & 16384) != 0 ? "" : str43, (i10 & 32768) != 0 ? "" : str44, (i10 & 65536) != 0 ? "" : str45, (i10 & 131072) != 0 ? "" : str46, (i10 & 262144) != 0 ? "" : str47, (i10 & 524288) != 0 ? "" : str48, (i10 & 1048576) != 0 ? "" : str49, (i10 & 2097152) != 0 ? "" : str50, (i10 & 4194304) != 0 ? "" : str51, (i10 & 8388608) != 0 ? "" : str52, (i10 & 16777216) != 0 ? "" : str53, (i10 & 33554432) != 0 ? "" : str54, (i10 & 67108864) != 0 ? "" : str55, (i10 & 134217728) != 0 ? 0 : i4, (i10 & 268435456) != 0 ? "" : str56, (i10 & 536870912) != 0 ? 0.0d : d, (i10 & 1073741824) != 0 ? 0.0d : d2, (i10 & Integer.MIN_VALUE) != 0 ? 0.0d : d3, (i11 & 1) != 0 ? "" : str57, (i11 & 2) != 0 ? "" : str58, (i11 & 4) != 0 ? "" : str59, (i11 & 8) != 0 ? "" : str60, (i11 & 16) != 0 ? 0.0d : d4, (i11 & 32) != 0 ? "" : str61, (i11 & 64) != 0 ? "" : str62, (i11 & 128) != 0 ? 0 : i5, (i11 & 256) != 0 ? "" : str63, (i11 & 512) != 0 ? "" : str64, (i11 & 1024) != 0 ? "" : str65, (i11 & 2048) != 0 ? 0.0d : d5, (i11 & 4096) != 0 ? "" : str66, (i11 & 8192) != 0 ? 0.0d : d6, (i11 & 16384) != 0 ? "" : str67, (i11 & 32768) != 0 ? 0.0d : d7, (i11 & 65536) != 0 ? 0.0d : d8, (i11 & 131072) != 0 ? "" : str68, (i11 & 262144) != 0 ? 0 : i6, (i11 & 524288) != 0 ? "" : str69, (i11 & 1048576) != 0 ? "" : str70, (i11 & 2097152) != 0 ? "" : str71, (i11 & 4194304) == 0 ? d9 : 0.0d, (i11 & 8388608) != 0 ? "" : str72, (i11 & 16777216) != 0 ? 0 : i7, (i11 & 33554432) != 0 ? 0 : i8, (i11 & 67108864) != 0 ? "" : str73, (i11 & 134217728) != 0 ? "" : str74, (i11 & 268435456) != 0 ? "" : str75, (i11 & 536870912) != 0 ? "" : str76, (i11 & 1073741824) != 0 ? "" : str77);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppEventDataDto(String screen_name, int i, String screen_description, int i2, String transition_reason, String type2, String message_type, String message_uuid, String entity_id, String source, String source_screen_name, String message, int i3, String field_name, String user_input, String tab_group_name, String tab_name, String tag, AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto, String button_group_title, String button_title, String button_description, String entity_type, String referrer, String root_url, String email_address, String email_category, String test_version, String uuid, String user_agent, String action_name, String url, String page, String section, String component, String element, String name, String url_params, String performance_data, String recipient, String sender, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String transfer_id, String relationship_id, int i4, String target_screen_name, double d, double d2, double d3, String description, String instrument_id, String symbol, String direction, double d4, String source_tag, String item, int i5, String event_type, String asset_class, String payload, double d5, String po_box, double d6, String debug_target, double d7, double d8, String loading_navigation_largest_request_url, int i6, String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id, double d9, String request_url, int i7, int i8, String message_title, String message_body, String masked_referrer, String masked_email_address, String masked_recipient) {
        this(new Surrogate(screen_name, i, screen_description, i2, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, message, i3, field_name, user_input, tab_group_name, tab_name, tag, appEventDataAdditionalInfoDto, button_group_title, button_title, button_description, entity_type, referrer, root_url, email_address, email_category, test_version, uuid, user_agent, action_name, url, page, section, component, element, name, url_params, performance_data, recipient, sender, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, transfer_id, relationship_id, i4, target_screen_name, d, d2, d3, description, instrument_id, symbol, direction, d4, source_tag, item, i5, event_type, asset_class, payload, d5, po_box, d6, debug_target, d7, d8, loading_navigation_largest_request_url, i6, recommendation_id, invest_flow_schedule_id, invest_flow_order_id, d9, request_url, i7, i8, message_title, message_body, masked_referrer, masked_email_address, masked_recipient));
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(screen_description, "screen_description");
        Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(field_name, "field_name");
        Intrinsics.checkNotNullParameter(user_input, "user_input");
        Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
        Intrinsics.checkNotNullParameter(tab_name, "tab_name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(button_description, "button_description");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(root_url, "root_url");
        Intrinsics.checkNotNullParameter(email_address, "email_address");
        Intrinsics.checkNotNullParameter(email_category, "email_category");
        Intrinsics.checkNotNullParameter(test_version, "test_version");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(action_name, "action_name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url_params, "url_params");
        Intrinsics.checkNotNullParameter(performance_data, "performance_data");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(display_message, "display_message");
        Intrinsics.checkNotNullParameter(exit_status, "exit_status");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(institution_search_query, "institution_search_query");
        Intrinsics.checkNotNullParameter(link_session_id, "link_session_id");
        Intrinsics.checkNotNullParameter(mfa_type, "mfa_type");
        Intrinsics.checkNotNullParameter(request_id, "request_id");
        Intrinsics.checkNotNullParameter(plaid_timestamp, "plaid_timestamp");
        Intrinsics.checkNotNullParameter(view_name, "view_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(source_tag, "source_tag");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(debug_target, "debug_target");
        Intrinsics.checkNotNullParameter(loading_navigation_largest_request_url, "loading_navigation_largest_request_url");
        Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
        Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
        Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(message_title, "message_title");
        Intrinsics.checkNotNullParameter(message_body, "message_body");
        Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
        Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
        Intrinsics.checkNotNullParameter(masked_recipient, "masked_recipient");
    }

    public static /* synthetic */ AppEventDataDto copy$default(AppEventDataDto appEventDataDto, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, String str11, String str12, String str13, String str14, String str15, AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, int i4, String str56, double d, double d2, double d3, String str57, String str58, String str59, String str60, double d4, String str61, String str62, int i5, String str63, String str64, String str65, double d5, String str66, double d6, String str67, double d7, double d8, String str68, int i6, String str69, String str70, String str71, double d9, String str72, int i7, int i8, String str73, String str74, String str75, String str76, String str77, int i9, int i10, int i11, Object obj) {
        String screen_name = (i9 & 1) != 0 ? appEventDataDto.surrogate.getScreen_name() : str;
        return appEventDataDto.copy(screen_name, (i9 & 2) != 0 ? appEventDataDto.surrogate.getScreen_depth() : i, (i9 & 4) != 0 ? appEventDataDto.surrogate.getScreen_description() : str2, (i9 & 8) != 0 ? appEventDataDto.surrogate.getTime_spent() : i2, (i9 & 16) != 0 ? appEventDataDto.surrogate.getTransition_reason() : str3, (i9 & 32) != 0 ? appEventDataDto.surrogate.getType() : str4, (i9 & 64) != 0 ? appEventDataDto.surrogate.getMessage_type() : str5, (i9 & 128) != 0 ? appEventDataDto.surrogate.getMessage_uuid() : str6, (i9 & 256) != 0 ? appEventDataDto.surrogate.getEntity_id() : str7, (i9 & 512) != 0 ? appEventDataDto.surrogate.getSource() : str8, (i9 & 1024) != 0 ? appEventDataDto.surrogate.getSource_screen_name() : str9, (i9 & 2048) != 0 ? appEventDataDto.surrogate.getMessage() : str10, (i9 & 4096) != 0 ? appEventDataDto.surrogate.getNumber_of_notifications() : i3, (i9 & 8192) != 0 ? appEventDataDto.surrogate.getField_name() : str11, (i9 & 16384) != 0 ? appEventDataDto.surrogate.getUser_input() : str12, (i9 & 32768) != 0 ? appEventDataDto.surrogate.getTab_group_name() : str13, (i9 & 65536) != 0 ? appEventDataDto.surrogate.getTab_name() : str14, (i9 & 131072) != 0 ? appEventDataDto.surrogate.getTag() : str15, (i9 & 262144) != 0 ? appEventDataDto.surrogate.getAdditional_info() : appEventDataAdditionalInfoDto, (i9 & 524288) != 0 ? appEventDataDto.surrogate.getButton_group_title() : str16, (i9 & 1048576) != 0 ? appEventDataDto.surrogate.getButton_title() : str17, (i9 & 2097152) != 0 ? appEventDataDto.surrogate.getButton_description() : str18, (i9 & 4194304) != 0 ? appEventDataDto.surrogate.getEntity_type() : str19, (i9 & 8388608) != 0 ? appEventDataDto.surrogate.getReferrer() : str20, (i9 & 16777216) != 0 ? appEventDataDto.surrogate.getRoot_url() : str21, (i9 & 33554432) != 0 ? appEventDataDto.surrogate.getEmail_address() : str22, (i9 & 67108864) != 0 ? appEventDataDto.surrogate.getEmail_category() : str23, (i9 & 134217728) != 0 ? appEventDataDto.surrogate.getTest_version() : str24, (i9 & 268435456) != 0 ? appEventDataDto.surrogate.getUuid() : str25, (i9 & 536870912) != 0 ? appEventDataDto.surrogate.getUser_agent() : str26, (i9 & 1073741824) != 0 ? appEventDataDto.surrogate.getAction_name() : str27, (i9 & Integer.MIN_VALUE) != 0 ? appEventDataDto.surrogate.getUrl() : str28, (i10 & 1) != 0 ? appEventDataDto.surrogate.getPage() : str29, (i10 & 2) != 0 ? appEventDataDto.surrogate.getSection() : str30, (i10 & 4) != 0 ? appEventDataDto.surrogate.getComponent() : str31, (i10 & 8) != 0 ? appEventDataDto.surrogate.getElement() : str32, (i10 & 16) != 0 ? appEventDataDto.surrogate.getName() : str33, (i10 & 32) != 0 ? appEventDataDto.surrogate.getUrl_params() : str34, (i10 & 64) != 0 ? appEventDataDto.surrogate.getPerformance_data() : str35, (i10 & 128) != 0 ? appEventDataDto.surrogate.getRecipient() : str36, (i10 & 256) != 0 ? appEventDataDto.surrogate.getSender() : str37, (i10 & 512) != 0 ? appEventDataDto.surrogate.getEvent_name() : str38, (i10 & 1024) != 0 ? appEventDataDto.surrogate.getError_code() : str39, (i10 & 2048) != 0 ? appEventDataDto.surrogate.getError_message() : str40, (i10 & 4096) != 0 ? appEventDataDto.surrogate.getError_type() : str41, (i10 & 8192) != 0 ? appEventDataDto.surrogate.getDisplay_message() : str42, (i10 & 16384) != 0 ? appEventDataDto.surrogate.getExit_status() : str43, (i10 & 32768) != 0 ? appEventDataDto.surrogate.getInstitution_id() : str44, (i10 & 65536) != 0 ? appEventDataDto.surrogate.getInstitution_name() : str45, (i10 & 131072) != 0 ? appEventDataDto.surrogate.getInstitution_search_query() : str46, (i10 & 262144) != 0 ? appEventDataDto.surrogate.getLink_session_id() : str47, (i10 & 524288) != 0 ? appEventDataDto.surrogate.getMfa_type() : str48, (i10 & 1048576) != 0 ? appEventDataDto.surrogate.getRequest_id() : str49, (i10 & 2097152) != 0 ? appEventDataDto.surrogate.getPlaid_timestamp() : str50, (i10 & 4194304) != 0 ? appEventDataDto.surrogate.getView_name() : str51, (i10 & 8388608) != 0 ? appEventDataDto.surrogate.getStatus() : str52, (i10 & 16777216) != 0 ? appEventDataDto.surrogate.getAccounts() : str53, (i10 & 33554432) != 0 ? appEventDataDto.surrogate.getTransfer_id() : str54, (i10 & 67108864) != 0 ? appEventDataDto.surrogate.getRelationship_id() : str55, (i10 & 134217728) != 0 ? appEventDataDto.surrogate.getDuration() : i4, (i10 & 268435456) != 0 ? appEventDataDto.surrogate.getTarget_screen_name() : str56, (i10 & 536870912) != 0 ? appEventDataDto.surrogate.getClp_value() : d, (1073741824 & i10) != 0 ? appEventDataDto.surrogate.getLcp_value() : d2, (Integer.MIN_VALUE & i10) != 0 ? appEventDataDto.surrogate.getEtr_value() : d3, (i11 & 1) != 0 ? appEventDataDto.surrogate.getDescription() : str57, (i11 & 2) != 0 ? appEventDataDto.surrogate.getInstrument_id() : str58, (i11 & 4) != 0 ? appEventDataDto.surrogate.getSymbol() : str59, (i11 & 8) != 0 ? appEventDataDto.surrogate.getDirection() : str60, (i11 & 16) != 0 ? appEventDataDto.surrogate.getFid_value() : d4, (i11 & 32) != 0 ? appEventDataDto.surrogate.getSource_tag() : str61, (i11 & 64) != 0 ? appEventDataDto.surrogate.getItem() : str62, (i11 & 128) != 0 ? appEventDataDto.surrogate.getTime() : i5, (i11 & 256) != 0 ? appEventDataDto.surrogate.getEvent_type() : str63, (i11 & 512) != 0 ? appEventDataDto.surrogate.getAsset_class() : str64, (i11 & 1024) != 0 ? appEventDataDto.surrogate.getPayload() : str65, (i11 & 2048) != 0 ? appEventDataDto.surrogate.getMilliseconds() : d5, (i11 & 4096) != 0 ? appEventDataDto.surrogate.getPo_box() : str66, (i11 & 8192) != 0 ? appEventDataDto.surrogate.getInp_value() : d6, (i11 & 16384) != 0 ? appEventDataDto.surrogate.getDebug_target() : str67, (i11 & 32768) != 0 ? appEventDataDto.surrogate.getLoading_navigation_value() : d7, (i11 & 65536) != 0 ? appEventDataDto.surrogate.getLoading_navigation_largest_request_duration() : d8, (i11 & 131072) != 0 ? appEventDataDto.surrogate.getLoading_navigation_largest_request_url() : str68, (i11 & 262144) != 0 ? appEventDataDto.surrogate.getLoading_navigation_num_requests() : i6, (i11 & 524288) != 0 ? appEventDataDto.surrogate.getRecommendation_id() : str69, (i11 & 1048576) != 0 ? appEventDataDto.surrogate.getInvest_flow_schedule_id() : str70, (i11 & 2097152) != 0 ? appEventDataDto.surrogate.getInvest_flow_order_id() : str71, (i11 & 4194304) != 0 ? appEventDataDto.surrogate.getRequest_duration() : d9, (8388608 & i11) != 0 ? appEventDataDto.surrogate.getRequest_url() : str72, (i11 & 16777216) != 0 ? appEventDataDto.surrogate.getResponse_status_code() : i7, (i11 & 33554432) != 0 ? appEventDataDto.surrogate.getItem_index() : i8, (i11 & 67108864) != 0 ? appEventDataDto.surrogate.getMessage_title() : str73, (i11 & 134217728) != 0 ? appEventDataDto.surrogate.getMessage_body() : str74, (i11 & 268435456) != 0 ? appEventDataDto.surrogate.getMasked_referrer() : str75, (i11 & 536870912) != 0 ? appEventDataDto.surrogate.getMasked_email_address() : str76, (i11 & 1073741824) != 0 ? appEventDataDto.surrogate.getMasked_recipient() : str77);
    }

    public final AppEventDataDto copy(String screen_name, int screen_depth, String screen_description, int time_spent, String transition_reason, String type2, String message_type, String message_uuid, String entity_id, String source, String source_screen_name, String message, int number_of_notifications, String field_name, String user_input, String tab_group_name, String tab_name, String tag, AppEventDataAdditionalInfoDto additional_info, String button_group_title, String button_title, String button_description, String entity_type, String referrer, String root_url, String email_address, String email_category, String test_version, String uuid, String user_agent, String action_name, String url, String page, String section, String component, String element, String name, String url_params, String performance_data, String recipient, String sender, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String transfer_id, String relationship_id, int duration, String target_screen_name, double clp_value, double lcp_value, double etr_value, String description, String instrument_id, String symbol, String direction, double fid_value, String source_tag, String item, int time, String event_type, String asset_class, String payload, double milliseconds, String po_box, double inp_value, String debug_target, double loading_navigation_value, double loading_navigation_largest_request_duration, String loading_navigation_largest_request_url, int loading_navigation_num_requests, String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id, double request_duration, String request_url, int response_status_code, int item_index, String message_title, String message_body, String masked_referrer, String masked_email_address, String masked_recipient) {
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(screen_description, "screen_description");
        Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(field_name, "field_name");
        Intrinsics.checkNotNullParameter(user_input, "user_input");
        Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
        Intrinsics.checkNotNullParameter(tab_name, "tab_name");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(button_description, "button_description");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(root_url, "root_url");
        Intrinsics.checkNotNullParameter(email_address, "email_address");
        Intrinsics.checkNotNullParameter(email_category, "email_category");
        Intrinsics.checkNotNullParameter(test_version, "test_version");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(action_name, "action_name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url_params, "url_params");
        Intrinsics.checkNotNullParameter(performance_data, "performance_data");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(display_message, "display_message");
        Intrinsics.checkNotNullParameter(exit_status, "exit_status");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(institution_search_query, "institution_search_query");
        Intrinsics.checkNotNullParameter(link_session_id, "link_session_id");
        Intrinsics.checkNotNullParameter(mfa_type, "mfa_type");
        Intrinsics.checkNotNullParameter(request_id, "request_id");
        Intrinsics.checkNotNullParameter(plaid_timestamp, "plaid_timestamp");
        Intrinsics.checkNotNullParameter(view_name, "view_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(source_tag, "source_tag");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(debug_target, "debug_target");
        Intrinsics.checkNotNullParameter(loading_navigation_largest_request_url, "loading_navigation_largest_request_url");
        Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
        Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
        Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(message_title, "message_title");
        Intrinsics.checkNotNullParameter(message_body, "message_body");
        Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
        Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
        Intrinsics.checkNotNullParameter(masked_recipient, "masked_recipient");
        return new AppEventDataDto(new Surrogate(screen_name, screen_depth, screen_description, time_spent, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, message, number_of_notifications, field_name, user_input, tab_group_name, tab_name, tag, additional_info, button_group_title, button_title, button_description, entity_type, referrer, root_url, email_address, email_category, test_version, uuid, user_agent, action_name, url, page, section, component, element, name, url_params, performance_data, recipient, sender, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, transfer_id, relationship_id, duration, target_screen_name, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, fid_value, source_tag, item, time, event_type, asset_class, payload, milliseconds, po_box, inp_value, debug_target, loading_navigation_value, loading_navigation_largest_request_duration, loading_navigation_largest_request_url, loading_navigation_num_requests, recommendation_id, invest_flow_schedule_id, invest_flow_order_id, request_duration, request_url, response_status_code, item_index, message_title, message_body, masked_referrer, masked_email_address, masked_recipient));
    }

    @Override // com.robinhood.idl.Dto
    public AppEventData toProto() {
        String screen_name = this.surrogate.getScreen_name();
        int screen_depth = this.surrogate.getScreen_depth();
        String screen_description = this.surrogate.getScreen_description();
        int time_spent = this.surrogate.getTime_spent();
        String transition_reason = this.surrogate.getTransition_reason();
        String type2 = this.surrogate.getType();
        String message_type = this.surrogate.getMessage_type();
        String message_uuid = this.surrogate.getMessage_uuid();
        String entity_id = this.surrogate.getEntity_id();
        String source = this.surrogate.getSource();
        String source_screen_name = this.surrogate.getSource_screen_name();
        String message = this.surrogate.getMessage();
        int number_of_notifications = this.surrogate.getNumber_of_notifications();
        String field_name = this.surrogate.getField_name();
        String user_input = this.surrogate.getUser_input();
        String tab_group_name = this.surrogate.getTab_group_name();
        String tab_name = this.surrogate.getTab_name();
        String tag = this.surrogate.getTag();
        AppEventDataAdditionalInfoDto additional_info = this.surrogate.getAdditional_info();
        return new AppEventData(screen_name, screen_depth, screen_description, time_spent, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, message, number_of_notifications, field_name, user_input, tab_group_name, tab_name, tag, additional_info != null ? additional_info.toProto() : null, this.surrogate.getButton_group_title(), this.surrogate.getButton_title(), this.surrogate.getButton_description(), this.surrogate.getEntity_type(), this.surrogate.getReferrer(), this.surrogate.getRoot_url(), this.surrogate.getEmail_address(), this.surrogate.getEmail_category(), this.surrogate.getTest_version(), this.surrogate.getUuid(), this.surrogate.getUser_agent(), this.surrogate.getAction_name(), this.surrogate.getUrl(), this.surrogate.getPage(), this.surrogate.getSection(), this.surrogate.getComponent(), this.surrogate.getElement(), this.surrogate.getName(), this.surrogate.getUrl_params(), this.surrogate.getPerformance_data(), this.surrogate.getRecipient(), this.surrogate.getSender(), this.surrogate.getEvent_name(), this.surrogate.getError_code(), this.surrogate.getError_message(), this.surrogate.getError_type(), this.surrogate.getDisplay_message(), this.surrogate.getExit_status(), this.surrogate.getInstitution_id(), this.surrogate.getInstitution_name(), this.surrogate.getInstitution_search_query(), this.surrogate.getLink_session_id(), this.surrogate.getMfa_type(), this.surrogate.getRequest_id(), this.surrogate.getPlaid_timestamp(), this.surrogate.getView_name(), this.surrogate.getStatus(), this.surrogate.getAccounts(), this.surrogate.getTransfer_id(), this.surrogate.getRelationship_id(), this.surrogate.getDuration(), this.surrogate.getTarget_screen_name(), this.surrogate.getClp_value(), this.surrogate.getLcp_value(), this.surrogate.getEtr_value(), this.surrogate.getDescription(), this.surrogate.getInstrument_id(), this.surrogate.getSymbol(), this.surrogate.getDirection(), this.surrogate.getFid_value(), this.surrogate.getSource_tag(), this.surrogate.getItem(), this.surrogate.getTime(), this.surrogate.getEvent_type(), this.surrogate.getAsset_class(), this.surrogate.getPayload(), this.surrogate.getMilliseconds(), this.surrogate.getPo_box(), this.surrogate.getInp_value(), this.surrogate.getDebug_target(), this.surrogate.getLoading_navigation_value(), this.surrogate.getLoading_navigation_largest_request_duration(), this.surrogate.getLoading_navigation_largest_request_url(), this.surrogate.getLoading_navigation_num_requests(), this.surrogate.getRecommendation_id(), this.surrogate.getInvest_flow_schedule_id(), this.surrogate.getInvest_flow_order_id(), this.surrogate.getRequest_duration(), this.surrogate.getRequest_url(), this.surrogate.getResponse_status_code(), this.surrogate.getItem_index(), this.surrogate.getMessage_title(), this.surrogate.getMessage_body(), this.surrogate.getMasked_referrer(), this.surrogate.getMasked_email_address(), this.surrogate.getMasked_recipient(), null, 0, 0, Integer.MIN_VALUE, null);
    }

    public String toString() {
        return "[AppEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AppEventDataDto) && Intrinsics.areEqual(((AppEventDataDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0003\b¥\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 £\u00032\u00020\u0001:\u0004¢\u0003£\u0003B¾\t\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\u0003\u0012\b\b\u0002\u0010'\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\b\b\u0002\u0010,\u001a\u00020\u0003\u0012\b\b\u0002\u0010-\u001a\u00020\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u0003\u0012\b\b\u0002\u00100\u001a\u00020\u0003\u0012\b\b\u0002\u00101\u001a\u00020\u0003\u0012\b\b\u0002\u00102\u001a\u00020\u0003\u0012\b\b\u0002\u00103\u001a\u00020\u0003\u0012\b\b\u0002\u00104\u001a\u00020\u0003\u0012\b\b\u0002\u00105\u001a\u00020\u0003\u0012\b\b\u0002\u00106\u001a\u00020\u0003\u0012\b\b\u0002\u00107\u001a\u00020\u0003\u0012\b\b\u0002\u00108\u001a\u00020\u0003\u0012\b\b\u0002\u00109\u001a\u00020\u0003\u0012\b\b\u0002\u0010:\u001a\u00020\u0003\u0012\b\b\u0002\u0010;\u001a\u00020\u0003\u0012\b\b\u0002\u0010<\u001a\u00020\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\u0003\u0012\b\b\u0002\u0010>\u001a\u00020\u0003\u0012\b\b\u0002\u0010?\u001a\u00020\u0003\u0012\b\b\u0002\u0010@\u001a\u00020\u0003\u0012\b\b\u0002\u0010A\u001a\u00020\u0003\u0012\b\b\u0002\u0010B\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010C\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0D\u0012\b\b\u0002\u0010E\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010F\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\u0017\b\u0002\u0010I\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\u0017\b\u0002\u0010J\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\b\b\u0002\u0010K\u001a\u00020\u0003\u0012\b\b\u0002\u0010L\u001a\u00020\u0003\u0012\b\b\u0002\u0010M\u001a\u00020\u0003\u0012\b\b\u0002\u0010N\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010O\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\b\b\u0002\u0010P\u001a\u00020\u0003\u0012\b\b\u0002\u0010Q\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010R\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010S\u001a\u00020\u0003\u0012\b\b\u0002\u0010T\u001a\u00020\u0003\u0012\b\b\u0002\u0010U\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010V\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\b\b\u0002\u0010W\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010X\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\b\b\u0002\u0010Y\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010Z\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\u0017\b\u0002\u0010[\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\b\b\u0002\u0010\\\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010]\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010^\u001a\u00020\u0003\u0012\b\b\u0002\u0010_\u001a\u00020\u0003\u0012\b\b\u0002\u0010`\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010a\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H\u0012\b\b\u0002\u0010b\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010c\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010d\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010e\u001a\u00020\u0003\u0012\b\b\u0002\u0010f\u001a\u00020\u0003\u0012\b\b\u0002\u0010g\u001a\u00020\u0003\u0012\b\b\u0002\u0010h\u001a\u00020\u0003\u0012\b\b\u0002\u0010i\u001a\u00020\u0003¢\u0006\u0004\bj\u0010kB¿\u0007\b\u0010\u0012\u0006\u0010l\u001a\u00020\u0005\u0012\u0006\u0010m\u001a\u00020\u0005\u0012\u0006\u0010n\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010F\u001a\u00020G\u0012\u0006\u0010I\u001a\u00020G\u0012\u0006\u0010J\u001a\u00020G\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010O\u001a\u00020G\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010R\u001a\u00020\u0005\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010V\u001a\u00020G\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010X\u001a\u00020G\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010Z\u001a\u00020G\u0012\u0006\u0010[\u001a\u00020G\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010]\u001a\u00020\u0005\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010a\u001a\u00020G\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010c\u001a\u00020\u0005\u0012\u0006\u0010d\u001a\u00020\u0005\u0012\b\u0010e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010o\u001a\u0004\u0018\u00010p¢\u0006\u0004\bj\u0010qJ\n\u0010µ\u0002\u001a\u00020\u0003HÆ\u0003J\u0019\u0010¶\u0002\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\n\u0010·\u0002\u001a\u00020\u0003HÆ\u0003J\u0019\u0010¸\u0002\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\n\u0010¹\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010º\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010»\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010½\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¾\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¿\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010À\u0002\u001a\u00020\u0003HÆ\u0003J\u0019\u0010Á\u0002\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\n\u0010Â\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ä\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Å\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0002\u001a\u00020\u0003HÆ\u0003J\f\u0010Ç\u0002\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\n\u0010È\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010É\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ê\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ë\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ì\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Í\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Î\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ï\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ð\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ò\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ó\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ö\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010×\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ø\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ù\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ú\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Û\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ü\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Ý\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010Þ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ß\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010à\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010á\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010â\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ã\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ä\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010å\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010æ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ç\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010è\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010é\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ê\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ë\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ì\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010í\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010î\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ï\u0002\u001a\u00020\u0003HÆ\u0003J\u0019\u0010ð\u0002\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0DHÆ\u0003J\n\u0010ñ\u0002\u001a\u00020\u0003HÆ\u0003J\u0019\u0010ò\u0002\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\u0019\u0010ó\u0002\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\u0019\u0010ô\u0002\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\n\u0010õ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ö\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010÷\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ø\u0002\u001a\u00020\u0003HÆ\u0003J\u0019\u0010ù\u0002\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\n\u0010ú\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010û\u0002\u001a\u00020\u0003HÆ\u0003J\u0019\u0010ü\u0002\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\n\u0010ý\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010þ\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010ÿ\u0002\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0080\u0003\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\n\u0010\u0081\u0003\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0082\u0003\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\n\u0010\u0083\u0003\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0084\u0003\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\u0019\u0010\u0085\u0003\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\n\u0010\u0086\u0003\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0087\u0003\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\n\u0010\u0088\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008a\u0003\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u008b\u0003\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0HHÆ\u0003J\n\u0010\u008c\u0003\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u008d\u0003\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0019\u0010\u008e\u0003\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\n\u0010\u008f\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0003\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0003\u001a\u00020\u0003HÆ\u0003JÁ\t\u0010\u0094\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u0017\b\u0002\u0010\u0013\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\u0017\b\u0002\u0010C\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0D2\b\b\u0002\u0010E\u001a\u00020\u00032\u0017\b\u0002\u0010F\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\u0017\b\u0002\u0010I\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\u0017\b\u0002\u0010J\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\b\b\u0002\u0010K\u001a\u00020\u00032\b\b\u0002\u0010L\u001a\u00020\u00032\b\b\u0002\u0010M\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u00020\u00032\u0017\b\u0002\u0010O\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\b\b\u0002\u0010P\u001a\u00020\u00032\b\b\u0002\u0010Q\u001a\u00020\u00032\u0017\b\u0002\u0010R\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010S\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\u00032\u0017\b\u0002\u0010V\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\b\b\u0002\u0010W\u001a\u00020\u00032\u0017\b\u0002\u0010X\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\b\b\u0002\u0010Y\u001a\u00020\u00032\u0017\b\u0002\u0010Z\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\u0017\b\u0002\u0010[\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\b\b\u0002\u0010\\\u001a\u00020\u00032\u0017\b\u0002\u0010]\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010^\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u00032\b\b\u0002\u0010`\u001a\u00020\u00032\u0017\b\u0002\u0010a\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H2\b\b\u0002\u0010b\u001a\u00020\u00032\u0017\b\u0002\u0010c\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010d\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010e\u001a\u00020\u00032\b\b\u0002\u0010f\u001a\u00020\u00032\b\b\u0002\u0010g\u001a\u00020\u00032\b\b\u0002\u0010h\u001a\u00020\u00032\b\b\u0002\u0010i\u001a\u00020\u0003HÆ\u0001J\u0016\u0010\u0095\u0003\u001a\u00030\u0096\u00032\t\u0010\u0097\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0098\u0003\u001a\u00020\u0005HÖ\u0001J\n\u0010\u0099\u0003\u001a\u00020\u0003HÖ\u0001J-\u0010\u009a\u0003\u001a\u00030\u009b\u00032\u0007\u0010\u009c\u0003\u001a\u00020\u00002\b\u0010\u009d\u0003\u001a\u00030\u009e\u00032\b\u0010\u009f\u0003\u001a\u00030 \u0003H\u0001¢\u0006\u0003\b¡\u0003R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u0010s\u001a\u0004\bt\u0010uR+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bv\u0010s\u001a\u0004\bw\u0010xR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u0010s\u001a\u0004\bz\u0010uR+\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u0010s\u001a\u0004\b|\u0010xR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010s\u001a\u0004\b~\u0010uR\u001d\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0000\u0012\u0004\b\u007f\u0010s\u001a\u0005\b\u0080\u0001\u0010uR\u001e\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0081\u0001\u0010s\u001a\u0005\b\u0082\u0001\u0010uR\u001e\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0083\u0001\u0010s\u001a\u0005\b\u0084\u0001\u0010uR\u001e\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0085\u0001\u0010s\u001a\u0005\b\u0086\u0001\u0010uR\u001e\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0087\u0001\u0010s\u001a\u0005\b\u0088\u0001\u0010uR\u001e\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0089\u0001\u0010s\u001a\u0005\b\u008a\u0001\u0010uR\u001e\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008b\u0001\u0010s\u001a\u0005\b\u008c\u0001\u0010uR-\u0010\u0013\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008d\u0001\u0010s\u001a\u0005\b\u008e\u0001\u0010xR\u001e\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008f\u0001\u0010s\u001a\u0005\b\u0090\u0001\u0010uR\u001e\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0091\u0001\u0010s\u001a\u0005\b\u0092\u0001\u0010uR\u001e\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0093\u0001\u0010s\u001a\u0005\b\u0094\u0001\u0010uR\u001e\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0095\u0001\u0010s\u001a\u0005\b\u0096\u0001\u0010uR\u001e\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0097\u0001\u0010s\u001a\u0005\b\u0098\u0001\u0010uR!\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0099\u0001\u0010s\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001e\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009c\u0001\u0010s\u001a\u0005\b\u009d\u0001\u0010uR\u001e\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009e\u0001\u0010s\u001a\u0005\b\u009f\u0001\u0010uR\u001e\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b \u0001\u0010s\u001a\u0005\b¡\u0001\u0010uR\u001e\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¢\u0001\u0010s\u001a\u0005\b£\u0001\u0010uR\u001e\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¤\u0001\u0010s\u001a\u0005\b¥\u0001\u0010uR\u001e\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¦\u0001\u0010s\u001a\u0005\b§\u0001\u0010uR\u001e\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¨\u0001\u0010s\u001a\u0005\b©\u0001\u0010uR\u001e\u0010\"\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bª\u0001\u0010s\u001a\u0005\b«\u0001\u0010uR\u001e\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¬\u0001\u0010s\u001a\u0005\b\u00ad\u0001\u0010uR\u001e\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b®\u0001\u0010s\u001a\u0005\b¯\u0001\u0010uR\u001e\u0010%\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b°\u0001\u0010s\u001a\u0005\b±\u0001\u0010uR\u001e\u0010&\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b²\u0001\u0010s\u001a\u0005\b³\u0001\u0010uR\u001e\u0010'\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b´\u0001\u0010s\u001a\u0005\bµ\u0001\u0010uR\u001e\u0010(\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¶\u0001\u0010s\u001a\u0005\b·\u0001\u0010uR\u001e\u0010)\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¸\u0001\u0010s\u001a\u0005\b¹\u0001\u0010uR\u001e\u0010*\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bº\u0001\u0010s\u001a\u0005\b»\u0001\u0010uR\u001e\u0010+\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¼\u0001\u0010s\u001a\u0005\b½\u0001\u0010uR\u001e\u0010,\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¾\u0001\u0010s\u001a\u0005\b¿\u0001\u0010uR\u001e\u0010-\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÀ\u0001\u0010s\u001a\u0005\bÁ\u0001\u0010uR\u001e\u0010.\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÂ\u0001\u0010s\u001a\u0005\bÃ\u0001\u0010uR\u001e\u0010/\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÄ\u0001\u0010s\u001a\u0005\bÅ\u0001\u0010uR\u001e\u00100\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÆ\u0001\u0010s\u001a\u0005\bÇ\u0001\u0010uR\u001e\u00101\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÈ\u0001\u0010s\u001a\u0005\bÉ\u0001\u0010uR\u001e\u00102\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÊ\u0001\u0010s\u001a\u0005\bË\u0001\u0010uR\u001e\u00103\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÌ\u0001\u0010s\u001a\u0005\bÍ\u0001\u0010uR\u001e\u00104\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÎ\u0001\u0010s\u001a\u0005\bÏ\u0001\u0010uR\u001e\u00105\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÐ\u0001\u0010s\u001a\u0005\bÑ\u0001\u0010uR\u001e\u00106\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÒ\u0001\u0010s\u001a\u0005\bÓ\u0001\u0010uR\u001e\u00107\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÔ\u0001\u0010s\u001a\u0005\bÕ\u0001\u0010uR\u001e\u00108\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÖ\u0001\u0010s\u001a\u0005\b×\u0001\u0010uR\u001e\u00109\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bØ\u0001\u0010s\u001a\u0005\bÙ\u0001\u0010uR\u001e\u0010:\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÚ\u0001\u0010s\u001a\u0005\bÛ\u0001\u0010uR\u001e\u0010;\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÜ\u0001\u0010s\u001a\u0005\bÝ\u0001\u0010uR\u001e\u0010<\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÞ\u0001\u0010s\u001a\u0005\bß\u0001\u0010uR\u001e\u0010=\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bà\u0001\u0010s\u001a\u0005\bá\u0001\u0010uR\u001e\u0010>\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bâ\u0001\u0010s\u001a\u0005\bã\u0001\u0010uR\u001e\u0010?\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bä\u0001\u0010s\u001a\u0005\bå\u0001\u0010uR\u001e\u0010@\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bæ\u0001\u0010s\u001a\u0005\bç\u0001\u0010uR\u001e\u0010A\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bè\u0001\u0010s\u001a\u0005\bé\u0001\u0010uR\u001e\u0010B\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bê\u0001\u0010s\u001a\u0005\bë\u0001\u0010uR-\u0010C\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0D8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bì\u0001\u0010s\u001a\u0005\bí\u0001\u0010xR\u001e\u0010E\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bî\u0001\u0010s\u001a\u0005\bï\u0001\u0010uR.\u0010F\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bð\u0001\u0010s\u001a\u0006\bñ\u0001\u0010ò\u0001R.\u0010I\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bó\u0001\u0010s\u001a\u0006\bô\u0001\u0010ò\u0001R.\u0010J\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bõ\u0001\u0010s\u001a\u0006\bö\u0001\u0010ò\u0001R\u001e\u0010K\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b÷\u0001\u0010s\u001a\u0005\bø\u0001\u0010uR\u001e\u0010L\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bù\u0001\u0010s\u001a\u0005\bú\u0001\u0010uR\u001e\u0010M\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bû\u0001\u0010s\u001a\u0005\bü\u0001\u0010uR\u001e\u0010N\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bý\u0001\u0010s\u001a\u0005\bþ\u0001\u0010uR.\u0010O\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÿ\u0001\u0010s\u001a\u0006\b\u0080\u0002\u0010ò\u0001R\u001e\u0010P\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0081\u0002\u0010s\u001a\u0005\b\u0082\u0002\u0010uR\u001e\u0010Q\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0083\u0002\u0010s\u001a\u0005\b\u0084\u0002\u0010uR-\u0010R\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0085\u0002\u0010s\u001a\u0005\b\u0086\u0002\u0010xR\u001e\u0010S\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0087\u0002\u0010s\u001a\u0005\b\u0088\u0002\u0010uR\u001e\u0010T\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0089\u0002\u0010s\u001a\u0005\b\u008a\u0002\u0010uR\u001e\u0010U\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008b\u0002\u0010s\u001a\u0005\b\u008c\u0002\u0010uR.\u0010V\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008d\u0002\u0010s\u001a\u0006\b\u008e\u0002\u0010ò\u0001R\u001e\u0010W\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008f\u0002\u0010s\u001a\u0005\b\u0090\u0002\u0010uR.\u0010X\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0091\u0002\u0010s\u001a\u0006\b\u0092\u0002\u0010ò\u0001R\u001e\u0010Y\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0093\u0002\u0010s\u001a\u0005\b\u0094\u0002\u0010uR.\u0010Z\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0095\u0002\u0010s\u001a\u0006\b\u0096\u0002\u0010ò\u0001R.\u0010[\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0097\u0002\u0010s\u001a\u0006\b\u0098\u0002\u0010ò\u0001R\u001e\u0010\\\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0099\u0002\u0010s\u001a\u0005\b\u009a\u0002\u0010uR-\u0010]\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009b\u0002\u0010s\u001a\u0005\b\u009c\u0002\u0010xR\u001e\u0010^\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009d\u0002\u0010s\u001a\u0005\b\u009e\u0002\u0010uR\u001e\u0010_\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009f\u0002\u0010s\u001a\u0005\b \u0002\u0010uR\u001e\u0010`\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¡\u0002\u0010s\u001a\u0005\b¢\u0002\u0010uR.\u0010a\u001a\u00110G¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b£\u0002\u0010s\u001a\u0006\b¤\u0002\u0010ò\u0001R\u001e\u0010b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¥\u0002\u0010s\u001a\u0005\b¦\u0002\u0010uR-\u0010c\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b§\u0002\u0010s\u001a\u0005\b¨\u0002\u0010xR-\u0010d\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b©\u0002\u0010s\u001a\u0005\bª\u0002\u0010xR\u001e\u0010e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b«\u0002\u0010s\u001a\u0005\b¬\u0002\u0010uR\u001e\u0010f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u00ad\u0002\u0010s\u001a\u0005\b®\u0002\u0010uR\u001e\u0010g\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¯\u0002\u0010s\u001a\u0005\b°\u0002\u0010uR\u001e\u0010h\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b±\u0002\u0010s\u001a\u0005\b²\u0002\u0010uR\u001e\u0010i\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b³\u0002\u0010s\u001a\u0005\b´\u0002\u0010u¨\u0006¤\u0003"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$Surrogate;", "", "screen_name", "", "screen_depth", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "screen_description", "time_spent", "transition_reason", "type", "message_type", "message_uuid", "entity_id", "source", "source_screen_name", "message", "number_of_notifications", "field_name", "user_input", "tab_group_name", "tab_name", "tag", "additional_info", "Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;", "button_group_title", "button_title", "button_description", "entity_type", Constants.REFERRER, "root_url", "email_address", "email_category", "test_version", "uuid", "user_agent", "action_name", "url", "page", "section", "component", "element", "name", "url_params", "performance_data", "recipient", "sender", "event_name", ErrorResponse.ERROR_CODE, "error_message", "error_type", "display_message", "exit_status", "institution_id", "institution_name", "institution_search_query", "link_session_id", "mfa_type", "request_id", "plaid_timestamp", "view_name", "status", "accounts", MatchSelectionActivity.TRANSFER_ID_EXTRA, "relationship_id", "duration", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "target_screen_name", "clp_value", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "lcp_value", "etr_value", "description", "instrument_id", "symbol", "direction", "fid_value", "source_tag", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "time", "event_type", "asset_class", "payload", "milliseconds", "po_box", "inp_value", "debug_target", "loading_navigation_value", "loading_navigation_largest_request_duration", "loading_navigation_largest_request_url", "loading_navigation_num_requests", "recommendation_id", "invest_flow_schedule_id", "invest_flow_order_id", "request_duration", "request_url", "response_status_code", "item_index", "message_title", "message_body", "masked_referrer", "masked_email_address", "masked_recipient", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DLjava/lang/String;DDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "seen1", "seen2", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DLjava/lang/String;DDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getScreen_name$annotations", "()V", "getScreen_name", "()Ljava/lang/String;", "getScreen_depth$annotations", "getScreen_depth", "()I", "getScreen_description$annotations", "getScreen_description", "getTime_spent$annotations", "getTime_spent", "getTransition_reason$annotations", "getTransition_reason", "getType$annotations", "getType", "getMessage_type$annotations", "getMessage_type", "getMessage_uuid$annotations", "getMessage_uuid", "getEntity_id$annotations", "getEntity_id", "getSource$annotations", "getSource", "getSource_screen_name$annotations", "getSource_screen_name", "getMessage$annotations", "getMessage", "getNumber_of_notifications$annotations", "getNumber_of_notifications", "getField_name$annotations", "getField_name", "getUser_input$annotations", "getUser_input", "getTab_group_name$annotations", "getTab_group_name", "getTab_name$annotations", "getTab_name", "getTag$annotations", "getTag", "getAdditional_info$annotations", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataAdditionalInfoDto;", "getButton_group_title$annotations", "getButton_group_title", "getButton_title$annotations", "getButton_title", "getButton_description$annotations", "getButton_description", "getEntity_type$annotations", "getEntity_type", "getReferrer$annotations", "getReferrer", "getRoot_url$annotations", "getRoot_url", "getEmail_address$annotations", "getEmail_address", "getEmail_category$annotations", "getEmail_category", "getTest_version$annotations", "getTest_version", "getUuid$annotations", "getUuid", "getUser_agent$annotations", "getUser_agent", "getAction_name$annotations", "getAction_name", "getUrl$annotations", "getUrl", "getPage$annotations", "getPage", "getSection$annotations", "getSection", "getComponent$annotations", "getComponent", "getElement$annotations", "getElement", "getName$annotations", "getName", "getUrl_params$annotations", "getUrl_params", "getPerformance_data$annotations", "getPerformance_data", "getRecipient$annotations", "getRecipient", "getSender$annotations", "getSender", "getEvent_name$annotations", "getEvent_name", "getError_code$annotations", "getError_code", "getError_message$annotations", "getError_message", "getError_type$annotations", "getError_type", "getDisplay_message$annotations", "getDisplay_message", "getExit_status$annotations", "getExit_status", "getInstitution_id$annotations", "getInstitution_id", "getInstitution_name$annotations", "getInstitution_name", "getInstitution_search_query$annotations", "getInstitution_search_query", "getLink_session_id$annotations", "getLink_session_id", "getMfa_type$annotations", "getMfa_type", "getRequest_id$annotations", "getRequest_id", "getPlaid_timestamp$annotations", "getPlaid_timestamp", "getView_name$annotations", "getView_name", "getStatus$annotations", "getStatus", "getAccounts$annotations", "getAccounts", "getTransfer_id$annotations", "getTransfer_id", "getRelationship_id$annotations", "getRelationship_id", "getDuration$annotations", "getDuration", "getTarget_screen_name$annotations", "getTarget_screen_name", "getClp_value$annotations", "getClp_value", "()D", "getLcp_value$annotations", "getLcp_value", "getEtr_value$annotations", "getEtr_value", "getDescription$annotations", "getDescription", "getInstrument_id$annotations", "getInstrument_id", "getSymbol$annotations", "getSymbol", "getDirection$annotations", "getDirection", "getFid_value$annotations", "getFid_value", "getSource_tag$annotations", "getSource_tag", "getItem$annotations", "getItem", "getTime$annotations", "getTime", "getEvent_type$annotations", "getEvent_type", "getAsset_class$annotations", "getAsset_class", "getPayload$annotations", "getPayload", "getMilliseconds$annotations", "getMilliseconds", "getPo_box$annotations", "getPo_box", "getInp_value$annotations", "getInp_value", "getDebug_target$annotations", "getDebug_target", "getLoading_navigation_value$annotations", "getLoading_navigation_value", "getLoading_navigation_largest_request_duration$annotations", "getLoading_navigation_largest_request_duration", "getLoading_navigation_largest_request_url$annotations", "getLoading_navigation_largest_request_url", "getLoading_navigation_num_requests$annotations", "getLoading_navigation_num_requests", "getRecommendation_id$annotations", "getRecommendation_id", "getInvest_flow_schedule_id$annotations", "getInvest_flow_schedule_id", "getInvest_flow_order_id$annotations", "getInvest_flow_order_id", "getRequest_duration$annotations", "getRequest_duration", "getRequest_url$annotations", "getRequest_url", "getResponse_status_code$annotations", "getResponse_status_code", "getItem_index$annotations", "getItem_index", "getMessage_title$annotations", "getMessage_title", "getMessage_body$annotations", "getMessage_body", "getMasked_referrer$annotations", "getMasked_referrer", "getMasked_email_address$annotations", "getMasked_email_address", "getMasked_recipient$annotations", "getMasked_recipient", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component90", "component91", "component92", "component93", "component94", "component95", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String accounts;
        private final String action_name;
        private final AppEventDataAdditionalInfoDto additional_info;
        private final String asset_class;
        private final String button_description;
        private final String button_group_title;
        private final String button_title;
        private final double clp_value;
        private final String component;
        private final String debug_target;
        private final String description;
        private final String direction;
        private final String display_message;
        private final int duration;
        private final String element;
        private final String email_address;
        private final String email_category;
        private final String entity_id;
        private final String entity_type;
        private final String error_code;
        private final String error_message;
        private final String error_type;
        private final double etr_value;
        private final String event_name;
        private final String event_type;
        private final String exit_status;
        private final double fid_value;
        private final String field_name;
        private final double inp_value;
        private final String institution_id;
        private final String institution_name;
        private final String institution_search_query;
        private final String instrument_id;
        private final String invest_flow_order_id;
        private final String invest_flow_schedule_id;
        private final String item;
        private final int item_index;
        private final double lcp_value;
        private final String link_session_id;
        private final double loading_navigation_largest_request_duration;
        private final String loading_navigation_largest_request_url;
        private final int loading_navigation_num_requests;
        private final double loading_navigation_value;
        private final String masked_email_address;
        private final String masked_recipient;
        private final String masked_referrer;
        private final String message;
        private final String message_body;
        private final String message_title;
        private final String message_type;
        private final String message_uuid;
        private final String mfa_type;
        private final double milliseconds;
        private final String name;
        private final int number_of_notifications;
        private final String page;
        private final String payload;
        private final String performance_data;
        private final String plaid_timestamp;
        private final String po_box;
        private final String recipient;
        private final String recommendation_id;
        private final String referrer;
        private final String relationship_id;
        private final double request_duration;
        private final String request_id;
        private final String request_url;
        private final int response_status_code;
        private final String root_url;
        private final int screen_depth;
        private final String screen_description;
        private final String screen_name;
        private final String section;
        private final String sender;
        private final String source;
        private final String source_screen_name;
        private final String source_tag;
        private final String status;
        private final String symbol;
        private final String tab_group_name;
        private final String tab_name;
        private final String tag;
        private final String target_screen_name;
        private final String test_version;
        private final int time;
        private final int time_spent;
        private final String transfer_id;
        private final String transition_reason;
        private final String type;
        private final String url;
        private final String url_params;
        private final String user_agent;
        private final String user_input;
        private final String uuid;
        private final String view_name;

        public Surrogate() {
            this((String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (AppEventDataAdditionalInfoDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0.0d, 0.0d, 0.0d, (String) null, (String) null, (String) null, (String) null, 0.0d, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0.0d, (String) null, 0.0d, (String) null, 0.0d, 0.0d, (String) null, 0, (String) null, (String) null, (String) null, 0.0d, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, String str11, String str12, String str13, String str14, String str15, AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, int i4, String str56, double d, double d2, double d3, String str57, String str58, String str59, String str60, double d4, String str61, String str62, int i5, String str63, String str64, String str65, double d5, String str66, double d6, String str67, double d7, double d8, String str68, int i6, String str69, String str70, String str71, double d9, String str72, int i7, int i8, String str73, String str74, String str75, String str76, String str77, int i9, int i10, int i11, Object obj) {
            String str78 = (i9 & 1) != 0 ? surrogate.screen_name : str;
            int i12 = (i9 & 2) != 0 ? surrogate.screen_depth : i;
            String str79 = (i9 & 4) != 0 ? surrogate.screen_description : str2;
            int i13 = (i9 & 8) != 0 ? surrogate.time_spent : i2;
            String str80 = (i9 & 16) != 0 ? surrogate.transition_reason : str3;
            String str81 = (i9 & 32) != 0 ? surrogate.type : str4;
            String str82 = (i9 & 64) != 0 ? surrogate.message_type : str5;
            String str83 = (i9 & 128) != 0 ? surrogate.message_uuid : str6;
            String str84 = (i9 & 256) != 0 ? surrogate.entity_id : str7;
            String str85 = (i9 & 512) != 0 ? surrogate.source : str8;
            String str86 = (i9 & 1024) != 0 ? surrogate.source_screen_name : str9;
            String str87 = (i9 & 2048) != 0 ? surrogate.message : str10;
            String str88 = str78;
            int i14 = (i9 & 4096) != 0 ? surrogate.number_of_notifications : i3;
            String str89 = (i9 & 8192) != 0 ? surrogate.field_name : str11;
            String str90 = (i9 & 16384) != 0 ? surrogate.user_input : str12;
            String str91 = (i9 & 32768) != 0 ? surrogate.tab_group_name : str13;
            String str92 = (i9 & 65536) != 0 ? surrogate.tab_name : str14;
            String str93 = (i9 & 131072) != 0 ? surrogate.tag : str15;
            AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto2 = (i9 & 262144) != 0 ? surrogate.additional_info : appEventDataAdditionalInfoDto;
            String str94 = (i9 & 524288) != 0 ? surrogate.button_group_title : str16;
            String str95 = (i9 & 1048576) != 0 ? surrogate.button_title : str17;
            String str96 = (i9 & 2097152) != 0 ? surrogate.button_description : str18;
            String str97 = (i9 & 4194304) != 0 ? surrogate.entity_type : str19;
            String str98 = (i9 & 8388608) != 0 ? surrogate.referrer : str20;
            String str99 = (i9 & 16777216) != 0 ? surrogate.root_url : str21;
            String str100 = (i9 & 33554432) != 0 ? surrogate.email_address : str22;
            String str101 = (i9 & 67108864) != 0 ? surrogate.email_category : str23;
            String str102 = (i9 & 134217728) != 0 ? surrogate.test_version : str24;
            String str103 = (i9 & 268435456) != 0 ? surrogate.uuid : str25;
            String str104 = (i9 & 536870912) != 0 ? surrogate.user_agent : str26;
            String str105 = (i9 & 1073741824) != 0 ? surrogate.action_name : str27;
            String str106 = (i9 & Integer.MIN_VALUE) != 0 ? surrogate.url : str28;
            String str107 = (i10 & 1) != 0 ? surrogate.page : str29;
            String str108 = (i10 & 2) != 0 ? surrogate.section : str30;
            String str109 = (i10 & 4) != 0 ? surrogate.component : str31;
            String str110 = (i10 & 8) != 0 ? surrogate.element : str32;
            String str111 = (i10 & 16) != 0 ? surrogate.name : str33;
            String str112 = (i10 & 32) != 0 ? surrogate.url_params : str34;
            String str113 = (i10 & 64) != 0 ? surrogate.performance_data : str35;
            String str114 = (i10 & 128) != 0 ? surrogate.recipient : str36;
            String str115 = (i10 & 256) != 0 ? surrogate.sender : str37;
            String str116 = (i10 & 512) != 0 ? surrogate.event_name : str38;
            String str117 = (i10 & 1024) != 0 ? surrogate.error_code : str39;
            String str118 = (i10 & 2048) != 0 ? surrogate.error_message : str40;
            String str119 = (i10 & 4096) != 0 ? surrogate.error_type : str41;
            String str120 = (i10 & 8192) != 0 ? surrogate.display_message : str42;
            String str121 = (i10 & 16384) != 0 ? surrogate.exit_status : str43;
            String str122 = (i10 & 32768) != 0 ? surrogate.institution_id : str44;
            String str123 = (i10 & 65536) != 0 ? surrogate.institution_name : str45;
            String str124 = (i10 & 131072) != 0 ? surrogate.institution_search_query : str46;
            String str125 = (i10 & 262144) != 0 ? surrogate.link_session_id : str47;
            String str126 = (i10 & 524288) != 0 ? surrogate.mfa_type : str48;
            String str127 = (i10 & 1048576) != 0 ? surrogate.request_id : str49;
            String str128 = (i10 & 2097152) != 0 ? surrogate.plaid_timestamp : str50;
            String str129 = (i10 & 4194304) != 0 ? surrogate.view_name : str51;
            String str130 = (i10 & 8388608) != 0 ? surrogate.status : str52;
            String str131 = (i10 & 16777216) != 0 ? surrogate.accounts : str53;
            String str132 = (i10 & 33554432) != 0 ? surrogate.transfer_id : str54;
            String str133 = (i10 & 67108864) != 0 ? surrogate.relationship_id : str55;
            int i15 = (i10 & 134217728) != 0 ? surrogate.duration : i4;
            String str134 = (i10 & 268435456) != 0 ? surrogate.target_screen_name : str56;
            double d10 = (i10 & 536870912) != 0 ? surrogate.clp_value : d;
            double d11 = (i10 & 1073741824) != 0 ? surrogate.lcp_value : d2;
            double d12 = (i10 & Integer.MIN_VALUE) != 0 ? surrogate.etr_value : d3;
            String str135 = (i11 & 1) != 0 ? surrogate.description : str57;
            String str136 = (i11 & 2) != 0 ? surrogate.instrument_id : str58;
            String str137 = str135;
            String str138 = (i11 & 4) != 0 ? surrogate.symbol : str59;
            String str139 = (i11 & 8) != 0 ? surrogate.direction : str60;
            String str140 = str136;
            double d13 = (i11 & 16) != 0 ? surrogate.fid_value : d4;
            String str141 = (i11 & 32) != 0 ? surrogate.source_tag : str61;
            String str142 = (i11 & 64) != 0 ? surrogate.item : str62;
            String str143 = str141;
            int i16 = (i11 & 128) != 0 ? surrogate.time : i5;
            String str144 = (i11 & 256) != 0 ? surrogate.event_type : str63;
            String str145 = (i11 & 512) != 0 ? surrogate.asset_class : str64;
            String str146 = (i11 & 1024) != 0 ? surrogate.payload : str65;
            String str147 = str142;
            double d14 = (i11 & 2048) != 0 ? surrogate.milliseconds : d5;
            String str148 = (i11 & 4096) != 0 ? surrogate.po_box : str66;
            double d15 = (i11 & 8192) != 0 ? surrogate.inp_value : d6;
            String str149 = (i11 & 16384) != 0 ? surrogate.debug_target : str67;
            double d16 = (i11 & 32768) != 0 ? surrogate.loading_navigation_value : d7;
            double d17 = (i11 & 65536) != 0 ? surrogate.loading_navigation_largest_request_duration : d8;
            String str150 = (i11 & 131072) != 0 ? surrogate.loading_navigation_largest_request_url : str68;
            int i17 = (i11 & 262144) != 0 ? surrogate.loading_navigation_num_requests : i6;
            return surrogate.copy(str88, i12, str79, i13, str80, str81, str82, str83, str84, str85, str86, str87, i14, str89, str90, str91, str92, str93, appEventDataAdditionalInfoDto2, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, str107, str108, str109, str110, str111, str112, str113, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str132, str133, i15, str134, d10, d11, d12, str137, str140, str138, str139, d13, str143, str147, i16, str144, str145, str146, d14, str148, d15, str149, d16, d17, str150, i17, (i11 & 524288) != 0 ? surrogate.recommendation_id : str69, (i11 & 1048576) != 0 ? surrogate.invest_flow_schedule_id : str70, (i11 & 2097152) != 0 ? surrogate.invest_flow_order_id : str71, (i11 & 4194304) != 0 ? surrogate.request_duration : d9, (i11 & 8388608) != 0 ? surrogate.request_url : str72, (16777216 & i11) != 0 ? surrogate.response_status_code : i7, (i11 & 33554432) != 0 ? surrogate.item_index : i8, (i11 & 67108864) != 0 ? surrogate.message_title : str73, (i11 & 134217728) != 0 ? surrogate.message_body : str74, (i11 & 268435456) != 0 ? surrogate.masked_referrer : str75, (i11 & 536870912) != 0 ? surrogate.masked_email_address : str76, (i11 & 1073741824) != 0 ? surrogate.masked_recipient : str77);
        }

        @SerialName("accounts")
        @JsonAnnotations2(names = {"accounts"})
        public static /* synthetic */ void getAccounts$annotations() {
        }

        @SerialName("actionName")
        @JsonAnnotations2(names = {"action_name"})
        public static /* synthetic */ void getAction_name$annotations() {
        }

        @SerialName("additionalInfo")
        @JsonAnnotations2(names = {"additional_info"})
        public static /* synthetic */ void getAdditional_info$annotations() {
        }

        @SerialName("assetClass")
        @JsonAnnotations2(names = {"asset_class"})
        public static /* synthetic */ void getAsset_class$annotations() {
        }

        @SerialName("buttonDescription")
        @JsonAnnotations2(names = {"button_description"})
        public static /* synthetic */ void getButton_description$annotations() {
        }

        @SerialName("buttonGroupTitle")
        @JsonAnnotations2(names = {"button_group_title"})
        public static /* synthetic */ void getButton_group_title$annotations() {
        }

        @SerialName("buttonTitle")
        @JsonAnnotations2(names = {"button_title"})
        public static /* synthetic */ void getButton_title$annotations() {
        }

        @SerialName("clpValue")
        @JsonAnnotations2(names = {"clp_value"})
        public static /* synthetic */ void getClp_value$annotations() {
        }

        @SerialName("component")
        @JsonAnnotations2(names = {"component"})
        public static /* synthetic */ void getComponent$annotations() {
        }

        @SerialName("debugTarget")
        @JsonAnnotations2(names = {"debug_target"})
        public static /* synthetic */ void getDebug_target$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("displayMessage")
        @JsonAnnotations2(names = {"display_message"})
        public static /* synthetic */ void getDisplay_message$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("element")
        @JsonAnnotations2(names = {"element"})
        public static /* synthetic */ void getElement$annotations() {
        }

        @SerialName("emailAddress")
        @JsonAnnotations2(names = {"email_address"})
        public static /* synthetic */ void getEmail_address$annotations() {
        }

        @SerialName("emailCategory")
        @JsonAnnotations2(names = {"email_category"})
        public static /* synthetic */ void getEmail_category$annotations() {
        }

        @SerialName("entityId")
        @JsonAnnotations2(names = {"entity_id"})
        public static /* synthetic */ void getEntity_id$annotations() {
        }

        @SerialName("entityType")
        @JsonAnnotations2(names = {"entity_type"})
        public static /* synthetic */ void getEntity_type$annotations() {
        }

        @SerialName("errorCode")
        @JsonAnnotations2(names = {ErrorResponse.ERROR_CODE})
        public static /* synthetic */ void getError_code$annotations() {
        }

        @SerialName("errorMessage")
        @JsonAnnotations2(names = {"error_message"})
        public static /* synthetic */ void getError_message$annotations() {
        }

        @SerialName("errorType")
        @JsonAnnotations2(names = {"error_type"})
        public static /* synthetic */ void getError_type$annotations() {
        }

        @SerialName("etrValue")
        @JsonAnnotations2(names = {"etr_value"})
        public static /* synthetic */ void getEtr_value$annotations() {
        }

        @SerialName("eventName")
        @JsonAnnotations2(names = {"event_name"})
        public static /* synthetic */ void getEvent_name$annotations() {
        }

        @SerialName("eventType")
        @JsonAnnotations2(names = {"event_type"})
        public static /* synthetic */ void getEvent_type$annotations() {
        }

        @SerialName("exitStatus")
        @JsonAnnotations2(names = {"exit_status"})
        public static /* synthetic */ void getExit_status$annotations() {
        }

        @SerialName("fidValue")
        @JsonAnnotations2(names = {"fid_value"})
        public static /* synthetic */ void getFid_value$annotations() {
        }

        @SerialName("fieldName")
        @JsonAnnotations2(names = {"field_name"})
        public static /* synthetic */ void getField_name$annotations() {
        }

        @SerialName("inpValue")
        @JsonAnnotations2(names = {"inp_value"})
        public static /* synthetic */ void getInp_value$annotations() {
        }

        @SerialName("institutionId")
        @JsonAnnotations2(names = {"institution_id"})
        public static /* synthetic */ void getInstitution_id$annotations() {
        }

        @SerialName("institutionName")
        @JsonAnnotations2(names = {"institution_name"})
        public static /* synthetic */ void getInstitution_name$annotations() {
        }

        @SerialName("institutionSearchQuery")
        @JsonAnnotations2(names = {"institution_search_query"})
        public static /* synthetic */ void getInstitution_search_query$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("investFlowOrderId")
        @JsonAnnotations2(names = {"invest_flow_order_id"})
        public static /* synthetic */ void getInvest_flow_order_id$annotations() {
        }

        @SerialName("investFlowScheduleId")
        @JsonAnnotations2(names = {"invest_flow_schedule_id"})
        public static /* synthetic */ void getInvest_flow_schedule_id$annotations() {
        }

        @SerialName(OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM)
        @JsonAnnotations2(names = {OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM})
        public static /* synthetic */ void getItem$annotations() {
        }

        @SerialName("itemIndex")
        @JsonAnnotations2(names = {"item_index"})
        public static /* synthetic */ void getItem_index$annotations() {
        }

        @SerialName("lcpValue")
        @JsonAnnotations2(names = {"lcp_value"})
        public static /* synthetic */ void getLcp_value$annotations() {
        }

        @SerialName("linkSessionId")
        @JsonAnnotations2(names = {"link_session_id"})
        public static /* synthetic */ void getLink_session_id$annotations() {
        }

        @SerialName("loadingNavigationLargestRequestDuration")
        @JsonAnnotations2(names = {"loading_navigation_largest_request_duration"})
        public static /* synthetic */ void getLoading_navigation_largest_request_duration$annotations() {
        }

        @SerialName("loadingNavigationLargestRequestUrl")
        @JsonAnnotations2(names = {"loading_navigation_largest_request_url"})
        public static /* synthetic */ void getLoading_navigation_largest_request_url$annotations() {
        }

        @SerialName("loadingNavigationNumRequests")
        @JsonAnnotations2(names = {"loading_navigation_num_requests"})
        public static /* synthetic */ void getLoading_navigation_num_requests$annotations() {
        }

        @SerialName("loadingNavigationValue")
        @JsonAnnotations2(names = {"loading_navigation_value"})
        public static /* synthetic */ void getLoading_navigation_value$annotations() {
        }

        @SerialName("maskedEmailAddress")
        @JsonAnnotations2(names = {"masked_email_address"})
        public static /* synthetic */ void getMasked_email_address$annotations() {
        }

        @SerialName("maskedRecipient")
        @JsonAnnotations2(names = {"masked_recipient"})
        public static /* synthetic */ void getMasked_recipient$annotations() {
        }

        @SerialName("maskedReferrer")
        @JsonAnnotations2(names = {"masked_referrer"})
        public static /* synthetic */ void getMasked_referrer$annotations() {
        }

        @SerialName("message")
        @JsonAnnotations2(names = {"message"})
        public static /* synthetic */ void getMessage$annotations() {
        }

        @SerialName("messageBody")
        @JsonAnnotations2(names = {"message_body"})
        public static /* synthetic */ void getMessage_body$annotations() {
        }

        @SerialName("messageTitle")
        @JsonAnnotations2(names = {"message_title"})
        public static /* synthetic */ void getMessage_title$annotations() {
        }

        @SerialName("messageType")
        @JsonAnnotations2(names = {"message_type"})
        public static /* synthetic */ void getMessage_type$annotations() {
        }

        @SerialName("messageUuid")
        @JsonAnnotations2(names = {"message_uuid"})
        public static /* synthetic */ void getMessage_uuid$annotations() {
        }

        @SerialName("mfaType")
        @JsonAnnotations2(names = {"mfa_type"})
        public static /* synthetic */ void getMfa_type$annotations() {
        }

        @SerialName("milliseconds")
        @JsonAnnotations2(names = {"milliseconds"})
        public static /* synthetic */ void getMilliseconds$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("numberOfNotifications")
        @JsonAnnotations2(names = {"number_of_notifications"})
        public static /* synthetic */ void getNumber_of_notifications$annotations() {
        }

        @SerialName("page")
        @JsonAnnotations2(names = {"page"})
        public static /* synthetic */ void getPage$annotations() {
        }

        @SerialName("payload")
        @JsonAnnotations2(names = {"payload"})
        public static /* synthetic */ void getPayload$annotations() {
        }

        @SerialName("performanceData")
        @JsonAnnotations2(names = {"performance_data"})
        public static /* synthetic */ void getPerformance_data$annotations() {
        }

        @SerialName("plaidTimestamp")
        @JsonAnnotations2(names = {"plaid_timestamp"})
        public static /* synthetic */ void getPlaid_timestamp$annotations() {
        }

        @SerialName("poBox")
        @JsonAnnotations2(names = {"po_box"})
        public static /* synthetic */ void getPo_box$annotations() {
        }

        @SerialName("recipient")
        @JsonAnnotations2(names = {"recipient"})
        public static /* synthetic */ void getRecipient$annotations() {
        }

        @SerialName("recommendationId")
        @JsonAnnotations2(names = {"recommendation_id"})
        public static /* synthetic */ void getRecommendation_id$annotations() {
        }

        @SerialName(Constants.REFERRER)
        @JsonAnnotations2(names = {Constants.REFERRER})
        public static /* synthetic */ void getReferrer$annotations() {
        }

        @SerialName("relationshipId")
        @JsonAnnotations2(names = {"relationship_id"})
        public static /* synthetic */ void getRelationship_id$annotations() {
        }

        @SerialName("requestDuration")
        @JsonAnnotations2(names = {"request_duration"})
        public static /* synthetic */ void getRequest_duration$annotations() {
        }

        @SerialName("requestId")
        @JsonAnnotations2(names = {"request_id"})
        public static /* synthetic */ void getRequest_id$annotations() {
        }

        @SerialName("requestUrl")
        @JsonAnnotations2(names = {"request_url"})
        public static /* synthetic */ void getRequest_url$annotations() {
        }

        @SerialName("responseStatusCode")
        @JsonAnnotations2(names = {"response_status_code"})
        public static /* synthetic */ void getResponse_status_code$annotations() {
        }

        @SerialName("rootUrl")
        @JsonAnnotations2(names = {"root_url"})
        public static /* synthetic */ void getRoot_url$annotations() {
        }

        @SerialName("screenDepth")
        @JsonAnnotations2(names = {"screen_depth"})
        public static /* synthetic */ void getScreen_depth$annotations() {
        }

        @SerialName("screenDescription")
        @JsonAnnotations2(names = {"screen_description"})
        public static /* synthetic */ void getScreen_description$annotations() {
        }

        @SerialName("screenName")
        @JsonAnnotations2(names = {"screen_name"})
        public static /* synthetic */ void getScreen_name$annotations() {
        }

        @SerialName("section")
        @JsonAnnotations2(names = {"section"})
        public static /* synthetic */ void getSection$annotations() {
        }

        @SerialName("sender")
        @JsonAnnotations2(names = {"sender"})
        public static /* synthetic */ void getSender$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("sourceScreenName")
        @JsonAnnotations2(names = {"source_screen_name"})
        public static /* synthetic */ void getSource_screen_name$annotations() {
        }

        @SerialName("sourceTag")
        @JsonAnnotations2(names = {"source_tag"})
        public static /* synthetic */ void getSource_tag$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tabGroupName")
        @JsonAnnotations2(names = {"tab_group_name"})
        public static /* synthetic */ void getTab_group_name$annotations() {
        }

        @SerialName("tabName")
        @JsonAnnotations2(names = {"tab_name"})
        public static /* synthetic */ void getTab_name$annotations() {
        }

        @SerialName("tag")
        @JsonAnnotations2(names = {"tag"})
        public static /* synthetic */ void getTag$annotations() {
        }

        @SerialName("targetScreenName")
        @JsonAnnotations2(names = {"target_screen_name"})
        public static /* synthetic */ void getTarget_screen_name$annotations() {
        }

        @SerialName("testVersion")
        @JsonAnnotations2(names = {"test_version"})
        public static /* synthetic */ void getTest_version$annotations() {
        }

        @SerialName("time")
        @JsonAnnotations2(names = {"time"})
        public static /* synthetic */ void getTime$annotations() {
        }

        @SerialName("timeSpent")
        @JsonAnnotations2(names = {"time_spent"})
        public static /* synthetic */ void getTime_spent$annotations() {
        }

        @SerialName("transferId")
        @JsonAnnotations2(names = {MatchSelectionActivity.TRANSFER_ID_EXTRA})
        public static /* synthetic */ void getTransfer_id$annotations() {
        }

        @SerialName("transitionReason")
        @JsonAnnotations2(names = {"transition_reason"})
        public static /* synthetic */ void getTransition_reason$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("url")
        @JsonAnnotations2(names = {"url"})
        public static /* synthetic */ void getUrl$annotations() {
        }

        @SerialName("urlParams")
        @JsonAnnotations2(names = {"url_params"})
        public static /* synthetic */ void getUrl_params$annotations() {
        }

        @SerialName("userAgent")
        @JsonAnnotations2(names = {"user_agent"})
        public static /* synthetic */ void getUser_agent$annotations() {
        }

        @SerialName("userInput")
        @JsonAnnotations2(names = {"user_input"})
        public static /* synthetic */ void getUser_input$annotations() {
        }

        @SerialName("uuid")
        @JsonAnnotations2(names = {"uuid"})
        public static /* synthetic */ void getUuid$annotations() {
        }

        @SerialName("viewName")
        @JsonAnnotations2(names = {"view_name"})
        public static /* synthetic */ void getView_name$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getScreen_name() {
            return this.screen_name;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSource_screen_name() {
            return this.source_screen_name;
        }

        /* renamed from: component12, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component13, reason: from getter */
        public final int getNumber_of_notifications() {
            return this.number_of_notifications;
        }

        /* renamed from: component14, reason: from getter */
        public final String getField_name() {
            return this.field_name;
        }

        /* renamed from: component15, reason: from getter */
        public final String getUser_input() {
            return this.user_input;
        }

        /* renamed from: component16, reason: from getter */
        public final String getTab_group_name() {
            return this.tab_group_name;
        }

        /* renamed from: component17, reason: from getter */
        public final String getTab_name() {
            return this.tab_name;
        }

        /* renamed from: component18, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component19, reason: from getter */
        public final AppEventDataAdditionalInfoDto getAdditional_info() {
            return this.additional_info;
        }

        /* renamed from: component2, reason: from getter */
        public final int getScreen_depth() {
            return this.screen_depth;
        }

        /* renamed from: component20, reason: from getter */
        public final String getButton_group_title() {
            return this.button_group_title;
        }

        /* renamed from: component21, reason: from getter */
        public final String getButton_title() {
            return this.button_title;
        }

        /* renamed from: component22, reason: from getter */
        public final String getButton_description() {
            return this.button_description;
        }

        /* renamed from: component23, reason: from getter */
        public final String getEntity_type() {
            return this.entity_type;
        }

        /* renamed from: component24, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component25, reason: from getter */
        public final String getRoot_url() {
            return this.root_url;
        }

        /* renamed from: component26, reason: from getter */
        public final String getEmail_address() {
            return this.email_address;
        }

        /* renamed from: component27, reason: from getter */
        public final String getEmail_category() {
            return this.email_category;
        }

        /* renamed from: component28, reason: from getter */
        public final String getTest_version() {
            return this.test_version;
        }

        /* renamed from: component29, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScreen_description() {
            return this.screen_description;
        }

        /* renamed from: component30, reason: from getter */
        public final String getUser_agent() {
            return this.user_agent;
        }

        /* renamed from: component31, reason: from getter */
        public final String getAction_name() {
            return this.action_name;
        }

        /* renamed from: component32, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component33, reason: from getter */
        public final String getPage() {
            return this.page;
        }

        /* renamed from: component34, reason: from getter */
        public final String getSection() {
            return this.section;
        }

        /* renamed from: component35, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        /* renamed from: component36, reason: from getter */
        public final String getElement() {
            return this.element;
        }

        /* renamed from: component37, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component38, reason: from getter */
        public final String getUrl_params() {
            return this.url_params;
        }

        /* renamed from: component39, reason: from getter */
        public final String getPerformance_data() {
            return this.performance_data;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTime_spent() {
            return this.time_spent;
        }

        /* renamed from: component40, reason: from getter */
        public final String getRecipient() {
            return this.recipient;
        }

        /* renamed from: component41, reason: from getter */
        public final String getSender() {
            return this.sender;
        }

        /* renamed from: component42, reason: from getter */
        public final String getEvent_name() {
            return this.event_name;
        }

        /* renamed from: component43, reason: from getter */
        public final String getError_code() {
            return this.error_code;
        }

        /* renamed from: component44, reason: from getter */
        public final String getError_message() {
            return this.error_message;
        }

        /* renamed from: component45, reason: from getter */
        public final String getError_type() {
            return this.error_type;
        }

        /* renamed from: component46, reason: from getter */
        public final String getDisplay_message() {
            return this.display_message;
        }

        /* renamed from: component47, reason: from getter */
        public final String getExit_status() {
            return this.exit_status;
        }

        /* renamed from: component48, reason: from getter */
        public final String getInstitution_id() {
            return this.institution_id;
        }

        /* renamed from: component49, reason: from getter */
        public final String getInstitution_name() {
            return this.institution_name;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTransition_reason() {
            return this.transition_reason;
        }

        /* renamed from: component50, reason: from getter */
        public final String getInstitution_search_query() {
            return this.institution_search_query;
        }

        /* renamed from: component51, reason: from getter */
        public final String getLink_session_id() {
            return this.link_session_id;
        }

        /* renamed from: component52, reason: from getter */
        public final String getMfa_type() {
            return this.mfa_type;
        }

        /* renamed from: component53, reason: from getter */
        public final String getRequest_id() {
            return this.request_id;
        }

        /* renamed from: component54, reason: from getter */
        public final String getPlaid_timestamp() {
            return this.plaid_timestamp;
        }

        /* renamed from: component55, reason: from getter */
        public final String getView_name() {
            return this.view_name;
        }

        /* renamed from: component56, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component57, reason: from getter */
        public final String getAccounts() {
            return this.accounts;
        }

        /* renamed from: component58, reason: from getter */
        public final String getTransfer_id() {
            return this.transfer_id;
        }

        /* renamed from: component59, reason: from getter */
        public final String getRelationship_id() {
            return this.relationship_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component60, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* renamed from: component61, reason: from getter */
        public final String getTarget_screen_name() {
            return this.target_screen_name;
        }

        /* renamed from: component62, reason: from getter */
        public final double getClp_value() {
            return this.clp_value;
        }

        /* renamed from: component63, reason: from getter */
        public final double getLcp_value() {
            return this.lcp_value;
        }

        /* renamed from: component64, reason: from getter */
        public final double getEtr_value() {
            return this.etr_value;
        }

        /* renamed from: component65, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component66, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component67, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component68, reason: from getter */
        public final String getDirection() {
            return this.direction;
        }

        /* renamed from: component69, reason: from getter */
        public final double getFid_value() {
            return this.fid_value;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMessage_type() {
            return this.message_type;
        }

        /* renamed from: component70, reason: from getter */
        public final String getSource_tag() {
            return this.source_tag;
        }

        /* renamed from: component71, reason: from getter */
        public final String getItem() {
            return this.item;
        }

        /* renamed from: component72, reason: from getter */
        public final int getTime() {
            return this.time;
        }

        /* renamed from: component73, reason: from getter */
        public final String getEvent_type() {
            return this.event_type;
        }

        /* renamed from: component74, reason: from getter */
        public final String getAsset_class() {
            return this.asset_class;
        }

        /* renamed from: component75, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* renamed from: component76, reason: from getter */
        public final double getMilliseconds() {
            return this.milliseconds;
        }

        /* renamed from: component77, reason: from getter */
        public final String getPo_box() {
            return this.po_box;
        }

        /* renamed from: component78, reason: from getter */
        public final double getInp_value() {
            return this.inp_value;
        }

        /* renamed from: component79, reason: from getter */
        public final String getDebug_target() {
            return this.debug_target;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMessage_uuid() {
            return this.message_uuid;
        }

        /* renamed from: component80, reason: from getter */
        public final double getLoading_navigation_value() {
            return this.loading_navigation_value;
        }

        /* renamed from: component81, reason: from getter */
        public final double getLoading_navigation_largest_request_duration() {
            return this.loading_navigation_largest_request_duration;
        }

        /* renamed from: component82, reason: from getter */
        public final String getLoading_navigation_largest_request_url() {
            return this.loading_navigation_largest_request_url;
        }

        /* renamed from: component83, reason: from getter */
        public final int getLoading_navigation_num_requests() {
            return this.loading_navigation_num_requests;
        }

        /* renamed from: component84, reason: from getter */
        public final String getRecommendation_id() {
            return this.recommendation_id;
        }

        /* renamed from: component85, reason: from getter */
        public final String getInvest_flow_schedule_id() {
            return this.invest_flow_schedule_id;
        }

        /* renamed from: component86, reason: from getter */
        public final String getInvest_flow_order_id() {
            return this.invest_flow_order_id;
        }

        /* renamed from: component87, reason: from getter */
        public final double getRequest_duration() {
            return this.request_duration;
        }

        /* renamed from: component88, reason: from getter */
        public final String getRequest_url() {
            return this.request_url;
        }

        /* renamed from: component89, reason: from getter */
        public final int getResponse_status_code() {
            return this.response_status_code;
        }

        /* renamed from: component9, reason: from getter */
        public final String getEntity_id() {
            return this.entity_id;
        }

        /* renamed from: component90, reason: from getter */
        public final int getItem_index() {
            return this.item_index;
        }

        /* renamed from: component91, reason: from getter */
        public final String getMessage_title() {
            return this.message_title;
        }

        /* renamed from: component92, reason: from getter */
        public final String getMessage_body() {
            return this.message_body;
        }

        /* renamed from: component93, reason: from getter */
        public final String getMasked_referrer() {
            return this.masked_referrer;
        }

        /* renamed from: component94, reason: from getter */
        public final String getMasked_email_address() {
            return this.masked_email_address;
        }

        /* renamed from: component95, reason: from getter */
        public final String getMasked_recipient() {
            return this.masked_recipient;
        }

        public final Surrogate copy(String screen_name, int screen_depth, String screen_description, int time_spent, String transition_reason, String type2, String message_type, String message_uuid, String entity_id, String source, String source_screen_name, String message, int number_of_notifications, String field_name, String user_input, String tab_group_name, String tab_name, String tag, AppEventDataAdditionalInfoDto additional_info, String button_group_title, String button_title, String button_description, String entity_type, String referrer, String root_url, String email_address, String email_category, String test_version, String uuid, String user_agent, String action_name, String url, String page, String section, String component, String element, String name, String url_params, String performance_data, String recipient, String sender, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String transfer_id, String relationship_id, int duration, String target_screen_name, double clp_value, double lcp_value, double etr_value, String description, String instrument_id, String symbol, String direction, double fid_value, String source_tag, String item, int time, String event_type, String asset_class, String payload, double milliseconds, String po_box, double inp_value, String debug_target, double loading_navigation_value, double loading_navigation_largest_request_duration, String loading_navigation_largest_request_url, int loading_navigation_num_requests, String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id, double request_duration, String request_url, int response_status_code, int item_index, String message_title, String message_body, String masked_referrer, String masked_email_address, String masked_recipient) {
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(screen_description, "screen_description");
            Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(message_type, "message_type");
            Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
            Intrinsics.checkNotNullParameter(entity_id, "entity_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(field_name, "field_name");
            Intrinsics.checkNotNullParameter(user_input, "user_input");
            Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
            Intrinsics.checkNotNullParameter(tab_name, "tab_name");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
            Intrinsics.checkNotNullParameter(button_title, "button_title");
            Intrinsics.checkNotNullParameter(button_description, "button_description");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(root_url, "root_url");
            Intrinsics.checkNotNullParameter(email_address, "email_address");
            Intrinsics.checkNotNullParameter(email_category, "email_category");
            Intrinsics.checkNotNullParameter(test_version, "test_version");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(action_name, "action_name");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(element, "element");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url_params, "url_params");
            Intrinsics.checkNotNullParameter(performance_data, "performance_data");
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(event_name, "event_name");
            Intrinsics.checkNotNullParameter(error_code, "error_code");
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(display_message, "display_message");
            Intrinsics.checkNotNullParameter(exit_status, "exit_status");
            Intrinsics.checkNotNullParameter(institution_id, "institution_id");
            Intrinsics.checkNotNullParameter(institution_name, "institution_name");
            Intrinsics.checkNotNullParameter(institution_search_query, "institution_search_query");
            Intrinsics.checkNotNullParameter(link_session_id, "link_session_id");
            Intrinsics.checkNotNullParameter(mfa_type, "mfa_type");
            Intrinsics.checkNotNullParameter(request_id, "request_id");
            Intrinsics.checkNotNullParameter(plaid_timestamp, "plaid_timestamp");
            Intrinsics.checkNotNullParameter(view_name, "view_name");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
            Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(source_tag, "source_tag");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            Intrinsics.checkNotNullParameter(asset_class, "asset_class");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(po_box, "po_box");
            Intrinsics.checkNotNullParameter(debug_target, "debug_target");
            Intrinsics.checkNotNullParameter(loading_navigation_largest_request_url, "loading_navigation_largest_request_url");
            Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
            Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
            Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
            Intrinsics.checkNotNullParameter(request_url, "request_url");
            Intrinsics.checkNotNullParameter(message_title, "message_title");
            Intrinsics.checkNotNullParameter(message_body, "message_body");
            Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
            Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
            Intrinsics.checkNotNullParameter(masked_recipient, "masked_recipient");
            return new Surrogate(screen_name, screen_depth, screen_description, time_spent, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, message, number_of_notifications, field_name, user_input, tab_group_name, tab_name, tag, additional_info, button_group_title, button_title, button_description, entity_type, referrer, root_url, email_address, email_category, test_version, uuid, user_agent, action_name, url, page, section, component, element, name, url_params, performance_data, recipient, sender, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, transfer_id, relationship_id, duration, target_screen_name, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, fid_value, source_tag, item, time, event_type, asset_class, payload, milliseconds, po_box, inp_value, debug_target, loading_navigation_value, loading_navigation_largest_request_duration, loading_navigation_largest_request_url, loading_navigation_num_requests, recommendation_id, invest_flow_schedule_id, invest_flow_order_id, request_duration, request_url, response_status_code, item_index, message_title, message_body, masked_referrer, masked_email_address, masked_recipient);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.screen_name, surrogate.screen_name) && this.screen_depth == surrogate.screen_depth && Intrinsics.areEqual(this.screen_description, surrogate.screen_description) && this.time_spent == surrogate.time_spent && Intrinsics.areEqual(this.transition_reason, surrogate.transition_reason) && Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.message_type, surrogate.message_type) && Intrinsics.areEqual(this.message_uuid, surrogate.message_uuid) && Intrinsics.areEqual(this.entity_id, surrogate.entity_id) && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.source_screen_name, surrogate.source_screen_name) && Intrinsics.areEqual(this.message, surrogate.message) && this.number_of_notifications == surrogate.number_of_notifications && Intrinsics.areEqual(this.field_name, surrogate.field_name) && Intrinsics.areEqual(this.user_input, surrogate.user_input) && Intrinsics.areEqual(this.tab_group_name, surrogate.tab_group_name) && Intrinsics.areEqual(this.tab_name, surrogate.tab_name) && Intrinsics.areEqual(this.tag, surrogate.tag) && Intrinsics.areEqual(this.additional_info, surrogate.additional_info) && Intrinsics.areEqual(this.button_group_title, surrogate.button_group_title) && Intrinsics.areEqual(this.button_title, surrogate.button_title) && Intrinsics.areEqual(this.button_description, surrogate.button_description) && Intrinsics.areEqual(this.entity_type, surrogate.entity_type) && Intrinsics.areEqual(this.referrer, surrogate.referrer) && Intrinsics.areEqual(this.root_url, surrogate.root_url) && Intrinsics.areEqual(this.email_address, surrogate.email_address) && Intrinsics.areEqual(this.email_category, surrogate.email_category) && Intrinsics.areEqual(this.test_version, surrogate.test_version) && Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.user_agent, surrogate.user_agent) && Intrinsics.areEqual(this.action_name, surrogate.action_name) && Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.page, surrogate.page) && Intrinsics.areEqual(this.section, surrogate.section) && Intrinsics.areEqual(this.component, surrogate.component) && Intrinsics.areEqual(this.element, surrogate.element) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.url_params, surrogate.url_params) && Intrinsics.areEqual(this.performance_data, surrogate.performance_data) && Intrinsics.areEqual(this.recipient, surrogate.recipient) && Intrinsics.areEqual(this.sender, surrogate.sender) && Intrinsics.areEqual(this.event_name, surrogate.event_name) && Intrinsics.areEqual(this.error_code, surrogate.error_code) && Intrinsics.areEqual(this.error_message, surrogate.error_message) && Intrinsics.areEqual(this.error_type, surrogate.error_type) && Intrinsics.areEqual(this.display_message, surrogate.display_message) && Intrinsics.areEqual(this.exit_status, surrogate.exit_status) && Intrinsics.areEqual(this.institution_id, surrogate.institution_id) && Intrinsics.areEqual(this.institution_name, surrogate.institution_name) && Intrinsics.areEqual(this.institution_search_query, surrogate.institution_search_query) && Intrinsics.areEqual(this.link_session_id, surrogate.link_session_id) && Intrinsics.areEqual(this.mfa_type, surrogate.mfa_type) && Intrinsics.areEqual(this.request_id, surrogate.request_id) && Intrinsics.areEqual(this.plaid_timestamp, surrogate.plaid_timestamp) && Intrinsics.areEqual(this.view_name, surrogate.view_name) && Intrinsics.areEqual(this.status, surrogate.status) && Intrinsics.areEqual(this.accounts, surrogate.accounts) && Intrinsics.areEqual(this.transfer_id, surrogate.transfer_id) && Intrinsics.areEqual(this.relationship_id, surrogate.relationship_id) && this.duration == surrogate.duration && Intrinsics.areEqual(this.target_screen_name, surrogate.target_screen_name) && Double.compare(this.clp_value, surrogate.clp_value) == 0 && Double.compare(this.lcp_value, surrogate.lcp_value) == 0 && Double.compare(this.etr_value, surrogate.etr_value) == 0 && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.direction, surrogate.direction) && Double.compare(this.fid_value, surrogate.fid_value) == 0 && Intrinsics.areEqual(this.source_tag, surrogate.source_tag) && Intrinsics.areEqual(this.item, surrogate.item) && this.time == surrogate.time && Intrinsics.areEqual(this.event_type, surrogate.event_type) && Intrinsics.areEqual(this.asset_class, surrogate.asset_class) && Intrinsics.areEqual(this.payload, surrogate.payload) && Double.compare(this.milliseconds, surrogate.milliseconds) == 0 && Intrinsics.areEqual(this.po_box, surrogate.po_box) && Double.compare(this.inp_value, surrogate.inp_value) == 0 && Intrinsics.areEqual(this.debug_target, surrogate.debug_target) && Double.compare(this.loading_navigation_value, surrogate.loading_navigation_value) == 0 && Double.compare(this.loading_navigation_largest_request_duration, surrogate.loading_navigation_largest_request_duration) == 0 && Intrinsics.areEqual(this.loading_navigation_largest_request_url, surrogate.loading_navigation_largest_request_url) && this.loading_navigation_num_requests == surrogate.loading_navigation_num_requests && Intrinsics.areEqual(this.recommendation_id, surrogate.recommendation_id) && Intrinsics.areEqual(this.invest_flow_schedule_id, surrogate.invest_flow_schedule_id) && Intrinsics.areEqual(this.invest_flow_order_id, surrogate.invest_flow_order_id) && Double.compare(this.request_duration, surrogate.request_duration) == 0 && Intrinsics.areEqual(this.request_url, surrogate.request_url) && this.response_status_code == surrogate.response_status_code && this.item_index == surrogate.item_index && Intrinsics.areEqual(this.message_title, surrogate.message_title) && Intrinsics.areEqual(this.message_body, surrogate.message_body) && Intrinsics.areEqual(this.masked_referrer, surrogate.masked_referrer) && Intrinsics.areEqual(this.masked_email_address, surrogate.masked_email_address) && Intrinsics.areEqual(this.masked_recipient, surrogate.masked_recipient);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((((((((((((((this.screen_name.hashCode() * 31) + Integer.hashCode(this.screen_depth)) * 31) + this.screen_description.hashCode()) * 31) + Integer.hashCode(this.time_spent)) * 31) + this.transition_reason.hashCode()) * 31) + this.type.hashCode()) * 31) + this.message_type.hashCode()) * 31) + this.message_uuid.hashCode()) * 31) + this.entity_id.hashCode()) * 31) + this.source.hashCode()) * 31) + this.source_screen_name.hashCode()) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.number_of_notifications)) * 31) + this.field_name.hashCode()) * 31) + this.user_input.hashCode()) * 31) + this.tab_group_name.hashCode()) * 31) + this.tab_name.hashCode()) * 31) + this.tag.hashCode()) * 31;
            AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto = this.additional_info;
            return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + (appEventDataAdditionalInfoDto == null ? 0 : appEventDataAdditionalInfoDto.hashCode())) * 31) + this.button_group_title.hashCode()) * 31) + this.button_title.hashCode()) * 31) + this.button_description.hashCode()) * 31) + this.entity_type.hashCode()) * 31) + this.referrer.hashCode()) * 31) + this.root_url.hashCode()) * 31) + this.email_address.hashCode()) * 31) + this.email_category.hashCode()) * 31) + this.test_version.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.user_agent.hashCode()) * 31) + this.action_name.hashCode()) * 31) + this.url.hashCode()) * 31) + this.page.hashCode()) * 31) + this.section.hashCode()) * 31) + this.component.hashCode()) * 31) + this.element.hashCode()) * 31) + this.name.hashCode()) * 31) + this.url_params.hashCode()) * 31) + this.performance_data.hashCode()) * 31) + this.recipient.hashCode()) * 31) + this.sender.hashCode()) * 31) + this.event_name.hashCode()) * 31) + this.error_code.hashCode()) * 31) + this.error_message.hashCode()) * 31) + this.error_type.hashCode()) * 31) + this.display_message.hashCode()) * 31) + this.exit_status.hashCode()) * 31) + this.institution_id.hashCode()) * 31) + this.institution_name.hashCode()) * 31) + this.institution_search_query.hashCode()) * 31) + this.link_session_id.hashCode()) * 31) + this.mfa_type.hashCode()) * 31) + this.request_id.hashCode()) * 31) + this.plaid_timestamp.hashCode()) * 31) + this.view_name.hashCode()) * 31) + this.status.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.transfer_id.hashCode()) * 31) + this.relationship_id.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + this.target_screen_name.hashCode()) * 31) + Double.hashCode(this.clp_value)) * 31) + Double.hashCode(this.lcp_value)) * 31) + Double.hashCode(this.etr_value)) * 31) + this.description.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.direction.hashCode()) * 31) + Double.hashCode(this.fid_value)) * 31) + this.source_tag.hashCode()) * 31) + this.item.hashCode()) * 31) + Integer.hashCode(this.time)) * 31) + this.event_type.hashCode()) * 31) + this.asset_class.hashCode()) * 31) + this.payload.hashCode()) * 31) + Double.hashCode(this.milliseconds)) * 31) + this.po_box.hashCode()) * 31) + Double.hashCode(this.inp_value)) * 31) + this.debug_target.hashCode()) * 31) + Double.hashCode(this.loading_navigation_value)) * 31) + Double.hashCode(this.loading_navigation_largest_request_duration)) * 31) + this.loading_navigation_largest_request_url.hashCode()) * 31) + Integer.hashCode(this.loading_navigation_num_requests)) * 31) + this.recommendation_id.hashCode()) * 31) + this.invest_flow_schedule_id.hashCode()) * 31) + this.invest_flow_order_id.hashCode()) * 31) + Double.hashCode(this.request_duration)) * 31) + this.request_url.hashCode()) * 31) + Integer.hashCode(this.response_status_code)) * 31) + Integer.hashCode(this.item_index)) * 31) + this.message_title.hashCode()) * 31) + this.message_body.hashCode()) * 31) + this.masked_referrer.hashCode()) * 31) + this.masked_email_address.hashCode()) * 31) + this.masked_recipient.hashCode();
        }

        public String toString() {
            return "Surrogate(screen_name=" + this.screen_name + ", screen_depth=" + this.screen_depth + ", screen_description=" + this.screen_description + ", time_spent=" + this.time_spent + ", transition_reason=" + this.transition_reason + ", type=" + this.type + ", message_type=" + this.message_type + ", message_uuid=" + this.message_uuid + ", entity_id=" + this.entity_id + ", source=" + this.source + ", source_screen_name=" + this.source_screen_name + ", message=" + this.message + ", number_of_notifications=" + this.number_of_notifications + ", field_name=" + this.field_name + ", user_input=" + this.user_input + ", tab_group_name=" + this.tab_group_name + ", tab_name=" + this.tab_name + ", tag=" + this.tag + ", additional_info=" + this.additional_info + ", button_group_title=" + this.button_group_title + ", button_title=" + this.button_title + ", button_description=" + this.button_description + ", entity_type=" + this.entity_type + ", referrer=" + this.referrer + ", root_url=" + this.root_url + ", email_address=" + this.email_address + ", email_category=" + this.email_category + ", test_version=" + this.test_version + ", uuid=" + this.uuid + ", user_agent=" + this.user_agent + ", action_name=" + this.action_name + ", url=" + this.url + ", page=" + this.page + ", section=" + this.section + ", component=" + this.component + ", element=" + this.element + ", name=" + this.name + ", url_params=" + this.url_params + ", performance_data=" + this.performance_data + ", recipient=" + this.recipient + ", sender=" + this.sender + ", event_name=" + this.event_name + ", error_code=" + this.error_code + ", error_message=" + this.error_message + ", error_type=" + this.error_type + ", display_message=" + this.display_message + ", exit_status=" + this.exit_status + ", institution_id=" + this.institution_id + ", institution_name=" + this.institution_name + ", institution_search_query=" + this.institution_search_query + ", link_session_id=" + this.link_session_id + ", mfa_type=" + this.mfa_type + ", request_id=" + this.request_id + ", plaid_timestamp=" + this.plaid_timestamp + ", view_name=" + this.view_name + ", status=" + this.status + ", accounts=" + this.accounts + ", transfer_id=" + this.transfer_id + ", relationship_id=" + this.relationship_id + ", duration=" + this.duration + ", target_screen_name=" + this.target_screen_name + ", clp_value=" + this.clp_value + ", lcp_value=" + this.lcp_value + ", etr_value=" + this.etr_value + ", description=" + this.description + ", instrument_id=" + this.instrument_id + ", symbol=" + this.symbol + ", direction=" + this.direction + ", fid_value=" + this.fid_value + ", source_tag=" + this.source_tag + ", item=" + this.item + ", time=" + this.time + ", event_type=" + this.event_type + ", asset_class=" + this.asset_class + ", payload=" + this.payload + ", milliseconds=" + this.milliseconds + ", po_box=" + this.po_box + ", inp_value=" + this.inp_value + ", debug_target=" + this.debug_target + ", loading_navigation_value=" + this.loading_navigation_value + ", loading_navigation_largest_request_duration=" + this.loading_navigation_largest_request_duration + ", loading_navigation_largest_request_url=" + this.loading_navigation_largest_request_url + ", loading_navigation_num_requests=" + this.loading_navigation_num_requests + ", recommendation_id=" + this.recommendation_id + ", invest_flow_schedule_id=" + this.invest_flow_schedule_id + ", invest_flow_order_id=" + this.invest_flow_order_id + ", request_duration=" + this.request_duration + ", request_url=" + this.request_url + ", response_status_code=" + this.response_status_code + ", item_index=" + this.item_index + ", message_title=" + this.message_title + ", message_body=" + this.message_body + ", masked_referrer=" + this.masked_referrer + ", masked_email_address=" + this.masked_email_address + ", masked_recipient=" + this.masked_recipient + ")";
        }

        /* compiled from: AppEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AppEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, String str, int i4, String str2, int i5, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i6, String str11, String str12, String str13, String str14, String str15, AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, int i7, String str56, double d, double d2, double d3, String str57, String str58, String str59, String str60, double d4, String str61, String str62, int i8, String str63, String str64, String str65, double d5, String str66, double d6, String str67, double d7, double d8, String str68, int i9, String str69, String str70, String str71, double d9, String str72, int i10, int i11, String str73, String str74, String str75, String str76, String str77, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.screen_name = "";
            } else {
                this.screen_name = str;
            }
            if ((i & 2) == 0) {
                this.screen_depth = 0;
            } else {
                this.screen_depth = i4;
            }
            if ((i & 4) == 0) {
                this.screen_description = "";
            } else {
                this.screen_description = str2;
            }
            if ((i & 8) == 0) {
                this.time_spent = 0;
            } else {
                this.time_spent = i5;
            }
            if ((i & 16) == 0) {
                this.transition_reason = "";
            } else {
                this.transition_reason = str3;
            }
            if ((i & 32) == 0) {
                this.type = "";
            } else {
                this.type = str4;
            }
            if ((i & 64) == 0) {
                this.message_type = "";
            } else {
                this.message_type = str5;
            }
            if ((i & 128) == 0) {
                this.message_uuid = "";
            } else {
                this.message_uuid = str6;
            }
            if ((i & 256) == 0) {
                this.entity_id = "";
            } else {
                this.entity_id = str7;
            }
            if ((i & 512) == 0) {
                this.source = "";
            } else {
                this.source = str8;
            }
            if ((i & 1024) == 0) {
                this.source_screen_name = "";
            } else {
                this.source_screen_name = str9;
            }
            if ((i & 2048) == 0) {
                this.message = "";
            } else {
                this.message = str10;
            }
            if ((i & 4096) == 0) {
                this.number_of_notifications = 0;
            } else {
                this.number_of_notifications = i6;
            }
            if ((i & 8192) == 0) {
                this.field_name = "";
            } else {
                this.field_name = str11;
            }
            if ((i & 16384) == 0) {
                this.user_input = "";
            } else {
                this.user_input = str12;
            }
            if ((i & 32768) == 0) {
                this.tab_group_name = "";
            } else {
                this.tab_group_name = str13;
            }
            if ((i & 65536) == 0) {
                this.tab_name = "";
            } else {
                this.tab_name = str14;
            }
            if ((i & 131072) == 0) {
                this.tag = "";
            } else {
                this.tag = str15;
            }
            this.additional_info = (i & 262144) == 0 ? null : appEventDataAdditionalInfoDto;
            if ((524288 & i) == 0) {
                this.button_group_title = "";
            } else {
                this.button_group_title = str16;
            }
            if ((1048576 & i) == 0) {
                this.button_title = "";
            } else {
                this.button_title = str17;
            }
            if ((2097152 & i) == 0) {
                this.button_description = "";
            } else {
                this.button_description = str18;
            }
            if ((4194304 & i) == 0) {
                this.entity_type = "";
            } else {
                this.entity_type = str19;
            }
            if ((8388608 & i) == 0) {
                this.referrer = "";
            } else {
                this.referrer = str20;
            }
            if ((16777216 & i) == 0) {
                this.root_url = "";
            } else {
                this.root_url = str21;
            }
            if ((33554432 & i) == 0) {
                this.email_address = "";
            } else {
                this.email_address = str22;
            }
            if ((67108864 & i) == 0) {
                this.email_category = "";
            } else {
                this.email_category = str23;
            }
            if ((134217728 & i) == 0) {
                this.test_version = "";
            } else {
                this.test_version = str24;
            }
            if ((268435456 & i) == 0) {
                this.uuid = "";
            } else {
                this.uuid = str25;
            }
            if ((536870912 & i) == 0) {
                this.user_agent = "";
            } else {
                this.user_agent = str26;
            }
            if ((1073741824 & i) == 0) {
                this.action_name = "";
            } else {
                this.action_name = str27;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.url = "";
            } else {
                this.url = str28;
            }
            if ((i2 & 1) == 0) {
                this.page = "";
            } else {
                this.page = str29;
            }
            if ((i2 & 2) == 0) {
                this.section = "";
            } else {
                this.section = str30;
            }
            if ((i2 & 4) == 0) {
                this.component = "";
            } else {
                this.component = str31;
            }
            if ((i2 & 8) == 0) {
                this.element = "";
            } else {
                this.element = str32;
            }
            if ((i2 & 16) == 0) {
                this.name = "";
            } else {
                this.name = str33;
            }
            if ((i2 & 32) == 0) {
                this.url_params = "";
            } else {
                this.url_params = str34;
            }
            if ((i2 & 64) == 0) {
                this.performance_data = "";
            } else {
                this.performance_data = str35;
            }
            if ((i2 & 128) == 0) {
                this.recipient = "";
            } else {
                this.recipient = str36;
            }
            if ((i2 & 256) == 0) {
                this.sender = "";
            } else {
                this.sender = str37;
            }
            if ((i2 & 512) == 0) {
                this.event_name = "";
            } else {
                this.event_name = str38;
            }
            if ((i2 & 1024) == 0) {
                this.error_code = "";
            } else {
                this.error_code = str39;
            }
            if ((i2 & 2048) == 0) {
                this.error_message = "";
            } else {
                this.error_message = str40;
            }
            if ((i2 & 4096) == 0) {
                this.error_type = "";
            } else {
                this.error_type = str41;
            }
            if ((i2 & 8192) == 0) {
                this.display_message = "";
            } else {
                this.display_message = str42;
            }
            if ((i2 & 16384) == 0) {
                this.exit_status = "";
            } else {
                this.exit_status = str43;
            }
            if ((i2 & 32768) == 0) {
                this.institution_id = "";
            } else {
                this.institution_id = str44;
            }
            if ((i2 & 65536) == 0) {
                this.institution_name = "";
            } else {
                this.institution_name = str45;
            }
            if ((i2 & 131072) == 0) {
                this.institution_search_query = "";
            } else {
                this.institution_search_query = str46;
            }
            if ((i2 & 262144) == 0) {
                this.link_session_id = "";
            } else {
                this.link_session_id = str47;
            }
            if ((524288 & i2) == 0) {
                this.mfa_type = "";
            } else {
                this.mfa_type = str48;
            }
            if ((1048576 & i2) == 0) {
                this.request_id = "";
            } else {
                this.request_id = str49;
            }
            if ((2097152 & i2) == 0) {
                this.plaid_timestamp = "";
            } else {
                this.plaid_timestamp = str50;
            }
            if ((4194304 & i2) == 0) {
                this.view_name = "";
            } else {
                this.view_name = str51;
            }
            if ((8388608 & i2) == 0) {
                this.status = "";
            } else {
                this.status = str52;
            }
            if ((16777216 & i2) == 0) {
                this.accounts = "";
            } else {
                this.accounts = str53;
            }
            if ((33554432 & i2) == 0) {
                this.transfer_id = "";
            } else {
                this.transfer_id = str54;
            }
            if ((67108864 & i2) == 0) {
                this.relationship_id = "";
            } else {
                this.relationship_id = str55;
            }
            if ((134217728 & i2) == 0) {
                this.duration = 0;
            } else {
                this.duration = i7;
            }
            if ((268435456 & i2) == 0) {
                this.target_screen_name = "";
            } else {
                this.target_screen_name = str56;
            }
            if ((536870912 & i2) == 0) {
                this.clp_value = 0.0d;
            } else {
                this.clp_value = d;
            }
            if ((1073741824 & i2) == 0) {
                this.lcp_value = 0.0d;
            } else {
                this.lcp_value = d2;
            }
            if ((Integer.MIN_VALUE & i2) == 0) {
                this.etr_value = 0.0d;
            } else {
                this.etr_value = d3;
            }
            if ((i3 & 1) == 0) {
                this.description = "";
            } else {
                this.description = str57;
            }
            if ((i3 & 2) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str58;
            }
            if ((i3 & 4) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str59;
            }
            if ((i3 & 8) == 0) {
                this.direction = "";
            } else {
                this.direction = str60;
            }
            if ((i3 & 16) == 0) {
                this.fid_value = 0.0d;
            } else {
                this.fid_value = d4;
            }
            if ((i3 & 32) == 0) {
                this.source_tag = "";
            } else {
                this.source_tag = str61;
            }
            if ((i3 & 64) == 0) {
                this.item = "";
            } else {
                this.item = str62;
            }
            if ((i3 & 128) == 0) {
                this.time = 0;
            } else {
                this.time = i8;
            }
            if ((i3 & 256) == 0) {
                this.event_type = "";
            } else {
                this.event_type = str63;
            }
            if ((i3 & 512) == 0) {
                this.asset_class = "";
            } else {
                this.asset_class = str64;
            }
            if ((i3 & 1024) == 0) {
                this.payload = "";
            } else {
                this.payload = str65;
            }
            if ((i3 & 2048) == 0) {
                this.milliseconds = 0.0d;
            } else {
                this.milliseconds = d5;
            }
            if ((i3 & 4096) == 0) {
                this.po_box = "";
            } else {
                this.po_box = str66;
            }
            if ((i3 & 8192) == 0) {
                this.inp_value = 0.0d;
            } else {
                this.inp_value = d6;
            }
            if ((i3 & 16384) == 0) {
                this.debug_target = "";
            } else {
                this.debug_target = str67;
            }
            if ((i3 & 32768) == 0) {
                this.loading_navigation_value = 0.0d;
            } else {
                this.loading_navigation_value = d7;
            }
            if ((i3 & 65536) == 0) {
                this.loading_navigation_largest_request_duration = 0.0d;
            } else {
                this.loading_navigation_largest_request_duration = d8;
            }
            if ((i3 & 131072) == 0) {
                this.loading_navigation_largest_request_url = "";
            } else {
                this.loading_navigation_largest_request_url = str68;
            }
            if ((i3 & 262144) == 0) {
                this.loading_navigation_num_requests = 0;
            } else {
                this.loading_navigation_num_requests = i9;
            }
            if ((524288 & i3) == 0) {
                this.recommendation_id = "";
            } else {
                this.recommendation_id = str69;
            }
            if ((1048576 & i3) == 0) {
                this.invest_flow_schedule_id = "";
            } else {
                this.invest_flow_schedule_id = str70;
            }
            if ((2097152 & i3) == 0) {
                this.invest_flow_order_id = "";
            } else {
                this.invest_flow_order_id = str71;
            }
            if ((4194304 & i3) == 0) {
                this.request_duration = 0.0d;
            } else {
                this.request_duration = d9;
            }
            if ((8388608 & i3) == 0) {
                this.request_url = "";
            } else {
                this.request_url = str72;
            }
            if ((16777216 & i3) == 0) {
                this.response_status_code = 0;
            } else {
                this.response_status_code = i10;
            }
            if ((33554432 & i3) == 0) {
                this.item_index = 0;
            } else {
                this.item_index = i11;
            }
            if ((67108864 & i3) == 0) {
                this.message_title = "";
            } else {
                this.message_title = str73;
            }
            if ((134217728 & i3) == 0) {
                this.message_body = "";
            } else {
                this.message_body = str74;
            }
            if ((268435456 & i3) == 0) {
                this.masked_referrer = "";
            } else {
                this.masked_referrer = str75;
            }
            if ((536870912 & i3) == 0) {
                this.masked_email_address = "";
            } else {
                this.masked_email_address = str76;
            }
            if ((1073741824 & i3) == 0) {
                this.masked_recipient = "";
            } else {
                this.masked_recipient = str77;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.screen_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.screen_name);
            }
            int i = self.screen_depth;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.screen_description, "")) {
                output.encodeStringElement(serialDesc, 2, self.screen_description);
            }
            int i2 = self.time_spent;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (!Intrinsics.areEqual(self.transition_reason, "")) {
                output.encodeStringElement(serialDesc, 4, self.transition_reason);
            }
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 5, self.type);
            }
            if (!Intrinsics.areEqual(self.message_type, "")) {
                output.encodeStringElement(serialDesc, 6, self.message_type);
            }
            if (!Intrinsics.areEqual(self.message_uuid, "")) {
                output.encodeStringElement(serialDesc, 7, self.message_uuid);
            }
            if (!Intrinsics.areEqual(self.entity_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.entity_id);
            }
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 9, self.source);
            }
            if (!Intrinsics.areEqual(self.source_screen_name, "")) {
                output.encodeStringElement(serialDesc, 10, self.source_screen_name);
            }
            if (!Intrinsics.areEqual(self.message, "")) {
                output.encodeStringElement(serialDesc, 11, self.message);
            }
            int i3 = self.number_of_notifications;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 12, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            if (!Intrinsics.areEqual(self.field_name, "")) {
                output.encodeStringElement(serialDesc, 13, self.field_name);
            }
            if (!Intrinsics.areEqual(self.user_input, "")) {
                output.encodeStringElement(serialDesc, 14, self.user_input);
            }
            if (!Intrinsics.areEqual(self.tab_group_name, "")) {
                output.encodeStringElement(serialDesc, 15, self.tab_group_name);
            }
            if (!Intrinsics.areEqual(self.tab_name, "")) {
                output.encodeStringElement(serialDesc, 16, self.tab_name);
            }
            if (!Intrinsics.areEqual(self.tag, "")) {
                output.encodeStringElement(serialDesc, 17, self.tag);
            }
            AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto = self.additional_info;
            if (appEventDataAdditionalInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, AppEventDataAdditionalInfoDto.Serializer.INSTANCE, appEventDataAdditionalInfoDto);
            }
            if (!Intrinsics.areEqual(self.button_group_title, "")) {
                output.encodeStringElement(serialDesc, 19, self.button_group_title);
            }
            if (!Intrinsics.areEqual(self.button_title, "")) {
                output.encodeStringElement(serialDesc, 20, self.button_title);
            }
            if (!Intrinsics.areEqual(self.button_description, "")) {
                output.encodeStringElement(serialDesc, 21, self.button_description);
            }
            if (!Intrinsics.areEqual(self.entity_type, "")) {
                output.encodeStringElement(serialDesc, 22, self.entity_type);
            }
            if (!Intrinsics.areEqual(self.referrer, "")) {
                output.encodeStringElement(serialDesc, 23, self.referrer);
            }
            if (!Intrinsics.areEqual(self.root_url, "")) {
                output.encodeStringElement(serialDesc, 24, self.root_url);
            }
            if (!Intrinsics.areEqual(self.email_address, "")) {
                output.encodeStringElement(serialDesc, 25, self.email_address);
            }
            if (!Intrinsics.areEqual(self.email_category, "")) {
                output.encodeStringElement(serialDesc, 26, self.email_category);
            }
            if (!Intrinsics.areEqual(self.test_version, "")) {
                output.encodeStringElement(serialDesc, 27, self.test_version);
            }
            if (!Intrinsics.areEqual(self.uuid, "")) {
                output.encodeStringElement(serialDesc, 28, self.uuid);
            }
            if (!Intrinsics.areEqual(self.user_agent, "")) {
                output.encodeStringElement(serialDesc, 29, self.user_agent);
            }
            if (!Intrinsics.areEqual(self.action_name, "")) {
                output.encodeStringElement(serialDesc, 30, self.action_name);
            }
            if (!Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 31, self.url);
            }
            if (!Intrinsics.areEqual(self.page, "")) {
                output.encodeStringElement(serialDesc, 32, self.page);
            }
            if (!Intrinsics.areEqual(self.section, "")) {
                output.encodeStringElement(serialDesc, 33, self.section);
            }
            if (!Intrinsics.areEqual(self.component, "")) {
                output.encodeStringElement(serialDesc, 34, self.component);
            }
            if (!Intrinsics.areEqual(self.element, "")) {
                output.encodeStringElement(serialDesc, 35, self.element);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 36, self.name);
            }
            if (!Intrinsics.areEqual(self.url_params, "")) {
                output.encodeStringElement(serialDesc, 37, self.url_params);
            }
            if (!Intrinsics.areEqual(self.performance_data, "")) {
                output.encodeStringElement(serialDesc, 38, self.performance_data);
            }
            if (!Intrinsics.areEqual(self.recipient, "")) {
                output.encodeStringElement(serialDesc, 39, self.recipient);
            }
            if (!Intrinsics.areEqual(self.sender, "")) {
                output.encodeStringElement(serialDesc, 40, self.sender);
            }
            if (!Intrinsics.areEqual(self.event_name, "")) {
                output.encodeStringElement(serialDesc, 41, self.event_name);
            }
            if (!Intrinsics.areEqual(self.error_code, "")) {
                output.encodeStringElement(serialDesc, 42, self.error_code);
            }
            if (!Intrinsics.areEqual(self.error_message, "")) {
                output.encodeStringElement(serialDesc, 43, self.error_message);
            }
            if (!Intrinsics.areEqual(self.error_type, "")) {
                output.encodeStringElement(serialDesc, 44, self.error_type);
            }
            if (!Intrinsics.areEqual(self.display_message, "")) {
                output.encodeStringElement(serialDesc, 45, self.display_message);
            }
            if (!Intrinsics.areEqual(self.exit_status, "")) {
                output.encodeStringElement(serialDesc, 46, self.exit_status);
            }
            if (!Intrinsics.areEqual(self.institution_id, "")) {
                output.encodeStringElement(serialDesc, 47, self.institution_id);
            }
            if (!Intrinsics.areEqual(self.institution_name, "")) {
                output.encodeStringElement(serialDesc, 48, self.institution_name);
            }
            if (!Intrinsics.areEqual(self.institution_search_query, "")) {
                output.encodeStringElement(serialDesc, 49, self.institution_search_query);
            }
            if (!Intrinsics.areEqual(self.link_session_id, "")) {
                output.encodeStringElement(serialDesc, 50, self.link_session_id);
            }
            if (!Intrinsics.areEqual(self.mfa_type, "")) {
                output.encodeStringElement(serialDesc, 51, self.mfa_type);
            }
            if (!Intrinsics.areEqual(self.request_id, "")) {
                output.encodeStringElement(serialDesc, 52, self.request_id);
            }
            if (!Intrinsics.areEqual(self.plaid_timestamp, "")) {
                output.encodeStringElement(serialDesc, 53, self.plaid_timestamp);
            }
            if (!Intrinsics.areEqual(self.view_name, "")) {
                output.encodeStringElement(serialDesc, 54, self.view_name);
            }
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 55, self.status);
            }
            if (!Intrinsics.areEqual(self.accounts, "")) {
                output.encodeStringElement(serialDesc, 56, self.accounts);
            }
            if (!Intrinsics.areEqual(self.transfer_id, "")) {
                output.encodeStringElement(serialDesc, 57, self.transfer_id);
            }
            if (!Intrinsics.areEqual(self.relationship_id, "")) {
                output.encodeStringElement(serialDesc, 58, self.relationship_id);
            }
            int i4 = self.duration;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 59, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            if (!Intrinsics.areEqual(self.target_screen_name, "")) {
                output.encodeStringElement(serialDesc, 60, self.target_screen_name);
            }
            if (Double.compare(self.clp_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 61, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.clp_value));
            }
            if (Double.compare(self.lcp_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 62, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.lcp_value));
            }
            if (Double.compare(self.etr_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 63, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.etr_value));
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 64, self.description);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 65, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 66, self.symbol);
            }
            if (!Intrinsics.areEqual(self.direction, "")) {
                output.encodeStringElement(serialDesc, 67, self.direction);
            }
            if (Double.compare(self.fid_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 68, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.fid_value));
            }
            if (!Intrinsics.areEqual(self.source_tag, "")) {
                output.encodeStringElement(serialDesc, 69, self.source_tag);
            }
            if (!Intrinsics.areEqual(self.item, "")) {
                output.encodeStringElement(serialDesc, 70, self.item);
            }
            int i5 = self.time;
            if (i5 != 0) {
                output.encodeSerializableElement(serialDesc, 71, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i5));
            }
            if (!Intrinsics.areEqual(self.event_type, "")) {
                output.encodeStringElement(serialDesc, 72, self.event_type);
            }
            if (!Intrinsics.areEqual(self.asset_class, "")) {
                output.encodeStringElement(serialDesc, 73, self.asset_class);
            }
            if (!Intrinsics.areEqual(self.payload, "")) {
                output.encodeStringElement(serialDesc, 74, self.payload);
            }
            if (Double.compare(self.milliseconds, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 75, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.milliseconds));
            }
            if (!Intrinsics.areEqual(self.po_box, "")) {
                output.encodeStringElement(serialDesc, 76, self.po_box);
            }
            if (Double.compare(self.inp_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 77, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.inp_value));
            }
            if (!Intrinsics.areEqual(self.debug_target, "")) {
                output.encodeStringElement(serialDesc, 78, self.debug_target);
            }
            if (Double.compare(self.loading_navigation_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 79, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.loading_navigation_value));
            }
            if (Double.compare(self.loading_navigation_largest_request_duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 80, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.loading_navigation_largest_request_duration));
            }
            if (!Intrinsics.areEqual(self.loading_navigation_largest_request_url, "")) {
                output.encodeStringElement(serialDesc, 81, self.loading_navigation_largest_request_url);
            }
            int i6 = self.loading_navigation_num_requests;
            if (i6 != 0) {
                output.encodeSerializableElement(serialDesc, 82, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i6));
            }
            if (!Intrinsics.areEqual(self.recommendation_id, "")) {
                output.encodeStringElement(serialDesc, 83, self.recommendation_id);
            }
            if (!Intrinsics.areEqual(self.invest_flow_schedule_id, "")) {
                output.encodeStringElement(serialDesc, 84, self.invest_flow_schedule_id);
            }
            if (!Intrinsics.areEqual(self.invest_flow_order_id, "")) {
                output.encodeStringElement(serialDesc, 85, self.invest_flow_order_id);
            }
            if (Double.compare(self.request_duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 86, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.request_duration));
            }
            if (!Intrinsics.areEqual(self.request_url, "")) {
                output.encodeStringElement(serialDesc, 87, self.request_url);
            }
            int i7 = self.response_status_code;
            if (i7 != 0) {
                output.encodeSerializableElement(serialDesc, 88, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i7));
            }
            int i8 = self.item_index;
            if (i8 != 0) {
                output.encodeSerializableElement(serialDesc, 89, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i8));
            }
            if (!Intrinsics.areEqual(self.message_title, "")) {
                output.encodeStringElement(serialDesc, 90, self.message_title);
            }
            if (!Intrinsics.areEqual(self.message_body, "")) {
                output.encodeStringElement(serialDesc, 91, self.message_body);
            }
            if (!Intrinsics.areEqual(self.masked_referrer, "")) {
                output.encodeStringElement(serialDesc, 92, self.masked_referrer);
            }
            if (!Intrinsics.areEqual(self.masked_email_address, "")) {
                output.encodeStringElement(serialDesc, 93, self.masked_email_address);
            }
            if (Intrinsics.areEqual(self.masked_recipient, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 94, self.masked_recipient);
        }

        public Surrogate(String screen_name, int i, String screen_description, int i2, String transition_reason, String type2, String message_type, String message_uuid, String entity_id, String source, String source_screen_name, String message, int i3, String field_name, String user_input, String tab_group_name, String tab_name, String tag, AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto, String button_group_title, String button_title, String button_description, String entity_type, String referrer, String root_url, String email_address, String email_category, String test_version, String uuid, String user_agent, String action_name, String url, String page, String section, String component, String element, String name, String url_params, String performance_data, String recipient, String sender, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String transfer_id, String relationship_id, int i4, String target_screen_name, double d, double d2, double d3, String description, String instrument_id, String symbol, String direction, double d4, String source_tag, String item, int i5, String event_type, String asset_class, String payload, double d5, String po_box, double d6, String debug_target, double d7, double d8, String loading_navigation_largest_request_url, int i6, String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id, double d9, String request_url, int i7, int i8, String message_title, String message_body, String masked_referrer, String masked_email_address, String masked_recipient) {
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(screen_description, "screen_description");
            Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(message_type, "message_type");
            Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
            Intrinsics.checkNotNullParameter(entity_id, "entity_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(field_name, "field_name");
            Intrinsics.checkNotNullParameter(user_input, "user_input");
            Intrinsics.checkNotNullParameter(tab_group_name, "tab_group_name");
            Intrinsics.checkNotNullParameter(tab_name, "tab_name");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(button_group_title, "button_group_title");
            Intrinsics.checkNotNullParameter(button_title, "button_title");
            Intrinsics.checkNotNullParameter(button_description, "button_description");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            Intrinsics.checkNotNullParameter(referrer, "referrer");
            Intrinsics.checkNotNullParameter(root_url, "root_url");
            Intrinsics.checkNotNullParameter(email_address, "email_address");
            Intrinsics.checkNotNullParameter(email_category, "email_category");
            Intrinsics.checkNotNullParameter(test_version, "test_version");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(action_name, "action_name");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(element, "element");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url_params, "url_params");
            Intrinsics.checkNotNullParameter(performance_data, "performance_data");
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(event_name, "event_name");
            Intrinsics.checkNotNullParameter(error_code, "error_code");
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(display_message, "display_message");
            Intrinsics.checkNotNullParameter(exit_status, "exit_status");
            Intrinsics.checkNotNullParameter(institution_id, "institution_id");
            Intrinsics.checkNotNullParameter(institution_name, "institution_name");
            Intrinsics.checkNotNullParameter(institution_search_query, "institution_search_query");
            Intrinsics.checkNotNullParameter(link_session_id, "link_session_id");
            Intrinsics.checkNotNullParameter(mfa_type, "mfa_type");
            Intrinsics.checkNotNullParameter(request_id, "request_id");
            Intrinsics.checkNotNullParameter(plaid_timestamp, "plaid_timestamp");
            Intrinsics.checkNotNullParameter(view_name, "view_name");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
            Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(source_tag, "source_tag");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            Intrinsics.checkNotNullParameter(asset_class, "asset_class");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(po_box, "po_box");
            Intrinsics.checkNotNullParameter(debug_target, "debug_target");
            Intrinsics.checkNotNullParameter(loading_navigation_largest_request_url, "loading_navigation_largest_request_url");
            Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
            Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
            Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
            Intrinsics.checkNotNullParameter(request_url, "request_url");
            Intrinsics.checkNotNullParameter(message_title, "message_title");
            Intrinsics.checkNotNullParameter(message_body, "message_body");
            Intrinsics.checkNotNullParameter(masked_referrer, "masked_referrer");
            Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
            Intrinsics.checkNotNullParameter(masked_recipient, "masked_recipient");
            this.screen_name = screen_name;
            this.screen_depth = i;
            this.screen_description = screen_description;
            this.time_spent = i2;
            this.transition_reason = transition_reason;
            this.type = type2;
            this.message_type = message_type;
            this.message_uuid = message_uuid;
            this.entity_id = entity_id;
            this.source = source;
            this.source_screen_name = source_screen_name;
            this.message = message;
            this.number_of_notifications = i3;
            this.field_name = field_name;
            this.user_input = user_input;
            this.tab_group_name = tab_group_name;
            this.tab_name = tab_name;
            this.tag = tag;
            this.additional_info = appEventDataAdditionalInfoDto;
            this.button_group_title = button_group_title;
            this.button_title = button_title;
            this.button_description = button_description;
            this.entity_type = entity_type;
            this.referrer = referrer;
            this.root_url = root_url;
            this.email_address = email_address;
            this.email_category = email_category;
            this.test_version = test_version;
            this.uuid = uuid;
            this.user_agent = user_agent;
            this.action_name = action_name;
            this.url = url;
            this.page = page;
            this.section = section;
            this.component = component;
            this.element = element;
            this.name = name;
            this.url_params = url_params;
            this.performance_data = performance_data;
            this.recipient = recipient;
            this.sender = sender;
            this.event_name = event_name;
            this.error_code = error_code;
            this.error_message = error_message;
            this.error_type = error_type;
            this.display_message = display_message;
            this.exit_status = exit_status;
            this.institution_id = institution_id;
            this.institution_name = institution_name;
            this.institution_search_query = institution_search_query;
            this.link_session_id = link_session_id;
            this.mfa_type = mfa_type;
            this.request_id = request_id;
            this.plaid_timestamp = plaid_timestamp;
            this.view_name = view_name;
            this.status = status;
            this.accounts = accounts2;
            this.transfer_id = transfer_id;
            this.relationship_id = relationship_id;
            this.duration = i4;
            this.target_screen_name = target_screen_name;
            this.clp_value = d;
            this.lcp_value = d2;
            this.etr_value = d3;
            this.description = description;
            this.instrument_id = instrument_id;
            this.symbol = symbol;
            this.direction = direction;
            this.fid_value = d4;
            this.source_tag = source_tag;
            this.item = item;
            this.time = i5;
            this.event_type = event_type;
            this.asset_class = asset_class;
            this.payload = payload;
            this.milliseconds = d5;
            this.po_box = po_box;
            this.inp_value = d6;
            this.debug_target = debug_target;
            this.loading_navigation_value = d7;
            this.loading_navigation_largest_request_duration = d8;
            this.loading_navigation_largest_request_url = loading_navigation_largest_request_url;
            this.loading_navigation_num_requests = i6;
            this.recommendation_id = recommendation_id;
            this.invest_flow_schedule_id = invest_flow_schedule_id;
            this.invest_flow_order_id = invest_flow_order_id;
            this.request_duration = d9;
            this.request_url = request_url;
            this.response_status_code = i7;
            this.item_index = i8;
            this.message_title = message_title;
            this.message_body = message_body;
            this.masked_referrer = masked_referrer;
            this.masked_email_address = masked_email_address;
            this.masked_recipient = masked_recipient;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, String str11, String str12, String str13, String str14, String str15, AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, int i4, String str56, double d, double d2, double d3, String str57, String str58, String str59, String str60, double d4, String str61, String str62, int i5, String str63, String str64, String str65, double d5, String str66, double d6, String str67, double d7, double d8, String str68, int i6, String str69, String str70, String str71, double d9, String str72, int i7, int i8, String str73, String str74, String str75, String str76, String str77, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            String str78 = (i9 & 1) != 0 ? "" : str;
            int i12 = (i9 & 2) != 0 ? 0 : i;
            String str79 = (i9 & 4) != 0 ? "" : str2;
            int i13 = (i9 & 8) != 0 ? 0 : i2;
            String str80 = (i9 & 16) != 0 ? "" : str3;
            String str81 = (i9 & 32) != 0 ? "" : str4;
            String str82 = (i9 & 64) != 0 ? "" : str5;
            String str83 = (i9 & 128) != 0 ? "" : str6;
            String str84 = (i9 & 256) != 0 ? "" : str7;
            String str85 = (i9 & 512) != 0 ? "" : str8;
            String str86 = (i9 & 1024) != 0 ? "" : str9;
            String str87 = (i9 & 2048) != 0 ? "" : str10;
            String str88 = str78;
            int i14 = (i9 & 4096) != 0 ? 0 : i3;
            String str89 = (i9 & 8192) != 0 ? "" : str11;
            String str90 = (i9 & 16384) != 0 ? "" : str12;
            String str91 = (i9 & 32768) != 0 ? "" : str13;
            String str92 = (i9 & 65536) != 0 ? "" : str14;
            String str93 = (i9 & 131072) != 0 ? "" : str15;
            AppEventDataAdditionalInfoDto appEventDataAdditionalInfoDto2 = (i9 & 262144) != 0 ? null : appEventDataAdditionalInfoDto;
            String str94 = (i9 & 524288) != 0 ? "" : str16;
            String str95 = (i9 & 1048576) != 0 ? "" : str17;
            String str96 = (i9 & 2097152) != 0 ? "" : str18;
            String str97 = (i9 & 4194304) != 0 ? "" : str19;
            String str98 = (i9 & 8388608) != 0 ? "" : str20;
            String str99 = (i9 & 16777216) != 0 ? "" : str21;
            String str100 = (i9 & 33554432) != 0 ? "" : str22;
            String str101 = (i9 & 67108864) != 0 ? "" : str23;
            String str102 = (i9 & 134217728) != 0 ? "" : str24;
            String str103 = (i9 & 268435456) != 0 ? "" : str25;
            String str104 = (i9 & 536870912) != 0 ? "" : str26;
            String str105 = (i9 & 1073741824) != 0 ? "" : str27;
            String str106 = (i9 & Integer.MIN_VALUE) != 0 ? "" : str28;
            this(str88, i12, str79, i13, str80, str81, str82, str83, str84, str85, str86, str87, i14, str89, str90, str91, str92, str93, appEventDataAdditionalInfoDto2, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, str104, str105, str106, (i10 & 1) != 0 ? "" : str29, (i10 & 2) != 0 ? "" : str30, (i10 & 4) != 0 ? "" : str31, (i10 & 8) != 0 ? "" : str32, (i10 & 16) != 0 ? "" : str33, (i10 & 32) != 0 ? "" : str34, (i10 & 64) != 0 ? "" : str35, (i10 & 128) != 0 ? "" : str36, (i10 & 256) != 0 ? "" : str37, (i10 & 512) != 0 ? "" : str38, (i10 & 1024) != 0 ? "" : str39, (i10 & 2048) != 0 ? "" : str40, (i10 & 4096) != 0 ? "" : str41, (i10 & 8192) != 0 ? "" : str42, (i10 & 16384) != 0 ? "" : str43, (i10 & 32768) != 0 ? "" : str44, (i10 & 65536) != 0 ? "" : str45, (i10 & 131072) != 0 ? "" : str46, (i10 & 262144) != 0 ? "" : str47, (i10 & 524288) != 0 ? "" : str48, (i10 & 1048576) != 0 ? "" : str49, (i10 & 2097152) != 0 ? "" : str50, (i10 & 4194304) != 0 ? "" : str51, (i10 & 8388608) != 0 ? "" : str52, (i10 & 16777216) != 0 ? "" : str53, (i10 & 33554432) != 0 ? "" : str54, (i10 & 67108864) != 0 ? "" : str55, (i10 & 134217728) != 0 ? 0 : i4, (i10 & 268435456) != 0 ? "" : str56, (i10 & 536870912) != 0 ? 0.0d : d, (i10 & 1073741824) != 0 ? 0.0d : d2, (i10 & Integer.MIN_VALUE) != 0 ? 0.0d : d3, (i11 & 1) != 0 ? "" : str57, (i11 & 2) != 0 ? "" : str58, (i11 & 4) != 0 ? "" : str59, (i11 & 8) != 0 ? "" : str60, (i11 & 16) != 0 ? 0.0d : d4, (i11 & 32) != 0 ? "" : str61, (i11 & 64) != 0 ? "" : str62, (i11 & 128) != 0 ? 0 : i5, (i11 & 256) != 0 ? "" : str63, (i11 & 512) != 0 ? "" : str64, (i11 & 1024) != 0 ? "" : str65, (i11 & 2048) != 0 ? 0.0d : d5, (i11 & 4096) != 0 ? "" : str66, (i11 & 8192) != 0 ? 0.0d : d6, (i11 & 16384) != 0 ? "" : str67, (i11 & 32768) != 0 ? 0.0d : d7, (i11 & 65536) != 0 ? 0.0d : d8, (i11 & 131072) != 0 ? "" : str68, (i11 & 262144) != 0 ? 0 : i6, (i11 & 524288) != 0 ? "" : str69, (i11 & 1048576) != 0 ? "" : str70, (i11 & 2097152) != 0 ? "" : str71, (i11 & 4194304) == 0 ? d9 : 0.0d, (i11 & 8388608) != 0 ? "" : str72, (i11 & 16777216) != 0 ? 0 : i7, (i11 & 33554432) != 0 ? 0 : i8, (i11 & 67108864) != 0 ? "" : str73, (i11 & 134217728) != 0 ? "" : str74, (i11 & 268435456) != 0 ? "" : str75, (i11 & 536870912) != 0 ? "" : str76, (i11 & 1073741824) != 0 ? "" : str77);
        }

        public final String getScreen_name() {
            return this.screen_name;
        }

        public final int getScreen_depth() {
            return this.screen_depth;
        }

        public final String getScreen_description() {
            return this.screen_description;
        }

        public final int getTime_spent() {
            return this.time_spent;
        }

        public final String getTransition_reason() {
            return this.transition_reason;
        }

        public final String getType() {
            return this.type;
        }

        public final String getMessage_type() {
            return this.message_type;
        }

        public final String getMessage_uuid() {
            return this.message_uuid;
        }

        public final String getEntity_id() {
            return this.entity_id;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getSource_screen_name() {
            return this.source_screen_name;
        }

        public final String getMessage() {
            return this.message;
        }

        public final int getNumber_of_notifications() {
            return this.number_of_notifications;
        }

        public final String getField_name() {
            return this.field_name;
        }

        public final String getUser_input() {
            return this.user_input;
        }

        public final String getTab_group_name() {
            return this.tab_group_name;
        }

        public final String getTab_name() {
            return this.tab_name;
        }

        public final String getTag() {
            return this.tag;
        }

        public final AppEventDataAdditionalInfoDto getAdditional_info() {
            return this.additional_info;
        }

        public final String getButton_group_title() {
            return this.button_group_title;
        }

        public final String getButton_title() {
            return this.button_title;
        }

        public final String getButton_description() {
            return this.button_description;
        }

        public final String getEntity_type() {
            return this.entity_type;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final String getRoot_url() {
            return this.root_url;
        }

        public final String getEmail_address() {
            return this.email_address;
        }

        public final String getEmail_category() {
            return this.email_category;
        }

        public final String getTest_version() {
            return this.test_version;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final String getUser_agent() {
            return this.user_agent;
        }

        public final String getAction_name() {
            return this.action_name;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getPage() {
            return this.page;
        }

        public final String getSection() {
            return this.section;
        }

        public final String getComponent() {
            return this.component;
        }

        public final String getElement() {
            return this.element;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUrl_params() {
            return this.url_params;
        }

        public final String getPerformance_data() {
            return this.performance_data;
        }

        public final String getRecipient() {
            return this.recipient;
        }

        public final String getSender() {
            return this.sender;
        }

        public final String getEvent_name() {
            return this.event_name;
        }

        public final String getError_code() {
            return this.error_code;
        }

        public final String getError_message() {
            return this.error_message;
        }

        public final String getError_type() {
            return this.error_type;
        }

        public final String getDisplay_message() {
            return this.display_message;
        }

        public final String getExit_status() {
            return this.exit_status;
        }

        public final String getInstitution_id() {
            return this.institution_id;
        }

        public final String getInstitution_name() {
            return this.institution_name;
        }

        public final String getInstitution_search_query() {
            return this.institution_search_query;
        }

        public final String getLink_session_id() {
            return this.link_session_id;
        }

        public final String getMfa_type() {
            return this.mfa_type;
        }

        public final String getRequest_id() {
            return this.request_id;
        }

        public final String getPlaid_timestamp() {
            return this.plaid_timestamp;
        }

        public final String getView_name() {
            return this.view_name;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getAccounts() {
            return this.accounts;
        }

        public final String getTransfer_id() {
            return this.transfer_id;
        }

        public final String getRelationship_id() {
            return this.relationship_id;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final String getTarget_screen_name() {
            return this.target_screen_name;
        }

        public final double getClp_value() {
            return this.clp_value;
        }

        public final double getLcp_value() {
            return this.lcp_value;
        }

        public final double getEtr_value() {
            return this.etr_value;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getDirection() {
            return this.direction;
        }

        public final double getFid_value() {
            return this.fid_value;
        }

        public final String getSource_tag() {
            return this.source_tag;
        }

        public final String getItem() {
            return this.item;
        }

        public final int getTime() {
            return this.time;
        }

        public final String getEvent_type() {
            return this.event_type;
        }

        public final String getAsset_class() {
            return this.asset_class;
        }

        public final String getPayload() {
            return this.payload;
        }

        public final double getMilliseconds() {
            return this.milliseconds;
        }

        public final String getPo_box() {
            return this.po_box;
        }

        public final double getInp_value() {
            return this.inp_value;
        }

        public final String getDebug_target() {
            return this.debug_target;
        }

        public final double getLoading_navigation_value() {
            return this.loading_navigation_value;
        }

        public final double getLoading_navigation_largest_request_duration() {
            return this.loading_navigation_largest_request_duration;
        }

        public final String getLoading_navigation_largest_request_url() {
            return this.loading_navigation_largest_request_url;
        }

        public final int getLoading_navigation_num_requests() {
            return this.loading_navigation_num_requests;
        }

        public final String getRecommendation_id() {
            return this.recommendation_id;
        }

        public final String getInvest_flow_schedule_id() {
            return this.invest_flow_schedule_id;
        }

        public final String getInvest_flow_order_id() {
            return this.invest_flow_order_id;
        }

        public final double getRequest_duration() {
            return this.request_duration;
        }

        public final String getRequest_url() {
            return this.request_url;
        }

        public final int getResponse_status_code() {
            return this.response_status_code;
        }

        public final int getItem_index() {
            return this.item_index;
        }

        public final String getMessage_title() {
            return this.message_title;
        }

        public final String getMessage_body() {
            return this.message_body;
        }

        public final String getMasked_referrer() {
            return this.masked_referrer;
        }

        public final String getMasked_email_address() {
            return this.masked_email_address;
        }

        public final String getMasked_recipient() {
            return this.masked_recipient;
        }
    }

    /* compiled from: AppEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/AppEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AppEventDataDto, AppEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) AppEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AppEventData> getProtoAdapter() {
            return AppEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppEventDataDto getZeroValue() {
            return AppEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppEventDataDto fromProto(AppEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String screen_name = proto.getScreen_name();
            int screen_depth = proto.getScreen_depth();
            String screen_description = proto.getScreen_description();
            int time_spent = proto.getTime_spent();
            String transition_reason = proto.getTransition_reason();
            String type2 = proto.getType();
            String message_type = proto.getMessage_type();
            String message_uuid = proto.getMessage_uuid();
            String entity_id = proto.getEntity_id();
            String source = proto.getSource();
            String source_screen_name = proto.getSource_screen_name();
            String message = proto.getMessage();
            int number_of_notifications = proto.getNumber_of_notifications();
            String field_name = proto.getField_name();
            String user_input = proto.getUser_input();
            String tab_group_name = proto.getTab_group_name();
            String tab_name = proto.getTab_name();
            String tag = proto.getTag();
            AppEventDataAdditionalInfo additional_info = proto.getAdditional_info();
            return new AppEventDataDto(new Surrogate(screen_name, screen_depth, screen_description, time_spent, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, message, number_of_notifications, field_name, user_input, tab_group_name, tab_name, tag, additional_info != null ? AppEventDataAdditionalInfoDto.INSTANCE.fromProto(additional_info) : null, proto.getButton_group_title(), proto.getButton_title(), proto.getButton_description(), proto.getEntity_type(), proto.getReferrer(), proto.getRoot_url(), proto.getEmail_address(), proto.getEmail_category(), proto.getTest_version(), proto.getUuid(), proto.getUser_agent(), proto.getAction_name(), proto.getUrl(), proto.getPage(), proto.getSection(), proto.getComponent(), proto.getElement(), proto.getName(), proto.getUrl_params(), proto.getPerformance_data(), proto.getRecipient(), proto.getSender(), proto.getEvent_name(), proto.getError_code(), proto.getError_message(), proto.getError_type(), proto.getDisplay_message(), proto.getExit_status(), proto.getInstitution_id(), proto.getInstitution_name(), proto.getInstitution_search_query(), proto.getLink_session_id(), proto.getMfa_type(), proto.getRequest_id(), proto.getPlaid_timestamp(), proto.getView_name(), proto.getStatus(), proto.getAccounts(), proto.getTransfer_id(), proto.getRelationship_id(), proto.getDuration(), proto.getTarget_screen_name(), proto.getClp_value(), proto.getLcp_value(), proto.getEtr_value(), proto.getDescription(), proto.getInstrument_id(), proto.getSymbol(), proto.getDirection(), proto.getFid_value(), proto.getSource_tag(), proto.getItem(), proto.getTime(), proto.getEvent_type(), proto.getAsset_class(), proto.getPayload(), proto.getMilliseconds(), proto.getPo_box(), proto.getInp_value(), proto.getDebug_target(), proto.getLoading_navigation_value(), proto.getLoading_navigation_largest_request_duration(), proto.getLoading_navigation_largest_request_url(), proto.getLoading_navigation_num_requests(), proto.getRecommendation_id(), proto.getInvest_flow_schedule_id(), proto.getInvest_flow_order_id(), proto.getRequest_duration(), proto.getRequest_url(), proto.getResponse_status_code(), proto.getItem_index(), proto.getMessage_title(), proto.getMessage_body(), proto.getMasked_referrer(), proto.getMasked_email_address(), proto.getMasked_recipient()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AppEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AppEventDataDto(null, 0, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 0.0d, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, 0, null, null, null, 0.0d, null, 0.0d, null, 0.0d, 0.0d, null, 0, null, null, null, 0.0d, null, 0, 0, null, null, null, null, null, -1, -1, Integer.MAX_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AppEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AppEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AppEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AppEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AppEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AppEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AppEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AppEventDataDto";
        }
    }
}
