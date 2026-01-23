package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.os.Bundle2;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.singular.sdk.internal.Constants;
import com.stripe.android.R$dimen;
import com.stripe.android.R$id;
import com.stripe.android.R$styleable;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.Cvc;
import com.stripe.android.databinding.StripeCardInputWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: CardInputWidget.kt */
@Metadata(m3635d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012*\u0002 \u0001\b\u0007\u0018\u0000 \u0087\u00022\u00020\u00012\u00020\u0002:\u001c\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u0087\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u000b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020$0(H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010#J\u000f\u0010-\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010\rJ\u000f\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010\rJ\u001d\u00101\u001a\u00020\u000b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0(H\u0002¢\u0006\u0004\b1\u0010+J\u000f\u00102\u001a\u00020\u000bH\u0014¢\u0006\u0004\b2\u0010\rJ\u000f\u00103\u001a\u00020\u000bH\u0014¢\u0006\u0004\b3\u0010\rJ\u000f\u00104\u001a\u00020\u000bH\u0014¢\u0006\u0004\b4\u0010\rJ\u0019\u00107\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010;\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010>\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u001cH\u0016¢\u0006\u0004\bA\u0010?J\u0019\u0010C\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\bC\u0010?J\u0019\u0010F\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\bE\u0010?J\u001b\u0010H\u001a\u00020\u000b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020$0(¢\u0006\u0004\bH\u0010+J\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000eH\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010N\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001a\u00020\u000b2\b\u0010P\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bQ\u0010OJ\u0019\u0010S\u001a\u00020\u000b2\b\u0010R\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bS\u0010OJ\u0019\u0010U\u001a\u00020\u000b2\b\u0010T\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bU\u0010OJ\u000f\u0010I\u001a\u00020\u000eH\u0016¢\u0006\u0004\bI\u0010\u0010J\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020ZH\u0014¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020ZH\u0014¢\u0006\u0004\b^\u0010_J+\u0010d\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007H\u0001¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020\u000b2\b\u0010e\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bf\u0010?J\u0017\u0010j\u001a\u00020\u001c2\u0006\u0010g\u001a\u00020\u0007H\u0001¢\u0006\u0004\bh\u0010iJ7\u0010p\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u000e2\u0006\u0010l\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u00072\u0006\u0010n\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u0007H\u0014¢\u0006\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010{\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0081\u0001R \u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009c\u0001\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R7\u0010¤\u0001\u001a\u00020\u000e2\u0007\u0010£\u0001\u001a\u00020\u000e8\u0000@BX\u0081\u000e¢\u0006\u001d\n\u0006\b¤\u0001\u0010¥\u0001\u0012\u0005\b¨\u0001\u0010\r\u001a\u0005\b¦\u0001\u0010\u0010\"\u0005\b§\u0001\u0010KR%\u0010`\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b`\u0010¥\u0001\u001a\u0005\b©\u0001\u0010\u0010\"\u0005\bª\u0001\u0010KR\u0019\u0010«\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¥\u0001R*\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R \u0010´\u0001\u001a\u00030³\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R-\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0¸\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b¹\u0001\u0010º\u0001\u0012\u0005\b½\u0001\u0010\r\u001a\u0006\b»\u0001\u0010¼\u0001R\u001e\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010º\u0001R,\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R0\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Ç\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R1\u0010Ó\u0001\u001a\u00020\u000e2\u0007\u0010Î\u0001\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0005\bÑ\u0001\u0010\u0010\"\u0005\bÒ\u0001\u0010KR1\u0010×\u0001\u001a\u00020\u000e2\u0007\u0010Î\u0001\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\bÔ\u0001\u0010Ð\u0001\u001a\u0005\bÕ\u0001\u0010\u0010\"\u0005\bÖ\u0001\u0010KR1\u0010Û\u0001\u001a\u00020\u000e2\u0007\u0010Î\u0001\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\bØ\u0001\u0010Ð\u0001\u001a\u0005\bÙ\u0001\u0010\u0010\"\u0005\bÚ\u0001\u0010KR4\u0010Ü\u0001\u001a\u0004\u0018\u00010\u001c2\t\u0010£\u0001\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\bÜ\u0001\u0010s\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0005\bß\u0001\u0010?R\u0018\u0010à\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bà\u0001\u0010sR\u001f\u0010ã\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010¾\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010¼\u0001R\u0019\u0010å\u0001\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010Þ\u0001R\u001a\u0010é\u0001\u001a\u0005\u0018\u00010æ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001R$\u0010í\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0(8@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bì\u0001\u0010\r\u001a\u0006\bê\u0001\u0010ë\u0001R\u001a\u0010ñ\u0001\u001a\u0005\u0018\u00010î\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001R\u0016\u0010a\u001a\u00020\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0016\u0010\u0012\u001a\u00020\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010ó\u0001R\u0017\u0010ö\u0001\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010Þ\u0001R\u0017\u0010ø\u0001\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010Þ\u0001R\u0013\u0010%\u001a\u00020$8F¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u001a\u0010þ\u0001\u001a\u0005\u0018\u00010û\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010ý\u0001R\u001a\u0010\u0082\u0002\u001a\u0005\u0018\u00010ÿ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R\u001a\u0010\u0086\u0002\u001a\u0005\u0018\u00010\u0083\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002¨\u0006\u0095\u0002"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updatePostalRequired", "()V", "", "isPostalRequired", "()Z", "touchX", "frameStart", "Lcom/stripe/android/view/CardInputWidget$Field;", "getFocusField", "(II)Lcom/stripe/android/view/CardInputWidget$Field;", "Landroid/view/View;", "view", "newWidth", "newMarginStart", "updateFieldLayout", "(Landroid/view/View;II)V", "", "text", "Lcom/stripe/android/view/StripeEditText;", "editText", "getDesiredWidthInPixels", "(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I", "initView", "(Landroid/util/AttributeSet;)V", "Lcom/stripe/android/model/CardBrand;", "brand", "updateCvc", "(Lcom/stripe/android/model/CardBrand;)V", "", "brands", "handlePossibleCardBrandsChanged", "(Ljava/util/List;)V", "applyCardElementAttributes", "scrollStart", "scrollEnd", "Landroid/view/animation/Animation;", "animations", "startSlideAnimation", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "Lcom/stripe/android/view/CardValidCallback;", "callback", "setCardValidCallback", "(Lcom/stripe/android/view/CardValidCallback;)V", "Lcom/stripe/android/view/CardInputListener;", "listener", "setCardInputListener", "(Lcom/stripe/android/view/CardInputListener;)V", "cardNumber", "setCardNumber", "(Ljava/lang/String;)V", "cardHint", "setCardHint", "cvcCode", "setCvcCode", "postalCode", "setPostalCode$payments_core_release", "setPostalCode", "preferredNetworks", "setPreferredNetworks", "isEnabled", "setEnabled", "(Z)V", "Landroid/text/TextWatcher;", "cardNumberTextWatcher", "setCardNumberTextWatcher", "(Landroid/text/TextWatcher;)V", "expiryDateTextWatcher", "setExpiryDateTextWatcher", "cvcNumberTextWatcher", "setCvcNumberTextWatcher", "postalCodeTextWatcher", "setPostalCodeTextWatcher", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "isShowingFullCard", "frameWidth", "updateSpaceSizes$payments_core_release", "(ZII)V", "updateSpaceSizes", "cvcLabel", "setCvcLabel", "panLength", "createHiddenCardText$payments_core_release", "(I)Ljava/lang/String;", "createHiddenCardText", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "l", "t", Constants.REVENUE_AMOUNT_KEY, "b", "onLayout", "(ZIIII)V", "customCvcLabel", "Ljava/lang/String;", "Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;", "viewBinding", "Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;", "Landroid/widget/FrameLayout;", "containerLayout", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/view/CardBrandView;", "cardBrandView", "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_release", "()Lcom/stripe/android/view/CardBrandView;", "Lcom/google/android/material/textfield/TextInputLayout;", "cardNumberTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "expiryDateTextInputLayout", "cvcNumberTextInputLayout", "postalCodeTextInputLayout", "Lcom/stripe/android/view/CardNumberEditText;", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText$payments_core_release", "()Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/ExpiryDateEditText;", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText$payments_core_release", "()Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/CvcEditText;", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText$payments_core_release", "()Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/PostalCodeEditText;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "Lcom/stripe/android/view/LifecycleOwnerDelegate;", "lifecycleDelegate", "Lcom/stripe/android/view/LifecycleOwnerDelegate;", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "com/stripe/android/view/CardInputWidget$cardValidTextWatcher$1", "cardValidTextWatcher", "Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;", "value", "shouldShowErrorIcon", "Z", "getShouldShowErrorIcon$payments_core_release", "setShouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_release$annotations", "isShowingFullCard$payments_core_release", "setShowingFullCard$payments_core_release", "isViewInitialized", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "layoutWidthCalculator", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "getLayoutWidthCalculator$payments_core_release", "()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "setLayoutWidthCalculator$payments_core_release", "(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V", "Lcom/stripe/android/view/CardInputWidgetPlacement;", "placement", "Lcom/stripe/android/view/CardInputWidgetPlacement;", "getPlacement$payments_core_release", "()Lcom/stripe/android/view/CardInputWidgetPlacement;", "", "requiredFields", "Ljava/util/Set;", "getRequiredFields$payments_core_release", "()Ljava/util/Set;", "getRequiredFields$payments_core_release$annotations", "", "allFields", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/ViewModelStoreOwner;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "Lkotlin/Function0;", "frameWidthSupplier", "Lkotlin/jvm/functions/Function0;", "getFrameWidthSupplier$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setFrameWidthSupplier$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "postalCodeEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPostalCodeEnabled", "setPostalCodeEnabled", "postalCodeEnabled", "postalCodeRequired$delegate", "getPostalCodeRequired", "setPostalCodeRequired", "postalCodeRequired", "usZipCodeRequired$delegate", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired", "onBehalfOf", "getOnBehalfOf", "()Ljava/lang/String;", "setOnBehalfOf", "hiddenCardText", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields", "invalidFields", "getPostalCodeValue", "postalCodeValue", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc", "()Lcom/stripe/android/cards/Cvc$Validated;", "cvc", "getCurrentFields$payments_core_release", "()Ljava/util/List;", "getCurrentFields$payments_core_release$annotations", "currentFields", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "getFrameWidth", "()I", "getFrameStart", "getCvcPlaceHolder", "cvcPlaceHolder", "getPeekCardText", "peekCardText", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardParams", "Companion", "AnimationEndListener", "CardFieldAnimation", "CardNumberSlideEndAnimation", "CardNumberSlideStartAnimation", "CvcSlideEndAnimation", "CvcSlideStartAnimation", "DefaultLayoutWidthCalculator", "ExpiryDateSlideEndAnimation", "ExpiryDateSlideStartAnimation", "Field", "LayoutWidthCalculator", "PostalCodeSlideEndAnimation", "PostalCodeSlideStartAnimation", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CardInputWidget extends LinearLayout {
    private final Set<StripeEditText> allFields;
    private final /* synthetic */ CardBrandView cardBrandView;
    private CardInputListener cardInputListener;
    private final /* synthetic */ CardNumberEditText cardNumberEditText;
    private final TextInputLayout cardNumberTextInputLayout;
    private CardValidCallback cardValidCallback;
    private final CardInputWidget2 cardValidTextWatcher;
    private final FrameLayout containerLayout;
    private String customCvcLabel;
    private final /* synthetic */ CvcEditText cvcEditText;
    private final TextInputLayout cvcNumberTextInputLayout;
    private final /* synthetic */ ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryDateTextInputLayout;
    private /* synthetic */ Function0<Integer> frameWidthSupplier;
    private String hiddenCardText;
    private /* synthetic */ boolean isShowingFullCard;
    private boolean isViewInitialized;
    private /* synthetic */ LayoutWidthCalculator layoutWidthCalculator;
    private final LifecycleOwnerDelegate lifecycleDelegate;
    private String onBehalfOf;
    private final CardInputWidgetPlacement placement;
    private final /* synthetic */ PostalCodeEditText postalCodeEditText;

    /* renamed from: postalCodeEnabled$delegate, reason: from kotlin metadata */
    private final Interfaces3 postalCodeEnabled;

    /* renamed from: postalCodeRequired$delegate, reason: from kotlin metadata */
    private final Interfaces3 postalCodeRequired;
    private final TextInputLayout postalCodeTextInputLayout;
    private final /* synthetic */ Set<StripeEditText> requiredFields;
    private boolean shouldShowErrorIcon;

    /* renamed from: usZipCodeRequired$delegate, reason: from kotlin metadata */
    private final Interfaces3 usZipCodeRequired;
    private final StripeCardInputWidgetBinding viewBinding;
    private ViewModelStoreOwner viewModelStoreOwner;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "postalCodeEnabled", "getPostalCodeEnabled()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "postalCodeRequired", "getPostalCodeRequired()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0))};
    public static final int $stable = 8;
    private static final int DEFAULT_READER_ID = R$id.stripe_default_reader_id;

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$AnimationEndListener;", "Landroid/view/animation/Animation$AnimationListener;", "()V", "onAnimationRepeat", "", "animation", "Landroid/view/animation/Animation;", "onAnimationStart", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static abstract class AnimationEndListener implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "", "calculate", "", "text", "", "paint", "Landroid/text/TextPaint;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface LayoutWidthCalculator {
        int calculate(String text, TextPaint paint);
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Field.values().length];
            try {
                iArr[Field.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Field.Expiry.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Field.Cvc.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Field.PostalCode.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardInputWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getCurrentFields$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getRequiredFields$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    public /* synthetic */ CardInputWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.stripe.android.view.CardInputWidget$cardValidTextWatcher$1] */
    @JvmOverloads
    public CardInputWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeCardInputWidgetBinding stripeCardInputWidgetBindingInflate = StripeCardInputWidgetBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeCardInputWidgetBindingInflate, "inflate(...)");
        this.viewBinding = stripeCardInputWidgetBindingInflate;
        FrameLayout container = stripeCardInputWidgetBindingInflate.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        this.containerLayout = container;
        CardBrandView cardBrandView = stripeCardInputWidgetBindingInflate.cardBrandView;
        Intrinsics.checkNotNullExpressionValue(cardBrandView, "cardBrandView");
        this.cardBrandView = cardBrandView;
        TextInputLayout cardNumberTextInputLayout = stripeCardInputWidgetBindingInflate.cardNumberTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(cardNumberTextInputLayout, "cardNumberTextInputLayout");
        this.cardNumberTextInputLayout = cardNumberTextInputLayout;
        TextInputLayout expiryDateTextInputLayout = stripeCardInputWidgetBindingInflate.expiryDateTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(expiryDateTextInputLayout, "expiryDateTextInputLayout");
        this.expiryDateTextInputLayout = expiryDateTextInputLayout;
        TextInputLayout cvcTextInputLayout = stripeCardInputWidgetBindingInflate.cvcTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(cvcTextInputLayout, "cvcTextInputLayout");
        this.cvcNumberTextInputLayout = cvcTextInputLayout;
        TextInputLayout postalCodeTextInputLayout = stripeCardInputWidgetBindingInflate.postalCodeTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(postalCodeTextInputLayout, "postalCodeTextInputLayout");
        this.postalCodeTextInputLayout = postalCodeTextInputLayout;
        CardNumberEditText cardNumberEditText = stripeCardInputWidgetBindingInflate.cardNumberEditText;
        Intrinsics.checkNotNullExpressionValue(cardNumberEditText, "cardNumberEditText");
        this.cardNumberEditText = cardNumberEditText;
        ExpiryDateEditText expiryDateEditText = stripeCardInputWidgetBindingInflate.expiryDateEditText;
        Intrinsics.checkNotNullExpressionValue(expiryDateEditText, "expiryDateEditText");
        this.expiryDateEditText = expiryDateEditText;
        CvcEditText cvcEditText = stripeCardInputWidgetBindingInflate.cvcEditText;
        Intrinsics.checkNotNullExpressionValue(cvcEditText, "cvcEditText");
        this.cvcEditText = cvcEditText;
        PostalCodeEditText postalCodeEditText = stripeCardInputWidgetBindingInflate.postalCodeEditText;
        Intrinsics.checkNotNullExpressionValue(postalCodeEditText, "postalCodeEditText");
        this.postalCodeEditText = postalCodeEditText;
        this.lifecycleDelegate = new LifecycleOwnerDelegate();
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardInputWidget$cardValidTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                super.afterTextChanged(s);
                CardValidCallback cardValidCallback = this.this$0.cardValidCallback;
                if (cardValidCallback != null) {
                    cardValidCallback.onInputChanged(this.this$0.getInvalidFields().isEmpty(), this.this$0.getInvalidFields());
                }
            }
        };
        this.isShowingFullCard = true;
        this.layoutWidthCalculator = new DefaultLayoutWidthCalculator();
        this.placement = new CardInputWidgetPlacement(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.TRUE;
        this.postalCodeEnabled = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.getClass();
                if (zBooleanValue) {
                    this.getPostalCodeEditText().setEnabled(true);
                    this.postalCodeTextInputLayout.setVisibility(0);
                    this.getCvcEditText().setImeOptions(5);
                    this.getPostalCodeEditText().removeTextChangedListener(this.cardValidTextWatcher);
                    this.getPostalCodeEditText().addTextChangedListener(this.cardValidTextWatcher);
                } else {
                    this.getPostalCodeEditText().setEnabled(false);
                    this.postalCodeTextInputLayout.setVisibility(8);
                    this.getCvcEditText().setImeOptions(6);
                    this.getPostalCodeEditText().removeTextChangedListener(this.cardValidTextWatcher);
                }
                this.updatePostalRequired();
            }
        };
        final Boolean bool2 = Boolean.FALSE;
        this.postalCodeRequired = new ObservableProperty<Boolean>(bool2) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.getClass();
                oldValue.getClass();
                this.updatePostalRequired();
            }
        };
        this.usZipCodeRequired = new ObservableProperty<Boolean>(bool2) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.getClass();
                if (zBooleanValue) {
                    this.getPostalCodeEditText().setConfig$payments_core_release(PostalCodeEditText.Config.f6427US);
                } else {
                    this.getPostalCodeEditText().setConfig$payments_core_release(PostalCodeEditText.Config.Global);
                }
                this.updatePostalRequired();
            }
        };
        if (getId() == -1) {
            setId(DEFAULT_READER_ID);
        }
        setOrientation(0);
        setMinimumWidth(getResources().getDimensionPixelSize(R$dimen.stripe_card_widget_min_width));
        this.frameWidthSupplier = new Function0<Integer>() { // from class: com.stripe.android.view.CardInputWidget.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(CardInputWidget.this.containerLayout.getWidth());
            }
        };
        Set<StripeEditText> setMutableSetOf = SetsKt.mutableSetOf(cardNumberEditText, cvcEditText, expiryDateEditText);
        this.requiredFields = setMutableSetOf;
        this.allFields = SetsKt.plus(setMutableSetOf, postalCodeEditText);
        initView(attributeSet);
        this.hiddenCardText = createHiddenCardText$payments_core_release(cardNumberEditText.getPanLength$payments_core_release());
    }

    /* renamed from: getCardBrandView$payments_core_release, reason: from getter */
    public final CardBrandView getCardBrandView() {
        return this.cardBrandView;
    }

    /* renamed from: getCardNumberEditText$payments_core_release, reason: from getter */
    public final CardNumberEditText getCardNumberEditText() {
        return this.cardNumberEditText;
    }

    /* renamed from: getExpiryDateEditText$payments_core_release, reason: from getter */
    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.expiryDateEditText;
    }

    /* renamed from: getCvcEditText$payments_core_release, reason: from getter */
    public final CvcEditText getCvcEditText() {
        return this.cvcEditText;
    }

    /* renamed from: getPostalCodeEditText$payments_core_release, reason: from getter */
    public final PostalCodeEditText getPostalCodeEditText() {
        return this.postalCodeEditText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<CardValidCallback.Fields> getInvalidFields() {
        String postalCode$payments_core_release;
        CardValidCallback.Fields fields = CardValidCallback.Fields.Number;
        CardValidCallback.Fields fields2 = null;
        if (this.cardNumberEditText.getValidatedCardNumber$payments_core_release() != null) {
            fields = null;
        }
        CardValidCallback.Fields fields3 = CardValidCallback.Fields.Expiry;
        if (this.expiryDateEditText.getValidatedDate() != null) {
            fields3 = null;
        }
        CardValidCallback.Fields fields4 = CardValidCallback.Fields.Cvc;
        if (getCvc() != null) {
            fields4 = null;
        }
        CardValidCallback.Fields fields5 = CardValidCallback.Fields.Postal;
        if (isPostalRequired() && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || StringsKt.isBlank(postalCode$payments_core_release))) {
            fields2 = fields5;
        }
        return CollectionsKt.toSet(CollectionsKt.listOfNotNull((Object[]) new CardValidCallback.Fields[]{fields, fields3, fields4, fields2}));
    }

    /* renamed from: getShouldShowErrorIcon$payments_core_release, reason: from getter */
    public final boolean getShouldShowErrorIcon() {
        return this.shouldShowErrorIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShouldShowErrorIcon(boolean z) {
        this.cardBrandView.setShouldShowErrorIcon(z);
        this.shouldShowErrorIcon = z;
    }

    public final void setShowingFullCard$payments_core_release(boolean z) {
        this.isShowingFullCard = z;
    }

    /* renamed from: getLayoutWidthCalculator$payments_core_release, reason: from getter */
    public final LayoutWidthCalculator getLayoutWidthCalculator() {
        return this.layoutWidthCalculator;
    }

    public final void setLayoutWidthCalculator$payments_core_release(LayoutWidthCalculator layoutWidthCalculator) {
        Intrinsics.checkNotNullParameter(layoutWidthCalculator, "<set-?>");
        this.layoutWidthCalculator = layoutWidthCalculator;
    }

    /* renamed from: getPlacement$payments_core_release, reason: from getter */
    public final CardInputWidgetPlacement getPlacement() {
        return this.placement;
    }

    private final String getPostalCodeValue() {
        if (getPostalCodeEnabled()) {
            return this.postalCodeEditText.getPostalCode$payments_core_release();
        }
        return null;
    }

    private final Cvc.Validated getCvc() {
        return this.cvcEditText.getCvc$payments_core_release();
    }

    public final CardBrand getBrand() {
        return this.cardNumberEditText.getCardBrand();
    }

    public final Set<StripeEditText> getRequiredFields$payments_core_release() {
        return this.requiredFields;
    }

    public final /* synthetic */ List getCurrentFields$payments_core_release() {
        Set<StripeEditText> set = this.requiredFields;
        PostalCodeEditText postalCodeEditText = this.postalCodeEditText;
        if (!getPostalCodeEnabled()) {
            postalCodeEditText = null;
        }
        return CollectionsKt.filterNotNull(SetsKt.plus(set, postalCodeEditText));
    }

    /* renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.viewModelStoreOwner = viewModelStoreOwner;
    }

    public PaymentMethodCreateParams.Card getPaymentMethodCard() {
        CardParams cardParams = getCardParams();
        if (cardParams == null) {
            return null;
        }
        String number = cardParams.getNumber();
        String cvc = cardParams.getCvc();
        int expMonth = cardParams.getExpMonth();
        int expYear = cardParams.getExpYear();
        return new PaymentMethodCreateParams.Card(number, Integer.valueOf(expMonth), Integer.valueOf(expYear), cvc, null, cardParams.getAttribution(), this.cardBrandView.paymentMethodCreateParamsNetworks(), 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PaymentMethod.BillingDetails getBillingDetails() {
        String postalCodeValue = getPostalCodeValue();
        if (postalCodeValue == null) {
            return null;
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        return new PaymentMethod.BillingDetails(new Address(str, str2, str3, str4, postalCodeValue, str5, 47, null), 0 == true ? 1 : 0, str6, str7, 14, null);
    }

    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, paymentMethodCard, getBillingDetails(), (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
        }
        return null;
    }

    public CardParams getCardParams() {
        String postalCode$payments_core_release;
        CardNumber.Validated validatedCardNumber$payments_core_release = this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
        ExpirationDate.Validated validatedDate = this.expiryDateEditText.getValidatedDate();
        Cvc.Validated cvc = getCvc();
        this.cardNumberEditText.setShouldShowError(validatedCardNumber$payments_core_release == null);
        this.expiryDateEditText.setShouldShowError(validatedDate == null);
        this.cvcEditText.setShouldShowError(cvc == null);
        this.postalCodeEditText.setShouldShowError((getPostalCodeRequired() || getUsZipCodeRequired()) && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || StringsKt.isBlank(postalCode$payments_core_release)));
        List currentFields$payments_core_release = getCurrentFields$payments_core_release();
        ArrayList<StripeEditText> arrayList = new ArrayList();
        for (Object obj : currentFields$payments_core_release) {
            if (((StripeEditText) obj).getShouldShowError()) {
                arrayList.add(obj);
            }
        }
        for (StripeEditText stripeEditText : arrayList) {
            String errorMessage = stripeEditText.getErrorMessage();
            if (errorMessage != null) {
                stripeEditText.announceForAccessibility(errorMessage);
            }
        }
        String str = null;
        if (validatedCardNumber$payments_core_release == null) {
            this.cardNumberEditText.requestFocus();
        } else if (validatedDate == null) {
            this.expiryDateEditText.requestFocus();
        } else if (cvc == null) {
            this.cvcEditText.requestFocus();
        } else if (this.postalCodeEditText.getShouldShowError()) {
            this.postalCodeEditText.requestFocus();
        } else {
            setShouldShowErrorIcon(false);
            CardBrand brand = getBrand();
            Set of = SetsKt.setOf("CardInputView");
            String value = validatedCardNumber$payments_core_release.getValue();
            int month = validatedDate.getMonth();
            int year = validatedDate.getYear();
            String value$payments_core_release = cvc.getValue();
            Address.Builder builder = new Address.Builder();
            String postalCodeValue = getPostalCodeValue();
            if (postalCodeValue != null && !StringsKt.isBlank(postalCodeValue)) {
                str = postalCodeValue;
            }
            return new CardParams(brand, of, value, month, year, value$payments_core_release, null, builder.setPostalCode(str).build(), null, this.cardBrandView.cardParamsNetworks(), null, 1344, null);
        }
        setShouldShowErrorIcon(true);
        return null;
    }

    private final int getFrameWidth() {
        return this.frameWidthSupplier.invoke().intValue();
    }

    public final Function0<Integer> getFrameWidthSupplier$payments_core_release() {
        return this.frameWidthSupplier;
    }

    public final void setFrameWidthSupplier$payments_core_release(Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.frameWidthSupplier = function0;
    }

    public final boolean getPostalCodeEnabled() {
        return ((Boolean) this.postalCodeEnabled.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setPostalCodeEnabled(boolean z) {
        this.postalCodeEnabled.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final boolean getPostalCodeRequired() {
        return ((Boolean) this.postalCodeRequired.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final void setPostalCodeRequired(boolean z) {
        this.postalCodeRequired.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final void setUsZipCodeRequired(boolean z) {
        this.usZipCodeRequired.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final void setOnBehalfOf(final String str) {
        if (Intrinsics.areEqual(this.onBehalfOf, str)) {
            return;
        }
        if (isAttachedToWindow()) {
            CardWidgetViewModel6.doWithCardWidgetViewModel(this, this.viewModelStoreOwner, new Function2<LifecycleOwner, CardWidgetViewModel, Unit>() { // from class: com.stripe.android.view.CardInputWidget$onBehalfOf$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner, CardWidgetViewModel cardWidgetViewModel) {
                    invoke2(lifecycleOwner, cardWidgetViewModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
                    Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
                    Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                    viewModel.setOnBehalfOf(str);
                }
            });
        }
        this.onBehalfOf = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePostalRequired() {
        if (isPostalRequired()) {
            this.requiredFields.add(this.postalCodeEditText);
        } else {
            this.requiredFields.remove(this.postalCodeEditText);
        }
    }

    private final boolean isPostalRequired() {
        return (getPostalCodeRequired() || getUsZipCodeRequired()) && getPostalCodeEnabled();
    }

    private final int getFrameStart() {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 0) {
            return this.containerLayout.getLeft();
        }
        return this.containerLayout.getRight();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lifecycleDelegate.initLifecycle(this);
        CardWidgetViewModel6.doWithCardWidgetViewModel(this, this.viewModelStoreOwner, new Function2<LifecycleOwner, CardWidgetViewModel, Unit>() { // from class: com.stripe.android.view.CardInputWidget.onAttachedToWindow.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner, CardWidgetViewModel cardWidgetViewModel) {
                invoke2(lifecycleOwner, cardWidgetViewModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
                Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                if (CardInputWidget.this.getOnBehalfOf() != null && !Intrinsics.areEqual(viewModel.get_onBehalfOf(), CardInputWidget.this.getOnBehalfOf())) {
                    viewModel.setOnBehalfOf(CardInputWidget.this.getOnBehalfOf());
                }
                StateFlow<Boolean> stateFlowIsCbcEligible = viewModel.isCbcEligible();
                CardInputWidget cardInputWidget = CardInputWidget.this;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(doWithCardWidgetViewModel), null, null, new CardWidgetViewModel2(doWithCardWidgetViewModel, Lifecycle.State.STARTED, stateFlowIsCbcEligible, null, cardInputWidget), 3, null);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycleDelegate.destroyLifecycle(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
    }

    public void setCardValidCallback(CardValidCallback callback) {
        this.cardValidCallback = callback;
        Iterator<T> it = this.requiredFields.iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (callback != null) {
            Iterator<T> it2 = this.requiredFields.iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback = this.cardValidCallback;
        if (cardValidCallback != null) {
            cardValidCallback.onInputChanged(getInvalidFields().isEmpty(), getInvalidFields());
        }
    }

    public void setCardInputListener(CardInputListener listener) {
        this.cardInputListener = listener;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumberEditText.setText(cardNumber);
        this.isShowingFullCard = !this.cardNumberEditText.getIsCardNumberValid();
    }

    public void setCardHint(String cardHint) {
        Intrinsics.checkNotNullParameter(cardHint, "cardHint");
        this.cardNumberEditText.setHint(cardHint);
    }

    public void setCvcCode(String cvcCode) {
        this.cvcEditText.setText(cvcCode);
    }

    public final /* synthetic */ void setPostalCode$payments_core_release(String postalCode) {
        this.postalCodeEditText.setText(postalCode);
    }

    public final void setPreferredNetworks(List<? extends CardBrand> preferredNetworks) {
        Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
        this.cardBrandView.setMerchantPreferredNetworks(preferredNetworks);
    }

    @Override // android.view.View
    public void setEnabled(boolean isEnabled) {
        Iterator it = getCurrentFields$payments_core_release().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).setEnabled(isEnabled);
        }
    }

    public void setCardNumberTextWatcher(TextWatcher cardNumberTextWatcher) {
        this.cardNumberEditText.addTextChangedListener(cardNumberTextWatcher);
    }

    public void setExpiryDateTextWatcher(TextWatcher expiryDateTextWatcher) {
        this.expiryDateEditText.addTextChangedListener(expiryDateTextWatcher);
    }

    public void setCvcNumberTextWatcher(TextWatcher cvcNumberTextWatcher) {
        this.cvcEditText.addTextChangedListener(cvcNumberTextWatcher);
    }

    public void setPostalCodeTextWatcher(TextWatcher postalCodeTextWatcher) {
        this.postalCodeEditText.addTextChangedListener(postalCodeTextWatcher);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        Set<StripeEditText> set = this.requiredFields;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (!((StripeEditText) it.next()).isEnabled()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        View view;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() != 0) {
            return super.onInterceptTouchEvent(ev);
        }
        Field focusField = getFocusField((int) ev.getX(), getFrameStart());
        if (focusField != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[focusField.ordinal()];
            if (i == 1) {
                view = this.cardNumberEditText;
            } else if (i == 2) {
                view = this.expiryDateEditText;
            } else if (i == 3) {
                view = this.cvcEditText;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                view = this.postalCodeEditText;
            }
            view.requestFocus();
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return Bundle2.bundleOf(Tuples4.m3642to("state_super_state", super.onSaveInstanceState()), Tuples4.m3642to("state_card_viewed", Boolean.valueOf(this.isShowingFullCard)), Tuples4.m3642to("state_postal_code_enabled", Boolean.valueOf(getPostalCodeEnabled())), Tuples4.m3642to("state_on_behalf_of", this.onBehalfOf));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setPostalCodeEnabled(bundle.getBoolean("state_postal_code_enabled", true));
            this.isShowingFullCard = bundle.getBoolean("state_card_viewed", true);
            setOnBehalfOf(bundle.getString("state_on_behalf_of"));
            super.onRestoreInstanceState(bundle.getParcelable("state_super_state"));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    private final Field getFocusField(int touchX, int frameStart) {
        return this.placement.getFocusField$payments_core_release(touchX, frameStart, this.isShowingFullCard, getPostalCodeEnabled());
    }

    public static /* synthetic */ void updateSpaceSizes$payments_core_release$default(CardInputWidget cardInputWidget, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = cardInputWidget.getFrameWidth();
        }
        if ((i3 & 4) != 0) {
            i2 = cardInputWidget.getFrameStart();
        }
        cardInputWidget.updateSpaceSizes$payments_core_release(z, i, i2);
    }

    public final void updateSpaceSizes$payments_core_release(boolean isShowingFullCard, int frameWidth, int frameStart) {
        if (frameWidth == 0) {
            return;
        }
        this.placement.setCardWidth$payments_core_release(getDesiredWidthInPixels("4242 4242 4242 4242 424", this.cardNumberEditText));
        this.placement.setDateWidth$payments_core_release(getDesiredWidthInPixels("MM/MM", this.expiryDateEditText));
        this.placement.setHiddenCardWidth$payments_core_release(getDesiredWidthInPixels(this.hiddenCardText, this.cardNumberEditText));
        this.placement.setCvcWidth$payments_core_release(getDesiredWidthInPixels(getCvcPlaceHolder(), this.cvcEditText));
        this.placement.setPostalCodeWidth$payments_core_release(getDesiredWidthInPixels("1234567890", this.postalCodeEditText));
        this.placement.setPeekCardWidth$payments_core_release(getDesiredWidthInPixels(getPeekCardText(), this.cardNumberEditText));
        this.placement.updateSpacing$payments_core_release(isShowingFullCard, getPostalCodeEnabled(), frameStart, frameWidth);
    }

    private final int getDesiredWidthInPixels(String text, StripeEditText editText) {
        LayoutWidthCalculator layoutWidthCalculator = this.layoutWidthCalculator;
        TextPaint paint = editText.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        return layoutWidthCalculator.calculate(text, paint);
    }

    private final void initView(AttributeSet attrs) {
        applyCardElementAttributes(attrs);
        ViewCompat.setAccessibilityDelegate(this.cardNumberEditText, new AccessibilityDelegateCompat() { // from class: com.stripe.android.view.CardInputWidget.initView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setHintText(null);
            }
        });
        this.isShowingFullCard = true;
        int defaultErrorColorInt = this.cardNumberEditText.getDefaultErrorColorInt();
        this.cardBrandView.setTintColorInt$payments_core_release(this.cardNumberEditText.getHintTextColors().getDefaultColor());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] CardInputView = R$styleable.CardInputView;
        Intrinsics.checkNotNullExpressionValue(CardInputView, "CardInputView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CardInputView, 0, 0);
        CardBrandView cardBrandView = this.cardBrandView;
        cardBrandView.setTintColorInt$payments_core_release(typedArrayObtainStyledAttributes.getColor(R$styleable.CardInputView_cardTint, cardBrandView.getTintColorInt$payments_core_release()));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.CardInputView_cardTextErrorColor, defaultErrorColorInt);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.CardInputView_cardHintText);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardInputView_android_focusedByDefault, true);
        typedArrayObtainStyledAttributes.recycle();
        if (string2 != null) {
            this.cardNumberEditText.setHint(string2);
        }
        Iterator it = getCurrentFields$payments_core_release().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).setErrorColor(color);
        }
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$27(this.f$0, view, z2);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$28(this.f$0, view, z2);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$29(this.f$0, view, z2);
            }
        });
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$30(this.f$0, view, z2);
            }
        });
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda4
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String str) {
                CardInputWidget.initView$lambda$31(this.f$0, str);
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda5
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String str) {
                CardInputWidget.initView$lambda$32(this.f$0, str);
            }
        });
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new Function0<Unit>() { // from class: com.stripe.android.view.CardInputWidget.initView.11
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CardInputWidget.this.scrollEnd();
                CardInputListener cardInputListener = CardInputWidget.this.cardInputListener;
                if (cardInputListener != null) {
                    cardInputListener.onCardComplete();
                }
            }
        });
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new Function1<CardBrand, Unit>() { // from class: com.stripe.android.view.CardInputWidget.initView.12
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand) throws Resources.NotFoundException {
                invoke2(cardBrand);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CardBrand brand) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(brand, "brand");
                CardInputWidget.this.getCardBrandView().setBrand(brand);
                CardInputWidget cardInputWidget = CardInputWidget.this;
                cardInputWidget.hiddenCardText = cardInputWidget.createHiddenCardText$payments_core_release(cardInputWidget.getCardNumberEditText().getPanLength$payments_core_release());
                CardInputWidget.this.updateCvc(brand);
            }
        });
        this.cardNumberEditText.setImplicitCardBrandChangeCallback$payments_core_release(new Function1<CardBrand, Unit>() { // from class: com.stripe.android.view.CardInputWidget.initView.13
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand) throws Resources.NotFoundException {
                invoke2(cardBrand);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CardBrand brand) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(brand, "brand");
                CardInputWidget cardInputWidget = CardInputWidget.this;
                cardInputWidget.hiddenCardText = cardInputWidget.createHiddenCardText$payments_core_release(cardInputWidget.getCardNumberEditText().getPanLength$payments_core_release());
                CardInputWidget.this.updateCvc(brand);
            }
        });
        this.cardNumberEditText.setPossibleCardBrandsCallback$payments_core_release(new C4265414(this));
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new Function0<Unit>() { // from class: com.stripe.android.view.CardInputWidget.initView.15
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CardInputWidget.this.getCvcEditText().requestFocus();
                CardInputListener cardInputListener = CardInputWidget.this.cardInputListener;
                if (cardInputListener != null) {
                    cardInputListener.onExpirationComplete();
                }
            }
        });
        this.cvcEditText.setCompletionCallback$payments_core_release(new Function0<Unit>() { // from class: com.stripe.android.view.CardInputWidget.initView.16
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (CardInputWidget.this.getPostalCodeEnabled()) {
                    CardInputWidget.this.getPostalCodeEditText().requestFocus();
                }
            }
        });
        Iterator<T> it2 = this.allFields.iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardInputWidget$initView$lambda$34$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    this.this$0.setShouldShowErrorIcon(false);
                }
            });
        }
        if (z) {
            this.cardNumberEditText.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$27(CardInputWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.scrollStart();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.CardNumber);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$28(CardInputWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.ExpiryDate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$29(CardInputWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.PostalCode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$30(CardInputWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cardBrandView.setShouldShowCvc(z);
        if (z) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.Cvc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$31(CardInputWidget this$0, String text) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(text, "text");
        if (!this$0.getBrand().isMaxCvc(text) || (cardInputListener = this$0.cardInputListener) == null) {
            return;
        }
        cardInputListener.onCvcComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$32(CardInputWidget this$0, String it) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.postalCodeEditText.isEnabled() && this$0.postalCodeEditText.hasValidPostal$payments_core_release() && (cardInputListener = this$0.cardInputListener) != null) {
            cardInputListener.onPostalCodeComplete();
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.view.CardInputWidget$initView$14 */
    /* synthetic */ class C4265414 extends FunctionReferenceImpl implements Function1<List<? extends CardBrand>, Unit> {
        C4265414(Object obj) {
            super(1, obj, CardInputWidget.class, "handlePossibleCardBrandsChanged", "handlePossibleCardBrandsChanged(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CardBrand> list) throws Resources.NotFoundException {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends CardBrand> p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardInputWidget) this.receiver).handlePossibleCardBrandsChanged(p0);
        }
    }

    public final void setCvcLabel(String cvcLabel) throws Resources.NotFoundException {
        this.customCvcLabel = cvcLabel;
        updateCvc(this.cardBrandView.getBrand());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCvc(CardBrand brand) throws Resources.NotFoundException {
        CvcEditText.updateBrand$payments_core_release$default(this.cvcEditText, brand, this.customCvcLabel, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePossibleCardBrandsChanged(List<? extends CardBrand> brands) throws Resources.NotFoundException {
        CardBrand brand = this.cardBrandView.getBrand();
        this.cardBrandView.setPossibleBrands(brands);
        if (!brands.contains(brand)) {
            this.cardBrandView.setBrand(CardBrand.Unknown);
        }
        this.hiddenCardText = createHiddenCardText$payments_core_release(this.cardNumberEditText.getPanLength$payments_core_release());
        CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) brands);
        if (cardBrand == null) {
            cardBrand = CardBrand.Unknown;
        }
        updateCvc(cardBrand);
    }

    public final String createHiddenCardText$payments_core_release(int panLength) {
        String formatted = new CardNumber.Unvalidated(StringsKt.repeat("0", panLength)).getFormatted(panLength);
        return StringsKt.take(formatted, StringsKt.lastIndexOf$default((CharSequence) formatted, ' ', 0, false, 6, (Object) null) + 1);
    }

    private final void applyCardElementAttributes(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] CardElement = R$styleable.CardElement;
        Intrinsics.checkNotNullExpressionValue(CardElement, "CardElement");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CardElement, 0, 0);
        setPostalCodeEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardElement_shouldShowPostalCode, getPostalCodeEnabled()));
        setPostalCodeRequired(typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardElement_shouldRequirePostalCode, getPostalCodeRequired()));
        setUsZipCodeRequired(typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void scrollStart() {
        if (this.isShowingFullCard || !this.isViewInitialized) {
            return;
        }
        int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(false);
        int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
        int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
        updateSpaceSizes$payments_core_release$default(this, true, 0, 0, 6, null);
        CardNumberSlideStartAnimation cardNumberSlideStartAnimation = new CardNumberSlideStartAnimation(this.cardNumberTextInputLayout);
        int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(true);
        ExpiryDateSlideStartAnimation expiryDateSlideStartAnimation = new ExpiryDateSlideStartAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
        int i = (dateStartMargin$payments_core_release2 - dateStartMargin$payments_core_release) + cvcStartMargin$payments_core_release;
        startSlideAnimation(CollectionsKt.listOfNotNull((Object[]) new CardFieldAnimation[]{cardNumberSlideStartAnimation, expiryDateSlideStartAnimation, new CvcSlideStartAnimation(this.cvcNumberTextInputLayout, cvcStartMargin$payments_core_release, i, this.placement.getCvcWidth()), getPostalCodeEnabled() ? new PostalCodeSlideStartAnimation(this.postalCodeTextInputLayout, postalCodeStartMargin$payments_core_release, (i - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth()) : null}));
        this.isShowingFullCard = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollEnd() {
        if (this.isShowingFullCard && this.isViewInitialized) {
            int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(true);
            updateSpaceSizes$payments_core_release$default(this, false, 0, 0, 6, null);
            CardNumberSlideEndAnimation cardNumberSlideEndAnimation = new CardNumberSlideEndAnimation(this.cardNumberTextInputLayout, this.placement.getHiddenCardWidth(), this.expiryDateEditText);
            int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(false);
            ExpiryDateSlideEndAnimation expiryDateSlideEndAnimation = new ExpiryDateSlideEndAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
            int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
            int i = (dateStartMargin$payments_core_release - dateStartMargin$payments_core_release2) + cvcStartMargin$payments_core_release;
            CvcSlideEndAnimation cvcSlideEndAnimation = new CvcSlideEndAnimation(this.cvcNumberTextInputLayout, i, cvcStartMargin$payments_core_release, this.placement.getCvcWidth());
            int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
            startSlideAnimation(CollectionsKt.listOfNotNull((Object[]) new CardFieldAnimation[]{cardNumberSlideEndAnimation, expiryDateSlideEndAnimation, cvcSlideEndAnimation, getPostalCodeEnabled() ? new PostalCodeSlideEndAnimation(this.postalCodeTextInputLayout, (i - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release, postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth()) : null}));
            this.isShowingFullCard = false;
        }
    }

    private final void startSlideAnimation(List<? extends Animation> animations) {
        AnimationSet animationSet = new AnimationSet(true);
        Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            animationSet.addAnimation((Animation) it.next());
        }
        this.containerLayout.startAnimation(animationSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (this.isViewInitialized || getWidth() == 0) {
            return;
        }
        this.isViewInitialized = true;
        this.placement.setTotalLengthInPixels$payments_core_release(getFrameWidth());
        updateSpaceSizes$payments_core_release$default(this, this.isShowingFullCard, 0, 0, 6, null);
        updateFieldLayout(this.cardNumberTextInputLayout, this.placement.getCardWidth(), this.isShowingFullCard ? 0 : this.placement.getHiddenCardWidth() * (-1));
        updateFieldLayout(this.expiryDateTextInputLayout, this.placement.getDateWidth(), this.placement.getDateStartMargin$payments_core_release(this.isShowingFullCard));
        updateFieldLayout(this.cvcNumberTextInputLayout, this.placement.getCvcWidth(), this.placement.getCvcStartMargin$payments_core_release(this.isShowingFullCard));
        updateFieldLayout(this.postalCodeTextInputLayout, this.placement.getPostalCodeWidth(), this.placement.getPostalCodeStartMargin$payments_core_release(this.isShowingFullCard));
    }

    private final String getCvcPlaceHolder() {
        if (CardBrand.AmericanExpress == getBrand()) {
            return "2345";
        }
        return "CVC";
    }

    private final String getPeekCardText() {
        int panLength$payments_core_release = this.cardNumberEditText.getPanLength$payments_core_release();
        return StringsKt.repeat("0", panLength$payments_core_release != 14 ? panLength$payments_core_release != 15 ? panLength$payments_core_release != 19 ? 4 : 3 : 5 : 2);
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "Landroid/view/animation/Animation;", "()V", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static abstract class CardFieldAnimation extends Animation {
        private static final Companion Companion = new Companion(null);

        public CardFieldAnimation() {
            setDuration(150L);
        }

        /* compiled from: CardInputWidget.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;", "", "()V", "ANIMATION_LENGTH", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class CardNumberSlideStartAnimation extends CardFieldAnimation {
        private final View view;

        public CardNumberSlideStartAnimation(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            setAnimationListener(new AnimationEndListener() { // from class: com.stripe.android.view.CardInputWidget.CardNumberSlideStartAnimation.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    CardNumberSlideStartAnimation.this.view.requestFocus();
                }
            });
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (layoutParams2.getMarginStart() * (1 - interpolatedTime)));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "(Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class ExpiryDateSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startPosition;
        private final View view;

        public ExpiryDateSlideStartAnimation(View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startPosition)));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class CvcSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public CvcSlideStartAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startPosition)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class PostalCodeSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public PostalCodeSlideStartAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startPosition)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "hiddenCardWidth", "", "focusOnEndView", "(Landroid/view/View;ILandroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class CardNumberSlideEndAnimation extends CardFieldAnimation {
        private final View focusOnEndView;
        private final int hiddenCardWidth;
        private final View view;

        public CardNumberSlideEndAnimation(View view, int i, View focusOnEndView) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(focusOnEndView, "focusOnEndView");
            this.view = view;
            this.hiddenCardWidth = i;
            this.focusOnEndView = focusOnEndView;
            setAnimationListener(new AnimationEndListener() { // from class: com.stripe.android.view.CardInputWidget.CardNumberSlideEndAnimation.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    CardNumberSlideEndAnimation.this.focusOnEndView.requestFocus();
                }
            });
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (this.hiddenCardWidth * (-1.0f) * interpolatedTime));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "(Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class ExpiryDateSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startMargin;
        private final View view;

        public ExpiryDateSlideEndAnimation(View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startMargin)));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class CvcSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public CvcSlideEndAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startMargin)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class PostalCodeSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public PostalCodeSlideEndAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startMargin)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "()V", "calculate", "", "text", "", "paint", "Landroid/text/TextPaint;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultLayoutWidthCalculator implements LayoutWidthCalculator {
        @Override // com.stripe.android.view.CardInputWidget.LayoutWidthCalculator
        public int calculate(String text, TextPaint paint) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            return (int) Layout.getDesiredWidth(text, paint);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CardInputWidget.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/CardInputWidget$Field;", "", "(Ljava/lang/String;I)V", "Number", "Expiry", "Cvc", "PostalCode", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Field {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Field[] $VALUES;
        public static final Field Number = new Field("Number", 0);
        public static final Field Expiry = new Field("Expiry", 1);
        public static final Field Cvc = new Field("Cvc", 2);
        public static final Field PostalCode = new Field("PostalCode", 3);

        private static final /* synthetic */ Field[] $values() {
            return new Field[]{Number, Expiry, Cvc, PostalCode};
        }

        public static EnumEntries<Field> getEntries() {
            return $ENTRIES;
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) $VALUES.clone();
        }

        private Field(String str, int i) {
        }

        static {
            Field[] fieldArr$values = $values();
            $VALUES = fieldArr$values;
            $ENTRIES = EnumEntries2.enumEntries(fieldArr$values);
        }
    }

    private final void updateFieldLayout(final View view, final int newWidth, final int newMarginStart) {
        OneShotPreDrawListener.add(view, new Runnable() { // from class: com.stripe.android.view.CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = newWidth;
                layoutParams2.setMarginStart(newMarginStart);
                view2.setLayoutParams(layoutParams2);
            }
        });
    }
}
