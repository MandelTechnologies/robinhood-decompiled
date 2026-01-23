package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.ExecutionFeesDto;
import com.robinhood.rosetta.mainst.NullableBoolDto;
import com.robinhood.rosetta.mainst.NullableIntDto;
import com.robinhood.rosetta.mainst.NullableStringDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import rosetta.mainst.Capacity;
import rosetta.mainst.CapacityDto;
import rosetta.mainst.LastLiquidityInd;
import rosetta.mainst.LastLiquidityIndDto;
import rosetta.mainst.Route;
import rosetta.mainst.RouteDto;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;
import rosetta.mainst.TradeBreakAgent;
import rosetta.mainst.TradeBreakAgentDto;
import rosetta.mainst.Venue;
import rosetta.mainst.VenueDto;

/* compiled from: ExecutionDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ¨\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b§\u0001¨\u0001©\u0001ª\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u009b\u0005\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010.\u001a\u00020+\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u00102\u001a\u000203\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u00105\u001a\u000206\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010;\u001a\u00020\u0014\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010=\u001a\u00020\u0014\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010C\u001a\u00020D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010M\u001a\u00020N\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P¢\u0006\u0004\b\u0006\u0010QJ\u0099\u0005\u0010\u009a\u0001\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010.\u001a\u00020+2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020\u00142\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010=\u001a\u00020\u00142\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010M\u001a\u00020N2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010PJ\t\u0010\u009b\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u009c\u0001\u001a\u00020\u0011H\u0016J\u0016\u0010\u009d\u0001\u001a\u00020\u00142\n\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001H\u0096\u0002J\t\u0010 \u0001\u001a\u00020\u0017H\u0016J\u001d\u0010¡\u0001\u001a\u00030¢\u00012\b\u0010£\u0001\u001a\u00030¤\u00012\u0007\u0010¥\u0001\u001a\u00020\u0017H\u0016J\t\u0010¦\u0001\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bW\u0010VR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\\\u0010YR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b_\u0010[R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bd\u0010VR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\be\u0010cR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bf\u0010cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bi\u0010cR\u0013\u0010 \u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bj\u0010YR\u0013\u0010!\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bk\u0010YR\u0013\u0010\"\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bl\u0010VR\u0013\u0010#\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bm\u0010VR\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010&\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bp\u0010cR\u0013\u0010'\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bq\u0010VR\u0013\u0010(\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\br\u0010VR\u0013\u0010)\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bs\u0010VR\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0013\u0010,\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bv\u0010VR\u0013\u0010-\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bw\u0010VR\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bx\u0010uR\u0013\u0010/\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\by\u0010YR\u0013\u00100\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bz\u0010SR\u0013\u00101\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b{\u0010SR\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0013\u00104\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b~\u0010YR\u0012\u00105\u001a\u0002068F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0014\u00107\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010VR\u0014\u00108\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010VR\u0014\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0007\u001a\u0005\b9\u0010\u0083\u0001R\u0012\u0010;\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010^R\u0014\u0010<\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010VR\u0012\u0010=\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010^R\u0014\u0010>\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010VR\u0014\u0010?\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010VR\u0014\u0010@\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010cR\u0014\u0010A\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010VR\u0014\u0010B\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010VR\u0013\u0010C\u001a\u00020D8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0014\u0010E\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010cR\u0014\u0010F\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010VR\u0014\u0010G\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010cR\u0014\u0010H\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010cR\u0014\u0010I\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010VR\u0014\u0010J\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010cR\u0014\u0010K\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010YR\u0014\u0010L\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010SR\u0013\u0010M\u001a\u00020N8F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0015\u0010O\u001a\u0004\u0018\u00010P8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006«\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ExecutionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/Execution;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/ExecutionDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/ExecutionDto$Surrogate;)V", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "id", "quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "execution_id", "", "broken_at", "fill", "", "exec_broker", "update_count", "", "leg_id", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "commission", "commission_currency", "commission_type", "liquidity_ind", "Lcom/robinhood/rosetta/mainst/NullableIntDto;", "settlement_type", "settlement_date", "trade_date", "sec_fee", "taf_fee", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "cl_ord_id", "rounded_notional", "nbbo_ask_price", "nbbo_ask_quantity", "nbbo_ask_venue", "Lrosetta/mainst/VenueDto;", "nbbo_bid_price", "nbbo_bid_quantity", "nbbo_bid_venue", "nbbo_exchange_timestamp", "pending_execution_id", "price_source_execution_id", "trade_break_agent", "Lrosetta/mainst/TradeBreakAgentDto;", "processed_at", "capacity", "Lrosetta/mainst/CapacityDto;", "limit_up_price", "limit_down_price", "is_adjustment", "Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "notional_execution", "clearing_quantity", "notional_fill", "or_fee", "occ_fee", "trade_match_id", "exchange_fee", "base_currency_traded", "side", "Lrosetta/mainst/SideDto;", "position_id", "non_denominated_currency_traded", "uti", "rel_tx_id", "fx_fee_in_bps", "contra_firm_account", "estimated_next_settlement_time", "associated_fx_execution_id", "last_liquidity_ind", "Lrosetta/mainst/LastLiquidityIndDto;", "execution_fees", "Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;ZLjava/lang/String;ILcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/RouteDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/TradeBreakAgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/LastLiquidityIndDto;Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getId", "getQuantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getPrice", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getExecution_id", "()Ljava/lang/String;", "getBroken_at", "getFill", "()Z", "getExec_broker", "getUpdate_count", "()I", "getLeg_id", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getCommission", "getCommission_currency", "getCommission_type", "getLiquidity_ind", "()Lcom/robinhood/rosetta/mainst/NullableIntDto;", "getSettlement_type", "getSettlement_date", "getTrade_date", "getSec_fee", "getTaf_fee", "getRoute", "()Lrosetta/mainst/RouteDto;", "getCl_ord_id", "getRounded_notional", "getNbbo_ask_price", "getNbbo_ask_quantity", "getNbbo_ask_venue", "()Lrosetta/mainst/VenueDto;", "getNbbo_bid_price", "getNbbo_bid_quantity", "getNbbo_bid_venue", "getNbbo_exchange_timestamp", "getPending_execution_id", "getPrice_source_execution_id", "getTrade_break_agent", "()Lrosetta/mainst/TradeBreakAgentDto;", "getProcessed_at", "getCapacity", "()Lrosetta/mainst/CapacityDto;", "getLimit_up_price", "getLimit_down_price", "()Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "getNotional_execution", "getClearing_quantity", "getNotional_fill", "getOr_fee", "getOcc_fee", "getTrade_match_id", "getExchange_fee", "getBase_currency_traded", "getSide", "()Lrosetta/mainst/SideDto;", "getPosition_id", "getNon_denominated_currency_traded", "getUti", "getRel_tx_id", "getFx_fee_in_bps", "getContra_firm_account", "getEstimated_next_settlement_time", "getAssociated_fx_execution_id", "getLast_liquidity_ind", "()Lrosetta/mainst/LastLiquidityIndDto;", "getExecution_fees", "()Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class ExecutionDto implements Dto3<Execution>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ExecutionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ExecutionDto, Execution>> binaryBase64Serializer$delegate;
    private static final ExecutionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ExecutionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ExecutionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final DecimalDto getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final DecimalDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final TimeDto getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getExecution_id() {
        return this.surrogate.getExecution_id();
    }

    public final TimeDto getBroken_at() {
        return this.surrogate.getBroken_at();
    }

    public final boolean getFill() {
        return this.surrogate.getFill();
    }

    public final String getExec_broker() {
        return this.surrogate.getExec_broker();
    }

    public final int getUpdate_count() {
        return this.surrogate.getUpdate_count();
    }

    public final NullableStringDto getLeg_id() {
        return this.surrogate.getLeg_id();
    }

    public final DecimalDto getCommission() {
        return this.surrogate.getCommission();
    }

    public final NullableStringDto getCommission_currency() {
        return this.surrogate.getCommission_currency();
    }

    public final NullableStringDto getCommission_type() {
        return this.surrogate.getCommission_type();
    }

    public final NullableIntDto getLiquidity_ind() {
        return this.surrogate.getLiquidity_ind();
    }

    public final NullableStringDto getSettlement_type() {
        return this.surrogate.getSettlement_type();
    }

    public final TimeDto getSettlement_date() {
        return this.surrogate.getSettlement_date();
    }

    public final TimeDto getTrade_date() {
        return this.surrogate.getTrade_date();
    }

    public final DecimalDto getSec_fee() {
        return this.surrogate.getSec_fee();
    }

    public final DecimalDto getTaf_fee() {
        return this.surrogate.getTaf_fee();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final NullableStringDto getCl_ord_id() {
        return this.surrogate.getCl_ord_id();
    }

    public final DecimalDto getRounded_notional() {
        return this.surrogate.getRounded_notional();
    }

    public final DecimalDto getNbbo_ask_price() {
        return this.surrogate.getNbbo_ask_price();
    }

    public final DecimalDto getNbbo_ask_quantity() {
        return this.surrogate.getNbbo_ask_quantity();
    }

    public final VenueDto getNbbo_ask_venue() {
        return this.surrogate.getNbbo_ask_venue();
    }

    public final DecimalDto getNbbo_bid_price() {
        return this.surrogate.getNbbo_bid_price();
    }

    public final DecimalDto getNbbo_bid_quantity() {
        return this.surrogate.getNbbo_bid_quantity();
    }

    public final VenueDto getNbbo_bid_venue() {
        return this.surrogate.getNbbo_bid_venue();
    }

    public final TimeDto getNbbo_exchange_timestamp() {
        return this.surrogate.getNbbo_exchange_timestamp();
    }

    public final UUIDDto getPending_execution_id() {
        return this.surrogate.getPending_execution_id();
    }

    public final UUIDDto getPrice_source_execution_id() {
        return this.surrogate.getPrice_source_execution_id();
    }

    public final TradeBreakAgentDto getTrade_break_agent() {
        return this.surrogate.getTrade_break_agent();
    }

    public final TimeDto getProcessed_at() {
        return this.surrogate.getProcessed_at();
    }

    public final CapacityDto getCapacity() {
        return this.surrogate.getCapacity();
    }

    public final DecimalDto getLimit_up_price() {
        return this.surrogate.getLimit_up_price();
    }

    public final DecimalDto getLimit_down_price() {
        return this.surrogate.getLimit_down_price();
    }

    public final NullableBoolDto is_adjustment() {
        return this.surrogate.is_adjustment();
    }

    public final boolean getNotional_execution() {
        return this.surrogate.getNotional_execution();
    }

    public final DecimalDto getClearing_quantity() {
        return this.surrogate.getClearing_quantity();
    }

    public final boolean getNotional_fill() {
        return this.surrogate.getNotional_fill();
    }

    public final DecimalDto getOr_fee() {
        return this.surrogate.getOr_fee();
    }

    public final DecimalDto getOcc_fee() {
        return this.surrogate.getOcc_fee();
    }

    public final NullableStringDto getTrade_match_id() {
        return this.surrogate.getTrade_match_id();
    }

    public final DecimalDto getExchange_fee() {
        return this.surrogate.getExchange_fee();
    }

    public final DecimalDto getBase_currency_traded() {
        return this.surrogate.getBase_currency_traded();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final NullableStringDto getPosition_id() {
        return this.surrogate.getPosition_id();
    }

    public final DecimalDto getNon_denominated_currency_traded() {
        return this.surrogate.getNon_denominated_currency_traded();
    }

    public final NullableStringDto getUti() {
        return this.surrogate.getUti();
    }

    public final NullableStringDto getRel_tx_id() {
        return this.surrogate.getRel_tx_id();
    }

    public final DecimalDto getFx_fee_in_bps() {
        return this.surrogate.getFx_fee_in_bps();
    }

    public final NullableStringDto getContra_firm_account() {
        return this.surrogate.getContra_firm_account();
    }

    public final TimeDto getEstimated_next_settlement_time() {
        return this.surrogate.getEstimated_next_settlement_time();
    }

    public final UUIDDto getAssociated_fx_execution_id() {
        return this.surrogate.getAssociated_fx_execution_id();
    }

    public final LastLiquidityIndDto getLast_liquidity_ind() {
        return this.surrogate.getLast_liquidity_ind();
    }

    public final ExecutionFeesDto getExecution_fees() {
        return this.surrogate.getExecution_fees();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ExecutionDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, String str, TimeDto timeDto2, boolean z, String str2, int i, NullableStringDto nullableStringDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableIntDto nullableIntDto, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, DecimalDto decimalDto4, DecimalDto decimalDto5, RouteDto routeDto, NullableStringDto nullableStringDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, DecimalDto decimalDto8, VenueDto venueDto, DecimalDto decimalDto9, DecimalDto decimalDto10, VenueDto venueDto2, TimeDto timeDto5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, TradeBreakAgentDto tradeBreakAgentDto, TimeDto timeDto6, CapacityDto capacityDto, DecimalDto decimalDto11, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, boolean z2, DecimalDto decimalDto13, boolean z3, DecimalDto decimalDto14, DecimalDto decimalDto15, NullableStringDto nullableStringDto6, DecimalDto decimalDto16, DecimalDto decimalDto17, SideDto sideDto, NullableStringDto nullableStringDto7, DecimalDto decimalDto18, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, DecimalDto decimalDto19, NullableStringDto nullableStringDto10, TimeDto timeDto7, UUIDDto uUIDDto5, LastLiquidityIndDto lastLiquidityIndDto, ExecutionFeesDto executionFeesDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        UUIDDto uUIDDto6 = (i2 & 1) != 0 ? null : uUIDDto;
        this(uUIDDto6, (i2 & 2) != 0 ? null : uUIDDto2, (i2 & 4) != 0 ? null : decimalDto, (i2 & 8) != 0 ? null : decimalDto2, (i2 & 16) != 0 ? null : timeDto, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? null : timeDto2, (i2 & 128) != 0 ? false : z, (i2 & 256) == 0 ? str2 : "", (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? null : nullableStringDto, (i2 & 2048) != 0 ? null : decimalDto3, (i2 & 4096) != 0 ? null : nullableStringDto2, (i2 & 8192) != 0 ? null : nullableStringDto3, (i2 & 16384) != 0 ? null : nullableIntDto, (i2 & 32768) != 0 ? null : nullableStringDto4, (i2 & 65536) != 0 ? null : timeDto3, (i2 & 131072) != 0 ? null : timeDto4, (i2 & 262144) != 0 ? null : decimalDto4, (i2 & 524288) != 0 ? null : decimalDto5, (i2 & 1048576) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 2097152) != 0 ? null : nullableStringDto5, (i2 & 4194304) != 0 ? null : decimalDto6, (i2 & 8388608) != 0 ? null : decimalDto7, (i2 & 16777216) != 0 ? null : decimalDto8, (i2 & 33554432) != 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto, (i2 & 67108864) != 0 ? null : decimalDto9, (i2 & 134217728) != 0 ? null : decimalDto10, (i2 & 268435456) != 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto2, (i2 & 536870912) != 0 ? null : timeDto5, (i2 & 1073741824) != 0 ? null : uUIDDto3, (i2 & Integer.MIN_VALUE) != 0 ? null : uUIDDto4, (i3 & 1) != 0 ? TradeBreakAgentDto.INSTANCE.getZeroValue() : tradeBreakAgentDto, (i3 & 2) != 0 ? null : timeDto6, (i3 & 4) != 0 ? CapacityDto.INSTANCE.getZeroValue() : capacityDto, (i3 & 8) != 0 ? null : decimalDto11, (i3 & 16) != 0 ? null : decimalDto12, (i3 & 32) != 0 ? null : nullableBoolDto, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? null : decimalDto13, (i3 & 256) != 0 ? false : z3, (i3 & 512) != 0 ? null : decimalDto14, (i3 & 1024) != 0 ? null : decimalDto15, (i3 & 2048) != 0 ? null : nullableStringDto6, (i3 & 4096) != 0 ? null : decimalDto16, (i3 & 8192) != 0 ? null : decimalDto17, (i3 & 16384) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i3 & 32768) != 0 ? null : nullableStringDto7, (i3 & 65536) != 0 ? null : decimalDto18, (i3 & 131072) != 0 ? null : nullableStringDto8, (i3 & 262144) != 0 ? null : nullableStringDto9, (i3 & 524288) != 0 ? null : decimalDto19, (i3 & 1048576) != 0 ? null : nullableStringDto10, (i3 & 2097152) != 0 ? null : timeDto7, (i3 & 4194304) != 0 ? null : uUIDDto5, (i3 & 8388608) != 0 ? LastLiquidityIndDto.INSTANCE.getZeroValue() : lastLiquidityIndDto, (i3 & 16777216) != 0 ? null : executionFeesDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExecutionDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, String execution_id, TimeDto timeDto2, boolean z, String exec_broker, int i, NullableStringDto nullableStringDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableIntDto nullableIntDto, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, DecimalDto decimalDto4, DecimalDto decimalDto5, RouteDto route, NullableStringDto nullableStringDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, DecimalDto decimalDto8, VenueDto nbbo_ask_venue, DecimalDto decimalDto9, DecimalDto decimalDto10, VenueDto nbbo_bid_venue, TimeDto timeDto5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, TradeBreakAgentDto trade_break_agent, TimeDto timeDto6, CapacityDto capacity, DecimalDto decimalDto11, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, boolean z2, DecimalDto decimalDto13, boolean z3, DecimalDto decimalDto14, DecimalDto decimalDto15, NullableStringDto nullableStringDto6, DecimalDto decimalDto16, DecimalDto decimalDto17, SideDto side, NullableStringDto nullableStringDto7, DecimalDto decimalDto18, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, DecimalDto decimalDto19, NullableStringDto nullableStringDto10, TimeDto timeDto7, UUIDDto uUIDDto5, LastLiquidityIndDto last_liquidity_ind, ExecutionFeesDto executionFeesDto) {
        this(new Surrogate(uUIDDto, uUIDDto2, decimalDto, decimalDto2, timeDto, execution_id, timeDto2, z, exec_broker, i, nullableStringDto, decimalDto3, nullableStringDto2, nullableStringDto3, nullableIntDto, nullableStringDto4, timeDto3, timeDto4, decimalDto4, decimalDto5, route, nullableStringDto5, decimalDto6, decimalDto7, decimalDto8, nbbo_ask_venue, decimalDto9, decimalDto10, nbbo_bid_venue, timeDto5, uUIDDto3, uUIDDto4, trade_break_agent, timeDto6, capacity, decimalDto11, decimalDto12, nullableBoolDto, z2, decimalDto13, z3, decimalDto14, decimalDto15, nullableStringDto6, decimalDto16, decimalDto17, side, nullableStringDto7, decimalDto18, nullableStringDto8, nullableStringDto9, decimalDto19, nullableStringDto10, timeDto7, uUIDDto5, last_liquidity_ind, executionFeesDto));
        Intrinsics.checkNotNullParameter(execution_id, "execution_id");
        Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(nbbo_ask_venue, "nbbo_ask_venue");
        Intrinsics.checkNotNullParameter(nbbo_bid_venue, "nbbo_bid_venue");
        Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
    }

    public final ExecutionDto copy(UUIDDto order_id, UUIDDto id, DecimalDto quantity, DecimalDto price, TimeDto timestamp, String execution_id, TimeDto broken_at, boolean fill, String exec_broker, int update_count, NullableStringDto leg_id, DecimalDto commission, NullableStringDto commission_currency, NullableStringDto commission_type, NullableIntDto liquidity_ind, NullableStringDto settlement_type, TimeDto settlement_date, TimeDto trade_date, DecimalDto sec_fee, DecimalDto taf_fee, RouteDto route, NullableStringDto cl_ord_id, DecimalDto rounded_notional, DecimalDto nbbo_ask_price, DecimalDto nbbo_ask_quantity, VenueDto nbbo_ask_venue, DecimalDto nbbo_bid_price, DecimalDto nbbo_bid_quantity, VenueDto nbbo_bid_venue, TimeDto nbbo_exchange_timestamp, UUIDDto pending_execution_id, UUIDDto price_source_execution_id, TradeBreakAgentDto trade_break_agent, TimeDto processed_at, CapacityDto capacity, DecimalDto limit_up_price, DecimalDto limit_down_price, NullableBoolDto is_adjustment, boolean notional_execution, DecimalDto clearing_quantity, boolean notional_fill, DecimalDto or_fee, DecimalDto occ_fee, NullableStringDto trade_match_id, DecimalDto exchange_fee, DecimalDto base_currency_traded, SideDto side, NullableStringDto position_id, DecimalDto non_denominated_currency_traded, NullableStringDto uti, NullableStringDto rel_tx_id, DecimalDto fx_fee_in_bps, NullableStringDto contra_firm_account, TimeDto estimated_next_settlement_time, UUIDDto associated_fx_execution_id, LastLiquidityIndDto last_liquidity_ind, ExecutionFeesDto execution_fees) {
        Intrinsics.checkNotNullParameter(execution_id, "execution_id");
        Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(nbbo_ask_venue, "nbbo_ask_venue");
        Intrinsics.checkNotNullParameter(nbbo_bid_venue, "nbbo_bid_venue");
        Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
        return new ExecutionDto(new Surrogate(order_id, id, quantity, price, timestamp, execution_id, broken_at, fill, exec_broker, update_count, leg_id, commission, commission_currency, commission_type, liquidity_ind, settlement_type, settlement_date, trade_date, sec_fee, taf_fee, route, cl_ord_id, rounded_notional, nbbo_ask_price, nbbo_ask_quantity, nbbo_ask_venue, nbbo_bid_price, nbbo_bid_quantity, nbbo_bid_venue, nbbo_exchange_timestamp, pending_execution_id, price_source_execution_id, trade_break_agent, processed_at, capacity, limit_up_price, limit_down_price, is_adjustment, notional_execution, clearing_quantity, notional_fill, or_fee, occ_fee, trade_match_id, exchange_fee, base_currency_traded, side, position_id, non_denominated_currency_traded, uti, rel_tx_id, fx_fee_in_bps, contra_firm_account, estimated_next_settlement_time, associated_fx_execution_id, last_liquidity_ind, execution_fees));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Execution toProto() {
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto = order_id != null ? order_id.toProto() : null;
        UUIDDto id = this.surrogate.getId();
        UUID proto2 = id != null ? id.toProto() : null;
        DecimalDto quantity = this.surrogate.getQuantity();
        Decimal proto3 = quantity != null ? quantity.toProto() : null;
        DecimalDto price = this.surrogate.getPrice();
        Decimal proto4 = price != null ? price.toProto() : null;
        TimeDto timestamp = this.surrogate.getTimestamp();
        Time proto5 = timestamp != null ? timestamp.toProto() : null;
        String execution_id = this.surrogate.getExecution_id();
        TimeDto broken_at = this.surrogate.getBroken_at();
        Time proto6 = broken_at != null ? broken_at.toProto() : null;
        boolean fill = this.surrogate.getFill();
        String exec_broker = this.surrogate.getExec_broker();
        int update_count = this.surrogate.getUpdate_count();
        NullableStringDto leg_id = this.surrogate.getLeg_id();
        NullableString proto7 = leg_id != null ? leg_id.toProto() : null;
        DecimalDto commission = this.surrogate.getCommission();
        Decimal proto8 = commission != null ? commission.toProto() : null;
        NullableStringDto commission_currency = this.surrogate.getCommission_currency();
        NullableString proto9 = commission_currency != null ? commission_currency.toProto() : null;
        NullableStringDto commission_type = this.surrogate.getCommission_type();
        NullableString proto10 = commission_type != null ? commission_type.toProto() : null;
        NullableIntDto liquidity_ind = this.surrogate.getLiquidity_ind();
        NullableInt proto11 = liquidity_ind != null ? liquidity_ind.toProto() : null;
        NullableStringDto settlement_type = this.surrogate.getSettlement_type();
        NullableString proto12 = settlement_type != null ? settlement_type.toProto() : null;
        TimeDto settlement_date = this.surrogate.getSettlement_date();
        Time proto13 = settlement_date != null ? settlement_date.toProto() : null;
        TimeDto trade_date = this.surrogate.getTrade_date();
        Time proto14 = trade_date != null ? trade_date.toProto() : null;
        DecimalDto sec_fee = this.surrogate.getSec_fee();
        Decimal proto15 = sec_fee != null ? sec_fee.toProto() : null;
        DecimalDto taf_fee = this.surrogate.getTaf_fee();
        Decimal proto16 = taf_fee != null ? taf_fee.toProto() : null;
        Route route = (Route) this.surrogate.getRoute().toProto();
        NullableStringDto cl_ord_id = this.surrogate.getCl_ord_id();
        NullableString proto17 = cl_ord_id != null ? cl_ord_id.toProto() : null;
        DecimalDto rounded_notional = this.surrogate.getRounded_notional();
        Decimal proto18 = rounded_notional != null ? rounded_notional.toProto() : null;
        DecimalDto nbbo_ask_price = this.surrogate.getNbbo_ask_price();
        Decimal proto19 = nbbo_ask_price != null ? nbbo_ask_price.toProto() : null;
        DecimalDto nbbo_ask_quantity = this.surrogate.getNbbo_ask_quantity();
        Decimal proto20 = nbbo_ask_quantity != null ? nbbo_ask_quantity.toProto() : null;
        Venue venue = (Venue) this.surrogate.getNbbo_ask_venue().toProto();
        DecimalDto nbbo_bid_price = this.surrogate.getNbbo_bid_price();
        Decimal proto21 = nbbo_bid_price != null ? nbbo_bid_price.toProto() : null;
        DecimalDto nbbo_bid_quantity = this.surrogate.getNbbo_bid_quantity();
        Decimal proto22 = nbbo_bid_quantity != null ? nbbo_bid_quantity.toProto() : null;
        Venue venue2 = (Venue) this.surrogate.getNbbo_bid_venue().toProto();
        TimeDto nbbo_exchange_timestamp = this.surrogate.getNbbo_exchange_timestamp();
        Time proto23 = nbbo_exchange_timestamp != null ? nbbo_exchange_timestamp.toProto() : null;
        UUIDDto pending_execution_id = this.surrogate.getPending_execution_id();
        UUID proto24 = pending_execution_id != null ? pending_execution_id.toProto() : null;
        UUIDDto price_source_execution_id = this.surrogate.getPrice_source_execution_id();
        UUID proto25 = price_source_execution_id != null ? price_source_execution_id.toProto() : null;
        TradeBreakAgent tradeBreakAgent = (TradeBreakAgent) this.surrogate.getTrade_break_agent().toProto();
        TimeDto processed_at = this.surrogate.getProcessed_at();
        Time proto26 = processed_at != null ? processed_at.toProto() : null;
        Capacity capacity = (Capacity) this.surrogate.getCapacity().toProto();
        DecimalDto limit_up_price = this.surrogate.getLimit_up_price();
        Decimal proto27 = limit_up_price != null ? limit_up_price.toProto() : null;
        DecimalDto limit_down_price = this.surrogate.getLimit_down_price();
        Decimal proto28 = limit_down_price != null ? limit_down_price.toProto() : null;
        NullableBoolDto nullableBoolDtoIs_adjustment = this.surrogate.is_adjustment();
        NullableBool proto29 = nullableBoolDtoIs_adjustment != null ? nullableBoolDtoIs_adjustment.toProto() : null;
        boolean notional_execution = this.surrogate.getNotional_execution();
        DecimalDto clearing_quantity = this.surrogate.getClearing_quantity();
        Decimal proto30 = clearing_quantity != null ? clearing_quantity.toProto() : null;
        boolean notional_fill = this.surrogate.getNotional_fill();
        DecimalDto or_fee = this.surrogate.getOr_fee();
        Decimal proto31 = or_fee != null ? or_fee.toProto() : null;
        DecimalDto occ_fee = this.surrogate.getOcc_fee();
        Decimal proto32 = occ_fee != null ? occ_fee.toProto() : null;
        NullableStringDto trade_match_id = this.surrogate.getTrade_match_id();
        NullableString proto33 = trade_match_id != null ? trade_match_id.toProto() : null;
        DecimalDto exchange_fee = this.surrogate.getExchange_fee();
        Decimal proto34 = exchange_fee != null ? exchange_fee.toProto() : null;
        DecimalDto base_currency_traded = this.surrogate.getBase_currency_traded();
        Decimal proto35 = base_currency_traded != null ? base_currency_traded.toProto() : null;
        Side side = (Side) this.surrogate.getSide().toProto();
        NullableStringDto position_id = this.surrogate.getPosition_id();
        NullableString proto36 = position_id != null ? position_id.toProto() : null;
        DecimalDto non_denominated_currency_traded = this.surrogate.getNon_denominated_currency_traded();
        Decimal proto37 = non_denominated_currency_traded != null ? non_denominated_currency_traded.toProto() : null;
        NullableStringDto uti = this.surrogate.getUti();
        NullableString proto38 = uti != null ? uti.toProto() : null;
        NullableStringDto rel_tx_id = this.surrogate.getRel_tx_id();
        NullableString proto39 = rel_tx_id != null ? rel_tx_id.toProto() : null;
        DecimalDto fx_fee_in_bps = this.surrogate.getFx_fee_in_bps();
        Decimal proto40 = fx_fee_in_bps != null ? fx_fee_in_bps.toProto() : null;
        NullableStringDto contra_firm_account = this.surrogate.getContra_firm_account();
        NullableString proto41 = contra_firm_account != null ? contra_firm_account.toProto() : null;
        TimeDto estimated_next_settlement_time = this.surrogate.getEstimated_next_settlement_time();
        Time proto42 = estimated_next_settlement_time != null ? estimated_next_settlement_time.toProto() : null;
        UUIDDto associated_fx_execution_id = this.surrogate.getAssociated_fx_execution_id();
        UUID proto43 = associated_fx_execution_id != null ? associated_fx_execution_id.toProto() : null;
        LastLiquidityInd lastLiquidityInd = (LastLiquidityInd) this.surrogate.getLast_liquidity_ind().toProto();
        ExecutionFeesDto execution_fees = this.surrogate.getExecution_fees();
        return new Execution(proto, proto2, proto3, proto4, proto5, execution_id, proto6, fill, exec_broker, update_count, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, route, proto17, proto18, proto19, proto20, venue, proto21, proto22, venue2, proto23, proto24, proto25, tradeBreakAgent, proto26, capacity, proto27, proto28, proto29, notional_execution, proto30, notional_fill, proto31, proto32, proto33, proto34, proto35, side, proto36, proto37, proto38, proto39, proto40, proto41, proto42, proto43, lastLiquidityInd, execution_fees != null ? execution_fees.toProto() : null, null, 0, 33554432, null);
    }

    public String toString() {
        return "[ExecutionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ExecutionDto) && Intrinsics.areEqual(((ExecutionDto) other).surrogate, this.surrogate);
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
    /* compiled from: ExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u00ad\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\bÂ\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u009e\u00022\u00020\u0001:\u0004\u009d\u0002\u009e\u0002B¨\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010+\u001a\u00020(\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u00102\u001a\u000203\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00108\u001a\u00020\u000e\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010:\u001a\u00020\u000e\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010@\u001a\u00020A\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010J\u001a\u00020K\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M¢\u0006\u0004\bN\u0010OBÕ\u0004\b\u0010\u0012\u0006\u0010P\u001a\u00020\u0011\u0012\u0006\u0010Q\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010(\u0012\b\u0010,\u001a\u0004\u0018\u00010\t\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u00010\t\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\b\u00104\u001a\u0004\u0018\u00010\u0006\u0012\b\u00105\u001a\u0004\u0018\u00010\u0006\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\u0006\u00108\u001a\u00020\u000e\u0012\b\u00109\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010:\u001a\u00020\u000e\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010@\u001a\u0004\u0018\u00010A\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010H\u001a\u0004\u0018\u00010\t\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010J\u001a\u0004\u0018\u00010K\u0012\b\u0010L\u001a\u0004\u0018\u00010M\u0012\b\u0010R\u001a\u0004\u0018\u00010S¢\u0006\u0004\bN\u0010TJ\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u000bHÆ\u0003J\u0019\u0010à\u0001\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010â\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010å\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010æ\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\"HÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010ï\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010ð\u0001\u001a\u00020(HÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010ó\u0001\u001a\u00020(HÆ\u0003J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010÷\u0001\u001a\u000200HÆ\u0003J\f\u0010ø\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010ù\u0001\u001a\u000203HÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010ü\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010þ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010\u0085\u0002\u001a\u00020AHÆ\u0003J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008e\u0002\u001a\u00020KHÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010MHÆ\u0003J«\u0005\u0010\u0090\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010+\u001a\u00020(2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u00108\u001a\u00020\u000e2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010:\u001a\u00020\u000e2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010@\u001a\u00020A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010J\u001a\u00020K2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MHÆ\u0001J\u0015\u0010\u0091\u0002\u001a\u00020\u000e2\t\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0093\u0002\u001a\u00020\u0011HÖ\u0001J\n\u0010\u0094\u0002\u001a\u00020\u000bHÖ\u0001J-\u0010\u0095\u0002\u001a\u00030\u0096\u00022\u0007\u0010\u0097\u0002\u001a\u00020\u00002\b\u0010\u0098\u0002\u001a\u00030\u0099\u00022\b\u0010\u009a\u0002\u001a\u00030\u009b\u0002H\u0001¢\u0006\u0003\b\u009c\u0002R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010V\u001a\u0004\bZ\u0010XR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010V\u001a\u0004\b\\\u0010]R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u0010V\u001a\u0004\b_\u0010]R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010V\u001a\u0004\ba\u0010bR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u0010V\u001a\u0004\bd\u0010eR\u001e\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u0010V\u001a\u0004\bg\u0010bR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u0010V\u001a\u0004\bi\u0010jR\u001c\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bk\u0010V\u001a\u0004\bl\u0010eR+\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bm\u0010V\u001a\u0004\bn\u0010oR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bp\u0010V\u001a\u0004\bq\u0010rR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bs\u0010V\u001a\u0004\bt\u0010]R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010V\u001a\u0004\bv\u0010rR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u0010V\u001a\u0004\bx\u0010rR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u0010V\u001a\u0004\bz\u0010{R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b|\u0010V\u001a\u0004\b}\u0010rR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b~\u0010V\u001a\u0004\b\u007f\u0010bR \u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0080\u0001\u0010V\u001a\u0005\b\u0081\u0001\u0010bR \u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0082\u0001\u0010V\u001a\u0005\b\u0083\u0001\u0010]R \u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0084\u0001\u0010V\u001a\u0005\b\u0085\u0001\u0010]R\u001f\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0086\u0001\u0010V\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010#\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0089\u0001\u0010V\u001a\u0005\b\u008a\u0001\u0010rR \u0010$\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008b\u0001\u0010V\u001a\u0005\b\u008c\u0001\u0010]R \u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008d\u0001\u0010V\u001a\u0005\b\u008e\u0001\u0010]R \u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008f\u0001\u0010V\u001a\u0005\b\u0090\u0001\u0010]R\u001f\u0010'\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0091\u0001\u0010V\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0094\u0001\u0010V\u001a\u0005\b\u0095\u0001\u0010]R \u0010*\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0096\u0001\u0010V\u001a\u0005\b\u0097\u0001\u0010]R\u001f\u0010+\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0098\u0001\u0010V\u001a\u0006\b\u0099\u0001\u0010\u0093\u0001R \u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009a\u0001\u0010V\u001a\u0005\b\u009b\u0001\u0010bR \u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009c\u0001\u0010V\u001a\u0005\b\u009d\u0001\u0010XR \u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009e\u0001\u0010V\u001a\u0005\b\u009f\u0001\u0010XR\u001f\u0010/\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b \u0001\u0010V\u001a\u0006\b¡\u0001\u0010¢\u0001R \u00101\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b£\u0001\u0010V\u001a\u0005\b¤\u0001\u0010bR\u001f\u00102\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¥\u0001\u0010V\u001a\u0006\b¦\u0001\u0010§\u0001R \u00104\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¨\u0001\u0010V\u001a\u0005\b©\u0001\u0010]R \u00105\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bª\u0001\u0010V\u001a\u0005\b«\u0001\u0010]R \u00106\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¬\u0001\u0010V\u001a\u0005\b6\u0010\u00ad\u0001R\u001e\u00108\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b®\u0001\u0010V\u001a\u0005\b¯\u0001\u0010jR \u00109\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b°\u0001\u0010V\u001a\u0005\b±\u0001\u0010]R\u001e\u0010:\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b²\u0001\u0010V\u001a\u0005\b³\u0001\u0010jR \u0010;\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b´\u0001\u0010V\u001a\u0005\bµ\u0001\u0010]R \u0010<\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¶\u0001\u0010V\u001a\u0005\b·\u0001\u0010]R \u0010=\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¸\u0001\u0010V\u001a\u0005\b¹\u0001\u0010rR \u0010>\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bº\u0001\u0010V\u001a\u0005\b»\u0001\u0010]R \u0010?\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¼\u0001\u0010V\u001a\u0005\b½\u0001\u0010]R\u001f\u0010@\u001a\u00020A8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¾\u0001\u0010V\u001a\u0006\b¿\u0001\u0010À\u0001R \u0010B\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÁ\u0001\u0010V\u001a\u0005\bÂ\u0001\u0010rR \u0010C\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÃ\u0001\u0010V\u001a\u0005\bÄ\u0001\u0010]R \u0010D\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÅ\u0001\u0010V\u001a\u0005\bÆ\u0001\u0010rR \u0010E\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÇ\u0001\u0010V\u001a\u0005\bÈ\u0001\u0010rR \u0010F\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÉ\u0001\u0010V\u001a\u0005\bÊ\u0001\u0010]R \u0010G\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bË\u0001\u0010V\u001a\u0005\bÌ\u0001\u0010rR \u0010H\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÍ\u0001\u0010V\u001a\u0005\bÎ\u0001\u0010bR \u0010I\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÏ\u0001\u0010V\u001a\u0005\bÐ\u0001\u0010XR\u001f\u0010J\u001a\u00020K8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÑ\u0001\u0010V\u001a\u0006\bÒ\u0001\u0010Ó\u0001R!\u0010L\u001a\u0004\u0018\u00010M8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÔ\u0001\u0010V\u001a\u0006\bÕ\u0001\u0010Ö\u0001¨\u0006\u009f\u0002"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ExecutionDto$Surrogate;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "id", "quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "execution_id", "", "broken_at", "fill", "", "exec_broker", "update_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "leg_id", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "commission", "commission_currency", "commission_type", "liquidity_ind", "Lcom/robinhood/rosetta/mainst/NullableIntDto;", "settlement_type", "settlement_date", "trade_date", "sec_fee", "taf_fee", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "cl_ord_id", "rounded_notional", "nbbo_ask_price", "nbbo_ask_quantity", "nbbo_ask_venue", "Lrosetta/mainst/VenueDto;", "nbbo_bid_price", "nbbo_bid_quantity", "nbbo_bid_venue", "nbbo_exchange_timestamp", "pending_execution_id", "price_source_execution_id", "trade_break_agent", "Lrosetta/mainst/TradeBreakAgentDto;", "processed_at", "capacity", "Lrosetta/mainst/CapacityDto;", "limit_up_price", "limit_down_price", "is_adjustment", "Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "notional_execution", "clearing_quantity", "notional_fill", "or_fee", "occ_fee", "trade_match_id", "exchange_fee", "base_currency_traded", "side", "Lrosetta/mainst/SideDto;", "position_id", "non_denominated_currency_traded", "uti", "rel_tx_id", "fx_fee_in_bps", "contra_firm_account", "estimated_next_settlement_time", "associated_fx_execution_id", "last_liquidity_ind", "Lrosetta/mainst/LastLiquidityIndDto;", "execution_fees", "Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;ZLjava/lang/String;ILcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/RouteDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/TradeBreakAgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/LastLiquidityIndDto;Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;ZLjava/lang/String;ILcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/RouteDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/TradeBreakAgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/LastLiquidityIndDto;Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getId$annotations", "getId", "getQuantity$annotations", "getQuantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getPrice$annotations", "getPrice", "getTimestamp$annotations", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getExecution_id$annotations", "getExecution_id", "()Ljava/lang/String;", "getBroken_at$annotations", "getBroken_at", "getFill$annotations", "getFill", "()Z", "getExec_broker$annotations", "getExec_broker", "getUpdate_count$annotations", "getUpdate_count", "()I", "getLeg_id$annotations", "getLeg_id", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getCommission$annotations", "getCommission", "getCommission_currency$annotations", "getCommission_currency", "getCommission_type$annotations", "getCommission_type", "getLiquidity_ind$annotations", "getLiquidity_ind", "()Lcom/robinhood/rosetta/mainst/NullableIntDto;", "getSettlement_type$annotations", "getSettlement_type", "getSettlement_date$annotations", "getSettlement_date", "getTrade_date$annotations", "getTrade_date", "getSec_fee$annotations", "getSec_fee", "getTaf_fee$annotations", "getTaf_fee", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "getCl_ord_id$annotations", "getCl_ord_id", "getRounded_notional$annotations", "getRounded_notional", "getNbbo_ask_price$annotations", "getNbbo_ask_price", "getNbbo_ask_quantity$annotations", "getNbbo_ask_quantity", "getNbbo_ask_venue$annotations", "getNbbo_ask_venue", "()Lrosetta/mainst/VenueDto;", "getNbbo_bid_price$annotations", "getNbbo_bid_price", "getNbbo_bid_quantity$annotations", "getNbbo_bid_quantity", "getNbbo_bid_venue$annotations", "getNbbo_bid_venue", "getNbbo_exchange_timestamp$annotations", "getNbbo_exchange_timestamp", "getPending_execution_id$annotations", "getPending_execution_id", "getPrice_source_execution_id$annotations", "getPrice_source_execution_id", "getTrade_break_agent$annotations", "getTrade_break_agent", "()Lrosetta/mainst/TradeBreakAgentDto;", "getProcessed_at$annotations", "getProcessed_at", "getCapacity$annotations", "getCapacity", "()Lrosetta/mainst/CapacityDto;", "getLimit_up_price$annotations", "getLimit_up_price", "getLimit_down_price$annotations", "getLimit_down_price", "is_adjustment$annotations", "()Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "getNotional_execution$annotations", "getNotional_execution", "getClearing_quantity$annotations", "getClearing_quantity", "getNotional_fill$annotations", "getNotional_fill", "getOr_fee$annotations", "getOr_fee", "getOcc_fee$annotations", "getOcc_fee", "getTrade_match_id$annotations", "getTrade_match_id", "getExchange_fee$annotations", "getExchange_fee", "getBase_currency_traded$annotations", "getBase_currency_traded", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getPosition_id$annotations", "getPosition_id", "getNon_denominated_currency_traded$annotations", "getNon_denominated_currency_traded", "getUti$annotations", "getUti", "getRel_tx_id$annotations", "getRel_tx_id", "getFx_fee_in_bps$annotations", "getFx_fee_in_bps", "getContra_firm_account$annotations", "getContra_firm_account", "getEstimated_next_settlement_time$annotations", "getEstimated_next_settlement_time", "getAssociated_fx_execution_id$annotations", "getAssociated_fx_execution_id", "getLast_liquidity_ind$annotations", "getLast_liquidity_ind", "()Lrosetta/mainst/LastLiquidityIndDto;", "getExecution_fees$annotations", "getExecution_fees", "()Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UUIDDto associated_fx_execution_id;
        private final DecimalDto base_currency_traded;
        private final TimeDto broken_at;
        private final CapacityDto capacity;
        private final NullableStringDto cl_ord_id;
        private final DecimalDto clearing_quantity;
        private final DecimalDto commission;
        private final NullableStringDto commission_currency;
        private final NullableStringDto commission_type;
        private final NullableStringDto contra_firm_account;
        private final TimeDto estimated_next_settlement_time;
        private final DecimalDto exchange_fee;
        private final String exec_broker;
        private final ExecutionFeesDto execution_fees;
        private final String execution_id;
        private final boolean fill;
        private final DecimalDto fx_fee_in_bps;
        private final UUIDDto id;
        private final NullableBoolDto is_adjustment;
        private final LastLiquidityIndDto last_liquidity_ind;
        private final NullableStringDto leg_id;
        private final DecimalDto limit_down_price;
        private final DecimalDto limit_up_price;
        private final NullableIntDto liquidity_ind;
        private final DecimalDto nbbo_ask_price;
        private final DecimalDto nbbo_ask_quantity;
        private final VenueDto nbbo_ask_venue;
        private final DecimalDto nbbo_bid_price;
        private final DecimalDto nbbo_bid_quantity;
        private final VenueDto nbbo_bid_venue;
        private final TimeDto nbbo_exchange_timestamp;
        private final DecimalDto non_denominated_currency_traded;
        private final boolean notional_execution;
        private final boolean notional_fill;
        private final DecimalDto occ_fee;
        private final DecimalDto or_fee;
        private final UUIDDto order_id;
        private final UUIDDto pending_execution_id;
        private final NullableStringDto position_id;
        private final DecimalDto price;
        private final UUIDDto price_source_execution_id;
        private final TimeDto processed_at;
        private final DecimalDto quantity;
        private final NullableStringDto rel_tx_id;
        private final DecimalDto rounded_notional;
        private final RouteDto route;
        private final DecimalDto sec_fee;
        private final TimeDto settlement_date;
        private final NullableStringDto settlement_type;
        private final SideDto side;
        private final DecimalDto taf_fee;
        private final TimeDto timestamp;
        private final TradeBreakAgentDto trade_break_agent;
        private final TimeDto trade_date;
        private final NullableStringDto trade_match_id;
        private final int update_count;
        private final NullableStringDto uti;

        public Surrogate() {
            this((UUIDDto) null, (UUIDDto) null, (DecimalDto) null, (DecimalDto) null, (TimeDto) null, (String) null, (TimeDto) null, false, (String) null, 0, (NullableStringDto) null, (DecimalDto) null, (NullableStringDto) null, (NullableStringDto) null, (NullableIntDto) null, (NullableStringDto) null, (TimeDto) null, (TimeDto) null, (DecimalDto) null, (DecimalDto) null, (RouteDto) null, (NullableStringDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (VenueDto) null, (DecimalDto) null, (DecimalDto) null, (VenueDto) null, (TimeDto) null, (UUIDDto) null, (UUIDDto) null, (TradeBreakAgentDto) null, (TimeDto) null, (CapacityDto) null, (DecimalDto) null, (DecimalDto) null, (NullableBoolDto) null, false, (DecimalDto) null, false, (DecimalDto) null, (DecimalDto) null, (NullableStringDto) null, (DecimalDto) null, (DecimalDto) null, (SideDto) null, (NullableStringDto) null, (DecimalDto) null, (NullableStringDto) null, (NullableStringDto) null, (DecimalDto) null, (NullableStringDto) null, (TimeDto) null, (UUIDDto) null, (LastLiquidityIndDto) null, (ExecutionFeesDto) null, -1, 33554431, (DefaultConstructorMarker) null);
        }

        @SerialName("associatedFxExecutionId")
        @JsonAnnotations2(names = {"associated_fx_execution_id"})
        public static /* synthetic */ void getAssociated_fx_execution_id$annotations() {
        }

        @SerialName("baseCurrencyTraded")
        @JsonAnnotations2(names = {"base_currency_traded"})
        public static /* synthetic */ void getBase_currency_traded$annotations() {
        }

        @SerialName("brokenAt")
        @JsonAnnotations2(names = {"broken_at"})
        public static /* synthetic */ void getBroken_at$annotations() {
        }

        @SerialName("capacity")
        @JsonAnnotations2(names = {"capacity"})
        public static /* synthetic */ void getCapacity$annotations() {
        }

        @SerialName("clOrdId")
        @JsonAnnotations2(names = {"cl_ord_id"})
        public static /* synthetic */ void getCl_ord_id$annotations() {
        }

        @SerialName("clearingQuantity")
        @JsonAnnotations2(names = {"clearing_quantity"})
        public static /* synthetic */ void getClearing_quantity$annotations() {
        }

        @SerialName("commission")
        @JsonAnnotations2(names = {"commission"})
        public static /* synthetic */ void getCommission$annotations() {
        }

        @SerialName("commissionCurrency")
        @JsonAnnotations2(names = {"commission_currency"})
        public static /* synthetic */ void getCommission_currency$annotations() {
        }

        @SerialName("commissionType")
        @JsonAnnotations2(names = {"commission_type"})
        public static /* synthetic */ void getCommission_type$annotations() {
        }

        @SerialName("contraFirmAccount")
        @JsonAnnotations2(names = {"contra_firm_account"})
        public static /* synthetic */ void getContra_firm_account$annotations() {
        }

        @SerialName("estimatedNextSettlementTime")
        @JsonAnnotations2(names = {"estimated_next_settlement_time"})
        public static /* synthetic */ void getEstimated_next_settlement_time$annotations() {
        }

        @SerialName("exchangeFee")
        @JsonAnnotations2(names = {"exchange_fee"})
        public static /* synthetic */ void getExchange_fee$annotations() {
        }

        @SerialName("execBroker")
        @JsonAnnotations2(names = {"exec_broker"})
        public static /* synthetic */ void getExec_broker$annotations() {
        }

        @SerialName("executionFees")
        @JsonAnnotations2(names = {"execution_fees"})
        public static /* synthetic */ void getExecution_fees$annotations() {
        }

        @SerialName("executionId")
        @JsonAnnotations2(names = {"execution_id"})
        public static /* synthetic */ void getExecution_id$annotations() {
        }

        @SerialName("fill")
        @JsonAnnotations2(names = {"fill"})
        public static /* synthetic */ void getFill$annotations() {
        }

        @SerialName("fxFeeInBps")
        @JsonAnnotations2(names = {"fx_fee_in_bps"})
        public static /* synthetic */ void getFx_fee_in_bps$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("lastLiquidityInd")
        @JsonAnnotations2(names = {"last_liquidity_ind"})
        public static /* synthetic */ void getLast_liquidity_ind$annotations() {
        }

        @SerialName("legId")
        @JsonAnnotations2(names = {"leg_id"})
        public static /* synthetic */ void getLeg_id$annotations() {
        }

        @SerialName("limitDownPrice")
        @JsonAnnotations2(names = {"limit_down_price"})
        public static /* synthetic */ void getLimit_down_price$annotations() {
        }

        @SerialName("limitUpPrice")
        @JsonAnnotations2(names = {"limit_up_price"})
        public static /* synthetic */ void getLimit_up_price$annotations() {
        }

        @SerialName("liquidityInd")
        @JsonAnnotations2(names = {"liquidity_ind"})
        public static /* synthetic */ void getLiquidity_ind$annotations() {
        }

        @SerialName("nbboAskPrice")
        @JsonAnnotations2(names = {"nbbo_ask_price"})
        public static /* synthetic */ void getNbbo_ask_price$annotations() {
        }

        @SerialName("nbboAskQuantity")
        @JsonAnnotations2(names = {"nbbo_ask_quantity"})
        public static /* synthetic */ void getNbbo_ask_quantity$annotations() {
        }

        @SerialName("nbboAskVenue")
        @JsonAnnotations2(names = {"nbbo_ask_venue"})
        public static /* synthetic */ void getNbbo_ask_venue$annotations() {
        }

        @SerialName("nbboBidPrice")
        @JsonAnnotations2(names = {"nbbo_bid_price"})
        public static /* synthetic */ void getNbbo_bid_price$annotations() {
        }

        @SerialName("nbboBidQuantity")
        @JsonAnnotations2(names = {"nbbo_bid_quantity"})
        public static /* synthetic */ void getNbbo_bid_quantity$annotations() {
        }

        @SerialName("nbboBidVenue")
        @JsonAnnotations2(names = {"nbbo_bid_venue"})
        public static /* synthetic */ void getNbbo_bid_venue$annotations() {
        }

        @SerialName("nbboExchangeTimestamp")
        @JsonAnnotations2(names = {"nbbo_exchange_timestamp"})
        public static /* synthetic */ void getNbbo_exchange_timestamp$annotations() {
        }

        @SerialName("nonDenominatedCurrencyTraded")
        @JsonAnnotations2(names = {"non_denominated_currency_traded"})
        public static /* synthetic */ void getNon_denominated_currency_traded$annotations() {
        }

        @SerialName("notionalExecution")
        @JsonAnnotations2(names = {"notional_execution"})
        public static /* synthetic */ void getNotional_execution$annotations() {
        }

        @SerialName("notionalFill")
        @JsonAnnotations2(names = {"notional_fill"})
        public static /* synthetic */ void getNotional_fill$annotations() {
        }

        @SerialName("occFee")
        @JsonAnnotations2(names = {"occ_fee"})
        public static /* synthetic */ void getOcc_fee$annotations() {
        }

        @SerialName("orFee")
        @JsonAnnotations2(names = {"or_fee"})
        public static /* synthetic */ void getOr_fee$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("pendingExecutionId")
        @JsonAnnotations2(names = {"pending_execution_id"})
        public static /* synthetic */ void getPending_execution_id$annotations() {
        }

        @SerialName("positionId")
        @JsonAnnotations2(names = {"position_id"})
        public static /* synthetic */ void getPosition_id$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("priceSourceExecutionId")
        @JsonAnnotations2(names = {"price_source_execution_id"})
        public static /* synthetic */ void getPrice_source_execution_id$annotations() {
        }

        @SerialName("processedAt")
        @JsonAnnotations2(names = {"processed_at"})
        public static /* synthetic */ void getProcessed_at$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("relTxId")
        @JsonAnnotations2(names = {"rel_tx_id"})
        public static /* synthetic */ void getRel_tx_id$annotations() {
        }

        @SerialName("roundedNotional")
        @JsonAnnotations2(names = {"rounded_notional"})
        public static /* synthetic */ void getRounded_notional$annotations() {
        }

        @SerialName(PlaceTypes.ROUTE)
        @JsonAnnotations2(names = {PlaceTypes.ROUTE})
        public static /* synthetic */ void getRoute$annotations() {
        }

        @SerialName("secFee")
        @JsonAnnotations2(names = {"sec_fee"})
        public static /* synthetic */ void getSec_fee$annotations() {
        }

        @SerialName("settlementDate")
        @JsonAnnotations2(names = {"settlement_date"})
        public static /* synthetic */ void getSettlement_date$annotations() {
        }

        @SerialName("settlementType")
        @JsonAnnotations2(names = {"settlement_type"})
        public static /* synthetic */ void getSettlement_type$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("tafFee")
        @JsonAnnotations2(names = {"taf_fee"})
        public static /* synthetic */ void getTaf_fee$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("tradeBreakAgent")
        @JsonAnnotations2(names = {"trade_break_agent"})
        public static /* synthetic */ void getTrade_break_agent$annotations() {
        }

        @SerialName("tradeDate")
        @JsonAnnotations2(names = {"trade_date"})
        public static /* synthetic */ void getTrade_date$annotations() {
        }

        @SerialName("tradeMatchId")
        @JsonAnnotations2(names = {"trade_match_id"})
        public static /* synthetic */ void getTrade_match_id$annotations() {
        }

        @SerialName("updateCount")
        @JsonAnnotations2(names = {"update_count"})
        public static /* synthetic */ void getUpdate_count$annotations() {
        }

        @SerialName("uti")
        @JsonAnnotations2(names = {"uti"})
        public static /* synthetic */ void getUti$annotations() {
        }

        @SerialName("isAdjustment")
        @JsonAnnotations2(names = {"is_adjustment"})
        public static /* synthetic */ void is_adjustment$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component10, reason: from getter */
        public final int getUpdate_count() {
            return this.update_count;
        }

        /* renamed from: component11, reason: from getter */
        public final NullableStringDto getLeg_id() {
            return this.leg_id;
        }

        /* renamed from: component12, reason: from getter */
        public final DecimalDto getCommission() {
            return this.commission;
        }

        /* renamed from: component13, reason: from getter */
        public final NullableStringDto getCommission_currency() {
            return this.commission_currency;
        }

        /* renamed from: component14, reason: from getter */
        public final NullableStringDto getCommission_type() {
            return this.commission_type;
        }

        /* renamed from: component15, reason: from getter */
        public final NullableIntDto getLiquidity_ind() {
            return this.liquidity_ind;
        }

        /* renamed from: component16, reason: from getter */
        public final NullableStringDto getSettlement_type() {
            return this.settlement_type;
        }

        /* renamed from: component17, reason: from getter */
        public final TimeDto getSettlement_date() {
            return this.settlement_date;
        }

        /* renamed from: component18, reason: from getter */
        public final TimeDto getTrade_date() {
            return this.trade_date;
        }

        /* renamed from: component19, reason: from getter */
        public final DecimalDto getSec_fee() {
            return this.sec_fee;
        }

        /* renamed from: component2, reason: from getter */
        public final UUIDDto getId() {
            return this.id;
        }

        /* renamed from: component20, reason: from getter */
        public final DecimalDto getTaf_fee() {
            return this.taf_fee;
        }

        /* renamed from: component21, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        /* renamed from: component22, reason: from getter */
        public final NullableStringDto getCl_ord_id() {
            return this.cl_ord_id;
        }

        /* renamed from: component23, reason: from getter */
        public final DecimalDto getRounded_notional() {
            return this.rounded_notional;
        }

        /* renamed from: component24, reason: from getter */
        public final DecimalDto getNbbo_ask_price() {
            return this.nbbo_ask_price;
        }

        /* renamed from: component25, reason: from getter */
        public final DecimalDto getNbbo_ask_quantity() {
            return this.nbbo_ask_quantity;
        }

        /* renamed from: component26, reason: from getter */
        public final VenueDto getNbbo_ask_venue() {
            return this.nbbo_ask_venue;
        }

        /* renamed from: component27, reason: from getter */
        public final DecimalDto getNbbo_bid_price() {
            return this.nbbo_bid_price;
        }

        /* renamed from: component28, reason: from getter */
        public final DecimalDto getNbbo_bid_quantity() {
            return this.nbbo_bid_quantity;
        }

        /* renamed from: component29, reason: from getter */
        public final VenueDto getNbbo_bid_venue() {
            return this.nbbo_bid_venue;
        }

        /* renamed from: component3, reason: from getter */
        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        /* renamed from: component30, reason: from getter */
        public final TimeDto getNbbo_exchange_timestamp() {
            return this.nbbo_exchange_timestamp;
        }

        /* renamed from: component31, reason: from getter */
        public final UUIDDto getPending_execution_id() {
            return this.pending_execution_id;
        }

        /* renamed from: component32, reason: from getter */
        public final UUIDDto getPrice_source_execution_id() {
            return this.price_source_execution_id;
        }

        /* renamed from: component33, reason: from getter */
        public final TradeBreakAgentDto getTrade_break_agent() {
            return this.trade_break_agent;
        }

        /* renamed from: component34, reason: from getter */
        public final TimeDto getProcessed_at() {
            return this.processed_at;
        }

        /* renamed from: component35, reason: from getter */
        public final CapacityDto getCapacity() {
            return this.capacity;
        }

        /* renamed from: component36, reason: from getter */
        public final DecimalDto getLimit_up_price() {
            return this.limit_up_price;
        }

        /* renamed from: component37, reason: from getter */
        public final DecimalDto getLimit_down_price() {
            return this.limit_down_price;
        }

        /* renamed from: component38, reason: from getter */
        public final NullableBoolDto getIs_adjustment() {
            return this.is_adjustment;
        }

        /* renamed from: component39, reason: from getter */
        public final boolean getNotional_execution() {
            return this.notional_execution;
        }

        /* renamed from: component4, reason: from getter */
        public final DecimalDto getPrice() {
            return this.price;
        }

        /* renamed from: component40, reason: from getter */
        public final DecimalDto getClearing_quantity() {
            return this.clearing_quantity;
        }

        /* renamed from: component41, reason: from getter */
        public final boolean getNotional_fill() {
            return this.notional_fill;
        }

        /* renamed from: component42, reason: from getter */
        public final DecimalDto getOr_fee() {
            return this.or_fee;
        }

        /* renamed from: component43, reason: from getter */
        public final DecimalDto getOcc_fee() {
            return this.occ_fee;
        }

        /* renamed from: component44, reason: from getter */
        public final NullableStringDto getTrade_match_id() {
            return this.trade_match_id;
        }

        /* renamed from: component45, reason: from getter */
        public final DecimalDto getExchange_fee() {
            return this.exchange_fee;
        }

        /* renamed from: component46, reason: from getter */
        public final DecimalDto getBase_currency_traded() {
            return this.base_currency_traded;
        }

        /* renamed from: component47, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component48, reason: from getter */
        public final NullableStringDto getPosition_id() {
            return this.position_id;
        }

        /* renamed from: component49, reason: from getter */
        public final DecimalDto getNon_denominated_currency_traded() {
            return this.non_denominated_currency_traded;
        }

        /* renamed from: component5, reason: from getter */
        public final TimeDto getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component50, reason: from getter */
        public final NullableStringDto getUti() {
            return this.uti;
        }

        /* renamed from: component51, reason: from getter */
        public final NullableStringDto getRel_tx_id() {
            return this.rel_tx_id;
        }

        /* renamed from: component52, reason: from getter */
        public final DecimalDto getFx_fee_in_bps() {
            return this.fx_fee_in_bps;
        }

        /* renamed from: component53, reason: from getter */
        public final NullableStringDto getContra_firm_account() {
            return this.contra_firm_account;
        }

        /* renamed from: component54, reason: from getter */
        public final TimeDto getEstimated_next_settlement_time() {
            return this.estimated_next_settlement_time;
        }

        /* renamed from: component55, reason: from getter */
        public final UUIDDto getAssociated_fx_execution_id() {
            return this.associated_fx_execution_id;
        }

        /* renamed from: component56, reason: from getter */
        public final LastLiquidityIndDto getLast_liquidity_ind() {
            return this.last_liquidity_ind;
        }

        /* renamed from: component57, reason: from getter */
        public final ExecutionFeesDto getExecution_fees() {
            return this.execution_fees;
        }

        /* renamed from: component6, reason: from getter */
        public final String getExecution_id() {
            return this.execution_id;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeDto getBroken_at() {
            return this.broken_at;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getFill() {
            return this.fill;
        }

        /* renamed from: component9, reason: from getter */
        public final String getExec_broker() {
            return this.exec_broker;
        }

        public final Surrogate copy(UUIDDto order_id, UUIDDto id, DecimalDto quantity, DecimalDto price, TimeDto timestamp, String execution_id, TimeDto broken_at, boolean fill, String exec_broker, int update_count, NullableStringDto leg_id, DecimalDto commission, NullableStringDto commission_currency, NullableStringDto commission_type, NullableIntDto liquidity_ind, NullableStringDto settlement_type, TimeDto settlement_date, TimeDto trade_date, DecimalDto sec_fee, DecimalDto taf_fee, RouteDto route, NullableStringDto cl_ord_id, DecimalDto rounded_notional, DecimalDto nbbo_ask_price, DecimalDto nbbo_ask_quantity, VenueDto nbbo_ask_venue, DecimalDto nbbo_bid_price, DecimalDto nbbo_bid_quantity, VenueDto nbbo_bid_venue, TimeDto nbbo_exchange_timestamp, UUIDDto pending_execution_id, UUIDDto price_source_execution_id, TradeBreakAgentDto trade_break_agent, TimeDto processed_at, CapacityDto capacity, DecimalDto limit_up_price, DecimalDto limit_down_price, NullableBoolDto is_adjustment, boolean notional_execution, DecimalDto clearing_quantity, boolean notional_fill, DecimalDto or_fee, DecimalDto occ_fee, NullableStringDto trade_match_id, DecimalDto exchange_fee, DecimalDto base_currency_traded, SideDto side, NullableStringDto position_id, DecimalDto non_denominated_currency_traded, NullableStringDto uti, NullableStringDto rel_tx_id, DecimalDto fx_fee_in_bps, NullableStringDto contra_firm_account, TimeDto estimated_next_settlement_time, UUIDDto associated_fx_execution_id, LastLiquidityIndDto last_liquidity_ind, ExecutionFeesDto execution_fees) {
            Intrinsics.checkNotNullParameter(execution_id, "execution_id");
            Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(nbbo_ask_venue, "nbbo_ask_venue");
            Intrinsics.checkNotNullParameter(nbbo_bid_venue, "nbbo_bid_venue");
            Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
            Intrinsics.checkNotNullParameter(capacity, "capacity");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
            return new Surrogate(order_id, id, quantity, price, timestamp, execution_id, broken_at, fill, exec_broker, update_count, leg_id, commission, commission_currency, commission_type, liquidity_ind, settlement_type, settlement_date, trade_date, sec_fee, taf_fee, route, cl_ord_id, rounded_notional, nbbo_ask_price, nbbo_ask_quantity, nbbo_ask_venue, nbbo_bid_price, nbbo_bid_quantity, nbbo_bid_venue, nbbo_exchange_timestamp, pending_execution_id, price_source_execution_id, trade_break_agent, processed_at, capacity, limit_up_price, limit_down_price, is_adjustment, notional_execution, clearing_quantity, notional_fill, or_fee, occ_fee, trade_match_id, exchange_fee, base_currency_traded, side, position_id, non_denominated_currency_traded, uti, rel_tx_id, fx_fee_in_bps, contra_firm_account, estimated_next_settlement_time, associated_fx_execution_id, last_liquidity_ind, execution_fees);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.execution_id, surrogate.execution_id) && Intrinsics.areEqual(this.broken_at, surrogate.broken_at) && this.fill == surrogate.fill && Intrinsics.areEqual(this.exec_broker, surrogate.exec_broker) && this.update_count == surrogate.update_count && Intrinsics.areEqual(this.leg_id, surrogate.leg_id) && Intrinsics.areEqual(this.commission, surrogate.commission) && Intrinsics.areEqual(this.commission_currency, surrogate.commission_currency) && Intrinsics.areEqual(this.commission_type, surrogate.commission_type) && Intrinsics.areEqual(this.liquidity_ind, surrogate.liquidity_ind) && Intrinsics.areEqual(this.settlement_type, surrogate.settlement_type) && Intrinsics.areEqual(this.settlement_date, surrogate.settlement_date) && Intrinsics.areEqual(this.trade_date, surrogate.trade_date) && Intrinsics.areEqual(this.sec_fee, surrogate.sec_fee) && Intrinsics.areEqual(this.taf_fee, surrogate.taf_fee) && this.route == surrogate.route && Intrinsics.areEqual(this.cl_ord_id, surrogate.cl_ord_id) && Intrinsics.areEqual(this.rounded_notional, surrogate.rounded_notional) && Intrinsics.areEqual(this.nbbo_ask_price, surrogate.nbbo_ask_price) && Intrinsics.areEqual(this.nbbo_ask_quantity, surrogate.nbbo_ask_quantity) && this.nbbo_ask_venue == surrogate.nbbo_ask_venue && Intrinsics.areEqual(this.nbbo_bid_price, surrogate.nbbo_bid_price) && Intrinsics.areEqual(this.nbbo_bid_quantity, surrogate.nbbo_bid_quantity) && this.nbbo_bid_venue == surrogate.nbbo_bid_venue && Intrinsics.areEqual(this.nbbo_exchange_timestamp, surrogate.nbbo_exchange_timestamp) && Intrinsics.areEqual(this.pending_execution_id, surrogate.pending_execution_id) && Intrinsics.areEqual(this.price_source_execution_id, surrogate.price_source_execution_id) && this.trade_break_agent == surrogate.trade_break_agent && Intrinsics.areEqual(this.processed_at, surrogate.processed_at) && this.capacity == surrogate.capacity && Intrinsics.areEqual(this.limit_up_price, surrogate.limit_up_price) && Intrinsics.areEqual(this.limit_down_price, surrogate.limit_down_price) && Intrinsics.areEqual(this.is_adjustment, surrogate.is_adjustment) && this.notional_execution == surrogate.notional_execution && Intrinsics.areEqual(this.clearing_quantity, surrogate.clearing_quantity) && this.notional_fill == surrogate.notional_fill && Intrinsics.areEqual(this.or_fee, surrogate.or_fee) && Intrinsics.areEqual(this.occ_fee, surrogate.occ_fee) && Intrinsics.areEqual(this.trade_match_id, surrogate.trade_match_id) && Intrinsics.areEqual(this.exchange_fee, surrogate.exchange_fee) && Intrinsics.areEqual(this.base_currency_traded, surrogate.base_currency_traded) && this.side == surrogate.side && Intrinsics.areEqual(this.position_id, surrogate.position_id) && Intrinsics.areEqual(this.non_denominated_currency_traded, surrogate.non_denominated_currency_traded) && Intrinsics.areEqual(this.uti, surrogate.uti) && Intrinsics.areEqual(this.rel_tx_id, surrogate.rel_tx_id) && Intrinsics.areEqual(this.fx_fee_in_bps, surrogate.fx_fee_in_bps) && Intrinsics.areEqual(this.contra_firm_account, surrogate.contra_firm_account) && Intrinsics.areEqual(this.estimated_next_settlement_time, surrogate.estimated_next_settlement_time) && Intrinsics.areEqual(this.associated_fx_execution_id, surrogate.associated_fx_execution_id) && this.last_liquidity_ind == surrogate.last_liquidity_ind && Intrinsics.areEqual(this.execution_fees, surrogate.execution_fees);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.order_id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            UUIDDto uUIDDto2 = this.id;
            int iHashCode2 = (iHashCode + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31;
            DecimalDto decimalDto = this.quantity;
            int iHashCode3 = (iHashCode2 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            DecimalDto decimalDto2 = this.price;
            int iHashCode4 = (iHashCode3 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            TimeDto timeDto = this.timestamp;
            int iHashCode5 = (((iHashCode4 + (timeDto == null ? 0 : timeDto.hashCode())) * 31) + this.execution_id.hashCode()) * 31;
            TimeDto timeDto2 = this.broken_at;
            int iHashCode6 = (((((((iHashCode5 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + Boolean.hashCode(this.fill)) * 31) + this.exec_broker.hashCode()) * 31) + Integer.hashCode(this.update_count)) * 31;
            NullableStringDto nullableStringDto = this.leg_id;
            int iHashCode7 = (iHashCode6 + (nullableStringDto == null ? 0 : nullableStringDto.hashCode())) * 31;
            DecimalDto decimalDto3 = this.commission;
            int iHashCode8 = (iHashCode7 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            NullableStringDto nullableStringDto2 = this.commission_currency;
            int iHashCode9 = (iHashCode8 + (nullableStringDto2 == null ? 0 : nullableStringDto2.hashCode())) * 31;
            NullableStringDto nullableStringDto3 = this.commission_type;
            int iHashCode10 = (iHashCode9 + (nullableStringDto3 == null ? 0 : nullableStringDto3.hashCode())) * 31;
            NullableIntDto nullableIntDto = this.liquidity_ind;
            int iHashCode11 = (iHashCode10 + (nullableIntDto == null ? 0 : nullableIntDto.hashCode())) * 31;
            NullableStringDto nullableStringDto4 = this.settlement_type;
            int iHashCode12 = (iHashCode11 + (nullableStringDto4 == null ? 0 : nullableStringDto4.hashCode())) * 31;
            TimeDto timeDto3 = this.settlement_date;
            int iHashCode13 = (iHashCode12 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31;
            TimeDto timeDto4 = this.trade_date;
            int iHashCode14 = (iHashCode13 + (timeDto4 == null ? 0 : timeDto4.hashCode())) * 31;
            DecimalDto decimalDto4 = this.sec_fee;
            int iHashCode15 = (iHashCode14 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31;
            DecimalDto decimalDto5 = this.taf_fee;
            int iHashCode16 = (((iHashCode15 + (decimalDto5 == null ? 0 : decimalDto5.hashCode())) * 31) + this.route.hashCode()) * 31;
            NullableStringDto nullableStringDto5 = this.cl_ord_id;
            int iHashCode17 = (iHashCode16 + (nullableStringDto5 == null ? 0 : nullableStringDto5.hashCode())) * 31;
            DecimalDto decimalDto6 = this.rounded_notional;
            int iHashCode18 = (iHashCode17 + (decimalDto6 == null ? 0 : decimalDto6.hashCode())) * 31;
            DecimalDto decimalDto7 = this.nbbo_ask_price;
            int iHashCode19 = (iHashCode18 + (decimalDto7 == null ? 0 : decimalDto7.hashCode())) * 31;
            DecimalDto decimalDto8 = this.nbbo_ask_quantity;
            int iHashCode20 = (((iHashCode19 + (decimalDto8 == null ? 0 : decimalDto8.hashCode())) * 31) + this.nbbo_ask_venue.hashCode()) * 31;
            DecimalDto decimalDto9 = this.nbbo_bid_price;
            int iHashCode21 = (iHashCode20 + (decimalDto9 == null ? 0 : decimalDto9.hashCode())) * 31;
            DecimalDto decimalDto10 = this.nbbo_bid_quantity;
            int iHashCode22 = (((iHashCode21 + (decimalDto10 == null ? 0 : decimalDto10.hashCode())) * 31) + this.nbbo_bid_venue.hashCode()) * 31;
            TimeDto timeDto5 = this.nbbo_exchange_timestamp;
            int iHashCode23 = (iHashCode22 + (timeDto5 == null ? 0 : timeDto5.hashCode())) * 31;
            UUIDDto uUIDDto3 = this.pending_execution_id;
            int iHashCode24 = (iHashCode23 + (uUIDDto3 == null ? 0 : uUIDDto3.hashCode())) * 31;
            UUIDDto uUIDDto4 = this.price_source_execution_id;
            int iHashCode25 = (((iHashCode24 + (uUIDDto4 == null ? 0 : uUIDDto4.hashCode())) * 31) + this.trade_break_agent.hashCode()) * 31;
            TimeDto timeDto6 = this.processed_at;
            int iHashCode26 = (((iHashCode25 + (timeDto6 == null ? 0 : timeDto6.hashCode())) * 31) + this.capacity.hashCode()) * 31;
            DecimalDto decimalDto11 = this.limit_up_price;
            int iHashCode27 = (iHashCode26 + (decimalDto11 == null ? 0 : decimalDto11.hashCode())) * 31;
            DecimalDto decimalDto12 = this.limit_down_price;
            int iHashCode28 = (iHashCode27 + (decimalDto12 == null ? 0 : decimalDto12.hashCode())) * 31;
            NullableBoolDto nullableBoolDto = this.is_adjustment;
            int iHashCode29 = (((iHashCode28 + (nullableBoolDto == null ? 0 : nullableBoolDto.hashCode())) * 31) + Boolean.hashCode(this.notional_execution)) * 31;
            DecimalDto decimalDto13 = this.clearing_quantity;
            int iHashCode30 = (((iHashCode29 + (decimalDto13 == null ? 0 : decimalDto13.hashCode())) * 31) + Boolean.hashCode(this.notional_fill)) * 31;
            DecimalDto decimalDto14 = this.or_fee;
            int iHashCode31 = (iHashCode30 + (decimalDto14 == null ? 0 : decimalDto14.hashCode())) * 31;
            DecimalDto decimalDto15 = this.occ_fee;
            int iHashCode32 = (iHashCode31 + (decimalDto15 == null ? 0 : decimalDto15.hashCode())) * 31;
            NullableStringDto nullableStringDto6 = this.trade_match_id;
            int iHashCode33 = (iHashCode32 + (nullableStringDto6 == null ? 0 : nullableStringDto6.hashCode())) * 31;
            DecimalDto decimalDto16 = this.exchange_fee;
            int iHashCode34 = (iHashCode33 + (decimalDto16 == null ? 0 : decimalDto16.hashCode())) * 31;
            DecimalDto decimalDto17 = this.base_currency_traded;
            int iHashCode35 = (((iHashCode34 + (decimalDto17 == null ? 0 : decimalDto17.hashCode())) * 31) + this.side.hashCode()) * 31;
            NullableStringDto nullableStringDto7 = this.position_id;
            int iHashCode36 = (iHashCode35 + (nullableStringDto7 == null ? 0 : nullableStringDto7.hashCode())) * 31;
            DecimalDto decimalDto18 = this.non_denominated_currency_traded;
            int iHashCode37 = (iHashCode36 + (decimalDto18 == null ? 0 : decimalDto18.hashCode())) * 31;
            NullableStringDto nullableStringDto8 = this.uti;
            int iHashCode38 = (iHashCode37 + (nullableStringDto8 == null ? 0 : nullableStringDto8.hashCode())) * 31;
            NullableStringDto nullableStringDto9 = this.rel_tx_id;
            int iHashCode39 = (iHashCode38 + (nullableStringDto9 == null ? 0 : nullableStringDto9.hashCode())) * 31;
            DecimalDto decimalDto19 = this.fx_fee_in_bps;
            int iHashCode40 = (iHashCode39 + (decimalDto19 == null ? 0 : decimalDto19.hashCode())) * 31;
            NullableStringDto nullableStringDto10 = this.contra_firm_account;
            int iHashCode41 = (iHashCode40 + (nullableStringDto10 == null ? 0 : nullableStringDto10.hashCode())) * 31;
            TimeDto timeDto7 = this.estimated_next_settlement_time;
            int iHashCode42 = (iHashCode41 + (timeDto7 == null ? 0 : timeDto7.hashCode())) * 31;
            UUIDDto uUIDDto5 = this.associated_fx_execution_id;
            int iHashCode43 = (((iHashCode42 + (uUIDDto5 == null ? 0 : uUIDDto5.hashCode())) * 31) + this.last_liquidity_ind.hashCode()) * 31;
            ExecutionFeesDto executionFeesDto = this.execution_fees;
            return iHashCode43 + (executionFeesDto != null ? executionFeesDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", id=" + this.id + ", quantity=" + this.quantity + ", price=" + this.price + ", timestamp=" + this.timestamp + ", execution_id=" + this.execution_id + ", broken_at=" + this.broken_at + ", fill=" + this.fill + ", exec_broker=" + this.exec_broker + ", update_count=" + this.update_count + ", leg_id=" + this.leg_id + ", commission=" + this.commission + ", commission_currency=" + this.commission_currency + ", commission_type=" + this.commission_type + ", liquidity_ind=" + this.liquidity_ind + ", settlement_type=" + this.settlement_type + ", settlement_date=" + this.settlement_date + ", trade_date=" + this.trade_date + ", sec_fee=" + this.sec_fee + ", taf_fee=" + this.taf_fee + ", route=" + this.route + ", cl_ord_id=" + this.cl_ord_id + ", rounded_notional=" + this.rounded_notional + ", nbbo_ask_price=" + this.nbbo_ask_price + ", nbbo_ask_quantity=" + this.nbbo_ask_quantity + ", nbbo_ask_venue=" + this.nbbo_ask_venue + ", nbbo_bid_price=" + this.nbbo_bid_price + ", nbbo_bid_quantity=" + this.nbbo_bid_quantity + ", nbbo_bid_venue=" + this.nbbo_bid_venue + ", nbbo_exchange_timestamp=" + this.nbbo_exchange_timestamp + ", pending_execution_id=" + this.pending_execution_id + ", price_source_execution_id=" + this.price_source_execution_id + ", trade_break_agent=" + this.trade_break_agent + ", processed_at=" + this.processed_at + ", capacity=" + this.capacity + ", limit_up_price=" + this.limit_up_price + ", limit_down_price=" + this.limit_down_price + ", is_adjustment=" + this.is_adjustment + ", notional_execution=" + this.notional_execution + ", clearing_quantity=" + this.clearing_quantity + ", notional_fill=" + this.notional_fill + ", or_fee=" + this.or_fee + ", occ_fee=" + this.occ_fee + ", trade_match_id=" + this.trade_match_id + ", exchange_fee=" + this.exchange_fee + ", base_currency_traded=" + this.base_currency_traded + ", side=" + this.side + ", position_id=" + this.position_id + ", non_denominated_currency_traded=" + this.non_denominated_currency_traded + ", uti=" + this.uti + ", rel_tx_id=" + this.rel_tx_id + ", fx_fee_in_bps=" + this.fx_fee_in_bps + ", contra_firm_account=" + this.contra_firm_account + ", estimated_next_settlement_time=" + this.estimated_next_settlement_time + ", associated_fx_execution_id=" + this.associated_fx_execution_id + ", last_liquidity_ind=" + this.last_liquidity_ind + ", execution_fees=" + this.execution_fees + ")";
        }

        /* compiled from: ExecutionDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ExecutionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/ExecutionDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ExecutionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, String str, TimeDto timeDto2, boolean z, String str2, int i3, NullableStringDto nullableStringDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableIntDto nullableIntDto, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, DecimalDto decimalDto4, DecimalDto decimalDto5, RouteDto routeDto, NullableStringDto nullableStringDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, DecimalDto decimalDto8, VenueDto venueDto, DecimalDto decimalDto9, DecimalDto decimalDto10, VenueDto venueDto2, TimeDto timeDto5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, TradeBreakAgentDto tradeBreakAgentDto, TimeDto timeDto6, CapacityDto capacityDto, DecimalDto decimalDto11, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, boolean z2, DecimalDto decimalDto13, boolean z3, DecimalDto decimalDto14, DecimalDto decimalDto15, NullableStringDto nullableStringDto6, DecimalDto decimalDto16, DecimalDto decimalDto17, SideDto sideDto, NullableStringDto nullableStringDto7, DecimalDto decimalDto18, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, DecimalDto decimalDto19, NullableStringDto nullableStringDto10, TimeDto timeDto7, UUIDDto uUIDDto5, LastLiquidityIndDto lastLiquidityIndDto, ExecutionFeesDto executionFeesDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto2;
            }
            if ((i & 4) == 0) {
                this.quantity = null;
            } else {
                this.quantity = decimalDto;
            }
            if ((i & 8) == 0) {
                this.price = null;
            } else {
                this.price = decimalDto2;
            }
            if ((i & 16) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = timeDto;
            }
            if ((i & 32) == 0) {
                this.execution_id = "";
            } else {
                this.execution_id = str;
            }
            if ((i & 64) == 0) {
                this.broken_at = null;
            } else {
                this.broken_at = timeDto2;
            }
            if ((i & 128) == 0) {
                this.fill = false;
            } else {
                this.fill = z;
            }
            if ((i & 256) == 0) {
                this.exec_broker = "";
            } else {
                this.exec_broker = str2;
            }
            if ((i & 512) == 0) {
                this.update_count = 0;
            } else {
                this.update_count = i3;
            }
            if ((i & 1024) == 0) {
                this.leg_id = null;
            } else {
                this.leg_id = nullableStringDto;
            }
            if ((i & 2048) == 0) {
                this.commission = null;
            } else {
                this.commission = decimalDto3;
            }
            if ((i & 4096) == 0) {
                this.commission_currency = null;
            } else {
                this.commission_currency = nullableStringDto2;
            }
            if ((i & 8192) == 0) {
                this.commission_type = null;
            } else {
                this.commission_type = nullableStringDto3;
            }
            if ((i & 16384) == 0) {
                this.liquidity_ind = null;
            } else {
                this.liquidity_ind = nullableIntDto;
            }
            if ((i & 32768) == 0) {
                this.settlement_type = null;
            } else {
                this.settlement_type = nullableStringDto4;
            }
            if ((i & 65536) == 0) {
                this.settlement_date = null;
            } else {
                this.settlement_date = timeDto3;
            }
            if ((i & 131072) == 0) {
                this.trade_date = null;
            } else {
                this.trade_date = timeDto4;
            }
            if ((i & 262144) == 0) {
                this.sec_fee = null;
            } else {
                this.sec_fee = decimalDto4;
            }
            if ((524288 & i) == 0) {
                this.taf_fee = null;
            } else {
                this.taf_fee = decimalDto5;
            }
            this.route = (1048576 & i) == 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto;
            if ((2097152 & i) == 0) {
                this.cl_ord_id = null;
            } else {
                this.cl_ord_id = nullableStringDto5;
            }
            if ((4194304 & i) == 0) {
                this.rounded_notional = null;
            } else {
                this.rounded_notional = decimalDto6;
            }
            if ((8388608 & i) == 0) {
                this.nbbo_ask_price = null;
            } else {
                this.nbbo_ask_price = decimalDto7;
            }
            if ((16777216 & i) == 0) {
                this.nbbo_ask_quantity = null;
            } else {
                this.nbbo_ask_quantity = decimalDto8;
            }
            this.nbbo_ask_venue = (33554432 & i) == 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto;
            if ((67108864 & i) == 0) {
                this.nbbo_bid_price = null;
            } else {
                this.nbbo_bid_price = decimalDto9;
            }
            if ((134217728 & i) == 0) {
                this.nbbo_bid_quantity = null;
            } else {
                this.nbbo_bid_quantity = decimalDto10;
            }
            this.nbbo_bid_venue = (268435456 & i) == 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto2;
            if ((536870912 & i) == 0) {
                this.nbbo_exchange_timestamp = null;
            } else {
                this.nbbo_exchange_timestamp = timeDto5;
            }
            if ((1073741824 & i) == 0) {
                this.pending_execution_id = null;
            } else {
                this.pending_execution_id = uUIDDto3;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.price_source_execution_id = null;
            } else {
                this.price_source_execution_id = uUIDDto4;
            }
            this.trade_break_agent = (i2 & 1) == 0 ? TradeBreakAgentDto.INSTANCE.getZeroValue() : tradeBreakAgentDto;
            if ((i2 & 2) == 0) {
                this.processed_at = null;
            } else {
                this.processed_at = timeDto6;
            }
            this.capacity = (i2 & 4) == 0 ? CapacityDto.INSTANCE.getZeroValue() : capacityDto;
            if ((i2 & 8) == 0) {
                this.limit_up_price = null;
            } else {
                this.limit_up_price = decimalDto11;
            }
            if ((i2 & 16) == 0) {
                this.limit_down_price = null;
            } else {
                this.limit_down_price = decimalDto12;
            }
            if ((i2 & 32) == 0) {
                this.is_adjustment = null;
            } else {
                this.is_adjustment = nullableBoolDto;
            }
            if ((i2 & 64) == 0) {
                this.notional_execution = false;
            } else {
                this.notional_execution = z2;
            }
            if ((i2 & 128) == 0) {
                this.clearing_quantity = null;
            } else {
                this.clearing_quantity = decimalDto13;
            }
            if ((i2 & 256) == 0) {
                this.notional_fill = false;
            } else {
                this.notional_fill = z3;
            }
            if ((i2 & 512) == 0) {
                this.or_fee = null;
            } else {
                this.or_fee = decimalDto14;
            }
            if ((i2 & 1024) == 0) {
                this.occ_fee = null;
            } else {
                this.occ_fee = decimalDto15;
            }
            if ((i2 & 2048) == 0) {
                this.trade_match_id = null;
            } else {
                this.trade_match_id = nullableStringDto6;
            }
            if ((i2 & 4096) == 0) {
                this.exchange_fee = null;
            } else {
                this.exchange_fee = decimalDto16;
            }
            if ((i2 & 8192) == 0) {
                this.base_currency_traded = null;
            } else {
                this.base_currency_traded = decimalDto17;
            }
            this.side = (i2 & 16384) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
            if ((i2 & 32768) == 0) {
                this.position_id = null;
            } else {
                this.position_id = nullableStringDto7;
            }
            if ((i2 & 65536) == 0) {
                this.non_denominated_currency_traded = null;
            } else {
                this.non_denominated_currency_traded = decimalDto18;
            }
            if ((i2 & 131072) == 0) {
                this.uti = null;
            } else {
                this.uti = nullableStringDto8;
            }
            if ((i2 & 262144) == 0) {
                this.rel_tx_id = null;
            } else {
                this.rel_tx_id = nullableStringDto9;
            }
            if ((524288 & i2) == 0) {
                this.fx_fee_in_bps = null;
            } else {
                this.fx_fee_in_bps = decimalDto19;
            }
            if ((1048576 & i2) == 0) {
                this.contra_firm_account = null;
            } else {
                this.contra_firm_account = nullableStringDto10;
            }
            if ((2097152 & i2) == 0) {
                this.estimated_next_settlement_time = null;
            } else {
                this.estimated_next_settlement_time = timeDto7;
            }
            if ((4194304 & i2) == 0) {
                this.associated_fx_execution_id = null;
            } else {
                this.associated_fx_execution_id = uUIDDto5;
            }
            this.last_liquidity_ind = (8388608 & i2) == 0 ? LastLiquidityIndDto.INSTANCE.getZeroValue() : lastLiquidityIndDto;
            if ((16777216 & i2) == 0) {
                this.execution_fees = null;
            } else {
                this.execution_fees = executionFeesDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.order_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            UUIDDto uUIDDto2 = self.id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            DecimalDto decimalDto = self.quantity;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.price;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            TimeDto timeDto = self.timestamp;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimeDto.Serializer.INSTANCE, timeDto);
            }
            if (!Intrinsics.areEqual(self.execution_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.execution_id);
            }
            TimeDto timeDto2 = self.broken_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            boolean z = self.fill;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            if (!Intrinsics.areEqual(self.exec_broker, "")) {
                output.encodeStringElement(serialDesc, 8, self.exec_broker);
            }
            int i = self.update_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 9, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            NullableStringDto nullableStringDto = self.leg_id;
            if (nullableStringDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, NullableStringDto.Serializer.INSTANCE, nullableStringDto);
            }
            DecimalDto decimalDto3 = self.commission;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            NullableStringDto nullableStringDto2 = self.commission_currency;
            if (nullableStringDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, NullableStringDto.Serializer.INSTANCE, nullableStringDto2);
            }
            NullableStringDto nullableStringDto3 = self.commission_type;
            if (nullableStringDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, NullableStringDto.Serializer.INSTANCE, nullableStringDto3);
            }
            NullableIntDto nullableIntDto = self.liquidity_ind;
            if (nullableIntDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, NullableIntDto.Serializer.INSTANCE, nullableIntDto);
            }
            NullableStringDto nullableStringDto4 = self.settlement_type;
            if (nullableStringDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, NullableStringDto.Serializer.INSTANCE, nullableStringDto4);
            }
            TimeDto timeDto3 = self.settlement_date;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            TimeDto timeDto4 = self.trade_date;
            if (timeDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, TimeDto.Serializer.INSTANCE, timeDto4);
            }
            DecimalDto decimalDto4 = self.sec_fee;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            DecimalDto decimalDto5 = self.taf_fee;
            if (decimalDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, DecimalDto.Serializer.INSTANCE, decimalDto5);
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 20, RouteDto.Serializer.INSTANCE, self.route);
            }
            NullableStringDto nullableStringDto5 = self.cl_ord_id;
            if (nullableStringDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, NullableStringDto.Serializer.INSTANCE, nullableStringDto5);
            }
            DecimalDto decimalDto6 = self.rounded_notional;
            if (decimalDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, DecimalDto.Serializer.INSTANCE, decimalDto6);
            }
            DecimalDto decimalDto7 = self.nbbo_ask_price;
            if (decimalDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, DecimalDto.Serializer.INSTANCE, decimalDto7);
            }
            DecimalDto decimalDto8 = self.nbbo_ask_quantity;
            if (decimalDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, DecimalDto.Serializer.INSTANCE, decimalDto8);
            }
            VenueDto venueDto = self.nbbo_ask_venue;
            VenueDto.Companion companion = VenueDto.INSTANCE;
            if (venueDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 25, VenueDto.Serializer.INSTANCE, self.nbbo_ask_venue);
            }
            DecimalDto decimalDto9 = self.nbbo_bid_price;
            if (decimalDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, DecimalDto.Serializer.INSTANCE, decimalDto9);
            }
            DecimalDto decimalDto10 = self.nbbo_bid_quantity;
            if (decimalDto10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, DecimalDto.Serializer.INSTANCE, decimalDto10);
            }
            if (self.nbbo_bid_venue != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 28, VenueDto.Serializer.INSTANCE, self.nbbo_bid_venue);
            }
            TimeDto timeDto5 = self.nbbo_exchange_timestamp;
            if (timeDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, TimeDto.Serializer.INSTANCE, timeDto5);
            }
            UUIDDto uUIDDto3 = self.pending_execution_id;
            if (uUIDDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, UUIDDto.Serializer.INSTANCE, uUIDDto3);
            }
            UUIDDto uUIDDto4 = self.price_source_execution_id;
            if (uUIDDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, UUIDDto.Serializer.INSTANCE, uUIDDto4);
            }
            if (self.trade_break_agent != TradeBreakAgentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 32, TradeBreakAgentDto.Serializer.INSTANCE, self.trade_break_agent);
            }
            TimeDto timeDto6 = self.processed_at;
            if (timeDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, TimeDto.Serializer.INSTANCE, timeDto6);
            }
            if (self.capacity != CapacityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 34, CapacityDto.Serializer.INSTANCE, self.capacity);
            }
            DecimalDto decimalDto11 = self.limit_up_price;
            if (decimalDto11 != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, DecimalDto.Serializer.INSTANCE, decimalDto11);
            }
            DecimalDto decimalDto12 = self.limit_down_price;
            if (decimalDto12 != null) {
                output.encodeNullableSerializableElement(serialDesc, 36, DecimalDto.Serializer.INSTANCE, decimalDto12);
            }
            NullableBoolDto nullableBoolDto = self.is_adjustment;
            if (nullableBoolDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 37, NullableBoolDto.Serializer.INSTANCE, nullableBoolDto);
            }
            boolean z2 = self.notional_execution;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 38, z2);
            }
            DecimalDto decimalDto13 = self.clearing_quantity;
            if (decimalDto13 != null) {
                output.encodeNullableSerializableElement(serialDesc, 39, DecimalDto.Serializer.INSTANCE, decimalDto13);
            }
            boolean z3 = self.notional_fill;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 40, z3);
            }
            DecimalDto decimalDto14 = self.or_fee;
            if (decimalDto14 != null) {
                output.encodeNullableSerializableElement(serialDesc, 41, DecimalDto.Serializer.INSTANCE, decimalDto14);
            }
            DecimalDto decimalDto15 = self.occ_fee;
            if (decimalDto15 != null) {
                output.encodeNullableSerializableElement(serialDesc, 42, DecimalDto.Serializer.INSTANCE, decimalDto15);
            }
            NullableStringDto nullableStringDto6 = self.trade_match_id;
            if (nullableStringDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 43, NullableStringDto.Serializer.INSTANCE, nullableStringDto6);
            }
            DecimalDto decimalDto16 = self.exchange_fee;
            if (decimalDto16 != null) {
                output.encodeNullableSerializableElement(serialDesc, 44, DecimalDto.Serializer.INSTANCE, decimalDto16);
            }
            DecimalDto decimalDto17 = self.base_currency_traded;
            if (decimalDto17 != null) {
                output.encodeNullableSerializableElement(serialDesc, 45, DecimalDto.Serializer.INSTANCE, decimalDto17);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 46, SideDto.Serializer.INSTANCE, self.side);
            }
            NullableStringDto nullableStringDto7 = self.position_id;
            if (nullableStringDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 47, NullableStringDto.Serializer.INSTANCE, nullableStringDto7);
            }
            DecimalDto decimalDto18 = self.non_denominated_currency_traded;
            if (decimalDto18 != null) {
                output.encodeNullableSerializableElement(serialDesc, 48, DecimalDto.Serializer.INSTANCE, decimalDto18);
            }
            NullableStringDto nullableStringDto8 = self.uti;
            if (nullableStringDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 49, NullableStringDto.Serializer.INSTANCE, nullableStringDto8);
            }
            NullableStringDto nullableStringDto9 = self.rel_tx_id;
            if (nullableStringDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 50, NullableStringDto.Serializer.INSTANCE, nullableStringDto9);
            }
            DecimalDto decimalDto19 = self.fx_fee_in_bps;
            if (decimalDto19 != null) {
                output.encodeNullableSerializableElement(serialDesc, 51, DecimalDto.Serializer.INSTANCE, decimalDto19);
            }
            NullableStringDto nullableStringDto10 = self.contra_firm_account;
            if (nullableStringDto10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 52, NullableStringDto.Serializer.INSTANCE, nullableStringDto10);
            }
            TimeDto timeDto7 = self.estimated_next_settlement_time;
            if (timeDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 53, TimeDto.Serializer.INSTANCE, timeDto7);
            }
            UUIDDto uUIDDto5 = self.associated_fx_execution_id;
            if (uUIDDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 54, UUIDDto.Serializer.INSTANCE, uUIDDto5);
            }
            if (self.last_liquidity_ind != LastLiquidityIndDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 55, LastLiquidityIndDto.Serializer.INSTANCE, self.last_liquidity_ind);
            }
            ExecutionFeesDto executionFeesDto = self.execution_fees;
            if (executionFeesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 56, ExecutionFeesDto.Serializer.INSTANCE, executionFeesDto);
            }
        }

        public Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, String execution_id, TimeDto timeDto2, boolean z, String exec_broker, int i, NullableStringDto nullableStringDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableIntDto nullableIntDto, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, DecimalDto decimalDto4, DecimalDto decimalDto5, RouteDto route, NullableStringDto nullableStringDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, DecimalDto decimalDto8, VenueDto nbbo_ask_venue, DecimalDto decimalDto9, DecimalDto decimalDto10, VenueDto nbbo_bid_venue, TimeDto timeDto5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, TradeBreakAgentDto trade_break_agent, TimeDto timeDto6, CapacityDto capacity, DecimalDto decimalDto11, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, boolean z2, DecimalDto decimalDto13, boolean z3, DecimalDto decimalDto14, DecimalDto decimalDto15, NullableStringDto nullableStringDto6, DecimalDto decimalDto16, DecimalDto decimalDto17, SideDto side, NullableStringDto nullableStringDto7, DecimalDto decimalDto18, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, DecimalDto decimalDto19, NullableStringDto nullableStringDto10, TimeDto timeDto7, UUIDDto uUIDDto5, LastLiquidityIndDto last_liquidity_ind, ExecutionFeesDto executionFeesDto) {
            Intrinsics.checkNotNullParameter(execution_id, "execution_id");
            Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(nbbo_ask_venue, "nbbo_ask_venue");
            Intrinsics.checkNotNullParameter(nbbo_bid_venue, "nbbo_bid_venue");
            Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
            Intrinsics.checkNotNullParameter(capacity, "capacity");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
            this.order_id = uUIDDto;
            this.id = uUIDDto2;
            this.quantity = decimalDto;
            this.price = decimalDto2;
            this.timestamp = timeDto;
            this.execution_id = execution_id;
            this.broken_at = timeDto2;
            this.fill = z;
            this.exec_broker = exec_broker;
            this.update_count = i;
            this.leg_id = nullableStringDto;
            this.commission = decimalDto3;
            this.commission_currency = nullableStringDto2;
            this.commission_type = nullableStringDto3;
            this.liquidity_ind = nullableIntDto;
            this.settlement_type = nullableStringDto4;
            this.settlement_date = timeDto3;
            this.trade_date = timeDto4;
            this.sec_fee = decimalDto4;
            this.taf_fee = decimalDto5;
            this.route = route;
            this.cl_ord_id = nullableStringDto5;
            this.rounded_notional = decimalDto6;
            this.nbbo_ask_price = decimalDto7;
            this.nbbo_ask_quantity = decimalDto8;
            this.nbbo_ask_venue = nbbo_ask_venue;
            this.nbbo_bid_price = decimalDto9;
            this.nbbo_bid_quantity = decimalDto10;
            this.nbbo_bid_venue = nbbo_bid_venue;
            this.nbbo_exchange_timestamp = timeDto5;
            this.pending_execution_id = uUIDDto3;
            this.price_source_execution_id = uUIDDto4;
            this.trade_break_agent = trade_break_agent;
            this.processed_at = timeDto6;
            this.capacity = capacity;
            this.limit_up_price = decimalDto11;
            this.limit_down_price = decimalDto12;
            this.is_adjustment = nullableBoolDto;
            this.notional_execution = z2;
            this.clearing_quantity = decimalDto13;
            this.notional_fill = z3;
            this.or_fee = decimalDto14;
            this.occ_fee = decimalDto15;
            this.trade_match_id = nullableStringDto6;
            this.exchange_fee = decimalDto16;
            this.base_currency_traded = decimalDto17;
            this.side = side;
            this.position_id = nullableStringDto7;
            this.non_denominated_currency_traded = decimalDto18;
            this.uti = nullableStringDto8;
            this.rel_tx_id = nullableStringDto9;
            this.fx_fee_in_bps = decimalDto19;
            this.contra_firm_account = nullableStringDto10;
            this.estimated_next_settlement_time = timeDto7;
            this.associated_fx_execution_id = uUIDDto5;
            this.last_liquidity_ind = last_liquidity_ind;
            this.execution_fees = executionFeesDto;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, String str, TimeDto timeDto2, boolean z, String str2, int i, NullableStringDto nullableStringDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableIntDto nullableIntDto, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, DecimalDto decimalDto4, DecimalDto decimalDto5, RouteDto routeDto, NullableStringDto nullableStringDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, DecimalDto decimalDto8, VenueDto venueDto, DecimalDto decimalDto9, DecimalDto decimalDto10, VenueDto venueDto2, TimeDto timeDto5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, TradeBreakAgentDto tradeBreakAgentDto, TimeDto timeDto6, CapacityDto capacityDto, DecimalDto decimalDto11, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, boolean z2, DecimalDto decimalDto13, boolean z3, DecimalDto decimalDto14, DecimalDto decimalDto15, NullableStringDto nullableStringDto6, DecimalDto decimalDto16, DecimalDto decimalDto17, SideDto sideDto, NullableStringDto nullableStringDto7, DecimalDto decimalDto18, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, DecimalDto decimalDto19, NullableStringDto nullableStringDto10, TimeDto timeDto7, UUIDDto uUIDDto5, LastLiquidityIndDto lastLiquidityIndDto, ExecutionFeesDto executionFeesDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            UUIDDto uUIDDto6 = (i2 & 1) != 0 ? null : uUIDDto;
            this(uUIDDto6, (i2 & 2) != 0 ? null : uUIDDto2, (i2 & 4) != 0 ? null : decimalDto, (i2 & 8) != 0 ? null : decimalDto2, (i2 & 16) != 0 ? null : timeDto, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? null : timeDto2, (i2 & 128) != 0 ? false : z, (i2 & 256) == 0 ? str2 : "", (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? null : nullableStringDto, (i2 & 2048) != 0 ? null : decimalDto3, (i2 & 4096) != 0 ? null : nullableStringDto2, (i2 & 8192) != 0 ? null : nullableStringDto3, (i2 & 16384) != 0 ? null : nullableIntDto, (i2 & 32768) != 0 ? null : nullableStringDto4, (i2 & 65536) != 0 ? null : timeDto3, (i2 & 131072) != 0 ? null : timeDto4, (i2 & 262144) != 0 ? null : decimalDto4, (i2 & 524288) != 0 ? null : decimalDto5, (i2 & 1048576) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 2097152) != 0 ? null : nullableStringDto5, (i2 & 4194304) != 0 ? null : decimalDto6, (i2 & 8388608) != 0 ? null : decimalDto7, (i2 & 16777216) != 0 ? null : decimalDto8, (i2 & 33554432) != 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto, (i2 & 67108864) != 0 ? null : decimalDto9, (i2 & 134217728) != 0 ? null : decimalDto10, (i2 & 268435456) != 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto2, (i2 & 536870912) != 0 ? null : timeDto5, (i2 & 1073741824) != 0 ? null : uUIDDto3, (i2 & Integer.MIN_VALUE) != 0 ? null : uUIDDto4, (i3 & 1) != 0 ? TradeBreakAgentDto.INSTANCE.getZeroValue() : tradeBreakAgentDto, (i3 & 2) != 0 ? null : timeDto6, (i3 & 4) != 0 ? CapacityDto.INSTANCE.getZeroValue() : capacityDto, (i3 & 8) != 0 ? null : decimalDto11, (i3 & 16) != 0 ? null : decimalDto12, (i3 & 32) != 0 ? null : nullableBoolDto, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? null : decimalDto13, (i3 & 256) != 0 ? false : z3, (i3 & 512) != 0 ? null : decimalDto14, (i3 & 1024) != 0 ? null : decimalDto15, (i3 & 2048) != 0 ? null : nullableStringDto6, (i3 & 4096) != 0 ? null : decimalDto16, (i3 & 8192) != 0 ? null : decimalDto17, (i3 & 16384) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i3 & 32768) != 0 ? null : nullableStringDto7, (i3 & 65536) != 0 ? null : decimalDto18, (i3 & 131072) != 0 ? null : nullableStringDto8, (i3 & 262144) != 0 ? null : nullableStringDto9, (i3 & 524288) != 0 ? null : decimalDto19, (i3 & 1048576) != 0 ? null : nullableStringDto10, (i3 & 2097152) != 0 ? null : timeDto7, (i3 & 4194304) != 0 ? null : uUIDDto5, (i3 & 8388608) != 0 ? LastLiquidityIndDto.INSTANCE.getZeroValue() : lastLiquidityIndDto, (i3 & 16777216) != 0 ? null : executionFeesDto);
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        public final DecimalDto getPrice() {
            return this.price;
        }

        public final TimeDto getTimestamp() {
            return this.timestamp;
        }

        public final String getExecution_id() {
            return this.execution_id;
        }

        public final TimeDto getBroken_at() {
            return this.broken_at;
        }

        public final boolean getFill() {
            return this.fill;
        }

        public final String getExec_broker() {
            return this.exec_broker;
        }

        public final int getUpdate_count() {
            return this.update_count;
        }

        public final NullableStringDto getLeg_id() {
            return this.leg_id;
        }

        public final DecimalDto getCommission() {
            return this.commission;
        }

        public final NullableStringDto getCommission_currency() {
            return this.commission_currency;
        }

        public final NullableStringDto getCommission_type() {
            return this.commission_type;
        }

        public final NullableIntDto getLiquidity_ind() {
            return this.liquidity_ind;
        }

        public final NullableStringDto getSettlement_type() {
            return this.settlement_type;
        }

        public final TimeDto getSettlement_date() {
            return this.settlement_date;
        }

        public final TimeDto getTrade_date() {
            return this.trade_date;
        }

        public final DecimalDto getSec_fee() {
            return this.sec_fee;
        }

        public final DecimalDto getTaf_fee() {
            return this.taf_fee;
        }

        public final RouteDto getRoute() {
            return this.route;
        }

        public final NullableStringDto getCl_ord_id() {
            return this.cl_ord_id;
        }

        public final DecimalDto getRounded_notional() {
            return this.rounded_notional;
        }

        public final DecimalDto getNbbo_ask_price() {
            return this.nbbo_ask_price;
        }

        public final DecimalDto getNbbo_ask_quantity() {
            return this.nbbo_ask_quantity;
        }

        public final VenueDto getNbbo_ask_venue() {
            return this.nbbo_ask_venue;
        }

        public final DecimalDto getNbbo_bid_price() {
            return this.nbbo_bid_price;
        }

        public final DecimalDto getNbbo_bid_quantity() {
            return this.nbbo_bid_quantity;
        }

        public final VenueDto getNbbo_bid_venue() {
            return this.nbbo_bid_venue;
        }

        public final TimeDto getNbbo_exchange_timestamp() {
            return this.nbbo_exchange_timestamp;
        }

        public final UUIDDto getPending_execution_id() {
            return this.pending_execution_id;
        }

        public final UUIDDto getPrice_source_execution_id() {
            return this.price_source_execution_id;
        }

        public final TradeBreakAgentDto getTrade_break_agent() {
            return this.trade_break_agent;
        }

        public final TimeDto getProcessed_at() {
            return this.processed_at;
        }

        public final CapacityDto getCapacity() {
            return this.capacity;
        }

        public final DecimalDto getLimit_up_price() {
            return this.limit_up_price;
        }

        public final DecimalDto getLimit_down_price() {
            return this.limit_down_price;
        }

        public final NullableBoolDto is_adjustment() {
            return this.is_adjustment;
        }

        public final boolean getNotional_execution() {
            return this.notional_execution;
        }

        public final DecimalDto getClearing_quantity() {
            return this.clearing_quantity;
        }

        public final boolean getNotional_fill() {
            return this.notional_fill;
        }

        public final DecimalDto getOr_fee() {
            return this.or_fee;
        }

        public final DecimalDto getOcc_fee() {
            return this.occ_fee;
        }

        public final NullableStringDto getTrade_match_id() {
            return this.trade_match_id;
        }

        public final DecimalDto getExchange_fee() {
            return this.exchange_fee;
        }

        public final DecimalDto getBase_currency_traded() {
            return this.base_currency_traded;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final NullableStringDto getPosition_id() {
            return this.position_id;
        }

        public final DecimalDto getNon_denominated_currency_traded() {
            return this.non_denominated_currency_traded;
        }

        public final NullableStringDto getUti() {
            return this.uti;
        }

        public final NullableStringDto getRel_tx_id() {
            return this.rel_tx_id;
        }

        public final DecimalDto getFx_fee_in_bps() {
            return this.fx_fee_in_bps;
        }

        public final NullableStringDto getContra_firm_account() {
            return this.contra_firm_account;
        }

        public final TimeDto getEstimated_next_settlement_time() {
            return this.estimated_next_settlement_time;
        }

        public final UUIDDto getAssociated_fx_execution_id() {
            return this.associated_fx_execution_id;
        }

        public final LastLiquidityIndDto getLast_liquidity_ind() {
            return this.last_liquidity_ind;
        }

        public final ExecutionFeesDto getExecution_fees() {
            return this.execution_fees;
        }
    }

    /* compiled from: ExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ExecutionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/ExecutionDto;", "Lcom/robinhood/rosetta/mainst/Execution;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/ExecutionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ExecutionDto, Execution> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ExecutionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ExecutionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ExecutionDto> getBinaryBase64Serializer() {
            return (KSerializer) ExecutionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Execution> getProtoAdapter() {
            return Execution.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ExecutionDto getZeroValue() {
            return ExecutionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ExecutionDto fromProto(Execution proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID order_id = proto.getOrder_id();
            UUIDDto uUIDDtoFromProto = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            UUID id = proto.getId();
            UUIDDto uUIDDtoFromProto2 = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            Decimal quantity = proto.getQuantity();
            DecimalDto decimalDtoFromProto = quantity != null ? DecimalDto.INSTANCE.fromProto(quantity) : null;
            Decimal price = proto.getPrice();
            DecimalDto decimalDtoFromProto2 = price != null ? DecimalDto.INSTANCE.fromProto(price) : null;
            Time timestamp = proto.getTimestamp();
            TimeDto timeDtoFromProto = timestamp != null ? TimeDto.INSTANCE.fromProto(timestamp) : null;
            String execution_id = proto.getExecution_id();
            Time broken_at = proto.getBroken_at();
            TimeDto timeDtoFromProto2 = broken_at != null ? TimeDto.INSTANCE.fromProto(broken_at) : null;
            boolean fill = proto.getFill();
            String exec_broker = proto.getExec_broker();
            int update_count = proto.getUpdate_count();
            NullableString leg_id = proto.getLeg_id();
            NullableStringDto nullableStringDtoFromProto = leg_id != null ? NullableStringDto.INSTANCE.fromProto(leg_id) : null;
            Decimal commission = proto.getCommission();
            DecimalDto decimalDtoFromProto3 = commission != null ? DecimalDto.INSTANCE.fromProto(commission) : null;
            NullableString commission_currency = proto.getCommission_currency();
            NullableStringDto nullableStringDtoFromProto2 = commission_currency != null ? NullableStringDto.INSTANCE.fromProto(commission_currency) : null;
            NullableString commission_type = proto.getCommission_type();
            NullableStringDto nullableStringDtoFromProto3 = commission_type != null ? NullableStringDto.INSTANCE.fromProto(commission_type) : null;
            NullableInt liquidity_ind = proto.getLiquidity_ind();
            NullableIntDto nullableIntDtoFromProto = liquidity_ind != null ? NullableIntDto.INSTANCE.fromProto(liquidity_ind) : null;
            NullableString settlement_type = proto.getSettlement_type();
            NullableStringDto nullableStringDtoFromProto4 = settlement_type != null ? NullableStringDto.INSTANCE.fromProto(settlement_type) : null;
            Time settlement_date = proto.getSettlement_date();
            TimeDto timeDtoFromProto3 = settlement_date != null ? TimeDto.INSTANCE.fromProto(settlement_date) : null;
            Time trade_date = proto.getTrade_date();
            TimeDto timeDtoFromProto4 = trade_date != null ? TimeDto.INSTANCE.fromProto(trade_date) : null;
            Decimal sec_fee = proto.getSec_fee();
            DecimalDto decimalDtoFromProto4 = sec_fee != null ? DecimalDto.INSTANCE.fromProto(sec_fee) : null;
            Decimal taf_fee = proto.getTaf_fee();
            DecimalDto decimalDtoFromProto5 = taf_fee != null ? DecimalDto.INSTANCE.fromProto(taf_fee) : null;
            RouteDto routeDtoFromProto = RouteDto.INSTANCE.fromProto(proto.getRoute());
            NullableString cl_ord_id = proto.getCl_ord_id();
            NullableStringDto nullableStringDtoFromProto5 = cl_ord_id != null ? NullableStringDto.INSTANCE.fromProto(cl_ord_id) : null;
            Decimal rounded_notional = proto.getRounded_notional();
            DecimalDto decimalDtoFromProto6 = rounded_notional != null ? DecimalDto.INSTANCE.fromProto(rounded_notional) : null;
            Decimal nbbo_ask_price = proto.getNbbo_ask_price();
            DecimalDto decimalDtoFromProto7 = nbbo_ask_price != null ? DecimalDto.INSTANCE.fromProto(nbbo_ask_price) : null;
            Decimal nbbo_ask_quantity = proto.getNbbo_ask_quantity();
            DecimalDto decimalDtoFromProto8 = nbbo_ask_quantity != null ? DecimalDto.INSTANCE.fromProto(nbbo_ask_quantity) : null;
            VenueDto.Companion companion = VenueDto.INSTANCE;
            VenueDto venueDtoFromProto = companion.fromProto(proto.getNbbo_ask_venue());
            Decimal nbbo_bid_price = proto.getNbbo_bid_price();
            DecimalDto decimalDtoFromProto9 = nbbo_bid_price != null ? DecimalDto.INSTANCE.fromProto(nbbo_bid_price) : null;
            Decimal nbbo_bid_quantity = proto.getNbbo_bid_quantity();
            DecimalDto decimalDtoFromProto10 = nbbo_bid_quantity != null ? DecimalDto.INSTANCE.fromProto(nbbo_bid_quantity) : null;
            VenueDto venueDtoFromProto2 = companion.fromProto(proto.getNbbo_bid_venue());
            Time nbbo_exchange_timestamp = proto.getNbbo_exchange_timestamp();
            TimeDto timeDtoFromProto5 = nbbo_exchange_timestamp != null ? TimeDto.INSTANCE.fromProto(nbbo_exchange_timestamp) : null;
            UUID pending_execution_id = proto.getPending_execution_id();
            UUIDDto uUIDDtoFromProto3 = pending_execution_id != null ? UUIDDto.INSTANCE.fromProto(pending_execution_id) : null;
            UUID price_source_execution_id = proto.getPrice_source_execution_id();
            UUIDDto uUIDDtoFromProto4 = price_source_execution_id != null ? UUIDDto.INSTANCE.fromProto(price_source_execution_id) : null;
            TradeBreakAgentDto tradeBreakAgentDtoFromProto = TradeBreakAgentDto.INSTANCE.fromProto(proto.getTrade_break_agent());
            Time processed_at = proto.getProcessed_at();
            TimeDto timeDtoFromProto6 = processed_at != null ? TimeDto.INSTANCE.fromProto(processed_at) : null;
            CapacityDto capacityDtoFromProto = CapacityDto.INSTANCE.fromProto(proto.getCapacity());
            Decimal limit_up_price = proto.getLimit_up_price();
            DecimalDto decimalDtoFromProto11 = limit_up_price != null ? DecimalDto.INSTANCE.fromProto(limit_up_price) : null;
            Decimal limit_down_price = proto.getLimit_down_price();
            DecimalDto decimalDtoFromProto12 = limit_down_price != null ? DecimalDto.INSTANCE.fromProto(limit_down_price) : null;
            NullableBool is_adjustment = proto.getIs_adjustment();
            NullableBoolDto nullableBoolDtoFromProto = is_adjustment != null ? NullableBoolDto.INSTANCE.fromProto(is_adjustment) : null;
            boolean notional_execution = proto.getNotional_execution();
            Decimal clearing_quantity = proto.getClearing_quantity();
            DecimalDto decimalDtoFromProto13 = clearing_quantity != null ? DecimalDto.INSTANCE.fromProto(clearing_quantity) : null;
            boolean notional_fill = proto.getNotional_fill();
            Decimal or_fee = proto.getOr_fee();
            DecimalDto decimalDtoFromProto14 = or_fee != null ? DecimalDto.INSTANCE.fromProto(or_fee) : null;
            Decimal occ_fee = proto.getOcc_fee();
            DecimalDto decimalDtoFromProto15 = occ_fee != null ? DecimalDto.INSTANCE.fromProto(occ_fee) : null;
            NullableString trade_match_id = proto.getTrade_match_id();
            NullableStringDto nullableStringDtoFromProto6 = trade_match_id != null ? NullableStringDto.INSTANCE.fromProto(trade_match_id) : null;
            Decimal exchange_fee = proto.getExchange_fee();
            DecimalDto decimalDtoFromProto16 = exchange_fee != null ? DecimalDto.INSTANCE.fromProto(exchange_fee) : null;
            Decimal base_currency_traded = proto.getBase_currency_traded();
            DecimalDto decimalDtoFromProto17 = base_currency_traded != null ? DecimalDto.INSTANCE.fromProto(base_currency_traded) : null;
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            NullableString position_id = proto.getPosition_id();
            NullableStringDto nullableStringDtoFromProto7 = position_id != null ? NullableStringDto.INSTANCE.fromProto(position_id) : null;
            Decimal non_denominated_currency_traded = proto.getNon_denominated_currency_traded();
            DecimalDto decimalDtoFromProto18 = non_denominated_currency_traded != null ? DecimalDto.INSTANCE.fromProto(non_denominated_currency_traded) : null;
            NullableString uti = proto.getUti();
            NullableStringDto nullableStringDtoFromProto8 = uti != null ? NullableStringDto.INSTANCE.fromProto(uti) : null;
            NullableString rel_tx_id = proto.getRel_tx_id();
            NullableStringDto nullableStringDtoFromProto9 = rel_tx_id != null ? NullableStringDto.INSTANCE.fromProto(rel_tx_id) : null;
            Decimal fx_fee_in_bps = proto.getFx_fee_in_bps();
            DecimalDto decimalDtoFromProto19 = fx_fee_in_bps != null ? DecimalDto.INSTANCE.fromProto(fx_fee_in_bps) : null;
            NullableString contra_firm_account = proto.getContra_firm_account();
            NullableStringDto nullableStringDtoFromProto10 = contra_firm_account != null ? NullableStringDto.INSTANCE.fromProto(contra_firm_account) : null;
            Time estimated_next_settlement_time = proto.getEstimated_next_settlement_time();
            TimeDto timeDtoFromProto7 = estimated_next_settlement_time != null ? TimeDto.INSTANCE.fromProto(estimated_next_settlement_time) : null;
            UUID associated_fx_execution_id = proto.getAssociated_fx_execution_id();
            UUIDDto uUIDDtoFromProto5 = associated_fx_execution_id != null ? UUIDDto.INSTANCE.fromProto(associated_fx_execution_id) : null;
            LastLiquidityIndDto lastLiquidityIndDtoFromProto = LastLiquidityIndDto.INSTANCE.fromProto(proto.getLast_liquidity_ind());
            ExecutionFees execution_fees = proto.getExecution_fees();
            return new ExecutionDto(new Surrogate(uUIDDtoFromProto, uUIDDtoFromProto2, decimalDtoFromProto, decimalDtoFromProto2, timeDtoFromProto, execution_id, timeDtoFromProto2, fill, exec_broker, update_count, nullableStringDtoFromProto, decimalDtoFromProto3, nullableStringDtoFromProto2, nullableStringDtoFromProto3, nullableIntDtoFromProto, nullableStringDtoFromProto4, timeDtoFromProto3, timeDtoFromProto4, decimalDtoFromProto4, decimalDtoFromProto5, routeDtoFromProto, nullableStringDtoFromProto5, decimalDtoFromProto6, decimalDtoFromProto7, decimalDtoFromProto8, venueDtoFromProto, decimalDtoFromProto9, decimalDtoFromProto10, venueDtoFromProto2, timeDtoFromProto5, uUIDDtoFromProto3, uUIDDtoFromProto4, tradeBreakAgentDtoFromProto, timeDtoFromProto6, capacityDtoFromProto, decimalDtoFromProto11, decimalDtoFromProto12, nullableBoolDtoFromProto, notional_execution, decimalDtoFromProto13, notional_fill, decimalDtoFromProto14, decimalDtoFromProto15, nullableStringDtoFromProto6, decimalDtoFromProto16, decimalDtoFromProto17, sideDtoFromProto, nullableStringDtoFromProto7, decimalDtoFromProto18, nullableStringDtoFromProto8, nullableStringDtoFromProto9, decimalDtoFromProto19, nullableStringDtoFromProto10, timeDtoFromProto7, uUIDDtoFromProto5, lastLiquidityIndDtoFromProto, execution_fees != null ? ExecutionFeesDto.INSTANCE.fromProto(execution_fees) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.ExecutionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExecutionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ExecutionDto(null, null, null, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 33554431, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ExecutionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/ExecutionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/ExecutionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ExecutionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.Execution", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ExecutionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ExecutionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ExecutionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ExecutionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.ExecutionDto";
        }
    }
}
