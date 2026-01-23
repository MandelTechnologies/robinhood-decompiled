package com.robinhood.android.trade.equity.p261ui.configuration;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.p261ui.configuration.OrderTrailTypeDialogFragment;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderTrailTypeDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/OrderTrailTypeDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderTrailTypeDialogFragment extends Hammer_OrderTrailTypeDialogFragment {
    public static final String TRAIL_TYPE_REQUEST_KEY = "trailing_type_request_key";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OrderTrailTypeDialogFragment() {
        super((DefaultConstructorMarker) null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(-1333046443, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment$onCreateDialog$1$1

            /* compiled from: OrderTrailTypeDialogFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment$onCreateDialog$1$1$1 */
            static final class C294061 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ OrderTrailTypeDialogFragment this$0;

                /* compiled from: OrderTrailTypeDialogFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment$onCreateDialog$1$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[EquityOrderSide.values().length];
                        try {
                            iArr[EquityOrderSide.BUY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[EquityOrderSide.SELL.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                C294061(OrderTrailTypeDialogFragment orderTrailTypeDialogFragment) {
                    this.this$0 = orderTrailTypeDialogFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$4$lambda$1$lambda$0(OrderTrailTypeDialogFragment orderTrailTypeDialogFragment) {
                    orderTrailTypeDialogFragment.getParentFragmentManager().setFragmentResult(OrderTrailTypeDialogFragment.TRAIL_TYPE_REQUEST_KEY, Bundle2.bundleOf(Tuples4.m3642to(OrderTrailTypeDialogFragment.TRAIL_TYPE_REQUEST_KEY, OrderTrailingPeg.TrailingPegType.PERCENTAGE.getServerValue())));
                    orderTrailTypeDialogFragment.dismiss();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$4$lambda$3$lambda$2(OrderTrailTypeDialogFragment orderTrailTypeDialogFragment) {
                    orderTrailTypeDialogFragment.getParentFragmentManager().setFragmentResult(OrderTrailTypeDialogFragment.TRAIL_TYPE_REQUEST_KEY, Bundle2.bundleOf(Tuples4.m3642to(OrderTrailTypeDialogFragment.TRAIL_TYPE_REQUEST_KEY, OrderTrailingPeg.TrailingPegType.PRICE.getServerValue())));
                    orderTrailTypeDialogFragment.dismiss();
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    char c;
                    String string2;
                    String string3;
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1535957347, i, -1, "com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous> (OrderTrailTypeDialogFragment.kt:38)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                    final OrderTrailTypeDialogFragment orderTrailTypeDialogFragment = this.this$0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String string4 = orderTrailTypeDialogFragment.getString(C29365R.string.order_create_trailing_type_dialog_title);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    BentoText2.m20747BentoText38GnDrw(string4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
                    Color color = null;
                    BentoBaseRowState.Start.PictogramPog pictogramPog = new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.PERCENT_SIGN, color, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU()), 2, null);
                    String string5 = orderTrailTypeDialogFragment.getString(C29365R.string.order_create_trailing_amount_percentage);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    OrderTrailTypeDialogFragment.Companion companion3 = OrderTrailTypeDialogFragment.INSTANCE;
                    EquityOrderSide side = ((OrderTrailTypeDialogFragment.Args) companion3.getArgs((Fragment) orderTrailTypeDialogFragment)).getSide();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    int i3 = iArr[side.ordinal()];
                    if (i3 != 1) {
                        c = 2;
                        if (i3 != 2) {
                            if (i3 == 3) {
                                throw new IllegalStateException("short trailing orders not supported");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        string2 = orderTrailTypeDialogFragment.getString(C29365R.string.order_create_trailing_percentage_sell_dialog_description);
                    } else {
                        c = 2;
                        string2 = orderTrailTypeDialogFragment.getString(C29365R.string.order_create_trailing_percentage_buy_dialog_description);
                    }
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(orderTrailTypeDialogFragment);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0171: CONSTRUCTOR (r15v3 'objRememberedValue' java.lang.Object) = 
                              (r5v0 'orderTrailTypeDialogFragment' com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment A[DONT_INLINE])
                             A[MD:(com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment):void (m)] (LINE:62) call: com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment):void type: CONSTRUCTOR in method: com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment$onCreateDialog$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            Method dump skipped, instructions count: 606
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.trade.equity.p261ui.configuration.OrderTrailTypeDialogFragment2.C294061.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1333046443, i, -1, "com.robinhood.android.trade.equity.ui.configuration.OrderTrailTypeDialogFragment.onCreateDialog.<anonymous>.<anonymous> (OrderTrailTypeDialogFragment.kt:37)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1535957347, true, new C294061(this.this$0), composer, 54), composer, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            builder.setView(composeView);
            AlertDialog alertDialogCreate = builder.create();
            Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
            return alertDialogCreate;
        }

        /* compiled from: OrderTrailTypeDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/OrderTrailTypeDialogFragment$Args;", "Landroid/os/Parcelable;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;)V", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Args implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Args> CREATOR = new Creator();
            private final EquityOrderSide side;

            /* compiled from: OrderTrailTypeDialogFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Args> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Args(EquityOrderSide.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args[] newArray(int i) {
                    return new Args[i];
                }
            }

            public static /* synthetic */ Args copy$default(Args args, EquityOrderSide equityOrderSide, int i, Object obj) {
                if ((i & 1) != 0) {
                    equityOrderSide = args.side;
                }
                return args.copy(equityOrderSide);
            }

            /* renamed from: component1, reason: from getter */
            public final EquityOrderSide getSide() {
                return this.side;
            }

            public final Args copy(EquityOrderSide side) {
                Intrinsics.checkNotNullParameter(side, "side");
                return new Args(side);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Args) && this.side == ((Args) other).side;
            }

            public int hashCode() {
                return this.side.hashCode();
            }

            public String toString() {
                return "Args(side=" + this.side + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.side.name());
            }

            public Args(EquityOrderSide side) {
                Intrinsics.checkNotNullParameter(side, "side");
                this.side = side;
            }

            public final EquityOrderSide getSide() {
                return this.side;
            }
        }

        /* compiled from: OrderTrailTypeDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/OrderTrailTypeDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/DialogFragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/OrderTrailTypeDialogFragment;", "Lcom/robinhood/android/trade/equity/ui/configuration/OrderTrailTypeDialogFragment$Args;", "<init>", "()V", "TRAIL_TYPE_REQUEST_KEY", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements DialogFragmentWithArgsCompanion<OrderTrailTypeDialogFragment, Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public Args getArgs(OrderTrailTypeDialogFragment orderTrailTypeDialogFragment) {
                return (Args) DialogFragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderTrailTypeDialogFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion
            public OrderTrailTypeDialogFragment newInstance(Args args, int i) {
                return (OrderTrailTypeDialogFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance(this, args, i);
            }
        }
    }
