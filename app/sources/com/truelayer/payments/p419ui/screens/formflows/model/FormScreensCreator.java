package com.truelayer.payments.p419ui.screens.formflows.model;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.AdditionalInput;
import com.truelayer.payments.core.domain.payments.FormInput;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput2;
import com.truelayer.payments.core.domain.payments.TranslatableText;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import com.truelayer.payments.p419ui.components.InfoBanner4;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields3;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields6;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.screens.LastInputError;
import com.truelayer.payments.p419ui.screens.ScreenKt;
import com.truelayer.payments.p419ui.screens.components.LegalText;
import com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.utils.FieldIds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: FormScreensCreator.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 T2\u00020\u0001:\u0002TUB\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010&2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160&2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u0004\u0018\u00010\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b+\u0010,J7\u0010/\u001a\u00020.2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0011H\u0002¢\u0006\u0004\b/\u00100J#\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u0002042\u0006\u0010\u001c\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u001c\u001a\u000203H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160&2\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J\"\u0010@\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0004\u0012\u0004\u0012\u00020?0>H\u0086@¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010CR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010CR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010DR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010GR.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010MR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00160\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010NR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010CR\u0018\u0010Q\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010C¨\u0006V"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/model/FormScreensCreator;", "", "Lcom/truelayer/payments/ui/models/PaymentContext;", "paymentContext", "", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "inputs", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "recentAdditionalInputs", "Landroid/content/Context;", "context", "Lcom/truelayer/payments/core/network/Network;", "api", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "selectedProvider", "", "isSignupPlus", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "translationsMap", "Lkotlin/Function2;", "", "onBannerLinkClicked", "Lkotlin/Function1;", "onLegalLinkClicked", "<init>", "(Lcom/truelayer/payments/ui/models/PaymentContext;Ljava/util/List;Ljava/util/List;Landroid/content/Context;Lcom/truelayer/payments/core/network/Network;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;ZLjava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "input", "preProcessInput", "(Lcom/truelayer/payments/ui/screens/FormInputWrapper;)Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "steps", "processFieldsAndCreateStep", "(Ljava/util/List;Ljava/util/List;)V", "Lcom/truelayer/payments/ui/screens/formflows/model/FormScreenType;", "formScreenType", "Lkotlin/Function0;", "generateHeaders", "(Ljava/util/List;Lcom/truelayer/payments/ui/screens/formflows/model/FormScreenType;)Lkotlin/jvm/functions/Function2;", "generateFooters", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "getStepTitle", "(Ljava/util/List;)Ljava/lang/String;", "recentlyUsed", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Form;", "createFormStep", "(Ljava/util/List;Ljava/util/Map;)Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Form;", "applyTranslations", "(Ljava/util/List;)Ljava/util/List;", "Lcom/truelayer/payments/ui/screens/FormInputWrapper$Select;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Select;", "createSelectStep", "(Lcom/truelayer/payments/ui/screens/FormInputWrapper$Select;)Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Select;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$RadioSelect;", "createRadioSelectStep", "(Lcom/truelayer/payments/ui/screens/FormInputWrapper$Select;)Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$RadioSelect;", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "legals", "createLegalFooter", "(Lcom/truelayer/payments/core/domain/experience/localisation/Legals;)Lkotlin/jvm/functions/Function2;", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "createSteps", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/truelayer/payments/ui/models/PaymentContext;", "Ljava/util/List;", "Landroid/content/Context;", "Lcom/truelayer/payments/core/network/Network;", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "Z", "Ljava/util/Map;", "getTranslationsMap", "()Ljava/util/Map;", "setTranslationsMap", "(Ljava/util/Map;)V", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "additionalInputs", "legalText", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "singleScreenFieldIds", "Companion", "SelectType", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FormScreensCreator {
    private static final int minimumNumberOfOptionsForSearchSelect = 7;
    private List<? extends AdditionalInput> additionalInputs;
    private final Network api;
    private final Context context;
    private final List<FormInputWrapper> inputs;
    private final boolean isSignupPlus;
    private Legals legalText;
    private final Function2<String, String, Unit> onBannerLinkClicked;
    private final Function1<String, Unit> onLegalLinkClicked;
    private final PaymentContext paymentContext;
    private final List<RecentAdditionalInput> recentAdditionalInputs;
    private final PaymentProvider selectedProvider;
    private final List<String> singleScreenFieldIds;
    private Map<String, LocalisedText> translationsMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FormScreensCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SelectType.values().length];
            try {
                iArr[SelectType.SearchSelect.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectType.RadioButtonSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdditionalInput.InfoElement.values().length];
            try {
                iArr2[AdditionalInput.InfoElement.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdditionalInput.InfoElement.Unknown.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: FormScreensCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator", m3645f = "FormScreensCreator.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "createSteps")
    /* renamed from: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$createSteps$1 */
    static final class C431101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C431101(Continuation<? super C431101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FormScreensCreator.this.createSteps(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormScreensCreator(PaymentContext paymentContext, List<? extends FormInputWrapper> inputs, List<RecentAdditionalInput> recentAdditionalInputs, Context context, Network api, PaymentProvider selectedProvider, boolean z, Map<String, LocalisedText> translationsMap, Function2<? super String, ? super String, Unit> onBannerLinkClicked, Function1<? super String, Unit> onLegalLinkClicked) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(recentAdditionalInputs, "recentAdditionalInputs");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
        Intrinsics.checkNotNullParameter(translationsMap, "translationsMap");
        Intrinsics.checkNotNullParameter(onBannerLinkClicked, "onBannerLinkClicked");
        Intrinsics.checkNotNullParameter(onLegalLinkClicked, "onLegalLinkClicked");
        this.paymentContext = paymentContext;
        this.inputs = inputs;
        this.recentAdditionalInputs = recentAdditionalInputs;
        this.context = context;
        this.api = api;
        this.selectedProvider = selectedProvider;
        this.isSignupPlus = z;
        this.translationsMap = translationsMap;
        this.onBannerLinkClicked = onBannerLinkClicked;
        this.onLegalLinkClicked = onLegalLinkClicked;
        this.additionalInputs = CollectionsKt.emptyList();
        this.singleScreenFieldIds = CollectionsKt.listOf(FieldIds.IBAN);
    }

    public final Map<String, LocalisedText> getTranslationsMap() {
        return this.translationsMap;
    }

    public final void setTranslationsMap(Map<String, LocalisedText> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.translationsMap = map;
    }

    public /* synthetic */ FormScreensCreator(PaymentContext paymentContext, List list, List list2, Context context, Network network, PaymentProvider paymentProvider, boolean z, Map map, Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentContext, list, list2, context, network, paymentProvider, z, map, (i & 256) != 0 ? new Function2<String, String, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                invoke2(str, str2);
                return Unit.INSTANCE;
            }
        } : function2, (i & 512) != 0 ? new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        } : function1);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FormScreensCreator.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/model/FormScreensCreator$SelectType;", "", "(Ljava/lang/String;I)V", "SearchSelect", "RadioButtonSelect", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class SelectType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SelectType[] $VALUES;
        public static final SelectType SearchSelect = new SelectType("SearchSelect", 0);
        public static final SelectType RadioButtonSelect = new SelectType("RadioButtonSelect", 1);

        private static final /* synthetic */ SelectType[] $values() {
            return new SelectType[]{SearchSelect, RadioButtonSelect};
        }

        public static EnumEntries<SelectType> getEntries() {
            return $ENTRIES;
        }

        public static SelectType valueOf(String str) {
            return (SelectType) Enum.valueOf(SelectType.class, str);
        }

        public static SelectType[] values() {
            return (SelectType[]) $VALUES.clone();
        }

        private SelectType(String str, int i) {
        }

        static {
            SelectType[] selectTypeArr$values = $values();
            $VALUES = selectTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(selectTypeArr$values);
        }
    }

    /* compiled from: FormScreensCreator.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/model/FormScreensCreator$Companion;", "", "()V", "minimumNumberOfOptionsForSearchSelect", "", "selectType", "Lcom/truelayer/payments/ui/screens/formflows/model/FormScreensCreator$SelectType;", "itemCount", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SelectType selectType(int itemCount) {
            if (itemCount > 7) {
                return SelectType.SearchSelect;
            }
            return SelectType.RadioButtonSelect;
        }
    }

    private final FormInputWrapper preProcessInput(FormInputWrapper input) {
        if (input instanceof FormInputWrapper.Select) {
            FormInputWrapper.Select select = (FormInputWrapper.Select) input;
            int i = WhenMappings.$EnumSwitchMapping$0[INSTANCE.selectType(select.getInput().getOptions().size()).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return FormInputWrapper.Select.copy$default(select, FormInput.Select.copy$default(select.getInput(), null, null, null, false, CollectionsKt.sortedWith(select.getInput().getOptions(), new Comparator() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$preProcessInput$$inlined$sortedBy$2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(((FormInput.Select.SelectOption) t).getLabel().getText(), ((FormInput.Select.SelectOption) t2).getLabel().getText());
                        }
                    }), 15, null), null, 2, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            FormInput.Select input2 = select.getInput();
            List<FormInput.Select.SelectOption> options = select.getInput().getOptions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(FormInput.Select.SelectOption.copy$default((FormInput.Select.SelectOption) it.next(), null, null, this.selectedProvider.getIconUri(), null, 11, null));
            }
            return FormInputWrapper.Select.copy$default(select, FormInput.Select.copy$default(input2, null, null, null, false, CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$preProcessInput$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((FormInput.Select.SelectOption) t).getLabel().getText(), ((FormInput.Select.SelectOption) t2).getLabel().getText());
                }
            }), 15, null), null, 2, null);
        }
        if ((input instanceof FormInputWrapper.Text) || (input instanceof FormInputWrapper.TextWithImage)) {
            return input;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSteps(Continuation<? super Outcome<? extends List<? extends FormFlowScreen>, ? extends CoreError>> continuation) {
        C431101 c431101;
        List<FormFlowScreen> arrayList;
        List<FormInputWrapper> list;
        FormScreensCreator formScreensCreator;
        if (continuation instanceof C431101) {
            c431101 = (C431101) continuation;
            int i = c431101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c431101.label = i - Integer.MIN_VALUE;
            } else {
                c431101 = new C431101(continuation);
            }
        }
        Object obj = c431101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c431101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            if (this.inputs.isEmpty()) {
                return new Ok(CollectionsKt.listOf(new FormFlowScreen.Empty("", null, null, 6, null)));
            }
            FormScreensCreator6 formScreensCreator6 = new FormScreensCreator6(this, null);
            c431101.L$0 = this;
            c431101.L$1 = arrayList;
            c431101.L$2 = arrayList2;
            c431101.label = 1;
            Object objCoroutineScope = CoroutineScope2.coroutineScope(formScreensCreator6, c431101);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList2;
            obj = objCoroutineScope;
            formScreensCreator = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c431101.L$2;
            arrayList = (List) c431101.L$1;
            formScreensCreator = (FormScreensCreator) c431101.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Fail fail = (Fail) obj;
        if (fail != null) {
            return fail;
        }
        for (FormInputWrapper formInputWrapper : formScreensCreator.inputs) {
            formInputWrapper.applyTranslation(formScreensCreator.translationsMap);
            FormInputWrapper formInputWrapperPreProcessInput = formScreensCreator.preProcessInput(formInputWrapper);
            if (formInputWrapperPreProcessInput instanceof FormInputWrapper.Select) {
                FormInputWrapper.Select select = (FormInputWrapper.Select) formInputWrapperPreProcessInput;
                if (select.getInput().getOptions().isEmpty()) {
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "Select field has no options for field: " + select.getInput().getId(), null, null, null, null, 61, null));
                    return new Fail(CoreError.INSTANCE.mo27021default());
                }
                formScreensCreator.processFieldsAndCreateStep(list, arrayList);
                int i3 = WhenMappings.$EnumSwitchMapping$0[INSTANCE.selectType(select.getInput().getOptions().size()).ordinal()];
                if (i3 == 1) {
                    arrayList.add(formScreensCreator.createSelectStep(select));
                } else if (i3 == 2) {
                    arrayList.add(formScreensCreator.createRadioSelectStep(select));
                }
            } else if (formInputWrapperPreProcessInput instanceof FormInputWrapper.Text) {
                if (formScreensCreator.singleScreenFieldIds.contains(formInputWrapperPreProcessInput.getId())) {
                    formScreensCreator.processFieldsAndCreateStep(list, arrayList);
                    arrayList.add(formScreensCreator.createFormStep(CollectionsKt.listOf(formInputWrapperPreProcessInput), RecentAdditionalInput2.mapDistinct(formScreensCreator.recentAdditionalInputs)));
                } else {
                    list.add(formInputWrapperPreProcessInput);
                }
            } else if (formInputWrapperPreProcessInput instanceof FormInputWrapper.TextWithImage) {
                list.add(formInputWrapperPreProcessInput);
            }
        }
        formScreensCreator.processFieldsAndCreateStep(list, arrayList);
        return new Ok(arrayList);
    }

    private final void processFieldsAndCreateStep(List<FormInputWrapper> inputs, List<FormFlowScreen> steps) {
        if (inputs.isEmpty()) {
            return;
        }
        steps.add(createFormStep(inputs, RecentAdditionalInput2.mapDistinct(this.recentAdditionalInputs)));
        inputs.clear();
    }

    private final Function2<Composer, Integer, Unit> generateHeaders(List<? extends FormInputWrapper> inputs, final FormScreenType formScreenType) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(ComposableLambda3.composableLambdaInstance(-1010545757, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.generateHeaders.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1010545757, i, -1, "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.generateHeaders.<anonymous> (FormScreensCreator.kt:234)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Spacing spacing = Spacing.INSTANCE;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, spacing.m27177getREGULARD9Ej5fM(), 0.0f, 2, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    FormScreenType formScreenType2 = formScreenType;
                    FormScreensCreator formScreensCreator = this;
                    composer.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, centerVertically, composer, 54);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5144paddingVpY3zN4$default);
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    Row6 row6 = Row6.INSTANCE;
                    composer.startReplaceableGroup(-716056719);
                    if (formScreenType2 != FormScreenType.SearchSelect) {
                        EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(row6.align(companion, companion2.getCenterVertically()), C2002Dp.m7995constructorimpl(40), formScreensCreator.selectedProvider.getExtendedIcon(), formScreensCreator.selectedProvider.getIconUri(), null, null, composer, 48, 48);
                        Spacer2.Spacer(SizeKt.m5171sizeVpY3zN4(companion, spacing.m27175getMEDIUMD9Ej5fM(), C2002Dp.m7995constructorimpl(1)), composer, 6);
                        TextKt.m6028Text4IGK_g(formScreensCreator.selectedProvider.getDisplayName(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), composer, 0, 0, 65534);
                    }
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        Iterator<T> it = inputs.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            FormInputWrapper formInputWrapper = (FormInputWrapper) it.next();
            Iterator<T> it2 = this.additionalInputs.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((AdditionalInput) next).getKey(), formInputWrapper.getId())) {
                    obj = next;
                    break;
                }
            }
            final AdditionalInput additionalInput = (AdditionalInput) obj;
            if (additionalInput != null && (additionalInput instanceof AdditionalInput.Info)) {
                if (WhenMappings.$EnumSwitchMapping$1[((AdditionalInput.Info) additionalInput).getElement().ordinal()] == 1) {
                    arrayList.add(ComposableLambda3.composableLambdaInstance(1626962069, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$generateHeaders$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1626962069, i, -1, "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.generateHeaders.<anonymous>.<anonymous>.<anonymous> (FormScreensCreator.kt:263)");
                                }
                                String text = ((AdditionalInput.Info) additionalInput).getText();
                                final FormScreensCreator formScreensCreator = this;
                                final AdditionalInput additionalInput2 = additionalInput;
                                InfoBanner4.InfoBanner(null, text, null, null, new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$generateHeaders$2$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                        invoke2(str);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String url) {
                                        Intrinsics.checkNotNullParameter(url, "url");
                                        formScreensCreator.onBannerLinkClicked.invoke(additionalInput2.getKey(), url);
                                    }
                                }, composer, 0, 13);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ComposableLambda3.composableLambdaInstance(-1207693808, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.generateHeaders.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1207693808, i, -1, "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.generateHeaders.<anonymous> (FormScreensCreator.kt:276)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(Spacing.INSTANCE.m27177getREGULARD9Ej5fM());
                    List<Function2<Composer, Integer, Unit>> list = arrayList;
                    composer.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    Column6 column6 = Column6.INSTANCE;
                    composer.startReplaceableGroup(-716055052);
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((Function2) it3.next()).invoke(composer, 0);
                    }
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        });
    }

    private final Function2<Composer, Integer, Unit> generateFooters(List<? extends FormInputWrapper> inputs) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(createLegalFooter(this.legalText));
        return ComposableLambda3.composableLambdaInstance(666593000, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.generateFooters.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(666593000, i, -1, "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.generateFooters.<anonymous> (FormScreensCreator.kt:297)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(Spacing.INSTANCE.m27175getMEDIUMD9Ej5fM());
                    List<Function2<Composer, Integer, Unit>> list = arrayList;
                    composer.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    Column6 column6 = Column6.INSTANCE;
                    composer.startReplaceableGroup(-649182507);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((Function2) it.next()).invoke(composer, 0);
                    }
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        });
    }

    private final String getStepTitle(List<? extends FormInputWrapper> inputs) {
        LocalisedText localisedText = this.translationsMap.get(CollectionsKt.joinToString$default(inputs, ".", null, ".title", 0, null, new Function1<FormInputWrapper, CharSequence>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$getStepTitle$id$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(FormInputWrapper it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        }, 26, null));
        if (localisedText != null) {
            return localisedText.getValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.truelayer.payments.ui.components.inputs.form.models.TextField] */
    /* JADX WARN: Type inference failed for: r6v19, types: [com.truelayer.payments.ui.components.inputs.form.models.SelectField] */
    private final FormFlowScreen.Form createFormStep(List<? extends FormInputWrapper> inputs, Map<String, ? extends List<RecentAdditionalInput>> recentlyUsed) {
        TranslatableText description;
        Function2<Composer, Integer, Unit> function2M27116getLambda2$payments_ui_release;
        Fields6 fields6IntoField;
        Fields6 fields6IntoField2;
        Object next;
        final String text;
        String stepTitle = getStepTitle(inputs);
        if (stepTitle == null) {
            stepTitle = this.context.getString(C42830R.string.default_form_title);
            Intrinsics.checkNotNullExpressionValue(stepTitle, "getString(...)");
        }
        Function2<Composer, Integer, Unit> function2GenerateHeaders = generateHeaders(inputs, FormScreenType.Form);
        Function2<Composer, Integer, Unit> function2GenerateFooters = generateFooters(inputs);
        List<FormInputWrapper> listApplyTranslations = applyTranslations(CollectionsKt.toList(inputs));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listApplyTranslations, 10));
        for (FormInputWrapper formInputWrapper : listApplyTranslations) {
            FormInput input = formInputWrapper.getInput();
            if (input instanceof FormInput.Text) {
                description = ((FormInput.Text) input).getDescription();
            } else {
                description = input instanceof FormInput.TextWithImage ? ((FormInput.TextWithImage) input).getDescription() : null;
            }
            FormScreensCreator2 formScreensCreator2 = FormScreensCreator2.INSTANCE;
            Function2<Composer, Integer, Unit> function2M27115getLambda1$payments_ui_release = formScreensCreator2.m27115getLambda1$payments_ui_release();
            if (description == null || (text = description.getText()) == null || (function2M27116getLambda2$payments_ui_release = ComposableLambda3.composableLambdaInstance(1836253276, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator$createFormStep$1$footer$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1836253276, i, -1, "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.createFormStep.<anonymous>.<anonymous>.<anonymous> (FormScreensCreator.kt:328)");
                        }
                        TextKt.m6028Text4IGK_g(text, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 48, 0, 65532);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            })) == null) {
                function2M27116getLambda2$payments_ui_release = formScreensCreator2.m27116getLambda2$payments_ui_release();
            }
            Function2<Composer, Integer, Unit> function2 = function2M27116getLambda2$payments_ui_release;
            List<RecentAdditionalInput> listEmptyList = recentlyUsed.get(formInputWrapper.getId());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (formInputWrapper instanceof FormInputWrapper.Select) {
                FormInputWrapper.Select select = (FormInputWrapper.Select) formInputWrapper;
                List mutableList = CollectionsKt.toMutableList((Collection) select.getInput().getOptions());
                ArrayList arrayList2 = new ArrayList();
                for (RecentAdditionalInput recentAdditionalInput : listEmptyList) {
                    Iterator it = mutableList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(recentAdditionalInput.getInputId(), ((FormInput.Select.SelectOption) next).getId())) {
                            break;
                        }
                    }
                    FormInput.Select.SelectOption selectOption = (FormInput.Select.SelectOption) next;
                    if (selectOption != null) {
                        arrayList2.add(selectOption);
                    }
                }
                FormInput.Select input2 = select.getInput();
                LastInputError lastError = formInputWrapper.getLastError();
                List list = mutableList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(SelectOption2.intoSelectOption((FormInput.Select.SelectOption) it2.next()));
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(SelectOption2.intoSelectOption((FormInput.Select.SelectOption) it3.next()));
                }
                fields6IntoField2 = Fields3.intoField(input2, lastError, arrayList3, arrayList4, function2M27115getLambda1$payments_ui_release, function2);
            } else if (formInputWrapper instanceof FormInputWrapper.Text) {
                FormInput.Text input3 = ((FormInputWrapper.Text) formInputWrapper).getInput();
                LastInputError lastError2 = formInputWrapper.getLastError();
                List<RecentAdditionalInput> list2 = listEmptyList;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((RecentAdditionalInput) it4.next()).getValue());
                }
                fields6IntoField2 = Fields3.intoField(input3, lastError2, arrayList5, ExtraInputValidationProvider.INSTANCE.provideValidations(formInputWrapper), function2M27115getLambda1$payments_ui_release, function2);
            } else {
                if (!(formInputWrapper instanceof FormInputWrapper.TextWithImage)) {
                    throw new NoWhenBranchMatchedException();
                }
                FormInput.TextWithImage input4 = ((FormInputWrapper.TextWithImage) formInputWrapper).getInput();
                LastInputError lastError3 = formInputWrapper.getLastError();
                List<RecentAdditionalInput> list3 = listEmptyList;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((RecentAdditionalInput) it5.next()).getValue());
                }
                fields6IntoField = Fields3.intoField(input4, lastError3, arrayList6, ExtraInputValidationProvider.INSTANCE.provideValidations(formInputWrapper), function2M27115getLambda1$payments_ui_release, function2);
                arrayList.add(fields6IntoField);
            }
            fields6IntoField = fields6IntoField2;
            arrayList.add(fields6IntoField);
        }
        return new FormFlowScreen.Form(stepTitle, function2GenerateHeaders, function2GenerateFooters, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<FormInputWrapper> applyTranslations(List<? extends FormInputWrapper> inputs) {
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            ((FormInputWrapper) it.next()).applyTranslation(this.translationsMap);
        }
        return inputs;
    }

    private final FormFlowScreen.Select createSelectStep(FormInputWrapper.Select input) {
        Object next;
        input.applyTranslation(this.translationsMap);
        Intrinsics.checkNotNull(input, "null cannot be cast to non-null type com.truelayer.payments.ui.screens.FormInputWrapper");
        String stepTitle = getStepTitle(CollectionsKt.listOf(input));
        if (stepTitle == null) {
            stepTitle = input.getInput().getLabel().getText();
        }
        String str = stepTitle;
        String hintLabel = input.getInput().getHintLabel();
        Function2<Composer, Integer, Unit> function2GenerateHeaders = generateHeaders(CollectionsKt.listOf(input), FormScreenType.SearchSelect);
        List<RecentAdditionalInput> list = this.recentAdditionalInputs;
        ArrayList<RecentAdditionalInput> arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((RecentAdditionalInput) obj).getInputId(), input.getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (RecentAdditionalInput recentAdditionalInput : arrayList) {
            Iterator<T> it = input.getInput().getOptions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((FormInput.Select.SelectOption) next).getId(), recentAdditionalInput.getValue())) {
                    break;
                }
            }
            FormInput.Select.SelectOption selectOption = (FormInput.Select.SelectOption) next;
            SelectOption selectOptionIntoSelectOption = selectOption != null ? SelectOption2.intoSelectOption(selectOption) : null;
            if (selectOptionIntoSelectOption != null) {
                arrayList2.add(selectOptionIntoSelectOption);
            }
        }
        Field fieldIntoField$default = ScreenKt.intoField$default(input, null, null, arrayList2, 3, null);
        Intrinsics.checkNotNull(fieldIntoField$default, "null cannot be cast to non-null type com.truelayer.payments.ui.components.inputs.form.models.SelectField");
        return new FormFlowScreen.Select(str, hintLabel, function2GenerateHeaders, null, (Fields4) fieldIntoField$default);
    }

    private final FormFlowScreen.RadioSelect createRadioSelectStep(FormInputWrapper.Select input) {
        Object next;
        input.applyTranslation(this.translationsMap);
        String stepTitle = getStepTitle(CollectionsKt.listOf(input));
        if (stepTitle == null) {
            stepTitle = input.getInput().getLabel().getText();
        }
        Function2<Composer, Integer, Unit> function2GenerateHeaders = generateHeaders(CollectionsKt.listOf(input), FormScreenType.RadioSelect);
        Function2<Composer, Integer, Unit> function2GenerateFooters = generateFooters(CollectionsKt.listOf(input));
        List<RecentAdditionalInput> list = this.recentAdditionalInputs;
        ArrayList<RecentAdditionalInput> arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((RecentAdditionalInput) obj).getInputId(), input.getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (RecentAdditionalInput recentAdditionalInput : arrayList) {
            Iterator<T> it = input.getInput().getOptions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((FormInput.Select.SelectOption) next).getId(), recentAdditionalInput.getValue())) {
                    break;
                }
            }
            FormInput.Select.SelectOption selectOption = (FormInput.Select.SelectOption) next;
            SelectOption selectOptionIntoSelectOption = selectOption != null ? SelectOption2.intoSelectOption(selectOption) : null;
            if (selectOptionIntoSelectOption != null) {
                arrayList2.add(selectOptionIntoSelectOption);
            }
        }
        Field fieldIntoField$default = ScreenKt.intoField$default(input, null, null, arrayList2, 3, null);
        Intrinsics.checkNotNull(fieldIntoField$default, "null cannot be cast to non-null type com.truelayer.payments.ui.components.inputs.form.models.SelectField");
        return new FormFlowScreen.RadioSelect(stepTitle, function2GenerateHeaders, function2GenerateFooters, (Fields4) fieldIntoField$default);
    }

    private final Function2<Composer, Integer, Unit> createLegalFooter(final Legals legals) {
        return ComposableLambda3.composableLambdaInstance(1332081967, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.createLegalFooter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1332081967, i, -1, "com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.createLegalFooter.<anonymous> (FormScreensCreator.kt:412)");
                    }
                    Legals legals2 = legals;
                    final FormScreensCreator formScreensCreator = this;
                    LegalText.LegalText(null, legals2, new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.model.FormScreensCreator.createLegalFooter.1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String url) {
                            Intrinsics.checkNotNullParameter(url, "url");
                            formScreensCreator.onLegalLinkClicked.invoke(url);
                        }
                    }, composer, 64, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        });
    }
}
