package com.ionspin.kotlin.bignum.integer.base63.array;

import com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic;
import com.ionspin.kotlin.bignum.integer.Quadruple;
import com.ionspin.kotlin.bignum.integer.Sextuple;
import com.ionspin.kotlin.bignum.integer.base32.BigInteger32Arithmetic;
import com.ionspin.kotlin.bignum.integer.base32.BigInteger32Arithmetic$$ExternalSyntheticBackport2;
import com.ionspin.kotlin.bignum.integer.util.DigitUtil;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.supportchat.ChatImageUtils;
import com.squareup.wire.internal.MathMethods;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections._UCollections;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.UStrings;

/* compiled from: BigInteger63Arithmetic.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b$\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002ô\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ2\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ\u0016\u0010\u0018\u001a\u00020\u0015*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b'\u0010\"J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0018\u0010-\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b,\u0010%J\"\u00102\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101J\"\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00101J0\u00109\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108J\"\u0010<\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J0\u0010B\u001a\u00020?2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\"\u0010E\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ0\u0010G\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010\u000bJ\"\u0010I\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010DJ\"\u0010K\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010DJ(\u0010P\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\u0006\u0010M\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\bN\u0010OJ \u0010T\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bS\u0010DJ \u0010W\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\bU\u0010VJ(\u0010Z\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\"\u0010_\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\\H\u0016ø\u0001\u0000¢\u0006\u0004\b^\u0010VJ2\u0010e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070b2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ \u0010i\u001a\u00020\u00042\u0006\u0010f\u001a\u00020\u00042\u0006\u0010g\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bh\u00101J,\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040l2\u0006\u0010j\u001a\u00020\u00042\u0006\u0010k\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bm\u0010nJ\u001a\u0010q\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\bp\u0010*J\u001a\u0010u\u001a\u00020r2\u0006\u0010.\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ\u001a\u0010x\u001a\u00020\u00042\u0006\u0010.\u001a\u00020rH\u0000ø\u0001\u0000¢\u0006\u0004\bv\u0010wJ.\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040l2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\by\u0010nJ\u001c\u0010}\u001a\u00020\u0019*\u00020\u00192\u0006\u0010{\u001a\u00020\u0019H\u0080\u0002¢\u0006\u0004\b|\u0010\u001bJ\u001c\u0010\u007f\u001a\u00020\u0019*\u00020\u00192\u0006\u0010{\u001a\u00020\u0019H\u0080\u0002¢\u0006\u0004\b~\u0010\u001bJ\u001e\u0010\u0081\u0001\u001a\u00020\u0019*\u00020\u00192\u0006\u0010{\u001a\u00020\u0019H\u0080\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u001bJ\u001e\u0010\u0083\u0001\u001a\u00020\u0019*\u00020\u00192\u0006\u0010{\u001a\u00020\u0019H\u0080\u0002¢\u0006\u0005\b\u0082\u0001\u0010\u001bJ\u001f\u0010\u0086\u0001\u001a\u00020\u0019*\u00020\u00192\u0006\u0010/\u001a\u00020\u0007H\u0080\u0004¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001f\u0010\u0088\u0001\u001a\u00020\u0019*\u00020\u00192\u0006\u0010/\u001a\u00020\u0007H\u0080\u0004¢\u0006\u0006\b\u0087\u0001\u0010\u0085\u0001J\"\u0010\u008b\u0001\u001a\u00020\u0019*\u00020\u00192\u0006\u0010.\u001a\u00020\u0004H\u0080\u0004ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J*\u0010\u0090\u0001\u001a\u00020\u00042\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0006\u0010[\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J&\u0010\u0093\u0001\u001a\u00030\u008c\u00012\u0006\u0010.\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J%\u0010\u008b\u0001\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0007\u0010\u0094\u0001\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0095\u0001\u0010DJ!\u0010\u0088\u0001\u001a\u00020\u0004*\u00020\u00042\u0006\u0010/\u001a\u00020\u0007H\u0080\u0004ø\u0001\u0000¢\u0006\u0005\b\u0096\u0001\u00101J!\u0010\u0086\u0001\u001a\u00020\u0004*\u00020\u00042\u0006\u0010/\u001a\u00020\u0007H\u0080\u0004ø\u0001\u0000¢\u0006\u0005\b\u0097\u0001\u00101J \u0010}\u001a\u00020\u0004*\u00020\u00042\u0006\u0010{\u001a\u00020\u0004H\u0080\u0002ø\u0001\u0000¢\u0006\u0005\b\u0098\u0001\u0010DJ \u0010\u007f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010{\u001a\u00020\u0004H\u0080\u0002ø\u0001\u0000¢\u0006\u0005\b\u0099\u0001\u0010DJ!\u0010\u0081\u0001\u001a\u00020\u0004*\u00020\u00042\u0006\u0010{\u001a\u00020\u0004H\u0080\u0002ø\u0001\u0000¢\u0006\u0005\b\u009a\u0001\u0010DJ \u0010}\u001a\u00020\u0004*\u00020\u00042\u0006\u0010{\u001a\u00020\u001fH\u0080\u0002ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010VJ \u0010\u007f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010{\u001a\u00020\u001fH\u0080\u0002ø\u0001\u0000¢\u0006\u0005\b\u009c\u0001\u0010VJ!\u0010\u0081\u0001\u001a\u00020\u0004*\u00020\u00042\u0006\u0010{\u001a\u00020\u001fH\u0080\u0002ø\u0001\u0000¢\u0006\u0005\b\u009d\u0001\u0010VJ!\u0010\u0083\u0001\u001a\u00020\u0004*\u00020\u00042\u0006\u0010{\u001a\u00020\u0004H\u0080\u0002ø\u0001\u0000¢\u0006\u0005\b\u009e\u0001\u0010DJ-\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040l*\u00020\u00042\u0006\u0010{\u001a\u00020\u0004H\u0080\u0004ø\u0001\u0000¢\u0006\u0005\b\u009f\u0001\u0010nJ!\u0010¢\u0001\u001a\u00020\u0007*\u00020\u00042\u0006\u0010{\u001a\u00020\u0004H\u0080\u0002ø\u0001\u0000¢\u0006\u0005\b¡\u0001\u0010;J\"\u0010¢\u0001\u001a\u00020\u0007*\u00020\u00042\u0006\u0010{\u001a\u00020\u001fH\u0080\u0002ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0018\u0010¦\u0001\u001a\u00020r*\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0005\b¥\u0001\u0010tJ\u0018\u0010¨\u0001\u001a\u00020\u0004*\u00020rH\u0000ø\u0001\u0000¢\u0006\u0005\b§\u0001\u0010wJ\u001e\u0010¬\u0001\u001a\u00020\u00042\u0007\u0010©\u0001\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001f\u0010±\u0001\u001a\u00020\u00042\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001f\u0010¶\u0001\u001a\u00020\u00042\b\u0010³\u0001\u001a\u00030²\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001f\u0010»\u0001\u001a\u00020\u00042\b\u0010¸\u0001\u001a\u00030·\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001J!\u0010¾\u0001\u001a\u00020\u00042\u0007\u0010¼\u0001\u001a\u00020\\H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b½\u0001\u0010«\u0001J!\u0010Á\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÀ\u0001\u0010°\u0001J\"\u0010Å\u0001\u001a\u00020\u00042\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÄ\u0001\u0010µ\u0001J\"\u0010É\u0001\u001a\u00020\u00042\b\u0010Ç\u0001\u001a\u00030Æ\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÈ\u0001\u0010º\u0001R \u0010Ë\u0001\u001a\u00030Ê\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R%\u0010Ï\u0001\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ì\u0001\u001a\u0006\bÐ\u0001\u0010Î\u0001R%\u0010Ñ\u0001\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ì\u0001\u001a\u0006\bÒ\u0001\u0010Î\u0001R%\u0010Ó\u0001\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ì\u0001\u001a\u0006\bÔ\u0001\u0010Î\u0001R%\u0010Õ\u0001\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ì\u0001\u001a\u0006\bÖ\u0001\u0010Î\u0001R\"\u0010×\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\b×\u0001\u0010Ì\u0001\u001a\u0006\bØ\u0001\u0010Î\u0001R\u001f\u0010Ù\u0001\u001a\u00020\u00078\u0016X\u0096D¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u001f\u0010Ý\u0001\u001a\u00020\u00078\u0006X\u0086D¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Ú\u0001\u001a\u0006\bÞ\u0001\u0010Ü\u0001R%\u0010ß\u0001\u001a\u00020\u001f8\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001R\"\u0010ã\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bã\u0001\u0010Ì\u0001\u001a\u0006\bä\u0001\u0010Î\u0001R%\u0010å\u0001\u001a\u00020\u001f8\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bå\u0001\u0010à\u0001\u001a\u0006\bæ\u0001\u0010â\u0001R%\u0010ç\u0001\u001a\u00020\u001f8\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bç\u0001\u0010à\u0001\u001a\u0006\bè\u0001\u0010â\u0001R%\u0010é\u0001\u001a\u00020\u001f8\u0006X\u0086Dø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\bé\u0001\u0010à\u0001\u001a\u0006\bê\u0001\u0010â\u0001R\u001c\u0010ë\u0001\u001a\u00020\u00198\u0006¢\u0006\u0010\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001R#\u0010ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040ï\u00018\u0006¢\u0006\u0010\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006õ\u0001"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic;", "Lcom/ionspin/kotlin/bignum/integer/BigIntegerArithmetic;", "<init>", "()V", "Lkotlin/ULongArray;", "first", "second", "", "firstCorrectedSize", "secondCorrectedSize", "multiplyWithCorrectedSize-mwLU0fg", "([J[JII)[J", "multiplyWithCorrectedSize", "firstCorrectedSizeStart", "secondCorrectedSizeStart", "basecaseMultiplyWithCorrectedSize-mwLU0fg", "basecaseMultiplyWithCorrectedSize", "firstUnsigned", "secondUnsigned", "karatsubaMultiplyWithCorrectedSizes-mwLU0fg", "karatsubaMultiplyWithCorrectedSizes", "", "isZero-QwZRm1k", "([J)Z", "isZero", "Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;", "signedAdd", "(Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;)Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;", "signedSubtract", "signedMultiply", "signedDivide", "Lkotlin/ULong;", "value", "numberOfLeadingZerosInAWord-VKZWuLQ", "(J)I", "numberOfLeadingZerosInAWord", "bitLength-QwZRm1k", "([J)I", "bitLength", "bitLength-VKZWuLQ", "bigInteger", "removeLeadingZeros-JIhQxVY", "([J)[J", "removeLeadingZeros", "countLeadingZeroWords-QwZRm1k", "countLeadingZeroWords", "operand", "places", "shiftLeft-GERUpyg", "([JI)[J", "shiftLeft", "shiftRight-GERUpyg", "shiftRight", "firstStart", "secondStart", "compareWithStartIndexes-MccmUSY", "([J[JII)I", "compareWithStartIndexes", "compare-GR1PJdc", "([J[J)I", "compare", "resultArray", "resultArrayStart", "", "baseAddIntoArray-KsfQWN0", "([JI[J[J)V", "baseAddIntoArray", "add-j68ebKY", "([J[J)[J", "add", "subtractWithStartIndexes-mwLU0fg", "subtractWithStartIndexes", "subtract-j68ebKY", "subtract", "multiply-j68ebKY", "multiply", "original", "numberOfWords", "extendULongArray-9R_UfW4", "([JIJ)[J", "extendULongArray", "firstUnchecked", "secondUnchecked", "toomCook3Multiply-j68ebKY", "toomCook3Multiply", "baseMultiply-ss9iZGw", "([JJ)[J", "baseMultiply", "baseMultiplyWithCorrectedSize-_EW1lsA", "([JJI)[J", "baseMultiplyWithCorrectedSize", "base", "", "exponent", "pow-GERUpyg", "pow", Card.Icon.DIVIDEND, "divisor", "Lkotlin/Triple;", "normalize-GR1PJdc", "([J[J)Lkotlin/Triple;", "normalize", "remainderNormalized", "normalizationShift", "denormalize-GERUpyg", "denormalize", "unnormalizedDividend", "unnormalizedDivisor", "Lkotlin/Pair;", "baseDivide-GR1PJdc", "([J[J)Lkotlin/Pair;", "baseDivide", "convertTo64BitRepresentation-JIhQxVY$bignum", "convertTo64BitRepresentation", "Lkotlin/UIntArray;", "convertTo32BitRepresentation-kqpWZOw$bignum", "([J)[I", "convertTo32BitRepresentation", "convertFrom32BitRepresentation-ehPNNiw$bignum", "([I)[J", "convertFrom32BitRepresentation", "divide-GR1PJdc", "divide", "other", "plus$bignum", "plus", "minus$bignum", "minus", "times$bignum", "times", "div$bignum", "div", "shr$bignum", "(Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;I)Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;", "shr", "shl$bignum", "shl", "and-SIFponk$bignum", "(Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;[J)Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;", "and", "", InquiryField.FloatField.TYPE2, "parseForBase-_llDaS8", "(Ljava/lang/String;I)[J", "parseForBase", "toString-tBf0fek", "([JI)Ljava/lang/String;", "toString", "mask", "and-j68ebKY", "shl-GERUpyg$bignum", "shr-GERUpyg$bignum", "plus-j68ebKY$bignum", "minus-j68ebKY$bignum", "times-j68ebKY$bignum", "plus-ss9iZGw$bignum", "minus-ss9iZGw$bignum", "times-ss9iZGw$bignum", "div-j68ebKY$bignum", "divrem-GR1PJdc$bignum", "divrem", "compareTo-GR1PJdc$bignum", "compareTo", "compareTo-3yFGk1Y$bignum", "([JJ)I", "to32Bit-kqpWZOw$bignum", "to32Bit", "from32Bit-ehPNNiw$bignum", "from32Bit", "uLong", "fromULong--GCcj4Q", "(J)[J", "fromULong", "Lkotlin/UInt;", "uInt", "fromUInt-kOc6_GI", "(I)[J", "fromUInt", "Lkotlin/UShort;", "uShort", "fromUShort-jOPi9CM", "(S)[J", "fromUShort", "Lkotlin/UByte;", "uByte", "fromUByte-ab45Ak8", "(B)[J", "fromUByte", "long", "fromLong-DHQ6RzY", "fromLong", "int", "fromInt-DHQ6RzY", "fromInt", "", "short", "fromShort-DHQ6RzY", "fromShort", "", "byte", "fromByte-DHQ6RzY", "fromByte", "", "_emitLongArray", "[J", "get_emitLongArray", "()[J", "ZERO", "getZERO-Y2RjT0g", "ONE", "getONE-Y2RjT0g", "TWO", "getTWO-Y2RjT0g", "TEN", "getTEN-Y2RjT0g", "reciprocalOf3In2ToThePowerOf63", "getReciprocalOf3In2ToThePowerOf63-Y2RjT0g", "basePowerOfTwo", "I", "getBasePowerOfTwo", "()I", "wordSizeInBits", "getWordSizeInBits", "baseMask", "J", "getBaseMask-s-VKNKU", "()J", "baseMaskArray", "getBaseMaskArray-Y2RjT0g", "lowMask", "getLowMask-s-VKNKU", "highMask", "getHighMask-s-VKNKU", "overflowMask", "getOverflowMask-s-VKNKU", "SIGNED_POSITIVE_TWO", "Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;", "getSIGNED_POSITIVE_TWO", "()Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;", "", "powersOf10", "[Lkotlin/ULongArray;", "getPowersOf10", "()[Lkotlin/ULongArray;", "SignedULongArray", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class BigInteger63Arithmetic implements BigIntegerArithmetic {
    public static final BigInteger63Arithmetic INSTANCE;
    private static final long[] ONE;
    private static final SignedULongArray SIGNED_POSITIVE_TWO;
    private static final long[] TEN;
    private static final long[] TWO;
    private static final long[] ZERO;
    private static final long[] _emitLongArray;
    private static final long baseMask;
    private static final long[] baseMaskArray;
    private static final int basePowerOfTwo;
    private static final long highMask;
    private static final long lowMask;
    private static final long overflowMask;
    private static final ULongArray[] powersOf10;
    private static final long[] reciprocalOf3In2ToThePowerOf63;
    private static final int wordSizeInBits;

    private BigInteger63Arithmetic() {
    }

    static {
        BigInteger63Arithmetic bigInteger63Arithmetic = new BigInteger63Arithmetic();
        INSTANCE = bigInteger63Arithmetic;
        _emitLongArray = new long[0];
        ZERO = new long[]{0};
        ONE = new long[]{1};
        TWO = new long[]{2};
        TEN = new long[]{10};
        reciprocalOf3In2ToThePowerOf63 = new long[]{3074457345618258603L};
        basePowerOfTwo = 63;
        wordSizeInBits = 63;
        baseMask = Long.MAX_VALUE;
        baseMaskArray = new long[]{Long.MAX_VALUE};
        lowMask = 4294967295L;
        highMask = 9223372032559808512L;
        overflowMask = Long.MIN_VALUE;
        SIGNED_POSITIVE_TWO = new SignedULongArray(bigInteger63Arithmetic.mo9386getTWOY2RjT0g(), true, null);
        powersOf10 = new ULongArray[]{ULongArray.m28611boximpl(new long[]{1}), ULongArray.m28611boximpl(new long[]{10}), ULongArray.m28611boximpl(new long[]{100}), ULongArray.m28611boximpl(new long[]{1000}), ULongArray.m28611boximpl(new long[]{10000}), ULongArray.m28611boximpl(new long[]{100000}), ULongArray.m28611boximpl(new long[]{1000000}), ULongArray.m28611boximpl(new long[]{ChatImageUtils.IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES}), ULongArray.m28611boximpl(new long[]{100000000}), ULongArray.m28611boximpl(new long[]{MathMethods.NANOS_PER_SECOND}), ULongArray.m28611boximpl(new long[]{10000000000L}), ULongArray.m28611boximpl(new long[]{100000000000L}), ULongArray.m28611boximpl(new long[]{1000000000000L}), ULongArray.m28611boximpl(new long[]{10000000000000L}), ULongArray.m28611boximpl(new long[]{100000000000000L}), ULongArray.m28611boximpl(new long[]{1000000000000000L}), ULongArray.m28611boximpl(new long[]{10000000000000000L}), ULongArray.m28611boximpl(new long[]{100000000000000000L}), ULongArray.m28611boximpl(new long[]{1000000000000000000L}), ULongArray.m28611boximpl(new long[]{776627963145224192L, 1}), ULongArray.m28611boximpl(new long[]{7766279631452241920L, 10}), ULongArray.m28611boximpl(new long[]{3875820019684212736L, 108}), ULongArray.m28611boximpl(new long[]{1864712049423024128L, 1084}), ULongArray.m28611boximpl(new long[]{200376420520689664L, 10842}), ULongArray.m28611boximpl(new long[]{2003764205206896640L, 108420}), ULongArray.m28611boximpl(new long[]{1590897978359414784L, 1084202}), ULongArray.m28611boximpl(new long[]{6685607746739372032L, 10842021}), ULongArray.m28611boximpl(new long[]{2292473209410289664L, 108420217}), ULongArray.m28611boximpl(new long[]{4477988020393345024L, 1084202172}), ULongArray.m28611boximpl(new long[]{7886392056514347008L, 10842021724L}), ULongArray.m28611boximpl(new long[]{5076944270305263616L, 108420217248L}), ULongArray.m28611boximpl(new long[]{4652582518778757120L, 1084202172485L}), ULongArray.m28611boximpl(new long[]{408965003513692160L, 10842021724855L}), ULongArray.m28611boximpl(new long[]{4089650035136921600L, 108420217248550L}), ULongArray.m28611boximpl(new long[]{4003012203950112768L, 1084202172485504L}), ULongArray.m28611boximpl(new long[]{3136633892082024448L, 10842021724855044L}), ULongArray.m28611boximpl(new long[]{3696222810255917056L, 108420217248550443L}), ULongArray.m28611boximpl(new long[]{68739955140067328L, 1084202172485504434L}), ULongArray.m28611boximpl(new long[]{687399551400673280L, 1618649688000268532L, 1}), ULongArray.m28611boximpl(new long[]{6873995514006732800L, 6963124843147909512L, 11}), ULongArray.m28611boximpl(new long[]{4176350882083897344L, 5067644173495664471L, 117}), ULongArray.m28611boximpl(new long[]{4870020673419870208L, 4559581550682765674L, 1175}), ULongArray.m28611boximpl(new long[]{2583346549924823040L, 8702327359408553513L, 11754}), ULongArray.m28611boximpl(new long[]{7386721425538678784L, 4012925262392552860L, 117549}), ULongArray.m28611boximpl(new long[]{80237960548581376L, 3235764476506425376L, 1175494}), ULongArray.m28611boximpl(new long[]{802379605485813760L, 4687528654499926336L, 11754943}), ULongArray.m28611boximpl(new long[]{8023796054858137600L, 758426360725384320L, 117549435}), ULongArray.m28611boximpl(new long[]{6450984253743169536L, 7584263607253843208L, 1175494350}), ULongArray.m28611boximpl(new long[]{9169610316303040512L, 2055659777700225622L, 11754943508L}), ULongArray.m28611boximpl(new long[]{8685754831337422848L, 2109853703292704613L, 117549435082L}), ULongArray.m28611boximpl(new long[]{3847199981681246208L, 2651792959217494523L, 1175494350822L}), ULongArray.m28611boximpl(new long[]{1578511669393358848L, 8071185518465393618L, 11754943508222L}), ULongArray.m28611boximpl(new long[]{6561744657078812672L, 6924878889815729717L, 117549435082228L}), ULongArray.m28611boximpl(new long[]{1053842312804696064L, 4685184640173866521L, 1175494350822287L}), ULongArray.m28611boximpl(new long[]{1315051091192184832L, 734986217464786171L, 11754943508222875L}), ULongArray.m28611boximpl(new long[]{3927138875067072512L, 7349862174647861711L, 117549435082228750L}), ULongArray.m28611boximpl(new long[]{2377900603251621888L, 8935017488495186458L, 1175494350822287507L}), ULongArray.m28611boximpl(new long[]{5332261958806667264L, 6339826553258882310L, 2531571471368099271L, 1}), ULongArray.m28611boximpl(new long[]{7205759403792793600L, 8058033311460168257L, 6868970639971441100L, 12}), ULongArray.m28611boximpl(new long[]{7493989779944505344L, 6793356819763476113L, 4126102141730980352L, 127}), ULongArray.m28611boximpl(new long[]{1152921504606846976L, 3369963939651330482L, 4367533269890700295L, 1274}), ULongArray.m28611boximpl(new long[]{2305843009213693952L, 6029523285948977397L, 6781844551487899721L, 12744}), ULongArray.m28611boximpl(new long[]{4611686018427387904L, 4955000638361119124L, 3254841256895566560L, 127447}), ULongArray.m28611boximpl(new long[]{0, 3433146199337312205L, 4878296458391338181L, 1274473}), ULongArray.m28611boximpl(new long[]{0, 6661345882808794626L, 2666104399639502773L, 12744735}), ULongArray.m28611boximpl(new long[]{0, 2049854570104515604L, 8214299922685476121L, 127447352}), ULongArray.m28611boximpl(new long[]{0, 2051801627335604424L, 8356022932016554748L, 1274473528}), ULongArray.m28611boximpl(new long[]{0, 2071272199646492624L, 549880988472565210L, 12744735289L}), ULongArray.m28611boximpl(new long[]{0, 2265977922755374624L, 5498809884725652102L, 127447352890L}), ULongArray.m28611boximpl(new long[]{0, 4213035153844194624L, 8871238662982641982L, 1274473528905L}), ULongArray.m28611boximpl(new long[]{0, 5236863391022843008L, 5702038298133437552L, 12744735289059L}), ULongArray.m28611boximpl(new long[]{0, 6251773725954551040L, 1680150760205720677L, 127447352890596L}), ULongArray.m28611boximpl(new long[]{0, 7177505038416855552L, 7578135565202430968L, 1274473528905961L}), ULongArray.m28611boximpl(new long[]{0, 7211446126185124864L, 1994379357186103223L, 12744735289059618L}), ULongArray.m28611boximpl(new long[]{0, 7550857003867817984L, 1497049498151480621L, 127447352890596182L}), ULongArray.m28611boximpl(new long[]{0, 1721593743839973376L, 5747122944660030410L, 1274473528905961821L}), ULongArray.m28611boximpl(new long[]{0, 7992565401544957952L, 2130997225471649253L, 3521363252204842408L, 1}), ULongArray.m28611boximpl(new long[]{0, 6138677720611373056L, 2863228181006940922L, 7543516411484096658L, 13}), ULongArray.m28611boximpl(new long[]{0, 6046544984985075712L, 962165699505081802L, 1648187820002760119L, 138}), ULongArray.m28611boximpl(new long[]{0, 5125217628722102272L, 398284958196042218L, 7258506163172825383L, 1381}), ULongArray.m28611boximpl(new long[]{0, 5135316102947143680L, 3982849581960422185L, 8021457373744823174L, 13817}), ULongArray.m28611boximpl(new long[]{0, 5236300845197557760L, 2935007672185118623L, 6427597442610025280L, 138178}), ULongArray.m28611boximpl(new long[]{0, 6246148267701698560L, 1679960611286858811L, 8935742204971597955L, 1381786}), ULongArray.m28611boximpl(new long[]{0, 7121250455888330752L, 7576234076013812308L, 6347073718022997279L, 13817869}), ULongArray.m28611boximpl(new long[]{0, 6648900300899876864L, 1975364465299916623L, 8130504959101317950L, 138178696}), ULongArray.m28611boximpl(new long[]{0, 1925398751015337984L, 1306900579289614621L, 7518073296174973038L, 1381786968}), ULongArray.m28611boximpl(new long[]{0, 807243436443828224L, 3845633756041370404L, 1393756666911523917L, 13817869688L}), ULongArray.m28611boximpl(new long[]{0, 8072434364438282240L, 1562849412994600808L, 4714194632260463366L, 138178696881L}), ULongArray.m28611boximpl(new long[]{0, 6937367349544615936L, 6405122093091232280L, 1025086138330754621L, 1381786968815L}), ULongArray.m28611boximpl(new long[]{0, 4810069237462728704L, 8710988709783667959L, 1027489346452770408L, 13817869688151L}), ULongArray.m28611boximpl(new long[]{0, 1983832190353408000L, 4099538766143697323L, 1051521427672928281L, 138178696881511L}), ULongArray.m28611boximpl(new long[]{0, 1391577829824528384L, 4101899514017870000L, 1291842239874507006L, 1381786968815111L}), ULongArray.m28611boximpl(new long[]{0, 4692406261390508032L, 4125506992759596769L, 3695050361890294256L, 13817869688151111L}), ULongArray.m28611boximpl(new long[]{0, 807202429631201280L, 4361581780176864463L, 57015471483839332L, 138178696881511114L}), ULongArray.m28611boximpl(new long[]{0, 8072024296312012800L, 6722329654349541398L, 570154714838393324L, 1381786968815111140L}), ULongArray.m28611boximpl(new long[]{0, 6933266668281921536L, 2659692285511983332L, 5701547148383933247L, 4594497651296335592L, 1}), ULongArray.m28611boximpl(new long[]{0, 4769062424835784704L, 8150178781410281711L, 1675239262710677624L, 9051488365544252694L, 14}), ULongArray.m28611boximpl(new long[]{0, 1573764064083968000L, 7714811519264610651L, 7529020590252000440L, 7504535323749544669L, 149}), ULongArray.m28611boximpl(new long[]{0, 6514268603984904192L, 3361138897807900047L, 1503229607681797944L, 1258376942657240234L, 1498}), ULongArray.m28611boximpl(new long[]{0, 579081781865611264L, 5941272867514673053L, 5808924039963203635L, 3360397389717626533L, 14981}), ULongArray.m28611boximpl(new long[]{0, 5790817818656112640L, 4072496454018075682L, 2749008178503381508L, 5933857786611937912L, 149813})};
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: getZERO-Y2RjT0g */
    public long[] mo9387getZEROY2RjT0g() {
        return ZERO;
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: getONE-Y2RjT0g */
    public long[] mo9384getONEY2RjT0g() {
        return ONE;
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: getTWO-Y2RjT0g */
    public long[] mo9386getTWOY2RjT0g() {
        return TWO;
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: getTEN-Y2RjT0g */
    public long[] mo9385getTENY2RjT0g() {
        return TEN;
    }

    public int getBasePowerOfTwo() {
        return basePowerOfTwo;
    }

    /* renamed from: numberOfLeadingZerosInAWord-VKZWuLQ, reason: not valid java name */
    public int m9444numberOfLeadingZerosInAWordVKZWuLQ(long value) {
        int i;
        long jM28605constructorimpl = ULong.m28605constructorimpl(value >>> 32);
        if (jM28605constructorimpl != 0) {
            i = 31;
            value = jM28605constructorimpl;
        } else {
            i = 63;
        }
        long jM28605constructorimpl2 = ULong.m28605constructorimpl(value >>> 16);
        if (jM28605constructorimpl2 != 0) {
            i -= 16;
            value = jM28605constructorimpl2;
        }
        long jM28605constructorimpl3 = ULong.m28605constructorimpl(value >>> 8);
        if (jM28605constructorimpl3 != 0) {
            i -= 8;
            value = jM28605constructorimpl3;
        }
        long jM28605constructorimpl4 = ULong.m28605constructorimpl(value >>> 4);
        if (jM28605constructorimpl4 != 0) {
            i -= 4;
            value = jM28605constructorimpl4;
        }
        long jM28605constructorimpl5 = ULong.m28605constructorimpl(value >>> 2);
        if (jM28605constructorimpl5 != 0) {
            i -= 2;
            value = jM28605constructorimpl5;
        }
        return ULong.m28605constructorimpl(value >>> 1) != 0 ? i - 2 : i - ((int) value);
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: bitLength-QwZRm1k */
    public int mo9373bitLengthQwZRm1k(long[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (m9419isZeroQwZRm1k(value)) {
            return 0;
        }
        int iM28619getSizeimpl = (ULongArray.m28619getSizeimpl(value) - m9435countLeadingZeroWordsQwZRm1k(value)) - 1;
        return m9428bitLengthVKZWuLQ(ULongArray.m28618getsVKNKU(value, iM28619getSizeimpl)) + (iM28619getSizeimpl * 63);
    }

    /* renamed from: bitLength-VKZWuLQ, reason: not valid java name */
    public final int m9428bitLengthVKZWuLQ(long value) {
        return 63 - m9444numberOfLeadingZerosInAWordVKZWuLQ(value);
    }

    /* renamed from: removeLeadingZeros-JIhQxVY, reason: not valid java name */
    public final long[] m9447removeLeadingZerosJIhQxVY(long[] bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(bigInteger) - m9435countLeadingZeroWordsQwZRm1k(bigInteger);
        if (iM28619getSizeimpl == 0) {
            return mo9387getZEROY2RjT0g();
        }
        return ULongArray.m28619getSizeimpl(bigInteger) == iM28619getSizeimpl ? bigInteger : ULongArray.m28613constructorimpl(ArraysKt.copyOfRange(bigInteger, 0, iM28619getSizeimpl));
    }

    /* renamed from: countLeadingZeroWords-QwZRm1k, reason: not valid java name */
    public final int m9435countLeadingZeroWordsQwZRm1k(long[] bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(bigInteger) - 1;
        if (iM28619getSizeimpl <= 0) {
            return 0;
        }
        long jM28618getsVKNKU = ULongArray.m28618getsVKNKU(bigInteger, iM28619getSizeimpl);
        while (jM28618getsVKNKU == 0 && iM28619getSizeimpl > 0) {
            iM28619getSizeimpl--;
            jM28618getsVKNKU = ULongArray.m28618getsVKNKU(bigInteger, iM28619getSizeimpl);
        }
        if (ULongArray.m28618getsVKNKU(bigInteger, iM28619getSizeimpl) == 0) {
            iM28619getSizeimpl--;
        }
        return (ULongArray.m28619getSizeimpl(bigInteger) - iM28619getSizeimpl) - 1;
    }

    /* renamed from: shiftLeft-GERUpyg, reason: not valid java name */
    public long[] m9448shiftLeftGERUpyg(long[] operand, int places) {
        long jM28605constructorimpl;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (m9419isZeroQwZRm1k(operand) || places == 0) {
            return operand;
        }
        if (ULongArray.m28621isEmptyimpl(operand)) {
            return mo9387getZEROY2RjT0g();
        }
        int iM9435countLeadingZeroWordsQwZRm1k = m9435countLeadingZeroWordsQwZRm1k(operand);
        if (ULongArray.m28619getSizeimpl(operand) == iM9435countLeadingZeroWordsQwZRm1k) {
            return mo9387getZEROY2RjT0g();
        }
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(operand) - iM9435countLeadingZeroWordsQwZRm1k;
        int iM9444numberOfLeadingZerosInAWordVKZWuLQ = m9444numberOfLeadingZerosInAWordVKZWuLQ(ULongArray.m28618getsVKNKU(operand, iM28619getSizeimpl - 1));
        int basePowerOfTwo2 = places / getBasePowerOfTwo();
        int basePowerOfTwo3 = places % getBasePowerOfTwo();
        int i = basePowerOfTwo3 > iM9444numberOfLeadingZerosInAWordVKZWuLQ ? basePowerOfTwo2 + 1 : basePowerOfTwo2;
        int i2 = 0;
        if (basePowerOfTwo3 == 0) {
            int i3 = iM28619getSizeimpl + i;
            long[] jArr = new long[i3];
            while (i2 < i3) {
                jArr[i2] = (i2 < 0 || i2 >= basePowerOfTwo2) ? ULongArray.m28618getsVKNKU(operand, i2 - basePowerOfTwo2) : 0L;
                i2++;
            }
            return ULongArray.m28613constructorimpl(jArr);
        }
        int i4 = iM28619getSizeimpl + i;
        long[] jArr2 = new long[i4];
        while (i2 < i4) {
            if (i2 >= 0 && i2 < basePowerOfTwo2) {
                jM28605constructorimpl = 0;
            } else if (i2 == basePowerOfTwo2) {
                jM28605constructorimpl = ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i2 - basePowerOfTwo2) << basePowerOfTwo3) & baseMask);
            } else {
                int i5 = basePowerOfTwo2 + 1;
                if (i2 < iM28619getSizeimpl + basePowerOfTwo2 && i5 <= i2) {
                    int i6 = i2 - basePowerOfTwo2;
                    jM28605constructorimpl = ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i6) << basePowerOfTwo3) & baseMask) | ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i6 - 1) >>> (INSTANCE.getBasePowerOfTwo() - basePowerOfTwo3)));
                } else if (i2 == i4 - 1) {
                    jM28605constructorimpl = ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i2 - i) >>> (INSTANCE.getBasePowerOfTwo() - basePowerOfTwo3));
                } else {
                    throw new RuntimeException("Invalid case " + i2);
                }
            }
            jArr2[i2] = jM28605constructorimpl;
            i2++;
        }
        return ULongArray.m28613constructorimpl(jArr2);
    }

    /* renamed from: shiftRight-GERUpyg, reason: not valid java name */
    public long[] m9449shiftRightGERUpyg(long[] operand, int places) {
        long jM28605constructorimpl;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (ULongArray.m28621isEmptyimpl(operand) || places == 0) {
            return operand;
        }
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(operand) - m9435countLeadingZeroWordsQwZRm1k(operand);
        int basePowerOfTwo2 = places % getBasePowerOfTwo();
        int basePowerOfTwo3 = places / getBasePowerOfTwo();
        if (basePowerOfTwo3 >= iM28619getSizeimpl) {
            return mo9387getZEROY2RjT0g();
        }
        if (basePowerOfTwo2 == 0) {
            ULongArray.m28613constructorimpl(ArraysKt.copyOfRange(operand, iM28619getSizeimpl - basePowerOfTwo3, iM28619getSizeimpl));
        }
        if (iM28619getSizeimpl > 1 && iM28619getSizeimpl - basePowerOfTwo3 == 1) {
            return new long[]{ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, iM28619getSizeimpl - 1) >>> basePowerOfTwo2)};
        }
        int i = iM28619getSizeimpl - basePowerOfTwo3;
        if (i == 0) {
            return mo9387getZEROY2RjT0g();
        }
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 >= 0 && i2 < (iM28619getSizeimpl - 1) - basePowerOfTwo3) {
                int i3 = i2 + basePowerOfTwo3;
                jM28605constructorimpl = ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i3) >>> basePowerOfTwo2) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i3 + 1) << (INSTANCE.getBasePowerOfTwo() - basePowerOfTwo2)) & baseMask));
            } else if (i2 == (iM28619getSizeimpl - 1) - basePowerOfTwo3) {
                jM28605constructorimpl = ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i2 + basePowerOfTwo3) >>> basePowerOfTwo2);
            } else {
                throw new RuntimeException("Invalid case " + i2);
            }
            jArr[i2] = jM28605constructorimpl;
        }
        return ULongArray.m28613constructorimpl(jArr);
    }

    /* renamed from: compareWithStartIndexes-MccmUSY, reason: not valid java name */
    public final int m9431compareWithStartIndexesMccmUSY(long[] first, long[] second, int firstStart, int secondStart) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (firstStart > secondStart) {
            return 1;
        }
        if (secondStart > firstStart) {
            return -1;
        }
        int i = firstStart - 1;
        while (true) {
            if (i < 0) {
                z = false;
                z2 = true;
                break;
            }
            if (Long.compare(ULongArray.m28618getsVKNKU(first, i) ^ Long.MIN_VALUE, ULongArray.m28618getsVKNKU(second, i) ^ Long.MIN_VALUE) > 0) {
                z2 = false;
                z = true;
                break;
            }
            if (Long.compare(ULongArray.m28618getsVKNKU(first, i) ^ Long.MIN_VALUE, ULongArray.m28618getsVKNKU(second, i) ^ Long.MIN_VALUE) < 0) {
                z2 = false;
                z = false;
                break;
            }
            i--;
        }
        if (z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: compare-GR1PJdc */
    public int mo9374compareGR1PJdc(long[] first, long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return m9431compareWithStartIndexesMccmUSY(first, second, ULongArray.m28619getSizeimpl(first) - m9435countLeadingZeroWordsQwZRm1k(first), ULongArray.m28619getSizeimpl(second) - m9435countLeadingZeroWordsQwZRm1k(second));
    }

    /* renamed from: baseAddIntoArray-KsfQWN0, reason: not valid java name */
    public final void m9424baseAddIntoArrayKsfQWN0(long[] resultArray, int resultArrayStart, long[] first, long[] second) {
        Sextuple sextuple;
        Intrinsics.checkNotNullParameter(resultArray, "resultArray");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int i = 0;
        if (m9419isZeroQwZRm1k(first)) {
            ArraysKt.copyInto(first, resultArray, resultArrayStart, 0, ULongArray.m28619getSizeimpl(first));
            return;
        }
        if (m9419isZeroQwZRm1k(second)) {
            ArraysKt.copyInto(second, resultArray, resultArrayStart, 0, ULongArray.m28619getSizeimpl(second));
            return;
        }
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(first) - m9435countLeadingZeroWordsQwZRm1k(first);
        int iM28619getSizeimpl2 = ULongArray.m28619getSizeimpl(second) - m9435countLeadingZeroWordsQwZRm1k(second);
        if (iM28619getSizeimpl > iM28619getSizeimpl2) {
            sextuple = new Sextuple(Integer.valueOf(ULongArray.m28619getSizeimpl(first)), Integer.valueOf(ULongArray.m28619getSizeimpl(second)), ULongArray.m28611boximpl(first), ULongArray.m28611boximpl(second), Integer.valueOf(iM28619getSizeimpl), Integer.valueOf(iM28619getSizeimpl2));
        } else {
            sextuple = new Sextuple(Integer.valueOf(ULongArray.m28619getSizeimpl(second)), Integer.valueOf(ULongArray.m28619getSizeimpl(first)), ULongArray.m28611boximpl(second), ULongArray.m28611boximpl(first), Integer.valueOf(iM28619getSizeimpl2), Integer.valueOf(iM28619getSizeimpl));
        }
        int iIntValue = ((Number) sextuple.component1()).intValue();
        ((Number) sextuple.component2()).intValue();
        long[] storage = ((ULongArray) sextuple.component3()).getStorage();
        long[] storage2 = ((ULongArray) sextuple.component4()).getStorage();
        int iIntValue2 = ((Number) sextuple.component5()).intValue();
        int iIntValue3 = ((Number) sextuple.component6()).intValue();
        long jM28605constructorimpl = 0;
        while (i < iIntValue3) {
            long jM28605constructorimpl2 = ULong.m28605constructorimpl(ULong.m28605constructorimpl(jM28605constructorimpl + ULongArray.m28618getsVKNKU(storage, i)) + ULongArray.m28618getsVKNKU(storage2, i));
            ULongArray.m28623setk8EXiF4(resultArray, i + resultArrayStart, ULong.m28605constructorimpl(baseMask & jM28605constructorimpl2));
            jM28605constructorimpl = ULong.m28605constructorimpl(jM28605constructorimpl2 >>> 63);
            i++;
        }
        while (jM28605constructorimpl != 0) {
            if (i == iIntValue) {
                ULongArray.m28623setk8EXiF4(resultArray, iIntValue + resultArrayStart, jM28605constructorimpl);
                return;
            }
            long jM28605constructorimpl3 = ULong.m28605constructorimpl(jM28605constructorimpl + ULongArray.m28618getsVKNKU(storage, i));
            ULongArray.m28623setk8EXiF4(resultArray, i, ULong.m28605constructorimpl(baseMask & jM28605constructorimpl3));
            jM28605constructorimpl = ULong.m28605constructorimpl(jM28605constructorimpl3 >>> 63);
            i++;
        }
        while (i < iIntValue2) {
            ULongArray.m28623setk8EXiF4(resultArray, i + resultArrayStart, ULongArray.m28618getsVKNKU(storage, i));
            i++;
        }
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: add-j68ebKY */
    public long[] mo9372addj68ebKY(long[] first, long[] second) {
        Sextuple sextuple;
        long[] jArrM28613constructorimpl;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (m9419isZeroQwZRm1k(first)) {
            return second;
        }
        if (m9419isZeroQwZRm1k(second)) {
            return first;
        }
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(first) - m9435countLeadingZeroWordsQwZRm1k(first);
        int iM28619getSizeimpl2 = ULongArray.m28619getSizeimpl(second) - m9435countLeadingZeroWordsQwZRm1k(second);
        if (iM28619getSizeimpl > iM28619getSizeimpl2) {
            sextuple = new Sextuple(Integer.valueOf(ULongArray.m28619getSizeimpl(first)), Integer.valueOf(ULongArray.m28619getSizeimpl(second)), ULongArray.m28611boximpl(first), ULongArray.m28611boximpl(second), Integer.valueOf(iM28619getSizeimpl), Integer.valueOf(iM28619getSizeimpl2));
        } else {
            sextuple = new Sextuple(Integer.valueOf(ULongArray.m28619getSizeimpl(second)), Integer.valueOf(ULongArray.m28619getSizeimpl(first)), ULongArray.m28611boximpl(second), ULongArray.m28611boximpl(first), Integer.valueOf(iM28619getSizeimpl2), Integer.valueOf(iM28619getSizeimpl));
        }
        int iIntValue = ((Number) sextuple.component1()).intValue();
        ((Number) sextuple.component2()).intValue();
        boolean z = (ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(((ULongArray) sextuple.component3()).getStorage(), ((Number) sextuple.component5()).intValue() - 1) & 6917529027641081856L) == 0 && ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(((ULongArray) sextuple.component4()).getStorage(), ((Number) sextuple.component6()).intValue() - 1) & 6917529027641081856L) == 0) ? false : true;
        if (z) {
            int i = iIntValue + 1;
            long[] jArr = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = 0;
            }
            jArrM28613constructorimpl = ULongArray.m28613constructorimpl(jArr);
        } else {
            long[] jArr2 = new long[iIntValue];
            for (int i3 = 0; i3 < iIntValue; i3++) {
                jArr2[i3] = 0;
            }
            jArrM28613constructorimpl = ULongArray.m28613constructorimpl(jArr2);
        }
        m9424baseAddIntoArrayKsfQWN0(jArrM28613constructorimpl, 0, first, second);
        return z ? m9447removeLeadingZerosJIhQxVY(jArrM28613constructorimpl) : jArrM28613constructorimpl;
    }

    /* renamed from: subtractWithStartIndexes-mwLU0fg, reason: not valid java name */
    public final long[] m9452subtractWithStartIndexesmwLU0fg(long[] first, long[] second, int firstStart, int secondStart) {
        Quadruple quadruple;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int iM9431compareWithStartIndexesMccmUSY = m9431compareWithStartIndexesMccmUSY(first, second, firstStart, secondStart);
        int i = secondStart + 1;
        boolean z = iM9431compareWithStartIndexesMccmUSY == 1;
        if (iM9431compareWithStartIndexesMccmUSY == 0) {
            return mo9387getZEROY2RjT0g();
        }
        if (i == 1 && ULongArray.m28618getsVKNKU(second, 0) == 0) {
            return first;
        }
        if (!z) {
            throw new RuntimeException("subtract result less than zero");
        }
        if (z) {
            quadruple = new Quadruple(ULongArray.m28611boximpl(first), ULongArray.m28611boximpl(second), Integer.valueOf(firstStart), Integer.valueOf(secondStart));
        } else {
            quadruple = new Quadruple(ULongArray.m28611boximpl(second), ULongArray.m28611boximpl(first), Integer.valueOf(secondStart), Integer.valueOf(firstStart));
        }
        long[] storage = ((ULongArray) quadruple.component1()).getStorage();
        long[] storage2 = ((ULongArray) quadruple.component2()).getStorage();
        int iIntValue = ((Number) quadruple.component3()).intValue();
        int iIntValue2 = ((Number) quadruple.component4()).intValue();
        long[] jArr = new long[iIntValue];
        for (int i2 = 0; i2 < iIntValue; i2++) {
            jArr[i2] = 0;
        }
        long[] jArrM28613constructorimpl = ULongArray.m28613constructorimpl(jArr);
        int i3 = 0;
        long jM28605constructorimpl = 0;
        while (i3 < iIntValue2) {
            long jM28605constructorimpl2 = ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(storage, i3) - ULongArray.m28618getsVKNKU(storage2, i3)) - jM28605constructorimpl);
            ULongArray.m28623setk8EXiF4(jArrM28613constructorimpl, i3, ULong.m28605constructorimpl(baseMask & jM28605constructorimpl2));
            jM28605constructorimpl = ULong.m28605constructorimpl(jM28605constructorimpl2 >>> 63);
            i3++;
        }
        while (jM28605constructorimpl != 0) {
            long jM28605constructorimpl3 = ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(storage, i3) - jM28605constructorimpl);
            ULongArray.m28623setk8EXiF4(jArrM28613constructorimpl, i3, ULong.m28605constructorimpl(baseMask & jM28605constructorimpl3));
            jM28605constructorimpl = ULong.m28605constructorimpl(jM28605constructorimpl3 >>> 63);
            i3++;
        }
        while (i3 < iIntValue) {
            ULongArray.m28623setk8EXiF4(jArrM28613constructorimpl, i3, ULongArray.m28618getsVKNKU(storage, i3));
            i3++;
        }
        if (m9435countLeadingZeroWordsQwZRm1k(jArrM28613constructorimpl) == ULongArray.m28619getSizeimpl(jArrM28613constructorimpl) - 1 && ULongArray.m28618getsVKNKU(jArrM28613constructorimpl, 0) == 0) {
            return mo9387getZEROY2RjT0g();
        }
        return m9447removeLeadingZerosJIhQxVY(jArrM28613constructorimpl);
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: subtract-j68ebKY */
    public long[] mo9391subtractj68ebKY(long[] first, long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return m9452subtractWithStartIndexesmwLU0fg(first, second, ULongArray.m28619getSizeimpl(first) - m9435countLeadingZeroWordsQwZRm1k(first), ULongArray.m28619getSizeimpl(second) - m9435countLeadingZeroWordsQwZRm1k(second));
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: multiply-j68ebKY */
    public long[] mo9388multiplyj68ebKY(long[] first, long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return m9421multiplyWithCorrectedSizemwLU0fg(first, second, ULongArray.m28619getSizeimpl(first) - m9435countLeadingZeroWordsQwZRm1k(first), ULongArray.m28619getSizeimpl(second) - m9435countLeadingZeroWordsQwZRm1k(second));
    }

    /* renamed from: multiplyWithCorrectedSize-mwLU0fg, reason: not valid java name */
    private final long[] m9421multiplyWithCorrectedSizemwLU0fg(long[] first, long[] second, int firstCorrectedSize, int secondCorrectedSize) {
        if (m9419isZeroQwZRm1k(first) || m9419isZeroQwZRm1k(second)) {
            return mo9387getZEROY2RjT0g();
        }
        if ((firstCorrectedSize >= 120 || secondCorrectedSize >= 120) && (firstCorrectedSize <= 15000 || secondCorrectedSize < 15000)) {
            return m9420karatsubaMultiplyWithCorrectedSizesmwLU0fg(first, second, firstCorrectedSize, secondCorrectedSize);
        }
        if (firstCorrectedSize >= 15000 && secondCorrectedSize >= 15000) {
            return m9456toomCook3Multiplyj68ebKY(first, second);
        }
        return m9418basecaseMultiplyWithCorrectedSizemwLU0fg(first, second, firstCorrectedSize, secondCorrectedSize);
    }

    /* renamed from: basecaseMultiplyWithCorrectedSize-mwLU0fg, reason: not valid java name */
    private final long[] m9418basecaseMultiplyWithCorrectedSizemwLU0fg(long[] first, long[] second, int firstCorrectedSizeStart, int secondCorrectedSizeStart) {
        long[] jArrMo9387getZEROY2RjT0g = mo9387getZEROY2RjT0g();
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(second);
        int i = 0;
        int i2 = 0;
        while (i < iM28619getSizeimpl) {
            long jM28618getsVKNKU = ULongArray.m28618getsVKNKU(second, i);
            int i3 = i2 + 1;
            if (i2 <= secondCorrectedSizeStart) {
                BigInteger63Arithmetic bigInteger63Arithmetic = INSTANCE;
                jArrMo9387getZEROY2RjT0g = bigInteger63Arithmetic.m9445plusj68ebKY$bignum(jArrMo9387getZEROY2RjT0g, bigInteger63Arithmetic.m9450shlGERUpyg$bignum(bigInteger63Arithmetic.m9426baseMultiplyss9iZGw(first, jM28618getsVKNKU), i2 * bigInteger63Arithmetic.getBasePowerOfTwo()));
            }
            i++;
            i2 = i3;
        }
        return jArrMo9387getZEROY2RjT0g;
    }

    /* renamed from: karatsubaMultiplyWithCorrectedSizes-mwLU0fg, reason: not valid java name */
    private final long[] m9420karatsubaMultiplyWithCorrectedSizesmwLU0fg(long[] firstUnsigned, long[] secondUnsigned, int firstCorrectedSize, int secondCorrectedSize) {
        boolean z = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SignedULongArray signedULongArray = new SignedULongArray(firstUnsigned, z, defaultConstructorMarker);
        SignedULongArray signedULongArray2 = new SignedULongArray(secondUnsigned, z, defaultConstructorMarker);
        int iMax = (Math.max(firstCorrectedSize, secondCorrectedSize) + 1) / 2;
        long[] jArrMo9384getONEY2RjT0g = mo9384getONEY2RjT0g();
        int i = wordSizeInBits;
        long[] jArrM9442minusss9iZGw$bignum = m9442minusss9iZGw$bignum(m9450shlGERUpyg$bignum(jArrMo9384getONEY2RjT0g, iMax * i), 1L);
        SignedULongArray signedULongArrayM9422andSIFponk$bignum = m9422andSIFponk$bignum(signedULongArray, jArrM9442minusss9iZGw$bignum);
        SignedULongArray signedULongArrayShr$bignum = shr$bignum(signedULongArray, iMax * i);
        SignedULongArray signedULongArrayM9422andSIFponk$bignum2 = m9422andSIFponk$bignum(signedULongArray2, jArrM9442minusss9iZGw$bignum);
        SignedULongArray signedULongArrayShr$bignum2 = shr$bignum(signedULongArray2, iMax * i);
        SignedULongArray signedULongArrayTimes$bignum = times$bignum(signedULongArrayShr$bignum, signedULongArrayShr$bignum2);
        SignedULongArray signedULongArrayTimes$bignum2 = times$bignum(signedULongArrayM9422andSIFponk$bignum, signedULongArrayM9422andSIFponk$bignum2);
        return plus$bignum(plus$bignum(shl$bignum(signedULongArrayTimes$bignum, i * 2 * iMax), shl$bignum(minus$bignum(minus$bignum(times$bignum(plus$bignum(signedULongArrayShr$bignum, signedULongArrayM9422andSIFponk$bignum), plus$bignum(signedULongArrayShr$bignum2, signedULongArrayM9422andSIFponk$bignum2)), signedULongArrayTimes$bignum), signedULongArrayTimes$bignum2), i * iMax)), signedULongArrayTimes$bignum2).getUnsignedValue();
    }

    /* renamed from: extendULongArray-9R_UfW4, reason: not valid java name */
    public final long[] m9439extendULongArray9R_UfW4(long[] original, int numberOfWords, long value) {
        Intrinsics.checkNotNullParameter(original, "original");
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(original) + numberOfWords;
        long[] jArr = new long[iM28619getSizeimpl];
        int i = 0;
        while (i < iM28619getSizeimpl) {
            jArr[i] = i < ULongArray.m28619getSizeimpl(original) ? ULongArray.m28618getsVKNKU(original, i) : value;
            i++;
        }
        return ULongArray.m28613constructorimpl(jArr);
    }

    /* renamed from: toomCook3Multiply-j68ebKY, reason: not valid java name */
    public final long[] m9456toomCook3Multiplyj68ebKY(long[] firstUnchecked, long[] secondUnchecked) {
        List listM28611boximpl;
        List listM28611boximpl2;
        Tuples2 tuples2;
        Intrinsics.checkNotNullParameter(firstUnchecked, "firstUnchecked");
        Intrinsics.checkNotNullParameter(secondUnchecked, "secondUnchecked");
        if (ULongArray.m28619getSizeimpl(firstUnchecked) % 3 != 0) {
            ULongArray uLongArrayM28611boximpl = ULongArray.m28611boximpl(firstUnchecked);
            int iM28619getSizeimpl = (((ULongArray.m28619getSizeimpl(firstUnchecked) + 2) / 3) * 3) - ULongArray.m28619getSizeimpl(firstUnchecked);
            long[] jArr = new long[iM28619getSizeimpl];
            for (int i = 0; i < iM28619getSizeimpl; i++) {
                jArr[i] = 0;
            }
            listM28611boximpl = CollectionsKt.plus((Collection) uLongArrayM28611boximpl, (Iterable) ULongArray.m28611boximpl(ULongArray.m28613constructorimpl(jArr)));
        } else {
            listM28611boximpl = ULongArray.m28611boximpl(firstUnchecked);
        }
        long[] uLongArray = _UCollections.toULongArray(listM28611boximpl);
        if (ULongArray.m28619getSizeimpl(secondUnchecked) % 3 != 0) {
            ULongArray uLongArrayM28611boximpl2 = ULongArray.m28611boximpl(secondUnchecked);
            int iM28619getSizeimpl2 = (((ULongArray.m28619getSizeimpl(secondUnchecked) + 2) / 3) * 3) - ULongArray.m28619getSizeimpl(secondUnchecked);
            long[] jArr2 = new long[iM28619getSizeimpl2];
            for (int i2 = 0; i2 < iM28619getSizeimpl2; i2++) {
                jArr2[i2] = 0;
            }
            listM28611boximpl2 = CollectionsKt.plus((Collection) uLongArrayM28611boximpl2, (Iterable) ULongArray.m28611boximpl(ULongArray.m28613constructorimpl(jArr2)));
        } else {
            listM28611boximpl2 = ULongArray.m28611boximpl(secondUnchecked);
        }
        long[] uLongArray2 = _UCollections.toULongArray(listM28611boximpl2);
        int iM28619getSizeimpl3 = ULongArray.m28619getSizeimpl(uLongArray);
        int iM28619getSizeimpl4 = ULongArray.m28619getSizeimpl(uLongArray2);
        if (iM28619getSizeimpl3 > iM28619getSizeimpl4) {
            tuples2 = new Tuples2(ULongArray.m28611boximpl(uLongArray), ULongArray.m28611boximpl(m9439extendULongArray9R_UfW4(uLongArray2, iM28619getSizeimpl3 - iM28619getSizeimpl4, 0L)));
        } else if (iM28619getSizeimpl3 < iM28619getSizeimpl4) {
            tuples2 = new Tuples2(ULongArray.m28611boximpl(m9439extendULongArray9R_UfW4(uLongArray, iM28619getSizeimpl4 - iM28619getSizeimpl3, 0L)), ULongArray.m28611boximpl(uLongArray2));
        } else {
            tuples2 = new Tuples2(ULongArray.m28611boximpl(uLongArray), ULongArray.m28611boximpl(uLongArray2));
        }
        long[] storage = ((ULongArray) tuples2.component1()).getStorage();
        long[] storage2 = ((ULongArray) tuples2.component2()).getStorage();
        int iMax = (Math.max(ULongArray.m28619getSizeimpl(uLongArray), ULongArray.m28619getSizeimpl(uLongArray2)) + 2) / 3;
        boolean z = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SignedULongArray signedULongArray = new SignedULongArray(_UCollections.toULongArray(UArraysKt.m28677sliceZRhS8yI(storage, RangesKt.until(0, iMax))), z, defaultConstructorMarker);
        int i3 = iMax * 2;
        SignedULongArray signedULongArray2 = new SignedULongArray(_UCollections.toULongArray(UArraysKt.m28677sliceZRhS8yI(storage, RangesKt.until(iMax, i3))), z, defaultConstructorMarker);
        int i4 = iMax * 3;
        SignedULongArray signedULongArray3 = new SignedULongArray(_UCollections.toULongArray(UArraysKt.m28677sliceZRhS8yI(storage, RangesKt.until(i3, i4))), z, defaultConstructorMarker);
        SignedULongArray signedULongArray4 = new SignedULongArray(_UCollections.toULongArray(UArraysKt.m28677sliceZRhS8yI(storage2, RangesKt.until(0, iMax))), z, defaultConstructorMarker);
        SignedULongArray signedULongArray5 = new SignedULongArray(_UCollections.toULongArray(UArraysKt.m28677sliceZRhS8yI(storage2, RangesKt.until(iMax, i3))), z, defaultConstructorMarker);
        SignedULongArray signedULongArray6 = new SignedULongArray(_UCollections.toULongArray(UArraysKt.m28677sliceZRhS8yI(storage2, RangesKt.until(i3, i4))), z, defaultConstructorMarker);
        SignedULongArray signedULongArrayPlus$bignum = plus$bignum(signedULongArray, signedULongArray3);
        SignedULongArray signedULongArrayPlus$bignum2 = plus$bignum(signedULongArrayPlus$bignum, signedULongArray2);
        SignedULongArray signedULongArrayMinus$bignum = minus$bignum(signedULongArrayPlus$bignum, signedULongArray2);
        SignedULongArray signedULongArrayPlus$bignum3 = plus$bignum(signedULongArrayMinus$bignum, signedULongArray3);
        SignedULongArray signedULongArray7 = SIGNED_POSITIVE_TWO;
        SignedULongArray signedULongArrayMinus$bignum2 = minus$bignum(times$bignum(signedULongArrayPlus$bignum3, signedULongArray7), signedULongArray);
        SignedULongArray signedULongArrayPlus$bignum4 = plus$bignum(signedULongArray4, signedULongArray6);
        SignedULongArray signedULongArrayPlus$bignum5 = plus$bignum(signedULongArrayPlus$bignum4, signedULongArray5);
        SignedULongArray signedULongArrayMinus$bignum3 = minus$bignum(signedULongArrayPlus$bignum4, signedULongArray5);
        SignedULongArray signedULongArrayMinus$bignum4 = minus$bignum(times$bignum(plus$bignum(signedULongArrayMinus$bignum3, signedULongArray6), signedULongArray7), signedULongArray4);
        SignedULongArray signedULongArrayTimes$bignum = times$bignum(signedULongArray, signedULongArray4);
        SignedULongArray signedULongArrayTimes$bignum2 = times$bignum(signedULongArrayPlus$bignum2, signedULongArrayPlus$bignum5);
        SignedULongArray signedULongArrayTimes$bignum3 = times$bignum(signedULongArrayMinus$bignum, signedULongArrayMinus$bignum3);
        SignedULongArray signedULongArrayTimes$bignum4 = times$bignum(signedULongArrayMinus$bignum2, signedULongArrayMinus$bignum4);
        SignedULongArray signedULongArrayTimes$bignum5 = times$bignum(signedULongArray3, signedULongArray6);
        SignedULongArray signedULongArrayDiv$bignum = div$bignum(minus$bignum(signedULongArrayTimes$bignum4, signedULongArrayTimes$bignum2), new SignedULongArray(new long[]{3}, z, defaultConstructorMarker));
        SignedULongArray signedULongArrayShr$bignum = shr$bignum(minus$bignum(signedULongArrayTimes$bignum2, signedULongArrayTimes$bignum3), 1);
        SignedULongArray signedULongArrayMinus$bignum5 = minus$bignum(signedULongArrayTimes$bignum3, signedULongArrayTimes$bignum);
        SignedULongArray signedULongArrayPlus$bignum6 = plus$bignum(shr$bignum(minus$bignum(signedULongArrayMinus$bignum5, signedULongArrayDiv$bignum), 1), times$bignum(signedULongArray7, signedULongArrayTimes$bignum5));
        SignedULongArray signedULongArrayMinus$bignum6 = minus$bignum(plus$bignum(signedULongArrayMinus$bignum5, signedULongArrayShr$bignum), signedULongArrayTimes$bignum5);
        SignedULongArray signedULongArrayShl$bignum = shl$bignum(minus$bignum(signedULongArrayShr$bignum, signedULongArrayPlus$bignum6), iMax * 63);
        return plus$bignum(plus$bignum(plus$bignum(plus$bignum(signedULongArrayTimes$bignum, signedULongArrayShl$bignum), shl$bignum(signedULongArrayMinus$bignum6, iMax * EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE)), shl$bignum(signedULongArrayPlus$bignum6, iMax * EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE)), shl$bignum(signedULongArrayTimes$bignum5, iMax * EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)).getUnsignedValue();
    }

    /* renamed from: baseMultiply-ss9iZGw, reason: not valid java name */
    public final long[] m9426baseMultiplyss9iZGw(long[] first, long second) {
        Intrinsics.checkNotNullParameter(first, "first");
        return m9427baseMultiplyWithCorrectedSize_EW1lsA(first, second, ULongArray.m28619getSizeimpl(first) - m9435countLeadingZeroWordsQwZRm1k(first));
    }

    /* renamed from: baseMultiplyWithCorrectedSize-_EW1lsA, reason: not valid java name */
    public final long[] m9427baseMultiplyWithCorrectedSize_EW1lsA(long[] first, long second, int firstCorrectedSize) {
        int i;
        Intrinsics.checkNotNullParameter(first, "first");
        long jM28605constructorimpl = ULong.m28605constructorimpl(lowMask & second);
        long jM28605constructorimpl2 = ULong.m28605constructorimpl(second >>> 32);
        int iMo9373bitLengthQwZRm1k = mo9373bitLengthQwZRm1k(first) + m9428bitLengthVKZWuLQ(second);
        if (iMo9373bitLengthQwZRm1k % 63 != 0) {
            i = (iMo9373bitLengthQwZRm1k / 63) + 1;
        } else {
            i = iMo9373bitLengthQwZRm1k / 63;
        }
        long[] jArrM28612constructorimpl = ULongArray.m28612constructorimpl(i);
        int i2 = 0;
        int i3 = 0;
        long jM28605constructorimpl3 = 0;
        while (i2 < firstCorrectedSize) {
            long jM28605constructorimpl4 = ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(first, i2) & lowMask);
            long jM28605constructorimpl5 = ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(first, i2) >>> 32);
            i2++;
            long jM28605constructorimpl6 = ULong.m28605constructorimpl(jM28605constructorimpl4 * jM28605constructorimpl);
            long jM28605constructorimpl7 = ULong.m28605constructorimpl(jM28605constructorimpl6 >>> 63);
            long j = baseMask;
            long jM28605constructorimpl8 = ULong.m28605constructorimpl(jM28605constructorimpl3 + ULong.m28605constructorimpl(jM28605constructorimpl6 & j));
            long jM28605constructorimpl9 = ULong.m28605constructorimpl(jM28605constructorimpl7 + ULong.m28605constructorimpl(jM28605constructorimpl8 >>> 63));
            long jM28605constructorimpl10 = ULong.m28605constructorimpl(jM28605constructorimpl8 & j);
            long jM28605constructorimpl11 = ULong.m28605constructorimpl(ULong.m28605constructorimpl(jM28605constructorimpl4 * jM28605constructorimpl2) + ULong.m28605constructorimpl(jM28605constructorimpl * jM28605constructorimpl5));
            long jM28605constructorimpl12 = ULong.m28605constructorimpl(jM28605constructorimpl9 + ULong.m28605constructorimpl(jM28605constructorimpl11 >>> 31));
            long jM28605constructorimpl13 = ULong.m28605constructorimpl(jM28605constructorimpl10 + ULong.m28605constructorimpl(ULong.m28605constructorimpl(jM28605constructorimpl11 << 32) & j));
            long jM28605constructorimpl14 = ULong.m28605constructorimpl(jM28605constructorimpl12 + ULong.m28605constructorimpl(jM28605constructorimpl13 >>> 63));
            ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i3, ULong.m28605constructorimpl(jM28605constructorimpl13 & j));
            jM28605constructorimpl3 = ULong.m28605constructorimpl(jM28605constructorimpl14 + ULong.m28605constructorimpl(ULong.m28605constructorimpl(jM28605constructorimpl5 * jM28605constructorimpl2) << 1));
            i3++;
        }
        if (jM28605constructorimpl3 != 0) {
            ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i3, jM28605constructorimpl3);
        }
        return jArrM28612constructorimpl;
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: pow-GERUpyg */
    public long[] mo9390powGERUpyg(long[] base, long exponent) {
        Intrinsics.checkNotNullParameter(base, "base");
        if (exponent == 0) {
            return mo9384getONEY2RjT0g();
        }
        if (exponent == 1) {
            return base;
        }
        if (ULongArray.m28619getSizeimpl(base) == 1 && ULongArray.m28618getsVKNKU(base, 0) == 10) {
            ULongArray[] uLongArrayArr = powersOf10;
            if (exponent < uLongArrayArr.length) {
                return uLongArrayArr[(int) exponent].getStorage();
            }
        }
        ULongArray.m28619getSizeimpl(base);
        m9435countLeadingZeroWordsQwZRm1k(base);
        long[] jArrMo9384getONEY2RjT0g = mo9384getONEY2RjT0g();
        while (exponent > 1) {
            long j = 2;
            if (exponent % j == 0) {
                base = m9453timesj68ebKY$bignum(base, base);
                exponent /= j;
            } else {
                jArrMo9384getONEY2RjT0g = m9453timesj68ebKY$bignum(base, jArrMo9384getONEY2RjT0g);
                base = m9453timesj68ebKY$bignum(base, base);
                exponent = (exponent - 1) / j;
            }
        }
        return m9453timesj68ebKY$bignum(jArrMo9384getONEY2RjT0g, base);
    }

    /* renamed from: normalize-GR1PJdc, reason: not valid java name */
    public final Tuples3<ULongArray, ULongArray, Integer> m9443normalizeGR1PJdc(long[] dividend, long[] divisor) {
        Intrinsics.checkNotNullParameter(dividend, "dividend");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        int iM9444numberOfLeadingZerosInAWordVKZWuLQ = m9444numberOfLeadingZerosInAWordVKZWuLQ(ULongArray.m28618getsVKNKU(divisor, ULongArray.m28619getSizeimpl(divisor) - 1));
        return new Tuples3<>(ULongArray.m28611boximpl(m9450shlGERUpyg$bignum(dividend, iM9444numberOfLeadingZerosInAWordVKZWuLQ)), ULongArray.m28611boximpl(m9450shlGERUpyg$bignum(divisor, iM9444numberOfLeadingZerosInAWordVKZWuLQ)), Integer.valueOf(iM9444numberOfLeadingZerosInAWordVKZWuLQ));
    }

    /* renamed from: denormalize-GERUpyg, reason: not valid java name */
    public final long[] m9436denormalizeGERUpyg(long[] remainderNormalized, int normalizationShift) {
        Intrinsics.checkNotNullParameter(remainderNormalized, "remainderNormalized");
        return m9451shrGERUpyg$bignum(remainderNormalized, normalizationShift);
    }

    /* renamed from: baseDivide-GR1PJdc, reason: not valid java name */
    public final Tuples2<ULongArray, ULongArray> m9425baseDivideGR1PJdc(long[] unnormalizedDividend, long[] unnormalizedDivisor) {
        long[] jArrMo9387getZEROY2RjT0g;
        Intrinsics.checkNotNullParameter(unnormalizedDividend, "unnormalizedDividend");
        Intrinsics.checkNotNullParameter(unnormalizedDivisor, "unnormalizedDivisor");
        if (m9430compareToGR1PJdc$bignum(unnormalizedDivisor, unnormalizedDividend) > 0) {
            return new Tuples2<>(ULongArray.m28611boximpl(mo9387getZEROY2RjT0g()), ULongArray.m28611boximpl(unnormalizedDividend));
        }
        if (ULongArray.m28619getSizeimpl(unnormalizedDivisor) == 1 && ULongArray.m28619getSizeimpl(unnormalizedDividend) == 1) {
            return new Tuples2<>(ULongArray.m28611boximpl(m9447removeLeadingZerosJIhQxVY(new long[]{BigInteger32Arithmetic$$ExternalSyntheticBackport2.m1064m(ULongArray.m28618getsVKNKU(unnormalizedDividend, 0), ULongArray.m28618getsVKNKU(unnormalizedDivisor, 0))})), ULongArray.m28611boximpl(m9447removeLeadingZerosJIhQxVY(new long[]{BigInteger63Arithmetic$$ExternalSyntheticBackport0.m1068m(ULongArray.m28618getsVKNKU(unnormalizedDividend, 0), ULongArray.m28618getsVKNKU(unnormalizedDivisor, 0))})));
        }
        if (mo9373bitLengthQwZRm1k(unnormalizedDividend) - mo9373bitLengthQwZRm1k(unnormalizedDivisor) == 0) {
            return new Tuples2<>(ULongArray.m28611boximpl(mo9384getONEY2RjT0g()), ULongArray.m28611boximpl(m9441minusj68ebKY$bignum(unnormalizedDividend, unnormalizedDivisor)));
        }
        Tuples3<ULongArray, ULongArray, Integer> tuples3M9443normalizeGR1PJdc = m9443normalizeGR1PJdc(unnormalizedDividend, unnormalizedDivisor);
        long[] storage = tuples3M9443normalizeGR1PJdc.component1().getStorage();
        long[] storage2 = tuples3M9443normalizeGR1PJdc.component2().getStorage();
        int iIntValue = tuples3M9443normalizeGR1PJdc.component3().intValue();
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(storage);
        int iM28619getSizeimpl2 = ULongArray.m28619getSizeimpl(storage2);
        int iM28619getSizeimpl3 = ULongArray.m28619getSizeimpl(storage2) - m9435countLeadingZeroWordsQwZRm1k(storage2);
        int i = iM28619getSizeimpl - iM28619getSizeimpl2;
        long[] jArrM28612constructorimpl = ULongArray.m28612constructorimpl(i);
        long[] jArrM9450shlGERUpyg$bignum = m9450shlGERUpyg$bignum(storage2, getBasePowerOfTwo() * i);
        long j = 1;
        if (m9430compareToGR1PJdc$bignum(storage, jArrM9450shlGERUpyg$bignum) >= 0) {
            jArrM28612constructorimpl = ULongArray.m28612constructorimpl(i + 1);
            ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i, 1L);
            storage = m9441minusj68ebKY$bignum(storage, jArrM9450shlGERUpyg$bignum);
        }
        int i2 = i - 1;
        while (-1 < i2) {
            int i3 = iM28619getSizeimpl2 + i2;
            if (i3 < ULongArray.m28619getSizeimpl(storage)) {
                jArrMo9387getZEROY2RjT0g = m9446plusss9iZGw$bignum(m9450shlGERUpyg$bignum(new long[]{ULongArray.m28618getsVKNKU(storage, i3)}, getBasePowerOfTwo()), ULongArray.m28618getsVKNKU(storage, i3 - 1));
            } else if (i3 == ULongArray.m28619getSizeimpl(storage)) {
                jArrMo9387getZEROY2RjT0g = new long[]{ULongArray.m28618getsVKNKU(storage, i3 - 1)};
            } else {
                jArrMo9387getZEROY2RjT0g = mo9387getZEROY2RjT0g();
            }
            long j2 = j;
            long[] jArrM9440from32BitehPNNiw$bignum = m9440from32BitehPNNiw$bignum(BigInteger32Arithmetic.INSTANCE.m9401divideYnv0uTE(m9455to32BitkqpWZOw$bignum(jArrMo9387getZEROY2RjT0g), m9455to32BitkqpWZOw$bignum(new long[]{ULongArray.m28618getsVKNKU(storage2, iM28619getSizeimpl2 - 1)})).getFirst().getStorage());
            long jM28618getsVKNKU = baseMask;
            if (m9429compareTo3yFGk1Y$bignum(jArrM9440from32BitehPNNiw$bignum, ULong.m28605constructorimpl(jM28618getsVKNKU - j2)) < 0) {
                jM28618getsVKNKU = ULongArray.m28618getsVKNKU(jArrM9440from32BitehPNNiw$bignum, 0);
            }
            ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i2, jM28618getsVKNKU);
            long[] jArrM9450shlGERUpyg$bignum2 = m9450shlGERUpyg$bignum(m9427baseMultiplyWithCorrectedSize_EW1lsA(storage2, ULongArray.m28618getsVKNKU(jArrM28612constructorimpl, i2), iM28619getSizeimpl3), getBasePowerOfTwo() * i2);
            while (m9430compareToGR1PJdc$bignum(jArrM9450shlGERUpyg$bignum2, storage) > 0) {
                ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i2, ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(jArrM28612constructorimpl, i2) - ULong.m28605constructorimpl(j2)));
                jArrM9450shlGERUpyg$bignum2 = m9450shlGERUpyg$bignum(m9427baseMultiplyWithCorrectedSize_EW1lsA(storage2, ULongArray.m28618getsVKNKU(jArrM28612constructorimpl, i2), iM28619getSizeimpl3), getBasePowerOfTwo() * i2);
            }
            storage = m9441minusj68ebKY$bignum(storage, jArrM9450shlGERUpyg$bignum2);
            i2--;
            j = j2;
        }
        long j3 = j;
        while (m9430compareToGR1PJdc$bignum(storage, storage2) >= 0) {
            jArrM28612constructorimpl = m9446plusss9iZGw$bignum(jArrM28612constructorimpl, j3);
            storage = m9441minusj68ebKY$bignum(storage, storage2);
        }
        return new Tuples2<>(ULongArray.m28611boximpl(m9447removeLeadingZerosJIhQxVY(jArrM28612constructorimpl)), ULongArray.m28611boximpl(m9436denormalizeGERUpyg(storage, iIntValue)));
    }

    /* renamed from: convertTo64BitRepresentation-JIhQxVY$bignum, reason: not valid java name */
    public final long[] m9434convertTo64BitRepresentationJIhQxVY$bignum(long[] operand) {
        int i;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (m9419isZeroQwZRm1k(operand)) {
            return mo9387getZEROY2RjT0g();
        }
        int iMo9373bitLengthQwZRm1k = mo9373bitLengthQwZRm1k(operand);
        if (iMo9373bitLengthQwZRm1k % 64 == 0) {
            i = iMo9373bitLengthQwZRm1k / 64;
        } else {
            i = (iMo9373bitLengthQwZRm1k / 64) + 1;
        }
        long[] jArrM28612constructorimpl = ULongArray.m28612constructorimpl(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 % 63;
            int i4 = (i2 / 63) + i2;
            int i5 = i4 + 1;
            if (i5 < ULongArray.m28619getSizeimpl(operand)) {
                ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i2, ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i5) << (63 - i3)) | ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i4) >>> i3)));
            } else {
                ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i2, ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i4) >>> i3));
            }
        }
        return m9447removeLeadingZerosJIhQxVY(jArrM28612constructorimpl);
    }

    /* renamed from: convertTo32BitRepresentation-kqpWZOw$bignum, reason: not valid java name */
    public final int[] m9433convertTo32BitRepresentationkqpWZOw$bignum(long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long[] jArrM9434convertTo64BitRepresentationJIhQxVY$bignum = m9434convertTo64BitRepresentationJIhQxVY$bignum(operand);
        int[] iArrM28588constructorimpl = UIntArray.m28588constructorimpl(ULongArray.m28619getSizeimpl(jArrM9434convertTo64BitRepresentationJIhQxVY$bignum) * 2);
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(jArrM9434convertTo64BitRepresentationJIhQxVY$bignum);
        for (int i = 0; i < iM28619getSizeimpl; i++) {
            int i2 = i * 2;
            UIntArray.m28599setVXSXFK8(iArrM28588constructorimpl, i2, UInt.m28582constructorimpl((int) ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(jArrM9434convertTo64BitRepresentationJIhQxVY$bignum, i) & ULong.m28605constructorimpl(BigInteger32Arithmetic.INSTANCE.m9402getBasepVg5ArA() & 4294967295L))));
            UIntArray.m28599setVXSXFK8(iArrM28588constructorimpl, i2 + 1, UInt.m28582constructorimpl((int) ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(jArrM9434convertTo64BitRepresentationJIhQxVY$bignum, i) >>> 32)));
        }
        return BigInteger32Arithmetic.INSTANCE.m9410removeLeadingZeroshkIa6DI(iArrM28588constructorimpl);
    }

    /* renamed from: convertFrom32BitRepresentation-ehPNNiw$bignum, reason: not valid java name */
    public final long[] m9432convertFrom32BitRepresentationehPNNiw$bignum(int[] operand) {
        int i;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (UIntArray.m28595getSizeimpl(operand) == 0) {
            return mo9387getZEROY2RjT0g();
        }
        if (UIntArray.m28595getSizeimpl(operand) == 1) {
            return new long[]{ULong.m28605constructorimpl(4294967295L & UIntArray.m28594getpVg5ArA(operand, 0))};
        }
        int iM9395bitLengthajY9A = BigInteger32Arithmetic.INSTANCE.m9395bitLengthajY9A(operand);
        if (iM9395bitLengthajY9A % 63 == 0) {
            i = iM9395bitLengthajY9A / 63;
        } else {
            i = (iM9395bitLengthajY9A / 63) + 1;
        }
        long[] jArrM28612constructorimpl = ULongArray.m28612constructorimpl(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 % 32;
            int i4 = (i2 * 2) - (i2 / 32);
            if (i == 2) {
                ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, 0, ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 0) & 4294967295L) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 1) & 4294967295L) << 32) & highMask)));
                if (UIntArray.m28595getSizeimpl(operand) == 4) {
                    ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, 1, ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 1) & 4294967295L) >>> 31) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 2) & 4294967295L) << 1)) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 3) & 4294967295L) << 33)));
                } else if (UIntArray.m28595getSizeimpl(operand) > 2) {
                    ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, 1, ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 1) & 4294967295L) >>> 31) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 2) & 4294967295L) << 1)));
                } else {
                    ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, 1, ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 1) & 4294967295L) >>> 31));
                }
            } else if (i2 == 0) {
                ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i2, ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 0) & 4294967295L) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, 1) & 4294967295L) << 32) & highMask)));
            } else if (1 <= i2 && i2 < i - 1) {
                ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i2, ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, i4 + 1) & 4294967295L) << (i3 + 32)) & highMask) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, i4 - 1) & 4294967295L) >>> (32 - i3)) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, i4) & 4294967295L) << i3))));
            } else if (i2 == i - 1) {
                if (i4 < UIntArray.m28595getSizeimpl(operand)) {
                    ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i2, ULong.m28605constructorimpl(ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, i4) & 4294967295L) << i3) | ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, i4 - 1) & 4294967295L) >>> (32 - i3))));
                } else {
                    ULongArray.m28623setk8EXiF4(jArrM28612constructorimpl, i2, ULong.m28605constructorimpl(ULong.m28605constructorimpl(UIntArray.m28594getpVg5ArA(operand, i4 - 1) & 4294967295L) >>> (32 - i3)));
                }
            }
        }
        return jArrM28612constructorimpl;
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: divide-GR1PJdc */
    public Tuples2<ULongArray, ULongArray> mo9375divideGR1PJdc(long[] first, long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return m9425baseDivideGR1PJdc(first, second);
    }

    /* renamed from: isZero-QwZRm1k, reason: not valid java name */
    private final boolean m9419isZeroQwZRm1k(long[] jArr) {
        if (ULongArray.m28617equalsimpl0(jArr, mo9387getZEROY2RjT0g())) {
            return true;
        }
        return (ULongArray.m28619getSizeimpl(jArr) == 1 && ULongArray.m28618getsVKNKU(jArr, 0) == 0) || ULongArray.m28619getSizeimpl(jArr) - m9435countLeadingZeroWordsQwZRm1k(jArr) == 0;
    }

    /* compiled from: BigInteger63Arithmetic.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m3636d2 = {"Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;", "", "Lkotlin/ULongArray;", "unsignedValue", "", "sign", "<init>", "([JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-tBf0fek", "([JZ)Lcom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic$SignedULongArray;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "[J", "getUnsignedValue-Y2RjT0g", "()[J", "Z", "getSign", "()Z", "bignum"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SignedULongArray {
        private final boolean sign;
        private final long[] unsignedValue;

        public /* synthetic */ SignedULongArray(long[] jArr, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(jArr, z);
        }

        /* renamed from: copy-tBf0fek$default, reason: not valid java name */
        public static /* synthetic */ SignedULongArray m9457copytBf0fek$default(SignedULongArray signedULongArray, long[] jArr, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                jArr = signedULongArray.unsignedValue;
            }
            if ((i & 2) != 0) {
                z = signedULongArray.sign;
            }
            return signedULongArray.m9458copytBf0fek(jArr, z);
        }

        /* renamed from: copy-tBf0fek, reason: not valid java name */
        public final SignedULongArray m9458copytBf0fek(long[] unsignedValue, boolean sign) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            return new SignedULongArray(unsignedValue, sign, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignedULongArray)) {
                return false;
            }
            SignedULongArray signedULongArray = (SignedULongArray) other;
            return ULongArray.m28617equalsimpl0(this.unsignedValue, signedULongArray.unsignedValue) && this.sign == signedULongArray.sign;
        }

        public int hashCode() {
            return (ULongArray.m28620hashCodeimpl(this.unsignedValue) * 31) + Boolean.hashCode(this.sign);
        }

        public String toString() {
            return "SignedULongArray(unsignedValue=" + ((Object) ULongArray.m28624toStringimpl(this.unsignedValue)) + ", sign=" + this.sign + ')';
        }

        private SignedULongArray(long[] unsignedValue, boolean z) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            this.unsignedValue = unsignedValue;
            this.sign = z;
        }

        public final boolean getSign() {
            return this.sign;
        }

        /* renamed from: getUnsignedValue-Y2RjT0g, reason: not valid java name and from getter */
        public final long[] getUnsignedValue() {
            return this.unsignedValue;
        }
    }

    private final SignedULongArray signedAdd(SignedULongArray first, SignedULongArray second) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (first.getSign() ^ second.getSign()) {
            if (m9430compareToGR1PJdc$bignum(first.getUnsignedValue(), second.getUnsignedValue()) > 0) {
                return new SignedULongArray(m9441minusj68ebKY$bignum(first.getUnsignedValue(), second.getUnsignedValue()), first.getSign(), defaultConstructorMarker);
            }
            return new SignedULongArray(m9441minusj68ebKY$bignum(second.getUnsignedValue(), first.getUnsignedValue()), second.getSign(), defaultConstructorMarker);
        }
        return new SignedULongArray(m9445plusj68ebKY$bignum(first.getUnsignedValue(), second.getUnsignedValue()), first.getSign(), defaultConstructorMarker);
    }

    private final SignedULongArray signedSubtract(SignedULongArray first, SignedULongArray second) {
        return signedAdd(first, SignedULongArray.m9457copytBf0fek$default(second, null, !second.getSign(), 1, null));
    }

    private final SignedULongArray signedMultiply(SignedULongArray first, SignedULongArray second) {
        return new SignedULongArray(m9453timesj68ebKY$bignum(first.getUnsignedValue(), second.getUnsignedValue()), !(first.getSign() ^ second.getSign()), null);
    }

    private final SignedULongArray signedDivide(SignedULongArray first, SignedULongArray second) {
        return new SignedULongArray(m9437divj68ebKY$bignum(first.getUnsignedValue(), second.getUnsignedValue()), !(first.getSign() ^ second.getSign()), null);
    }

    public final SignedULongArray plus$bignum(SignedULongArray signedULongArray, SignedULongArray other) {
        Intrinsics.checkNotNullParameter(signedULongArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return signedAdd(signedULongArray, other);
    }

    public final SignedULongArray minus$bignum(SignedULongArray signedULongArray, SignedULongArray other) {
        Intrinsics.checkNotNullParameter(signedULongArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return signedSubtract(signedULongArray, other);
    }

    public final SignedULongArray times$bignum(SignedULongArray signedULongArray, SignedULongArray other) {
        Intrinsics.checkNotNullParameter(signedULongArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return signedMultiply(signedULongArray, other);
    }

    public final SignedULongArray div$bignum(SignedULongArray signedULongArray, SignedULongArray other) {
        Intrinsics.checkNotNullParameter(signedULongArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return signedDivide(signedULongArray, other);
    }

    public final SignedULongArray shr$bignum(SignedULongArray signedULongArray, int i) {
        Intrinsics.checkNotNullParameter(signedULongArray, "<this>");
        return new SignedULongArray(m9451shrGERUpyg$bignum(signedULongArray.getUnsignedValue(), i), signedULongArray.getSign(), null);
    }

    public final SignedULongArray shl$bignum(SignedULongArray signedULongArray, int i) {
        Intrinsics.checkNotNullParameter(signedULongArray, "<this>");
        return new SignedULongArray(m9450shlGERUpyg$bignum(signedULongArray.getUnsignedValue(), i), signedULongArray.getSign(), null);
    }

    /* renamed from: and-SIFponk$bignum, reason: not valid java name */
    public final SignedULongArray m9422andSIFponk$bignum(SignedULongArray and, long[] operand) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        Intrinsics.checkNotNullParameter(operand, "operand");
        return new SignedULongArray(m9423andj68ebKY(and.getUnsignedValue(), operand), and.getSign(), null);
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: parseForBase-_llDaS8 */
    public long[] mo9389parseForBase_llDaS8(String number, int base) {
        Intrinsics.checkNotNullParameter(number, "number");
        long[] jArrMo9387getZEROY2RjT0g = mo9387getZEROY2RjT0g();
        String lowerCase = number.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            BigInteger63Arithmetic bigInteger63Arithmetic = INSTANCE;
            jArrMo9387getZEROY2RjT0g = bigInteger63Arithmetic.m9446plusss9iZGw$bignum(bigInteger63Arithmetic.m9454timesss9iZGw$bignum(jArrMo9387getZEROY2RjT0g, ULong.m28605constructorimpl(base)), ULong.m28605constructorimpl(DigitUtil.toDigit(cCharAt, base)));
        }
        return m9447removeLeadingZerosJIhQxVY(jArrMo9387getZEROY2RjT0g);
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: toString-tBf0fek */
    public String mo9392toStringtBf0fek(long[] operand, int base) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long[] jArrCopyOf = Arrays.copyOf(operand, operand.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrM28613constructorimpl = ULongArray.m28613constructorimpl(jArrCopyOf);
        long[] jArr = {ULong.m28605constructorimpl(base)};
        StringBuilder sb = new StringBuilder();
        while (!ULongArray.m28617equalsimpl0(jArrM28613constructorimpl, mo9387getZEROY2RjT0g())) {
            Tuples2<ULongArray, ULongArray> tuples2M9438divremGR1PJdc$bignum = m9438divremGR1PJdc$bignum(jArrM28613constructorimpl, jArr);
            if (ULongArray.m28621isEmptyimpl(tuples2M9438divremGR1PJdc$bignum.getSecond().getStorage())) {
                sb.append(0);
            } else {
                sb.append(UStrings.m28722toStringJSWoG40(ULongArray.m28618getsVKNKU(tuples2M9438divremGR1PJdc$bignum.getSecond().getStorage(), 0), base));
            }
            jArrM28613constructorimpl = tuples2M9438divremGR1PJdc$bignum.getFirst().getStorage();
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return StringsKt.reversed(string2).toString();
    }

    /* renamed from: and-j68ebKY, reason: not valid java name */
    public long[] m9423andj68ebKY(long[] operand, long[] mask) {
        Tuples2 tuples2;
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        if (ULongArray.m28619getSizeimpl(operand) > ULongArray.m28619getSizeimpl(mask)) {
            tuples2 = new Tuples2(ULongArray.m28611boximpl(operand), ULongArray.m28611boximpl(mask));
        } else {
            tuples2 = new Tuples2(ULongArray.m28611boximpl(mask), ULongArray.m28611boximpl(operand));
        }
        ((ULongArray) tuples2.component1()).getStorage();
        int iM28619getSizeimpl = ULongArray.m28619getSizeimpl(((ULongArray) tuples2.component2()).getStorage());
        long[] jArr = new long[iM28619getSizeimpl];
        for (int i = 0; i < iM28619getSizeimpl; i++) {
            jArr[i] = ULong.m28605constructorimpl(ULongArray.m28618getsVKNKU(operand, i) & ULongArray.m28618getsVKNKU(mask, i));
        }
        return ULongArray.m28613constructorimpl(jArr);
    }

    /* renamed from: shl-GERUpyg$bignum, reason: not valid java name */
    public final long[] m9450shlGERUpyg$bignum(long[] shl, int i) {
        Intrinsics.checkNotNullParameter(shl, "$this$shl");
        return m9448shiftLeftGERUpyg(shl, i);
    }

    /* renamed from: shr-GERUpyg$bignum, reason: not valid java name */
    public final long[] m9451shrGERUpyg$bignum(long[] shr, int i) {
        Intrinsics.checkNotNullParameter(shr, "$this$shr");
        return m9449shiftRightGERUpyg(shr, i);
    }

    /* renamed from: plus-j68ebKY$bignum, reason: not valid java name */
    public final long[] m9445plusj68ebKY$bignum(long[] plus, long[] other) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(other, "other");
        return mo9372addj68ebKY(plus, other);
    }

    /* renamed from: minus-j68ebKY$bignum, reason: not valid java name */
    public final long[] m9441minusj68ebKY$bignum(long[] minus, long[] other) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        Intrinsics.checkNotNullParameter(other, "other");
        return mo9391subtractj68ebKY(minus, other);
    }

    /* renamed from: times-j68ebKY$bignum, reason: not valid java name */
    public final long[] m9453timesj68ebKY$bignum(long[] times, long[] other) {
        Intrinsics.checkNotNullParameter(times, "$this$times");
        Intrinsics.checkNotNullParameter(other, "other");
        return mo9388multiplyj68ebKY(times, other);
    }

    /* renamed from: plus-ss9iZGw$bignum, reason: not valid java name */
    public final long[] m9446plusss9iZGw$bignum(long[] plus, long j) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return mo9372addj68ebKY(plus, new long[]{j});
    }

    /* renamed from: minus-ss9iZGw$bignum, reason: not valid java name */
    public final long[] m9442minusss9iZGw$bignum(long[] minus, long j) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        return mo9391subtractj68ebKY(minus, new long[]{j});
    }

    /* renamed from: times-ss9iZGw$bignum, reason: not valid java name */
    public final long[] m9454timesss9iZGw$bignum(long[] times, long j) {
        Intrinsics.checkNotNullParameter(times, "$this$times");
        return m9426baseMultiplyss9iZGw(times, j);
    }

    /* renamed from: div-j68ebKY$bignum, reason: not valid java name */
    public final long[] m9437divj68ebKY$bignum(long[] div, long[] other) {
        Intrinsics.checkNotNullParameter(div, "$this$div");
        Intrinsics.checkNotNullParameter(other, "other");
        return mo9375divideGR1PJdc(div, other).getFirst().getStorage();
    }

    /* renamed from: divrem-GR1PJdc$bignum, reason: not valid java name */
    public final Tuples2<ULongArray, ULongArray> m9438divremGR1PJdc$bignum(long[] divrem, long[] other) {
        Intrinsics.checkNotNullParameter(divrem, "$this$divrem");
        Intrinsics.checkNotNullParameter(other, "other");
        return mo9375divideGR1PJdc(divrem, other);
    }

    /* renamed from: compareTo-GR1PJdc$bignum, reason: not valid java name */
    public final int m9430compareToGR1PJdc$bignum(long[] compareTo, long[] other) {
        Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        Intrinsics.checkNotNullParameter(other, "other");
        return mo9374compareGR1PJdc(compareTo, other);
    }

    /* renamed from: compareTo-3yFGk1Y$bignum, reason: not valid java name */
    public final int m9429compareTo3yFGk1Y$bignum(long[] compareTo, long j) {
        Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        return mo9374compareGR1PJdc(compareTo, new long[]{j});
    }

    /* renamed from: to32Bit-kqpWZOw$bignum, reason: not valid java name */
    public final int[] m9455to32BitkqpWZOw$bignum(long[] to32Bit) {
        Intrinsics.checkNotNullParameter(to32Bit, "$this$to32Bit");
        return m9433convertTo32BitRepresentationkqpWZOw$bignum(to32Bit);
    }

    /* renamed from: from32Bit-ehPNNiw$bignum, reason: not valid java name */
    public final long[] m9440from32BitehPNNiw$bignum(int[] from32Bit) {
        Intrinsics.checkNotNullParameter(from32Bit, "$this$from32Bit");
        return m9432convertFrom32BitRepresentationehPNNiw$bignum(from32Bit);
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: fromULong--GCcj4Q */
    public long[] mo9382fromULongGCcj4Q(long uLong) {
        if (ULong.m28605constructorimpl(overflowMask & uLong) != 0) {
            return new long[]{ULong.m28605constructorimpl(uLong & baseMask), 1};
        }
        return new long[]{uLong};
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: fromUInt-kOc6_GI */
    public long[] mo9381fromUIntkOc6_GI(int uInt) {
        return new long[]{ULong.m28605constructorimpl(uInt & 4294967295L)};
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: fromUShort-jOPi9CM */
    public long[] mo9383fromUShortjOPi9CM(short uShort) {
        return new long[]{ULong.m28605constructorimpl(uShort & 65535)};
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: fromUByte-ab45Ak8 */
    public long[] mo9380fromUByteab45Ak8(byte uByte) {
        return new long[]{ULong.m28605constructorimpl(uByte & 255)};
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: fromLong-DHQ6RzY */
    public long[] mo9378fromLongDHQ6RzY(long j) {
        if (j == Long.MIN_VALUE) {
            return new long[]{0, 1};
        }
        return new long[]{ULong.m28605constructorimpl(ULong.m28605constructorimpl(Math.abs(j)) & baseMask)};
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: fromInt-DHQ6RzY */
    public long[] mo9377fromIntDHQ6RzY(int i) {
        return new long[]{ULong.m28605constructorimpl(Math.abs(i))};
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: fromShort-DHQ6RzY */
    public long[] mo9379fromShortDHQ6RzY(short s) {
        return new long[]{ULong.m28605constructorimpl(Math.abs((int) s))};
    }

    @Override // com.ionspin.kotlin.bignum.integer.BigIntegerArithmetic
    /* renamed from: fromByte-DHQ6RzY */
    public long[] mo9376fromByteDHQ6RzY(byte b) {
        return new long[]{ULong.m28605constructorimpl(Math.abs((int) b))};
    }
}
